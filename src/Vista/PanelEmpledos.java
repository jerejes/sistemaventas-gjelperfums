package Vista;
import dao.EmpleadoDao;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import render.EstiloTabla;

public class PanelEmpledos extends javax.swing.JPanel {
    public final EmpleadoDao empdao= new EmpleadoDao();
    public PanelEmpledos() {
        initComponents();
        actualizarTabla();
        panelRegistroEmpleados1.setVisible(false);
        panelRegistroEmpleados1.addComponentListener(new ComponentAdapter() 
        {
           @Override
           public void componentHidden(ComponentEvent e) {
               btnEliminarEmpleado.setVisible(true);
            btnmodificar.setVisible(true);
            btnAgregarEmpleado.setVisible(true);
          }
            
        });
    
     btnbuscaremp.setIcon(icono("/imagenes/search.png", 20));
     btnAgregarEmpleado.setIcon(icono("/imagenes/plus.png", 20));
     btnEliminarEmpleado.setIcon(icono("/imagenes/trash.png", 20));
     btnmodificar.setIcon(icono("/imagenes/edit.png", 20));
      }

    public void actualizarTabla() {
        txtbuscar.setText("");
        tblmostrarempleados.setModel(empdao.buscarEmpleado(""));
        EstiloTabla.aplicar(tblmostrarempleados);
    }


    private javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnbuscaremp = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnAgregarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmostrarempleados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnEliminarEmpleado = new javax.swing.JButton();
        panelRegistroEmpleados1 = new Vista.PanelRegistroEmpleados();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
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
                    .addComponent(txtbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(382, 70));

        btnbuscaremp.setBackground(new java.awt.Color(0, 102, 255));
        btnbuscaremp.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnbuscaremp.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscaremp.setText("Buscar ");
        btnbuscaremp.addActionListener(this::btnbuscarempActionPerformed);

        btnmodificar.setBackground(new java.awt.Color(0, 51, 204));
        btnmodificar.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");

        btnAgregarEmpleado.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregarEmpleado.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleado.setText(" Agregar");
        btnAgregarEmpleado.addActionListener(this::btnAgregarEmpleadoActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(btnbuscaremp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscaremp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_END);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tblmostrarempleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tblmostrarempleados.setOpaque(false);
        jScrollPane1.setViewportView(tblmostrarempleados);

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
            .addGap(0, 644, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(1421, 50));
        jPanel10.setLayout(new java.awt.BorderLayout());

        btnEliminarEmpleado.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarEmpleado.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("Eliminar");
        jPanel10.add(btnEliminarEmpleado, java.awt.BorderLayout.LINE_END);

        add(jPanel10, java.awt.BorderLayout.PAGE_END);
        add(panelRegistroEmpleados1, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        panelRegistroEmpleados1.setVisible(true);
        btnAgregarEmpleado.setVisible(false);
        btnEliminarEmpleado.setVisible(false);
        btnmodificar.setVisible(false);
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnbuscarempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarempActionPerformed
        tblmostrarempleados.setModel(empdao.buscarEmpleado(txtbuscar.getText()));
    }//GEN-LAST:event_btnbuscarempActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnbuscaremp;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private Vista.PanelRegistroEmpleados panelRegistroEmpleados1;
    private javax.swing.JTable tblmostrarempleados;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
