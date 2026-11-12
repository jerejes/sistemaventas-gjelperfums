package Vista;

import dao.ProveedorDAO;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.table.DefaultTableModel;
import render.EstiloTabla;

public class PanelProveedores extends javax.swing.JPanel {
    public final ProveedorDAO daoprov = new ProveedorDAO();
    public PanelProveedores() {
        initComponents();
        actualizarTabla();
        panelRegistroProveedores1.setVisible(false);
        panelRegistroProveedores1.addComponentListener(new ComponentAdapter() 
        {
                @Override
                public void componentHidden(ComponentEvent e) 
                {
                    btnNuevoProv.setVisible(true);
                    btnEliminarProveedor.setVisible(true);
                    btnModificarProveedor.setVisible(true);
                }
         });
        btnbuscarprov.setIcon(icono("/imagenes/search.png", 20));
        btnModificarProveedor.setIcon(icono("/imagenes/edit.png", 20));
            btnNuevoProv.setIcon(icono("/imagenes/plus.png", 20));
        btnEliminarProveedor.setIcon(icono("/imagenes/trash.png", 20));
    }
    public void actualizarTabla() {
        txtbuscar.setText("");
        tblmostrardatosprov.setModel(daoprov.buscarProveedor(""));
        EstiloTabla.aplicar(tblmostrardatosprov);
    }
    
    private javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmostrardatosprov = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnbuscarprov = new javax.swing.JButton();
        btnNuevoProv = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEliminarProveedor = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        panelRegistroProveedores1 = new Vista.panelRegistroProveedores();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        tblmostrardatosprov.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblmostrardatosprov);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText(" GESTION DE PROVEEDORES");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 48));
        jPanel5.setRequestFocusEnabled(false);

        btnbuscarprov.setBackground(new java.awt.Color(0, 102, 255));
        btnbuscarprov.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnbuscarprov.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarprov.setText("Buscar ");
        btnbuscarprov.addActionListener(this::btnbuscarprovActionPerformed);

        btnNuevoProv.setBackground(new java.awt.Color(0, 102, 102));
        btnNuevoProv.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnNuevoProv.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProv.setText("Nuevo");
        btnNuevoProv.setActionCommand("+ Nuevo ");
        btnNuevoProv.addActionListener(this::btnNuevoProvActionPerformed);

        btnModificarProveedor.setBackground(new java.awt.Color(0, 51, 153));
        btnModificarProveedor.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnModificarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProveedor.setText("Modificar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnbuscarprov, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoProv, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnModificarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(btnbuscarprov, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addComponent(btnNuevoProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.LINE_END);
        jPanel4.add(txtbuscar, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Buscar");
        jPanel4.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(5, 10));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1419, 40));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnEliminarProveedor.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarProveedor.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setText("Eliminar");
        jPanel2.add(btnEliminarProveedor, java.awt.BorderLayout.LINE_END);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(6, 603));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );

        add(jPanel7, java.awt.BorderLayout.LINE_START);
        add(panelRegistroProveedores1, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents
    private void btnNuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProvActionPerformed
        panelRegistroProveedores1.setVisible(true);
        btnNuevoProv.setVisible(false);
        btnEliminarProveedor.setVisible(false);
        btnModificarProveedor.setVisible(false);
    }//GEN-LAST:event_btnNuevoProvActionPerformed

    private void btnbuscarprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarprovActionPerformed
        tblmostrardatosprov.setModel(daoprov.buscarProveedor(txtbuscar.getText()));
    }//GEN-LAST:event_btnbuscarprovActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnNuevoProv;
    private javax.swing.JButton btnbuscarprov;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private Vista.panelRegistroProveedores panelRegistroProveedores1;
    private javax.swing.JTable tblmostrardatosprov;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
