package Vista;
public class panelRegistroCompra extends javax.swing.JDialog {
    public panelRegistroCompra() {
        initComponents();
        btnagregarProducto.setIcon(icono("/imagenes/carritoagregar.png", 20));
        btnEliminarComPro.setIcon(icono("/imagenes/trash.png", 20));
        btnlimpiar.setIcon(icono("/imagenes/Limpiar.png", 20));
        btnmodificar.setIcon(icono("/imagenes/edit.png", 20));
        btnfinalizarcompra.setIcon(icono("/imagenes/finalizarcompra.png", 20));

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 =   new modelo.PanelRedondeado();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnmodificar = new javax.swing.JButton();
        btnEliminarComPro = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtFecNacCliente1 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        btnfinalizarcompra = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnagregarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Proveedor | RUC");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("COMPRA DE PRODUCTOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 186, -1));

        jLabel3.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad");
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Producto | Codigo");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 40));

        jLabel6.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Compra");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 137, 40));

        btnmodificar.setBackground(new java.awt.Color(0, 0, 255));
        btnmodificar.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");
        jPanel2.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 130, 50));

        btnEliminarComPro.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarComPro.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnEliminarComPro.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarComPro.setText("Eliminar");
        jPanel2.add(btnEliminarComPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 120, 50));

        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 137, 40));

        jLabel7.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio Compra:");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 137, 40));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 460, 400));

        txtFecNacCliente1.setBackground(new java.awt.Color(204, 204, 204));
        txtFecNacCliente1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtFecNacCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 140, 40));

        jLabel8.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Pago");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 80, 40));

        btnfinalizarcompra.setBackground(new java.awt.Color(0, 102, 102));
        btnfinalizarcompra.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnfinalizarcompra.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizarcompra.setText("Finalizar Compra");
        jPanel2.add(btnfinalizarcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 160, 50));

        btnlimpiar.setBackground(new java.awt.Color(0, 102, 204));
        btnlimpiar.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setText("Limpiar");
        jPanel2.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 120, 50));

        btnagregarProducto.setBackground(new java.awt.Color(255, 51, 102));
        btnagregarProducto.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnagregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarProducto.setText("Agregar ");
        jPanel2.add(btnagregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 50));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 20));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    public javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarComPro;
    private javax.swing.JButton btnagregarProducto;
    private javax.swing.JButton btnfinalizarcompra;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private com.toedter.calendar.JDateChooser txtFecNacCliente1;
    // End of variables declaration//GEN-END:variables
}
