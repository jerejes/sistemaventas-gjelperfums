package Vista;

public class panelBoletaPago_SIN_USAR extends javax.swing.JPanel {

    public panelBoletaPago_SIN_USAR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        txtSalarioBP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDescuentoBP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBonificacionBP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDescPensBP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarBPago = new javax.swing.JButton();
        btnLimpiarBPago = new javax.swing.JButton();
        btnEliminarBPago = new javax.swing.JButton();
        btnCerrarBPago = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoletaPago = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        lblCantidadBPago = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDetallesBP = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txtDniBP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBonificacionBP1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFechaPaogBP = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSalarioBP.setBackground(new java.awt.Color(240, 240, 240));
        txtSalarioBP.setForeground(new java.awt.Color(40, 40, 40));
        txtSalarioBP.setBorder(null);
        jPanel1.add(txtSalarioBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));

        jLabel10.setForeground(new java.awt.Color(40, 40, 40));
        jLabel10.setText("Salario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel11.setForeground(new java.awt.Color(40, 40, 40));
        jLabel11.setText("Descuento:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        txtDescuentoBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDescuentoBP.setForeground(new java.awt.Color(40, 40, 40));
        txtDescuentoBP.setBorder(null);
        jPanel1.add(txtDescuentoBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, 30));

        jLabel12.setForeground(new java.awt.Color(40, 40, 40));
        jLabel12.setText("Bonificacion:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtBonificacionBP.setBackground(new java.awt.Color(240, 240, 240));
        txtBonificacionBP.setForeground(new java.awt.Color(40, 40, 40));
        txtBonificacionBP.setBorder(null);
        jPanel1.add(txtBonificacionBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 30));

        jLabel13.setForeground(new java.awt.Color(40, 40, 40));
        jLabel13.setText("Descuento Pensión:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        txtDescPensBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDescPensBP.setForeground(new java.awt.Color(40, 40, 40));
        txtDescPensBP.setBorder(null);
        jPanel1.add(txtDescPensBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 30));

        jLabel15.setForeground(new java.awt.Color(40, 40, 40));
        jLabel15.setText("Detalles:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("BOLETA DE PAGO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnAgregarBPago.setBackground(new java.awt.Color(180, 180, 180));
        btnAgregarBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarBPago.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarBPago.setText("Agregar");
        jPanel1.add(btnAgregarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 150, 35));

        btnLimpiarBPago.setBackground(new java.awt.Color(180, 180, 180));
        btnLimpiarBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiarBPago.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarBPago.setText("Limpiar Campos");
        jPanel1.add(btnLimpiarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 150, 35));

        btnEliminarBPago.setBackground(new java.awt.Color(180, 180, 180));
        btnEliminarBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarBPago.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarBPago.setText("Eliminar");
        jPanel1.add(btnEliminarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 150, 35));

        btnCerrarBPago.setBackground(new java.awt.Color(180, 180, 180));
        btnCerrarBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarBPago.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarBPago.setText("Cerrar");
        jPanel1.add(btnCerrarBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 150, 35));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 540, 440));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(40, 40, 40));
        jLabel16.setText("Cantidad de Registros:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        lblCantidadBPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidadBPago.setForeground(new java.awt.Color(40, 40, 40));
        lblCantidadBPago.setText("0");
        jPanel1.add(lblCantidadBPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 50, -1));

        txtDetallesBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDetallesBP.setColumns(20);
        txtDetallesBP.setLineWrap(true);
        txtDetallesBP.setRows(5);
        txtDetallesBP.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDetallesBP);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 90));

        jLabel14.setForeground(new java.awt.Color(40, 40, 40));
        jLabel14.setText("DNI del Empleado:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtDniBP.setBackground(new java.awt.Color(240, 240, 240));
        txtDniBP.setForeground(new java.awt.Color(40, 40, 40));
        txtDniBP.setBorder(null);
        jPanel1.add(txtDniBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 30));

        jLabel3.setForeground(new java.awt.Color(40, 40, 40));
        jLabel3.setText("Fecha Pago:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 20));

        txtBonificacionBP1.setBackground(new java.awt.Color(153, 153, 153));
        txtBonificacionBP1.setForeground(new java.awt.Color(40, 40, 40));
        txtBonificacionBP1.setBorder(null);
        jPanel1.add(txtBonificacionBP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 120, 30));

        jLabel17.setForeground(new java.awt.Color(40, 40, 40));
        jLabel17.setText("Total (solo ver):");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));
        jPanel1.add(txtFechaPaogBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, 30));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarBPago;
    private javax.swing.JButton btnCerrarBPago;
    private javax.swing.JButton btnEliminarBPago;
    private javax.swing.JButton btnLimpiarBPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidadBPago;
    private javax.swing.JTable tblBoletaPago;
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
