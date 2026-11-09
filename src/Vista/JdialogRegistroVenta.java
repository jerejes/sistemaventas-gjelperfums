package Vista;

import javax.swing.JOptionPane;

public class JdialogRegistroVenta extends modelo.JdialogRedondeado {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JdialogRegistroVenta.class.getName());
    public JdialogRegistroVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnsalir.setIcon(icono("/imagenes/square-x (1).png", 20));
        btnagregar.setIcon(icono("/imagenes/plus.png", 20));
        btnquitar.setIcon(icono("/imagenes/trash.png", 20));
        btnlimpiar.setIcon(icono("/imagenes/Limpiar.png", 20));
        btnfinalizarcom.setIcon(icono("/imagenes/finalizarcompra.png", 20));


    }
    public javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btnagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnlimpiar = new javax.swing.JButton();
        btnquitar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnfinalizarcom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalir.setBackground(new java.awt.Color(255, 51, 51));
        btnsalir.setOpaque(true);
        btnsalir.addActionListener(this::btnsalirActionPerformed);
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 40, 36));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(" NUEVA VENTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, 183, 59));

        jLabel2.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jTextField1.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 300, 42));

        jLabel3.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo de Pago");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jTextField2.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 177, 42));

        jLabel4.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Empleado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 180, 40));

        jLabel5.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cliente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jTextField3.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 177, 42));

        jLabel6.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Producto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, 40));

        btnagregar.setBackground(new java.awt.Color(255, 51, 153));
        btnagregar.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 120, 40));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 600, -1));

        btnlimpiar.setBackground(new java.awt.Color(0, 102, 204));
        btnlimpiar.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setText("Limpiar");
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, 110, 40));

        btnquitar.setBackground(new java.awt.Color(255, 51, 51));
        btnquitar.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        btnquitar.setForeground(new java.awt.Color(255, 255, 255));
        btnquitar.setText("Quitar");
        jPanel1.add(btnquitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 110, 40));

        jLabel7.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, 40, 20));

        btnfinalizarcom.setBackground(new java.awt.Color(0, 102, 102));
        btnfinalizarcom.setFont(new java.awt.Font("Swis721 Cn BT", 0, 13)); // NOI18N
        btnfinalizarcom.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizarcom.setText("Finalizar Venta");
        jPanel1.add(btnfinalizarcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 670, 160, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        int r = JOptionPane.showConfirmDialog(this,
                "¿Cerrar sin guardar la compra?", "Confirmar",
                JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JdialogRegistroVenta dialog = new JdialogRegistroVenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnfinalizarcom;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnquitar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
