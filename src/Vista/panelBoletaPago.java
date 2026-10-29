package Vista;

public class panelBoletaPago extends javax.swing.JPanel {

    public panelBoletaPago() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDniBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoletasPagoGen = new javax.swing.JTable();
        btnNuevaBP = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("Busqueda por DNI:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 40, 40));
        jLabel2.setText("BOLETAS DE PAGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtDniBuscar.setBackground(new java.awt.Color(240, 240, 240));
        txtDniBuscar.setForeground(new java.awt.Color(40, 40, 40));
        txtDniBuscar.setBorder(null);
        jPanel1.add(txtDniBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        tblBoletasPagoGen.setBackground(new java.awt.Color(200, 200, 200));
        tblBoletasPagoGen.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBoletasPagoGen);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 880, 360));

        btnNuevaBP.setText("Nueva Boleta");
        btnNuevaBP.addActionListener(this::btnNuevaBPActionPerformed);
        jPanel1.add(btnNuevaBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 170, 40));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaBPActionPerformed
        jdNuevaBoletaPago jdNuevaBP = new jdNuevaBoletaPago(null, true);
        jdNuevaBP.setTitle("Nueva boleta de pago");
        jdNuevaBP.setLocationRelativeTo(null);
        jdNuevaBP.setResizable(false);
        jdNuevaBP.setVisible(true);
        
    }//GEN-LAST:event_btnNuevaBPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaBP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBoletasPagoGen;
    private javax.swing.JTextField txtDniBuscar;
    // End of variables declaration//GEN-END:variables
}
