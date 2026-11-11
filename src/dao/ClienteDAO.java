package dao;
import conexionSqlServer.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Proveedor;

public class ClienteDAO {
    private String siguienteSerie(Connection cn) throws SQLException {
        try (Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) + 1 FROM VENTAS.CLIENTE")) {
            rs.next();
            return String.format("CLI%05d", rs.getInt(1));
        }
    }
    public void insertarCliente(Cliente cli) throws SQLException {
        String sql = "INSERT INTO VENTAS.CLIENTE "
                + "(num_serie, dni, correo, fecha_nac, nombre, apellido, "
                + "telefono, direccion, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection cn = conexion.getConnection()) {
            cli.setNumserie(siguienteSerie(cn));
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setString(1, cli.getNumserie());
                ps.setString(2, cli.getDni());
                ps.setString(3, cli.getCorreo());
                ps.setDate(4, java.sql.Date.valueOf(cli.getFechanac()));
                ps.setString(5, cli.getNombre());
                ps.setString(6, cli.getApellido());
                ps.setString(7, cli.getTelefono());
                ps.setString(8, cli.getDireccion());
                ps.setString(9, cli.getEstado());
                ps.executeUpdate();
            }
        }
    }
    public String existe(Cliente cli)
    {
    String sql = "SELECT dni, telefono, correo FROM VENTAS.CLIENTE WHERE correo=? OR dni=? OR telefono=?";
    
    try (Connection cn = conexion.getConnection();
         PreparedStatement ps = cn.prepareStatement(sql)) {
         
        ps.setString(1, cli.getCorreo());
        ps.setString(2, cli.getDni());
        ps.setString(3, cli.getTelefono());
        
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String dniBD = rs.getString("dni");
                String telfBD = rs.getString("telefono");
                String correoBD = rs.getString("correo");
                if (cli.getDni().equals(dniBD)) {
                    return "dni";
                }
                if (cli.getTelefono().equals(telfBD)) {
                    return "telefono";
                }
                if (cli.getCorreo().equalsIgnoreCase(correoBD)) {
                    return "correo";
                }
            }
        }
    } catch (SQLException x) {
        JOptionPane.showMessageDialog(null, "Error al validar los datos duplicados: " + x.getMessage());
    }
    return "ninguno"; 
    }
    public DefaultTableModel buscarCliente(String texto) 
    {
        String[] titulos = {"N° Serie", "DNI", "Correo", "Nombre", 
            "Apellido", "Teléfono", "Dirección", "Fecha de nacimiento", "Estado"};
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String sql = "SELECT * FROM VENTAS.CLIENTE ";
        if (texto != null && !texto.isBlank()) {
            sql += " WHERE num_serie LIKE ? "
                    + "OR nombre LIKE ? "
                    + "OR dni LIKE ? ";
        }
        sql += " ORDER BY cod_cliente";
        try (Connection cn = conexion.getConnection(); 
                PreparedStatement ps = cn.prepareStatement(sql)) {

            if (texto != null && !texto.isBlank()) {
                String buscar = "%" + texto.trim() + "%";
                ps.setString(1, buscar);
                ps.setString(2, buscar);
                ps.setString(3, buscar);
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Cliente cli = new Cliente(
                            rs.getInt("cod_cliente"),
                            rs.getString("dni"),
                            rs.getString("correo"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("telefono"),
                            rs.getString("direccion"),
                            rs.getDate("fecha_nac").toLocalDate(),
                            rs.getString("num_serie"),
                            rs.getString("estado")
                    );
                    modelo.addRow(cli.mostrarDatos());
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron cargar los proveedores.\n"
                    + "Inténtelo nuevamente.\n" + e.getMessage(), "Error al buscar proveedores",
                    JOptionPane.ERROR_MESSAGE);
        }
        return modelo;
    }
}

