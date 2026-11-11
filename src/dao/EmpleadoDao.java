package dao;

import conexionSqlServer.conexion;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empleado;

public class EmpleadoDao {
    private String siguienteSerie(Connection cn) throws SQLException {
        try (Statement st = cn.createStatement(); 
                ResultSet rs = st.executeQuery("SELECT COUNT(*) + 1 FROM rrhh.EMPLEADO")) {
            rs.next();
            return String.format("EMP%05d", rs.getInt(1));
        }
    }
    public void insertarEmpleado(Empleado emp) throws SQLException {
        String sql = "INSERT INTO rrhh.EMPLEADO"
                + "(num_serie, dni, correo, fecha_nac, nombre, apellido, "
                + "telefono, direccion, estado, fecha_ingreso, cargo, cod_emplesupervisor) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection cn = conexion.getConnection()) {
            emp.setNumserie(siguienteSerie(cn));

            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setString(1, emp.getNumserie());
                ps.setString(2, emp.getDni());
                ps.setString(3, emp.getCorreo());
                ps.setDate(4, java.sql.Date.valueOf(emp.getFechanac()));
                ps.setString(5, emp.getNombre());
                ps.setString(6, emp.getApellido());
                ps.setString(7, emp.getTelefono());
                ps.setString(8, emp.getDireccion());
                ps.setString(9, emp.getEstado());
                ps.setDate(10, java.sql.Date.valueOf(emp.getFechaIngreso()));
                ps.setString(11, emp.getCargo());

                if (emp.getSupervisor() == null) {
                    ps.setNull(12, java.sql.Types.INTEGER);
                } else {
                    ps.setInt(12, emp.getSupervisor().getCodPersona());
                }
                ps.executeUpdate();
            }
        }
    }
    public DefaultTableModel buscarEmpleado(String texto) {
        String[] titulos = {
            "N° Serie", "DNI", "Correo", "Nombre",
            "Apellido", "Teléfono", "Dirección",
            "Fecha de nacimiento", "Fecha de ingreso",
            "Cargo", "Estado"
        };

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "SELECT * FROM rrhh.EMPLEADO";

        if (texto != null && !texto.isBlank()) {
            sql += " WHERE num_serie LIKE ? "
                    + "OR nombre LIKE ? "
                    + "OR dni LIKE ? "
                    + "OR apellido LIKE ? "
                    + "OR cargo LIKE ?";
        }

        sql += " ORDER BY num_serie";

        try (Connection cn = conexion.getConnection(); PreparedStatement ps = cn.prepareStatement(sql)) {

            if (texto != null && !texto.isBlank()) {
                String buscar = "%" + texto.trim() + "%";

                ps.setString(1, buscar);
                ps.setString(2, buscar);
                ps.setString(3, buscar);
                ps.setString(4, buscar);
                ps.setString(5, buscar);
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Empleado emp = new Empleado(
                            rs.getInt("cod_empleado"),
                            rs.getString("dni"),
                            rs.getString("correo"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("telefono"),
                            rs.getString("direccion"),
                            rs.getDate("fecha_nac").toLocalDate(),
                            rs.getDate("fecha_ingreso").toLocalDate(),
                            null,
                            rs.getString("num_serie"),
                            rs.getString("cargo"),
                            rs.getString("estado")
                    );

                    modelo.addRow(emp.mostrarDatos());
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "No se pudieron cargar los empleados.\n"
                    + "Inténtelo nuevamente.\n" + e.getMessage(),
                    "Error al buscar empleados",
                    JOptionPane.ERROR_MESSAGE);
        }

        return modelo;
    }
    public DefaultComboBoxModel<Empleado> listarSupervisores() 
    {
        DefaultComboBoxModel<Empleado> modelo = new DefaultComboBoxModel<>();
        String sql = "SELECT cod_empleado, nombre, apellido FROM rrhh.EMPLEADO "
                + "WHERE cargo = 'Supervisor' AND estado = 'ACTIVO'";

        try (Connection cn = conexion.getConnection(); 
                Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Empleado e = new Empleado();
                e.setCodPersona(rs.getInt("cod_empleado"));
                e.setNombre(rs.getString("nombre"));
                e.setApellido(rs.getString("apellido"));
                modelo.addElement(e);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return modelo;
    }
}
