package Vista;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class PanelEmpledos extends javax.swing.JPanel {
    public PanelEmpledos() {
        initComponents();
        panelRegistroEmpleados2.setVisible(false);
        panelRegistroEmpleados2.addComponentListener(new ComponentAdapter() 
        {
            @Override
            public void componentHidden(ComponentEvent e) {
                btnEliminarEmpleado.setVisible(true);
                btnmodificar.setVisible(true);
                btnAgregarEmpleado.setVisible(true);
            }
            
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnAgregarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        panelRegistroEmpleados2 = new Vista.PanelRegistroEmpleados();
        jPanel10 = new javax.swing.JPanel();
        btnEliminarEmpleado = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell Nova Cond", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText(" GESTION DE EMPLEADOS");
        jPanel1.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(1030, 80));

        jLabel2.setFont(new java.awt.Font("Square721 Cn BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(382, 70));

        jButton5.setBackground(new java.awt.Color(0, 102, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Buscar ");

        btnmodificar.setBackground(new java.awt.Color(255, 0, 153));
        btnmodificar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");

        btnAgregarEmpleado.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregarEmpleado.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleado.setText("+ Agregar");
        btnAgregarEmpleado.addActionListener(this::btnAgregarEmpleadoActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_END);

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(6, 619));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);
        add(panelRegistroEmpleados2, java.awt.BorderLayout.LINE_END);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(1421, 50));
        jPanel10.setLayout(new java.awt.BorderLayout());

        btnEliminarEmpleado.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarEmpleado.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("X Eliminar");
        jPanel10.add(btnEliminarEmpleado, java.awt.BorderLayout.LINE_END);

        add(jPanel10, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        panelRegistroEmpleados2.setVisible(true);
        btnAgregarEmpleado.setVisible(false);
        btnEliminarEmpleado.setVisible(false);
        btnmodificar.setVisible(false);
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private Vista.PanelRegistroEmpleados panelRegistroEmpleados2;
    // End of variables declaration//GEN-END:variables
}
