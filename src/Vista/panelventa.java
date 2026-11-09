package Vista;

public class panelventa extends javax.swing.JPanel {

    public panelventa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarBPago = new javax.swing.JButton();
        btnLimpiarBPago = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoletaPago = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        lblCantidadBPago = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtDniBP = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtDniBP1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtDniBP2 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox6 = new javax.swing.JComboBox<>();
        btnAgregarBPago1 = new javax.swing.JButton();
        btnEliminarBPago = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        btnAgregarBPago.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregarBPago.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnAgregarBPago.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarBPago.setText("Guardar Venta");
        btnAgregarBPago.addActionListener(this::btnAgregarBPagoActionPerformed);
        jPanel1.add(btnAgregarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, 50));

        btnLimpiarBPago.setBackground(new java.awt.Color(255, 51, 102));
        btnLimpiarBPago.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnLimpiarBPago.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarBPago.setText("Cancelar Venta");
        jPanel1.add(btnLimpiarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 150, 50));

        jScrollPane1.setBorder(null);

        tblBoletaPago.setBackground(new java.awt.Color(204, 204, 204));
        tblBoletaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBoletaPago);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 540, 440));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cantidad de Registros:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 160, -1));

        lblCantidadBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidadBPago.setForeground(new java.awt.Color(40, 40, 40));
        lblCantidadBPago.setText("0");
        jPanel1.add(lblCantidadBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 50, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        txtDniBP.setBackground(new java.awt.Color(51, 51, 51));
        txtDniBP.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        txtDniBP.setForeground(new java.awt.Color(40, 40, 40));
        txtDniBP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "DNI Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        txtDniBP.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel2.add(txtDniBP);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setOpaque(false);

        txtDniBP1.setBackground(new java.awt.Color(51, 51, 51));
        txtDniBP1.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        txtDniBP1.setForeground(new java.awt.Color(40, 40, 40));
        txtDniBP1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "DNI | Codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        txtDniBP1.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel3.add(txtDniBP1);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 200, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);

        txtDniBP2.setBackground(new java.awt.Color(51, 51, 51));
        txtDniBP2.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        txtDniBP2.setForeground(new java.awt.Color(40, 40, 40));
        txtDniBP2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Codigo | Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        txtDniBP2.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel4.add(txtDniBP2);

        jSpinner1.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jSpinner1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jSpinner1.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel4.add(jSpinner1);

        jComboBox6.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox6.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jComboBox6.setPreferredSize(new java.awt.Dimension(100, 50));
        jComboBox6.addActionListener(this::jComboBox6ActionPerformed);
        jPanel4.add(jComboBox6);

        btnAgregarBPago1.setBackground(new java.awt.Color(0, 102, 204));
        btnAgregarBPago1.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnAgregarBPago1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarBPago1.setText("Agregar Producto");
        btnAgregarBPago1.setPreferredSize(new java.awt.Dimension(152, 40));
        btnAgregarBPago1.addActionListener(this::btnAgregarBPago1ActionPerformed);
        jPanel4.add(btnAgregarBPago1);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 380, 140));

        btnEliminarBPago.setBackground(new java.awt.Color(204, 0, 51));
        btnEliminarBPago.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnEliminarBPago.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarBPago.setText("Eliminar Producto");
        btnEliminarBPago.setActionCommand(" Producto");
        btnEliminarBPago.addActionListener(this::btnEliminarBPagoActionPerformed);
        jPanel1.add(btnEliminarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, 50));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 920, 520));

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void btnAgregarBPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarBPagoActionPerformed

    private void btnAgregarBPago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBPago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarBPago1ActionPerformed

    private void btnEliminarBPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarBPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBPago;
    private javax.swing.JButton btnAgregarBPago1;
    private javax.swing.JButton btnEliminarBPago;
    private javax.swing.JButton btnLimpiarBPago;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblCantidadBPago;
    private javax.swing.JTable tblBoletaPago;
    private javax.swing.JTextField txtDniBP;
    private javax.swing.JTextField txtDniBP1;
    private javax.swing.JTextField txtDniBP2;
    // End of variables declaration//GEN-END:variables
}
