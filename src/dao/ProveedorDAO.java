package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Proveedor;
import conexionSqlServer.conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ProveedorDAO {
    private String siguienteSerie(Connection cn) throws SQLException {
        try (Statement st = cn.createStatement(); 
               ResultSet rs = st.executeQuery("SELECT COUNT(*) + 1 FROM compras.PROVEEDOR")) {
               rs.next();
            return String.format("PROV%05d", rs.getInt(1));
        }
    }
    public void insertarproveedor( Proveedor prov) throws SQLException
    {
        String sql = "INSERT INTO compras.PROVEEDOR "
                + "(num_serie, nom_empresa, ruc, telefono, calle, avenida, distrito, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection cn = conexion.getConnection())
        {
            prov.setNumserie(siguienteSerie(cn));
        try (PreparedStatement ps = cn.prepareStatement(sql)) 
        {
                ps.setString(1, prov.getNumserie());
                ps.setString(2, prov.getNomEmpresa());
                ps.setString(3, prov.getRuc());
                ps.setString(4, prov.getTelefono());
                ps.setString(5, prov.getCalle());
                ps.setString(6, prov.getAvenida());
                ps.setString(7, prov.getDistrito());
                ps.setString(8, prov.getEstado());
                ps.executeUpdate();
         }
        }
    }
    public DefaultTableModel buscarProveedor(String texto) 
    {
        String[] titulos = {"N° Serie", "Nombre de empresa", "RUC",
            "Teléfono", "Ubicación", "Estado"
        };
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String sql = "SELECT * FROM compras.PROVEEDOR ";
        if (texto != null && !texto.isBlank()) 
        {
            sql += "WHERE num_serie LIKE ? "
                    + "OR nom_empresa LIKE ? "
                    + "OR ruc LIKE ? ";
        }
        sql += "ORDER BY num_serie";
        try (Connection cn = conexion.getConnection(); 
                PreparedStatement ps = cn.prepareStatement(sql)) {
            
            if (texto != null && !texto.isBlank()) 
            {
                String buscar = "%" + texto.trim() + "%";
                ps.setString(1, buscar);
                ps.setString(2, buscar);
                ps.setString(3, buscar);
            }
            try (ResultSet rs = ps.executeQuery()) 
            {
                while (rs.next()) {
                    Proveedor prov = new Proveedor(
                            rs.getInt("cod_proveedor"),
                            rs.getString("num_serie"),
                            rs.getString("nom_empresa"),
                            rs.getString("ruc"),
                            rs.getString("telefono"),
                            rs.getString("calle"),
                            rs.getString("avenida"),
                            rs.getString("distrito"),
                            rs.getString("estado")
                    );
                    modelo.addRow(prov.mostrarDatos());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog( null, "No se pudieron cargar los proveedores.\n"
                    + "Inténtelo nuevamente.\n"+ e.getMessage(),"Error al buscar proveedores",
                    JOptionPane.ERROR_MESSAGE);
        }
        return modelo;
    }
    
}
