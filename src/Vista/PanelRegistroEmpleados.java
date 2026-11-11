package Vista;
import dao.EmpleadoDao;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import modelo.Empleado;

public class PanelRegistroEmpleados extends javax.swing.JPanel {
    private final EmpleadoDao dao = new EmpleadoDao();
    
    public PanelRegistroEmpleados() {
        initComponents();
     btnguardaremp.setIcon(icono("/imagenes/finalizarcompra.png", 20));
     btnLimpiaremp.setIcon(icono("/imagenes/Limpiar.png", 20));

    cmbcargo.setModel(new javax.swing.DefaultComboBoxModel<>(
     new String[]{"Supervisor", "Almacenero", "Vendedor"}));

    cmbsupervisor.setModel(dao.listarSupervisores());

    txtFecNac.setMaxSelectableDate(new java.util.Date());

    cmbcargo.addActionListener(e -> actualizarSupervisor());
   actualizarSupervisor();
//    btnguardaremp.addActionListener(e -> guardar());
    btnLimpiaremp.addActionListener(e -> limpiar());
    }

    private void limpiar() {
        txtDni.setText("");
        txttelf.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtFecNac.setDate(null);
        txtFecingreso.setDate(null);
        cmbcargo.setSelectedIndex(0);
        actualizarSupervisor();
        txtDni.requestFocus();
    }
    private void actualizarSupervisor() 
    {
    boolean esSupervisor = "Supervisor".equals(cmbcargo.getSelectedItem());
    jLabel9.setVisible(!esSupervisor);          // la etiqueta "supervisor"
    cmbsupervisor.setVisible(!esSupervisor);    // el combo
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new modelo.PanelRedondeado();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCerrarempleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFecingreso = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnguardaremp = new javax.swing.JButton();
        btnLimpiaremp = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFecNac = new com.toedter.calendar.JDateChooser();
        cmbcargo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbsupervisor = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVO REGISTRO DE EMPLEADO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setForeground(new java.awt.Color(40, 40, 40));
        txtDni.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 40));

        jLabel5.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txttelf.setBackground(new java.awt.Color(255, 255, 255));
        txttelf.setForeground(new java.awt.Color(40, 40, 40));
        txttelf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txttelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 170, 40));

        jLabel13.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Teléfono");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        btnCerrarempleado.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarempleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarempleado.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarempleado.setText("x");
        btnCerrarempleado.addActionListener(this::btnCerrarempleadoActionPerformed);
        jPanel1.add(btnCerrarempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 35));

        jLabel2.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 40));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(40, 40, 40));
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 50));

        jLabel6.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 40));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setForeground(new java.awt.Color(40, 40, 40));
        txtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 360, 40));

        jLabel14.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Correo Electrónico");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, 30));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(40, 40, 40));
        txtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 210, 40));

        jLabel3.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cargo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 60, 30));

        txtFecingreso.setBackground(new java.awt.Color(255, 255, 255));
        txtFecingreso.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFecingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 140, 40));

        jLabel4.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 60, 30));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(40, 40, 40));
        txtDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 40));

        btnguardaremp.setBackground(new java.awt.Color(0, 102, 102));
        btnguardaremp.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        btnguardaremp.setForeground(new java.awt.Color(255, 255, 255));
        btnguardaremp.setText("Guardar");
        btnguardaremp.addActionListener(this::btnguardarempActionPerformed);
        jPanel1.add(btnguardaremp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 130, 50));

        btnLimpiaremp.setBackground(new java.awt.Color(0, 102, 204));
        btnLimpiaremp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiaremp.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiaremp.setText("Limpiar ");
        btnLimpiaremp.setToolTipText("");
        jPanel1.add(btnLimpiaremp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 130, 50));

        jLabel7.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 130, 30));

        txtFecNac.setBackground(new java.awt.Color(255, 255, 255));
        txtFecNac.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 140, 40));

        cmbcargo.setBackground(new java.awt.Color(255, 255, 255));
        cmbcargo.setForeground(new java.awt.Color(0, 0, 0));
        cmbcargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbcargo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(cmbcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 170, 40));

        jLabel8.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de Ingreso");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 110, 30));

        jLabel9.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("supervisor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 60, 30));

        cmbsupervisor.setBackground(new java.awt.Color(255, 255, 255));
        cmbsupervisor.setForeground(new java.awt.Color(0, 0, 0));
        cmbsupervisor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(cmbsupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 160, 40));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    private void btnCerrarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarempleadoActionPerformed
       int x = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar?", "CERRAR",
                JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
    }//GEN-LAST:event_btnCerrarempleadoActionPerformed

    private void btnguardarempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarempActionPerformed
       
        // Obtener los datos
        String dni = txtDni.getText().trim();
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String correo = txtCorreo.getText().trim();
        String telefono = txttelf.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String cargo = (String) cmbcargo.getSelectedItem();

        // Validar campos vacíos
        if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty()
                || correo.isEmpty() || direccion.isEmpty()
                || cargo == null || txtFecNac.getDate() == null
                || txtFecingreso.getDate() == null) {

            JOptionPane.showMessageDialog(this,
                    "Complete todos los campos obligatorios.",
                    "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar DNI: 8 dígitos
        if (!dni.matches("[0-9]{8}")) {
            JOptionPane.showMessageDialog(this,
                    "El DNI debe contener exactamente 8 dígitos.",
                    "DNI inválido", JOptionPane.WARNING_MESSAGE);
            txtDni.requestFocus();
            return;
        }

        // Validar teléfono: 9 dígitos (si se ingresó)
        if (!telefono.isEmpty() && !telefono.matches("[0-9]{9}")) {
            JOptionPane.showMessageDialog(this,
                    "El teléfono debe contener exactamente 9 dígitos.",
                    "Teléfono inválido", JOptionPane.WARNING_MESSAGE);
            txttelf.requestFocus();
            return;
        }

        // Validar correo
        if (!correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese un correo electrónico válido.",
                    "Correo inválido", JOptionPane.WARNING_MESSAGE);
            txtCorreo.requestFocus();
            return;
        }

        // Convertir fechas
        java.time.LocalDate fechaNac = txtFecNac.getDate().toInstant()
                .atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        java.time.LocalDate fechaIngreso = txtFecingreso.getDate().toInstant()
                .atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        // Validar fechas
        if (fechaNac.isAfter(java.time.LocalDate.now())) {
            JOptionPane.showMessageDialog(this,
                    "La fecha de nacimiento no puede ser futura.",
                    "Fecha inválida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (fechaIngreso.isBefore(fechaNac)) {
            JOptionPane.showMessageDialog(this,
                    "La fecha de ingreso no puede ser anterior al nacimiento.",
                    "Fecha inválida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener supervisor
        Empleado supervisor = null;

        if (!"Supervisor".equals(cargo)) {
            supervisor = (Empleado) cmbsupervisor.getSelectedItem();

            if (supervisor == null) {
                JOptionPane.showMessageDialog(this,
                        "Seleccione un supervisor.",
                        "Supervisor requerido", JOptionPane.WARNING_MESSAGE);
                cmbsupervisor.requestFocus();
                return;
            }
        }

                Empleado emp = new Empleado(
                  dni,
                  correo,
                  nombre,
                  apellido,
                  telefono,
                  direccion,
                  fechaNac,
                  fechaIngreso,
                  supervisor,
                  cargo,
                  "ACTIVO"
          );

        // Insertar en la base de datos
        try {
            dao.insertarEmpleado(emp);

            JOptionPane.showMessageDialog(this,
                    "Empleado registrado correctamente.",
                    "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

            cmbsupervisor.setModel(dao.listarSupervisores());
            limpiar();

        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(this,
                    "No se pudo registrar el empleado.\n" + e.getMessage(),
                    "Error al registrar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnguardarempActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarempleado;
    private javax.swing.JButton btnLimpiaremp;
    private javax.swing.JButton btnguardaremp;
    private javax.swing.JComboBox<String> cmbcargo;
    private javax.swing.JComboBox<Empleado> cmbsupervisor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private com.toedter.calendar.JDateChooser txtFecNac;
    private com.toedter.calendar.JDateChooser txtFecingreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txttelf;
    // End of variables declaration//GEN-END:variables
}
