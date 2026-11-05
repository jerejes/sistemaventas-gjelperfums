package Vista;

import java.awt.Color;

public class PanelRegistroProductos extends javax.swing.JPanel {

    public PanelRegistroProductos() {
        initComponents();
    }  
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreProd1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnLimpiarProd1 = new javax.swing.JButton();
        btnEliminarProd1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtPrecioProd2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnEliminarProd2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtPrecioProd3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrecioProd4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPrecioProd5 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVO PRODUCTO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre (*)");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        txtNombreProd1.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreProd1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtNombreProd1.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreProd1.setBorder(null);
        add(txtNombreProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 30));

        jLabel13.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tipo De Producto:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        btnLimpiarProd1.setBackground(new java.awt.Color(0, 102, 102));
        btnLimpiarProd1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnLimpiarProd1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarProd1.setText("Guardar");
        add(btnLimpiarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 150, 40));

        btnEliminarProd1.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarProd1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEliminarProd1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProd1.setText("X");
        btnEliminarProd1.addActionListener(this::btnEliminarProd1ActionPerformed);
        add(btnEliminarProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        jLabel14.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tipo Accesorio(*)");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        txtPrecioProd2.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioProd2.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtPrecioProd2.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioProd2.setBorder(null);
        add(txtPrecioProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 160, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 80, 30));

        btnEliminarProd2.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarProd2.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEliminarProd2.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProd2.setText("Limpiar");
        btnEliminarProd2.addActionListener(this::btnEliminarProd2ActionPerformed);
        add(btnEliminarProd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, 40));

        jLabel15.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Precio Unitario(*)");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtPrecioProd3.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioProd3.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtPrecioProd3.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioProd3.setBorder(null);
        add(txtPrecioProd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 30));

        jLabel16.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cont Ml (*)");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtPrecioProd4.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioProd4.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtPrecioProd4.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioProd4.setBorder(null);
        add(txtPrecioProd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 30));

        jLabel17.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Material(*)");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Genero(*)");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        txtPrecioProd5.setBackground(new java.awt.Color(102, 102, 102));
        txtPrecioProd5.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtPrecioProd5.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioProd5.setBorder(null);
        add(txtPrecioProd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 30));

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Accesorio");
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Perfume");
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProd1ActionPerformed

    private void btnEliminarProd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProd2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarProd1;
    private javax.swing.JButton btnEliminarProd2;
    private javax.swing.JButton btnLimpiarProd1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JTextField txtNombreProd1;
    private javax.swing.JTextField txtPrecioProd2;
    private javax.swing.JTextField txtPrecioProd3;
    private javax.swing.JTextField txtPrecioProd4;
    private javax.swing.JTextField txtPrecioProd5;
    // End of variables declaration//GEN-END:variables
}
