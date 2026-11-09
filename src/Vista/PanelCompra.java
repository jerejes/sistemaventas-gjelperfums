package Vista;
public class PanelCompra extends javax.swing.JPanel {
    public PanelCompra() {
        initComponents();
        btnEliminarCliente.setIcon(icono("/imagenes/trash.png", 20));
        btnBuscarCompra.setIcon(icono("/imagenes/search.png", 20));
        btnNuevaCompra.setIcon(icono("/imagenes/plus.png", 30));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnBuscarCompra = new javax.swing.JButton();
        btnNuevaCompra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnEliminarCliente = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(" GESTION DE COMPRAS");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btnBuscarCompra.setBackground(new java.awt.Color(0, 102, 255));
        btnBuscarCompra.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnBuscarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCompra.setText("Buscar ");
        btnBuscarCompra.setPreferredSize(new java.awt.Dimension(110, 26));
        jPanel5.add(btnBuscarCompra, java.awt.BorderLayout.LINE_START);

        btnNuevaCompra.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevaCompra.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnNuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCompra.setText(" Compra");
        btnNuevaCompra.setMinimumSize(new java.awt.Dimension(142, 10));
        btnNuevaCompra.setPreferredSize(new java.awt.Dimension(150, 12));
        btnNuevaCompra.addActionListener(this::btnNuevaCompraActionPerformed);
        jPanel5.add(btnNuevaCompra, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("  Buscar Por Codigo");
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 18));
        jPanel3.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jTextField1.setPreferredSize(new java.awt.Dimension(40, 50));
        jTextField1.addActionListener(this::jTextField1ActionPerformed);
        jPanel3.add(jTextField1, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(6, 10));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(300, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 4));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1033, 40));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnEliminarCliente.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarCliente.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(this::btnEliminarClienteActionPerformed);
        jPanel2.add(btnEliminarCliente, java.awt.BorderLayout.LINE_END);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(6, 637));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        add(jPanel6, java.awt.BorderLayout.LINE_START);
    }// </editor-fold>//GEN-END:initComponents

    public  javax.swing.ImageIcon icono(String ruta, int tam) 
    {
    java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
    return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompraActionPerformed
        java.awt.Frame parent = (java.awt.Frame) javax.swing.SwingUtilities.getWindowAncestor(this);
        panelRegistroCompra P = new panelRegistroCompra(parent, true);
        P.setSize(820, 580);
        P.setLocationRelativeTo(this);
        P.setVisible(true);
    }//GEN-LAST:event_btnNuevaCompraActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCompra;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnNuevaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
