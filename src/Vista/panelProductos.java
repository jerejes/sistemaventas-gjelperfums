package Vista;

import java.awt.Color;

public class panelProductos extends javax.swing.JPanel {

    public panelProductos() {
        initComponents();
    }  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreProd1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrecioProd1 = new javax.swing.JTextField();
        btnAgregarProd1 = new javax.swing.JButton();
        btnLimpiarProd1 = new javax.swing.JButton();
        btnEliminarProd1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        btnLimpiarProd2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiarProd3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtNombreProd1.setBackground(new java.awt.Color(240, 240, 240));
        txtNombreProd1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtNombreProd1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProd1.setBorder(null);
        add(txtNombreProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 320, 30));

        jLabel13.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Precio Unitario:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtPrecioProd1.setBackground(new java.awt.Color(240, 240, 240));
        txtPrecioProd1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtPrecioProd1.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioProd1.setBorder(null);
        add(txtPrecioProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 30));

        btnAgregarProd1.setBackground(new java.awt.Color(0, 153, 255));
        btnAgregarProd1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnAgregarProd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProd1.setText("Agregar");
        add(btnAgregarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, 40));

        btnLimpiarProd1.setBackground(new java.awt.Color(0, 153, 0));
        btnLimpiarProd1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnLimpiarProd1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarProd1.setText("Modificar");
        add(btnLimpiarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 150, 40));

        btnEliminarProd1.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarProd1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEliminarProd1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProd1.setText("Eliminar");
        add(btnEliminarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 40));

        jComboBox3.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder("Genero:"));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 50));

        jTextField4.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Accesorio:"));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 120, 50));

        jComboBox4.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo:"));
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, 50));

        jTextField5.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder("Material:"));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 120, -1));

        jTextField6.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder("cont ml:"));
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, -1));

        btnLimpiarProd2.setBackground(new java.awt.Color(255, 102, 153));
        btnLimpiarProd2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnLimpiarProd2.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarProd2.setText("Mostrar");
        add(btnLimpiarProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 150, 40));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 550, -1));

        btnLimpiarProd3.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpiarProd3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnLimpiarProd3.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarProd3.setText("Limpiar Campos");
        add(btnLimpiarProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 150, 30));

        jLabel2.setText("Cantidad De Registros:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 140, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProd1;
    private javax.swing.JButton btnEliminarProd1;
    private javax.swing.JButton btnLimpiarProd1;
    private javax.swing.JButton btnLimpiarProd2;
    private javax.swing.JButton btnLimpiarProd3;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtNombreProd1;
    private javax.swing.JTextField txtPrecioProd1;
    // End of variables declaration//GEN-END:variables
}
