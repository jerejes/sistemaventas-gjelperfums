/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

/**
 *
 * @author JULIAN
 */
public class jdNuevoUsuario extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(jdNuevoUsuario.class.getName());

    /**
     * Creates new form jdNuevoUsuario
     */
    public jdNuevoUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoU = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombreU = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContraseñaU = new javax.swing.JTextField();
        btnAgregarUsuario = new javax.swing.JButton();
        btnCancelarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(40, 40, 40));
        jLabel6.setText("Código:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtCodigoU.setBackground(new java.awt.Color(240, 240, 240));
        txtCodigoU.setForeground(new java.awt.Color(40, 40, 40));
        txtCodigoU.setBorder(null);
        jPanel1.add(txtCodigoU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 23));

        jLabel7.setForeground(new java.awt.Color(40, 40, 40));
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtNombreU.setBackground(new java.awt.Color(240, 240, 240));
        txtNombreU.setForeground(new java.awt.Color(40, 40, 40));
        txtNombreU.setBorder(null);
        jPanel1.add(txtNombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 210, 23));

        jLabel8.setForeground(new java.awt.Color(40, 40, 40));
        jLabel8.setText("Contraseña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtContraseñaU.setBackground(new java.awt.Color(240, 240, 240));
        txtContraseñaU.setForeground(new java.awt.Color(40, 40, 40));
        txtContraseñaU.setBorder(null);
        jPanel1.add(txtContraseñaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 210, 23));

        btnAgregarUsuario.setText("Agregar");
        btnAgregarUsuario.addActionListener(this::btnAgregarUsuarioActionPerformed);
        jPanel1.add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, 30));

        btnCancelarUsuario.setText("Cancelar");
        btnCancelarUsuario.addActionListener(this::btnCancelarUsuarioActionPerformed);
        jPanel1.add(btnCancelarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarUsuarioActionPerformed

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnCancelarUsuario;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoU;
    private javax.swing.JTextField txtContraseñaU;
    private javax.swing.JTextField txtNombreU;
    // End of variables declaration//GEN-END:variables
}
