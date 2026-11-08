package Vista;
import javax.swing.JOptionPane;
        
public class PanelRegsitroClientes extends javax.swing.JPanel {
    public boolean cerra;
    public PanelRegsitroClientes() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new modelo.PanelRedondeado();
        txtDireccionCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        btnCerrarCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        txtDniCliente1 = new javax.swing.JTextField();
        txtFecNacCliente = new com.toedter.calendar.JDateChooser();
        txtDniCliente2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtDireccionCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 451, 340, 48));

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtNombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        txtNombreCliente.setPreferredSize(new java.awt.Dimension(44, 18));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 237, 340, 47));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVO REGISTRO DE CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 218, -1, -1));

        jLabel3.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 359, -1, 20));

        jLabel4.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(40, 40, 40));
        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 432, -1, -1));

        jLabel5.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(40, 40, 40));
        jLabel5.setText("DNI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 149, -1, -1));

        jLabel6.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(40, 40, 40));
        jLabel6.setText("Apellido");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 290, -1, -1));

        txtApellidoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtApellidoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        txtApellidoCliente.setPreferredSize(new java.awt.Dimension(44, 18));
        jPanel1.add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 309, 340, 44));

        btnCerrarCliente.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarCliente.setText("x");
        btnCerrarCliente.addActionListener(this::btnCerrarClienteActionPerformed);
        jPanel1.add(btnCerrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 2, -1, 35));

        btnAgregarCliente.setBackground(new java.awt.Color(0, 153, 153));
        btnAgregarCliente.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setText("Guardar");
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 552, 150, 50));

        btnLimpiarCliente.setBackground(new java.awt.Color(255, 51, 51));
        btnLimpiarCliente.setFont(new java.awt.Font("Square721 Cn BT", 1, 14)); // NOI18N
        btnLimpiarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setText("Limpiar ");
        btnLimpiarCliente.setToolTipText("");
        jPanel1.add(btnLimpiarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 552, 140, 50));

        jLabel13.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(40, 40, 40));
        jLabel13.setText("Teléfono");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 149, -1, -1));

        jLabel14.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(40, 40, 40));
        jLabel14.setText("Correo Electrónico");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 361, -1, -1));

        txtCorreoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtCorreoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        txtCorreoCliente.setMinimumSize(new java.awt.Dimension(30, 18));
        txtCorreoCliente.setPreferredSize(new java.awt.Dimension(44, 18));
        jPanel1.add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 381, 210, 45));

        txtDniCliente1.setBackground(new java.awt.Color(255, 255, 255));
        txtDniCliente1.setForeground(new java.awt.Color(40, 40, 40));
        txtDniCliente1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        txtDniCliente1.setPreferredSize(new java.awt.Dimension(44, 18));
        jPanel1.add(txtDniCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 168, 150, 44));

        txtFecNacCliente.setBackground(new java.awt.Color(0, 102, 102));
        txtFecNacCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtFecNacCliente.setOpaque(false);
        jPanel1.add(txtFecNacCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 381, 122, 45));

        txtDniCliente2.setBackground(new java.awt.Color(255, 255, 255));
        txtDniCliente2.setForeground(new java.awt.Color(40, 40, 40));
        txtDniCliente2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        txtDniCliente2.setPreferredSize(new java.awt.Dimension(44, 18));
        jPanel1.add(txtDniCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 168, 178, 44));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarClienteActionPerformed
         int x = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar?", "CERRAR",
                JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
    }//GEN-LAST:event_btnCerrarClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCerrarCliente;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDniCliente1;
    private javax.swing.JTextField txtDniCliente2;
    private com.toedter.calendar.JDateChooser txtFecNacCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
