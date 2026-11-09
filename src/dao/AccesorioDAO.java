package dao;

import conexionSqlServer.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Accesorio;

public class AccesorioDAO {
    public boolean buscarproducto(Accesorio asc) {
        String sql = "SELECT p.nom_prod "
                + "FROM productos.vw_producto p "
                + "WHERE p.nom_prod = ? "
                + "AND p.material = ? "
                + "AND p.tipo_accesorio = ?";
        try (Connection cn = conexion.getConnection(); 
                PreparedStatement st = cn.prepareStatement(sql)) {
            st.setString(1, asc.getNomProd());
            st.setString(2, asc.getMaterial());
            st.setString(3, asc.getTipoAccesorio());
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
