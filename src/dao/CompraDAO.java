package dao;

import conexionSqlServer.conexion;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Compra;
import modelo.compraproducto;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CompraDAO
{
        private static final String vistacompras = "SELECT * FROM COMPRAS.VW_DETALLE_COMPRA ";
        
        public DefaultTableModel comprasrealizadas(String texto)
        {
            String[] titulo = {
                "N.º Serie", "Fecha", "Proveedor", "Producto",
                "Cantidad", "Precio compra", "Tipo de pago", "Estado", "Total"
            };
            DefaultTableModel modelcompras = new DefaultTableModel(null, titulo);
            String sql = vistacompras;
            if (texto != null && !texto.trim().isEmpty()) 
            {
                sql += " WHERE num_serie LIKE ? OR nom_prod LIKE ? "
                        + " OR nom_empresa LIKE ? "
                        + " OR estado LIKE ? ";
            }
            sql += " ORDER BY cod_compra ";
            try (Connection cn = conexion.getConnection(); 
                   PreparedStatement ps = cn.prepareStatement(sql)) 
            {
                if (texto != null && !texto.trim().isEmpty())
                {
                    String buscar = "%" + texto.trim() + "%";
                    ps.setString(1, buscar);
                    ps.setString(2, buscar);
                    ps.setString(3, buscar);
                    ps.setString(4, buscar);
                }
                try (ResultSet rs = ps.executeQuery()) 
                {
                    while (rs.next()) 
                    {
                        int cantidad = rs.getInt("cantidad");
                        double precio = rs.getDouble("precio_compra");
                        double total = Math.round(cantidad * precio * 100.0) / 100.0;
                        Object[] fila = {
                            rs.getString("num_serie"),
                            rs.getDate("fecha_compra"),
                            rs.getString("nom_empresa"),
                            rs.getString("nom_prod"),
                            cantidad,
                            precio,
                            rs.getString("tipo_pago"),
                            rs.getString("estado"),
                            total
                        };
                        modelcompras.addRow(fila);
                    }
                }
            } catch (SQLException x) {
                JOptionPane.showMessageDialog(null,"Error al mostrar compras: " + x.getMessage());
            }
            return modelcompras;
        }
        private String siguienteSerie(Connection cn) throws SQLException 
        {
            try (Statement st = cn.createStatement();  
                    ResultSet rs = st.executeQuery("SELECT COUNT(*) + 1 FROM COMPRAS.COMPRA")) {
                    rs.next();
                    return String.format("CPR%05d", rs.getInt(1));
            }
        }
        public boolean insertarCompra(Compra c)
        {
            try (Connection cn = conexion.getConnection())
            {
                cn.setAutoCommit(false);
                try
                {
                    int codigo = insertarCabecera(cn, c);
                    c.setCodCompra(codigo);

                    for (compraproducto d : c.getListaDetalleCompra())
                    {
                        insertarDetalle(cn, codigo, d);
                        sumarStock(cn, d);
                    }
                    cn.commit();
                    return true;
                }
                catch (SQLException x)
                {
                    cn.rollback();
                    throw x;
                }
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error al guardar la compra: " + e.getMessage());
                return false;
            }
        }
        private int insertarCabecera(Connection cn, Compra c) throws SQLException
        {
            String sql = "INSERT INTO COMPRAS.COMPRA "
                       + "(num_serie, tipo_pago, fecha_compra, estado, cod_proveedor) "
                       + "VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
            {
                c.setNumserie(siguienteSerie(cn));
                ps.setString(1, c.getNumserie());
                ps.setString(2, c.getTipoPago());
                ps.setDate(3,Date.valueOf(c.getFechaCompra()));
                ps.setString(4, c.getEstadoCompra());
                ps.setInt(5, c.getProveedor().getCodProveedor());
                ps.executeUpdate();
                try (ResultSet rs = ps.getGeneratedKeys())
                {
                    rs.next();
                    return rs.getInt(1);
                }
            }
        }
        private void insertarDetalle(Connection cn, int codCompra, compraproducto d) throws SQLException
        {
            String sql = "INSERT INTO COMPRAS.COMPRA_PRODUCTO "
                       + "(cod_compra, cod_producto, precio_compra, cantidad) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = cn.prepareStatement(sql))
            {
                ps.setInt(1, codCompra);
                ps.setInt(2, d.getProducto().getCodProducto());
                ps.setDouble(3, d.getPrecioUnitario());
                ps.setInt(4, d.getCantidad());
                ps.executeUpdate();
            }
        }
        private void sumarStock(Connection cn, compraproducto d) throws SQLException
        {
            String sql = "UPDATE catalogo.PRODUCTO SET stock_actual = stock_actual + ? WHERE cod_producto = ?";
            try (PreparedStatement ps = cn.prepareStatement(sql))
            {
                ps.setInt(1, d.getCantidad());
                ps.setInt(2, d.getProducto().getCodProducto());
                ps.executeUpdate();
            }
        }
}
