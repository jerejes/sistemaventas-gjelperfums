package Vista;

public class jdNuevaBoletaPago extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(jdNuevaBoletaPago.class.getName());

    public jdNuevaBoletaPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetallesBP = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        txtBonificacionBP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescPensBP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBonificacionBP1 = new javax.swing.JTextField();
        txtDescuentoBP = new javax.swing.JTextField();
        txtSalarioBP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFechaPaogBP = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDniBP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelarBPago = new javax.swing.JButton();
        btnAgregarBPago = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDetallesBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDetallesBP.setColumns(20);
        txtDetallesBP.setLineWrap(true);
        txtDetallesBP.setRows(5);
        txtDetallesBP.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDetallesBP);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 70));

        jLabel15.setForeground(new java.awt.Color(40, 40, 40));
        jLabel15.setText("Detalles:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtBonificacionBP.setBackground(new java.awt.Color(240, 240, 240));
        txtBonificacionBP.setForeground(new java.awt.Color(40, 40, 40));
        txtBonificacionBP.setBorder(null);
        jPanel1.add(txtBonificacionBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        jLabel12.setForeground(new java.awt.Color(40, 40, 40));
        jLabel12.setText("Bonificacion:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtDescPensBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDescPensBP.setForeground(new java.awt.Color(40, 40, 40));
        txtDescPensBP.setBorder(null);
        jPanel1.add(txtDescPensBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 90, 30));

        jLabel13.setForeground(new java.awt.Color(40, 40, 40));
        jLabel13.setText("Desc. Pensión:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel17.setForeground(new java.awt.Color(40, 40, 40));
        jLabel17.setText("Total (solo ver):");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        txtBonificacionBP1.setBackground(new java.awt.Color(153, 153, 153));
        txtBonificacionBP1.setForeground(new java.awt.Color(40, 40, 40));
        txtBonificacionBP1.setBorder(null);
        jPanel1.add(txtBonificacionBP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 80, 30));

        txtDescuentoBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDescuentoBP.setForeground(new java.awt.Color(40, 40, 40));
        txtDescuentoBP.setBorder(null);
        jPanel1.add(txtDescuentoBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 80, 30));

        txtSalarioBP.setBackground(new java.awt.Color(240, 240, 240));
        txtSalarioBP.setForeground(new java.awt.Color(40, 40, 40));
        txtSalarioBP.setBorder(null);
        jPanel1.add(txtSalarioBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 30));

        jLabel10.setForeground(new java.awt.Color(40, 40, 40));
        jLabel10.setText("Salario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel11.setForeground(new java.awt.Color(40, 40, 40));
        jLabel11.setText("Descuento:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel1.add(txtFechaPaogBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 170, 30));

        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("Fecha Pago:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 20));

        jLabel14.setForeground(new java.awt.Color(40, 40, 40));
        jLabel14.setText("DNI del Empleado:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtDniBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDniBP.setForeground(new java.awt.Color(40, 40, 40));
        txtDniBP.setBorder(null);
        jPanel1.add(txtDniBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 30));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("NUEVA BOLETA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnCancelarBPago.setBackground(new java.awt.Color(180, 180, 180));
        btnCancelarBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarBPago.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarBPago.setText("Cancelar");
        btnCancelarBPago.addActionListener(this::btnCancelarBPagoActionPerformed);
        jPanel1.add(btnCancelarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, 35));

        btnAgregarBPago.setBackground(new java.awt.Color(180, 180, 180));
        btnAgregarBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarBPago.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarBPago.setText("Agregar");
        btnAgregarBPago.addActionListener(this::btnAgregarBPagoActionPerformed);
        jPanel1.add(btnAgregarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 140, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarBPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBPagoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAgregarBPagoActionPerformed

    private void btnCancelarBPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBPagoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarBPagoActionPerformed

    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBPago;
    private javax.swing.JButton btnCancelarBPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBonificacionBP;
    private javax.swing.JTextField txtBonificacionBP1;
    private javax.swing.JTextField txtDescPensBP;
    private javax.swing.JTextField txtDescuentoBP;
    private javax.swing.JTextArea txtDetallesBP;
    private javax.swing.JTextField txtDniBP;
    private com.toedter.calendar.JDateChooser txtFechaPaogBP;
    private javax.swing.JTextField txtSalarioBP;
    // End of variables declaration//GEN-END:variables
}
