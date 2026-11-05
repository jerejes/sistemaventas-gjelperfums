package Vista;
import java.awt.Container;

public class PanelRegsitroClientes extends javax.swing.JPanel {
    public PanelRegsitroClientes() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        txtDireccionCliente.setBackground(new java.awt.Color(153, 153, 153));
        txtDireccionCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtDireccionCliente.setBorder(null);
        txtDireccionCliente.addActionListener(this::txtDireccionClienteActionPerformed);

        txtNombreCliente.setBackground(new java.awt.Color(153, 153, 153));
        txtNombreCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtNombreCliente.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Gill Sans Nova Cond XBd", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("REGISTRO DE CLIENTES");

        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("Nombre");

        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setForeground(new java.awt.Color(40, 40, 40));
        jLabel4.setText("Dirección");

        jLabel5.setForeground(new java.awt.Color(40, 40, 40));
        jLabel5.setText("DNI");

        jLabel6.setForeground(new java.awt.Color(40, 40, 40));
        jLabel6.setText("Apellido");

        txtApellidoCliente.setBackground(new java.awt.Color(153, 153, 153));
        txtApellidoCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtApellidoCliente.setBorder(null);

        btnCerrarCliente.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarCliente.setText("x");
        btnCerrarCliente.addActionListener(this::btnCerrarClienteActionPerformed);

        btnAgregarCliente.setBackground(new java.awt.Color(51, 153, 0));
        btnAgregarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setText("Guardar");

        btnLimpiarCliente.setBackground(new java.awt.Color(255, 51, 51));
        btnLimpiarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setText("Limpiar ");
        btnLimpiarCliente.setToolTipText("");

        jLabel13.setForeground(new java.awt.Color(40, 40, 40));
        jLabel13.setText("Teléfono");

        jLabel14.setForeground(new java.awt.Color(40, 40, 40));
        jLabel14.setText("Correo Electrónico");

        txtCorreoCliente.setBackground(new java.awt.Color(153, 153, 153));
        txtCorreoCliente.setForeground(new java.awt.Color(40, 40, 40));
        txtCorreoCliente.setBorder(null);

        txtDniCliente1.setBackground(new java.awt.Color(153, 153, 153));
        txtDniCliente1.setForeground(new java.awt.Color(40, 40, 40));
        txtDniCliente1.setBorder(null);

        txtFecNacCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtFecNacCliente.setForeground(new java.awt.Color(255, 255, 255));

        txtDniCliente2.setBackground(new java.awt.Color(153, 153, 153));
        txtDniCliente2.setForeground(new java.awt.Color(40, 40, 40));
        txtDniCliente2.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1)
                            .addGap(42, 42, 42)
                            .addComponent(btnCerrarCliente))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(168, 168, 168)
                            .addComponent(jLabel13))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtDniCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(txtDniCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(111, 111, 111)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txtFecNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4)
                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addComponent(btnCerrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel13))
                    .addGap(2, 2, 2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDniCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDniCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2)
                    .addGap(2, 2, 2)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel6)
                    .addGap(2, 2, 2)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addComponent(jLabel4)
                    .addGap(2, 2, 2)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void btnCerrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarClienteActionPerformed
   Container padre = getParent();
    if (padre != null) {
        padre.remove(this);
        padre.revalidate();
        padre.repaint();
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
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDniCliente1;
    private javax.swing.JTextField txtDniCliente2;
    private com.toedter.calendar.JDateChooser txtFecNacCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
