package Vista;
import javax.swing.JOptionPane;
public class PanelRegistroEmpleados extends javax.swing.JPanel {

    public PanelRegistroEmpleados() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new modelo.PanelRedondeado();
        jLabel1 = new javax.swing.JLabel();
        txtDniCliente2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDniCliente1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCerrarempleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFecNacCliente = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFecNacCliente1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

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

        txtDniCliente2.setBackground(new java.awt.Color(255, 255, 255));
        txtDniCliente2.setForeground(new java.awt.Color(40, 40, 40));
        txtDniCliente2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtDniCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 40));

        jLabel5.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DNI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtDniCliente1.setBackground(new java.awt.Color(255, 255, 255));
        txtDniCliente1.setForeground(new java.awt.Color(40, 40, 40));
        txtDniCliente1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtDniCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 170, 40));

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

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtNombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 360, 50));

        jLabel6.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 40));

        txtApellidoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtApellidoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 360, 40));

        jLabel14.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Correo Electrónico");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, 30));

        txtCorreoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtCorreoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 210, 40));

        jLabel3.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cargo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 60, 30));

        txtFecNacCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtFecNacCliente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFecNacCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 140, 40));

        jLabel4.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 60, 30));

        txtDireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtDireccionCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 210, 40));

        btnAgregarCliente.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setText("Guardar");
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 120, 40));

        btnLimpiarCliente.setBackground(new java.awt.Color(255, 51, 51));
        btnLimpiarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setText("Limpiar ");
        btnLimpiarCliente.setToolTipText("");
        jPanel1.add(btnLimpiarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 110, 40));

        jLabel7.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 130, 30));

        txtFecNacCliente1.setBackground(new java.awt.Color(255, 255, 255));
        txtFecNacCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFecNacCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 140, 40));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 120, 40));

        jLabel8.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de Ingreso");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 110, 30));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarempleadoActionPerformed
       int x = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar?", "CERRAR",
                JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
    }//GEN-LAST:event_btnCerrarempleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCerrarempleado;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDniCliente1;
    private javax.swing.JTextField txtDniCliente2;
    private com.toedter.calendar.JDateChooser txtFecNacCliente;
    private com.toedter.calendar.JDateChooser txtFecNacCliente1;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
