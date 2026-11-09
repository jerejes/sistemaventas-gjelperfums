package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Inventario;
import conexionSqlServer.conexion;
import javax.swing.JOptionPane;
public class InventarioDAO {
    
    public Inventario obtener() {
        String sql = "SELECT cod_inventario, nombre FROM productos.INVENTARIO";
        try (Connection cn = conexion.getConnection();
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                return new Inventario(rs.getInt("cod_inventario"), rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el inventario: " + ex.getMessage());
        }
        return null;
    }
}
