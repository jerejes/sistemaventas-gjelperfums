package Vista;

import dao.ProductoDAO;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import render.EstiloTabla;

public class PanelProd extends javax.swing.JPanel {
    private final ProductoDAO dao = new ProductoDAO();
    
    public PanelProd() {
        initComponents();
        actualizarTabla();
        panelRegistroProductos1.setVisible(false);
        btnbuscarprod.setIcon(icono("/imagenes/search.png", 20));
        btnagregarprod.setIcon(icono("/imagenes/plus.png", 20));
        btneliminarprod.setIcon(icono("/imagenes/trash.png", 20));
        btnmodifcarprod.setIcon(icono("/imagenes/edit.png", 20));
        panelRegistroProductos1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentHidden(ComponentEvent e) {
                btnagregarprod.setVisible(true);
                btneliminarprod.setVisible(true);
                btnmodifcarprod.setVisible(true);
            }
        });

    }
    public void actualizarTabla() {
        txtbuscarprod.setText("");
        tblProductos.setModel(dao.buscarProducto(""));
        EstiloTabla.aplicar(tblProductos);
    }
    private javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btneliminarprod = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtbuscarprod = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnbuscarprod = new javax.swing.JButton();
        btnmodifcarprod = new javax.swing.JButton();
        btnagregarprod = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        panelRegistroProductos1 = new Vista.PanelRegistroProductos();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1049, 40));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btneliminarprod.setBackground(new java.awt.Color(255, 51, 51));
        btneliminarprod.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btneliminarprod.setForeground(new java.awt.Color(255, 255, 255));
        btneliminarprod.setText("Eliminar");
        btneliminarprod.setPreferredSize(new java.awt.Dimension(120, 36));
        jPanel2.add(btneliminarprod, java.awt.BorderLayout.LINE_END);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText(" GESTION DE PRODUCTOS");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" Buscar:");
        jPanel3.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        txtbuscarprod.setPreferredSize(new java.awt.Dimension(64, 14));
        jPanel3.add(txtbuscarprod, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(6, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 70));

        btnbuscarprod.setBackground(new java.awt.Color(0, 102, 255));
        btnbuscarprod.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnbuscarprod.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarprod.setText("Buscar ");
        btnbuscarprod.addActionListener(this::btnbuscarprodActionPerformed);

        btnmodifcarprod.setBackground(new java.awt.Color(0, 51, 204));
        btnmodifcarprod.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnmodifcarprod.setForeground(new java.awt.Color(255, 255, 255));
        btnmodifcarprod.setText("Modificar");

        btnagregarprod.setBackground(new java.awt.Color(0, 102, 102));
        btnagregarprod.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnagregarprod.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarprod.setText("Producto");
        btnagregarprod.addActionListener(this::btnagregarprodActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbuscarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmodifcarprod, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnagregarprod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnbuscarprod, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(btnmodifcarprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnagregarprod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.LINE_END);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(6, 586));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        add(jPanel5, java.awt.BorderLayout.LINE_START);
        add(panelRegistroProductos1, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents
    private void btnagregarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarprodActionPerformed
        panelRegistroProductos1.setVisible(true);
        btnagregarprod.setVisible(false);
        btneliminarprod.setVisible(false);
        btnmodifcarprod.setVisible(false);
        
    }//GEN-LAST:event_btnagregarprodActionPerformed
    private void btnbuscarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarprodActionPerformed
        tblProductos.setModel(dao.buscarProducto(txtbuscarprod.getText()));
    }//GEN-LAST:event_btnbuscarprodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarprod;
    private javax.swing.JButton btnbuscarprod;
    private javax.swing.JButton btneliminarprod;
    private javax.swing.JButton btnmodifcarprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private Vista.PanelRegistroProductos panelRegistroProductos1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtbuscarprod;
    // End of variables declaration//GEN-END:variables
}
