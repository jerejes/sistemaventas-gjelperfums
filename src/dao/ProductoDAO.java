package dao;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Accesorio;
import modelo.Perfume;
import modelo.Producto;
import conexionSqlServer.conexion;
import javax.swing.table.DefaultTableModel;
public class ProductoDAO 
{
    private static final String BASE_SQL =
            "SELECT * FROM catalogo.VW_PRODUCTO ";

    public DefaultTableModel buscarProducto(String texto) {

        String[] titulo = {
            "Serie", "Nombre", "Tipo", "Precio", "Stock","Estado","Detalle"
        };
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        String sql = BASE_SQL;
        if (texto != null && !texto.trim().isEmpty()) {

            sql += "WHERE num_serie LIKE ? OR nom_prod LIKE ? ";
        }
        sql += "ORDER BY cod_producto";
        
        try (Connection cn = conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            if (texto != null && !texto.trim().isEmpty()) {

                ps.setString(1, "%" + texto.trim() + "%");
                ps.setString(2, "%" + texto.trim() + "%");
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Producto prod;
                    if (rs.getString("genero") != null) 
                    {
                        Perfume perf = new Perfume();
                        perf.setGenero(rs.getString("genero"));
                        perf.setContMl(rs.getInt("cont_ml"));
                        prod = perf;
                    } 
                    else 
                    {
                        Accesorio ac = new Accesorio();
                        ac.setTipoAccesorio(rs.getString("tipo_accesorio"));
                        ac.setMaterial(rs.getString("material"));

                        prod = ac;
                    }
                    prod.setCodProducto(rs.getInt("cod_producto"));
                    prod.setNumSerie(rs.getString("num_serie"));
                    prod.setNomProd(rs.getString("nom_prod"));
                    prod.setPrecioUnitario(rs.getDouble("precio_unidad"));
                    prod.setStockActual(rs.getInt("stock_actual"));
                    
                    if (prod.getStockActual()>10)
                    {
                        prod.setEstadoStock("Alto");
                    }
                    else if (prod.getStockActual()>= 0 && prod.getStockActual() <= 10)
                    {
                        prod.setEstadoStock("Bajo");
                    }
                    modelo.addRow(prod.getDatosTabla());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "No se pudieron cargar los productos.\n"
                    + "Inténtelo nuevamente.\n\n"
                    + e.getMessage(),
                    "Error al buscar productos",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return modelo;
    }
   private String siguienteSerie(Connection cn) throws SQLException {
        try (Statement st = cn.createStatement(); 
                ResultSet rs = st.executeQuery("SELECT COUNT(*) + 1 FROM catalogo.PRODUCTO")) 
        {
            rs.next();
            return String.format("PRO%05d", rs.getInt(1));
        }
    }  
   
    public boolean insertarProducto(Producto pr) 
  {
      try(Connection cn = conexion.getConnection())
      {
          cn.setAutoCommit(false);
          try
          {
              pr.setNumSerie(siguienteSerie(cn));
              int codigo = insertarbase(cn, pr);
              pr.setCodProducto(codigo);
              if (pr instanceof Perfume)
              {
                  insertarPerfume(cn,codigo,(Perfume) pr);
              }
              else
              {
                  insertarAccesorio(cn, codigo, (Accesorio) pr);
              }
              cn.commit();
              return true;
          }
          catch(SQLException x)
          {
              cn.rollback();            
              throw x;
          }
      }
      catch(SQLException e )
      {
         JOptionPane.showMessageDialog(null, "Error al guardar el producto: " + e.getMessage());
         return false;
      }
  }
    private int insertarbase (Connection cn , Producto p) throws SQLException
   {
        String sql = "INSERT INTO catalogo.PRODUCTO "
                + "(num_serie, nom_prod, precio_unidad, stock_actual, cod_inventario) VALUES (?, ?, ?, ?, ?)";
       try (PreparedStatement ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
           ps.setString(1, p.getNumSerie());
           ps.setString(2, p.getNomProd());
           ps.setDouble(3, p.getPrecioUnitario());
           ps.setInt(4, p.getStockActual());
           ps.setInt(5, p.getInventario().getCodInventario());
           ps.executeUpdate();

           try (ResultSet rs = ps.getGeneratedKeys()) {
               rs.next();
               return rs.getInt(1);        
           }
       }
      }
    private void insertarPerfume(Connection cn, int cod, Perfume p) throws SQLException {
        String sql = "INSERT INTO catalogo.PERFUME VALUES (?, ?, ?)";
        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, cod);
            ps.setString(2, p.getGenero());
            ps.setInt(3, p.getContMl());
            ps.executeUpdate();
        }
    }
    private void insertarAccesorio(Connection cn, int cod, Accesorio a) throws SQLException {
        String sql = "INSERT INTO catalogo.ACCESORIO VALUES (?, ?, ?)";
        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, cod);
            ps.setString(2, a.getTipoAccesorio());
            ps.setString(3, a.getMaterial());
            ps.executeUpdate();
        }
    }
    public Producto existefk (String texto)
    {
        if (texto == null || texto.trim().isEmpty()) {
        return null;
        }

        String sql = BASE_SQL + " WHERE num_serie = ? OR nom_prod = ?";

        try (Connection cn = conexion.getConnection();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, texto.trim());
            ps.setString(2, texto.trim());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                     Producto p;
                      if (rs.getString("genero") != null) {
                          p = new Perfume();
                      } else {
                          p = new Accesorio();
                      }
                      p.setCodProducto(rs.getInt("cod_producto"));
                      p.setNomProd(rs.getString("nom_prod"));
                      p.setNumSerie(rs.getString("num_serie"));
                      return p;
                }
            }

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al obtener producto: " + x.getMessage());
        }
        return null;
    }
}