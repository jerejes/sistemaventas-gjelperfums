package dao;
import java.sql.*;
import modelo.Perfume;
import conexionSqlServer.conexion;
import javax.swing.JOptionPane;
import modelo.Producto;
public class PerfumeDAO 
{
    public boolean buscarproducto(Perfume perf) {
        String sql = "SELECT p.nom_prod "
                + "FROM productos.vw_producto p "
                + "WHERE p.nom_prod = ? "
                + "AND p.genero = ? "
                + "AND p.cont_ml = ?";

        try (Connection cn = conexion.getConnection(); PreparedStatement st = cn.prepareStatement(sql)) {

            st.setString(1, perf.getNomProd());
            st.setString(2, perf.getGenero());
            st.setInt(3, perf.getContMl());

            try (ResultSet rs = st.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                    null, "Error al buscar el producto: " + e.getMessage()
            );
        }
        return false;
    }
}
