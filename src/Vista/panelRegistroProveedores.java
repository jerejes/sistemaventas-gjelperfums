package Vista;

import javax.swing.JOptionPane;

public class panelRegistroProveedores extends javax.swing.JPanel {
    public panelRegistroProveedores() {
        initComponents();
        btnguardarprove.setIcon(icono("/imagenes/finalizarcompra.png", 20));
        btnLimpiar.setIcon(icono("/imagenes/Limpiar.png", 20));

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new modelo.PanelRedondeado();
        jLabel2 = new javax.swing.JLabel();
        txtRucProv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomEmpresa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        btnCerrarproveedor = new javax.swing.JButton();
        btnguardarprove = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTelefonoProv = new javax.swing.JTextField();
        txtAvenida = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        setFocusCycleRoot(true);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("NUEVO PROVEEDOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtRucProv.setBackground(new java.awt.Color(255, 255, 255));
        txtRucProv.setForeground(new java.awt.Color(102, 102, 102));
        txtRucProv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtRucProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 290, 40));

        jLabel9.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("RUC");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre de la empresa (*)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtNomEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        txtNomEmpresa.setForeground(new java.awt.Color(102, 102, 102));
        txtNomEmpresa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtNomEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 290, 40));

        jLabel15.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Teléfono");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtDistrito.setBackground(new java.awt.Color(255, 255, 255));
        txtDistrito.setForeground(new java.awt.Color(102, 102, 102));
        txtDistrito.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 290, 40));

        btnCerrarproveedor.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarproveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarproveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarproveedor.addActionListener(this::btnCerrarproveedorActionPerformed);
        jPanel1.add(btnCerrarproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 35));

        btnguardarprove.setBackground(new java.awt.Color(0, 102, 102));
        btnguardarprove.setFont(new java.awt.Font("Swis721 Cn BT", 1, 13)); // NOI18N
        btnguardarprove.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarprove.setText("Guardar");
        jPanel1.add(btnguardarprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 140, 50));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 204));
        btnLimpiar.setFont(new java.awt.Font("Swis721 Cn BT", 1, 13)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar ");
        btnLimpiar.setToolTipText("");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 130, 50));

        jLabel20.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(40, 40, 40));
        jLabel20.setText("Calle");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setForeground(new java.awt.Color(102, 102, 102));
        txtCalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 290, 40));

        jLabel19.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(40, 40, 40));
        jLabel19.setText("Avenida");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel16.setFont(new java.awt.Font("Square721 Cn BT", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(40, 40, 40));
        jLabel16.setText("Distrito");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txtTelefonoProv.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoProv.setForeground(new java.awt.Color(102, 102, 102));
        txtTelefonoProv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtTelefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 290, 40));

        txtAvenida.setBackground(new java.awt.Color(255, 255, 255));
        txtAvenida.setForeground(new java.awt.Color(102, 102, 102));
        txtAvenida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(txtAvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 290, 40));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    private void btnCerrarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarproveedorActionPerformed
             int x = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cerrar?", "CERRAR",
                    JOptionPane.YES_NO_OPTION);
            if (x == JOptionPane.YES_OPTION) {
                setVisible(false);
            }
    }//GEN-LAST:event_btnCerrarproveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarproveedor;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnguardarprove;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAvenida;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtNomEmpresa;
    private javax.swing.JTextField txtRucProv;
    private javax.swing.JTextField txtTelefonoProv;
    // End of variables declaration//GEN-END:variables
}
