package dao;

import conexionSqlServer.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Cliente;
import modelo.Proveedor;

public class ClienteDAO {
    private String siguienteSerie(Connection cn) throws SQLException {
        try (Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) + 1 FROM ventas.CLIENTE")) {
            rs.next();
            return String.format("CLI%05d", rs.getInt(1));
        }
    }
    public void insertarCliente(Cliente cli) throws SQLException {
        String sql = "INSERT INTO ventas.CLIENTE "
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
}
