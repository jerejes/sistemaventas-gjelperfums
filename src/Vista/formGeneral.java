package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;


public class formGeneral extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(formGeneral.class.getName());

    public formGeneral() {
        initComponents();
        
        
    }


    private void mostrarPanel(JPanel p) {

    panelContenido.removeAll();

    panelContenido.add(p, BorderLayout.CENTER);

    panelContenido.revalidate();
    panelContenido.repaint();
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnBoletaPago = new javax.swing.JButton();
        btnBoletaVenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(0, 0, 60));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientes.setBackground(new java.awt.Color(0, 0, 60));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(240, 240, 240));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });
        btnClientes.addActionListener(this::btnClientesActionPerformed);
        panelMenu.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 40));

        btnProductos.setBackground(new java.awt.Color(0, 0, 60));
        btnProductos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(240, 240, 240));
        btnProductos.setText("Productos");
        btnProductos.setBorder(null);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        btnProductos.addActionListener(this::btnProductosActionPerformed);
        panelMenu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 40));

        btnProveedores.setBackground(new java.awt.Color(0, 0, 60));
        btnProveedores.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(240, 240, 240));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(null);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseExited(evt);
            }
        });
        btnProveedores.addActionListener(this::btnProveedoresActionPerformed);
        panelMenu.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, 40));

        btnEmpleados.setBackground(new java.awt.Color(0, 0, 60));
        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(240, 240, 240));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseExited(evt);
            }
        });
        btnEmpleados.addActionListener(this::btnEmpleadosActionPerformed);
        panelMenu.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 180, 40));

        btnBoletaPago.setBackground(new java.awt.Color(0, 0, 60));
        btnBoletaPago.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBoletaPago.setForeground(new java.awt.Color(240, 240, 240));
        btnBoletaPago.setText("Boletas de Pago");
        btnBoletaPago.setBorder(null);
        btnBoletaPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBoletaPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBoletaPagoMouseExited(evt);
            }
        });
        btnBoletaPago.addActionListener(this::btnBoletaPagoActionPerformed);
        panelMenu.add(btnBoletaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 40));

        btnBoletaVenta.setBackground(new java.awt.Color(0, 0, 60));
        btnBoletaVenta.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBoletaVenta.setForeground(new java.awt.Color(240, 240, 240));
        btnBoletaVenta.setText("Boletas de Venta");
        btnBoletaVenta.setBorder(null);
        btnBoletaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBoletaVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBoletaVentaMouseExited(evt);
            }
        });
        btnBoletaVenta.addActionListener(this::btnBoletaVentaActionPerformed);
        panelMenu.add(btnBoletaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 40));

        btnSalir.setBackground(new java.awt.Color(0, 0, 60));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(240, 240, 240));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        panelMenu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 180, 40));

        btnInfo.setBackground(new java.awt.Color(0, 0, 60));
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(240, 240, 240));
        btnInfo.setText("Información");
        btnInfo.setBorder(null);
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMouseExited(evt);
            }
        });
        btnInfo.addActionListener(this::btnInfoActionPerformed);
        panelMenu.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 180, 40));

        jPanel1.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 550));

        btnMenu.setBackground(new java.awt.Color(0, 0, 60));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(240, 240, 240));
        btnMenu.setText("<");
        btnMenu.setToolTipText("");
        btnMenu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnMenu.addActionListener(this::btnMenuActionPerformed);
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 30));

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 920, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents


// <editor-fold defaultstate="collapsed" desc="">
// </editor-fold>
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Salir">
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(250,250,250));
        btnSalir.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(0,0,60));
        btnSalir.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnSalirMouseExited
// </editor-fold>

    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Botón Menú">
    private boolean menuAbierto = true;

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
         btnMenu.setEnabled(false);

    int anchoMenu = panelMenu.getWidth();
    boolean cerrar = panelMenu.getX() >= 0;

    Timer timer = new Timer(5, null);
    timer.addActionListener(e -> {

        int xMenu = panelMenu.getX();
        int xBoton = btnMenu.getX();

        if (cerrar) {
            // CERRAR
            if (xMenu > -anchoMenu) {
                panelMenu.setLocation(xMenu - 5, 0);
                btnMenu.setLocation(xBoton - 5, btnMenu.getY());
            } else {
                panelMenu.setLocation(-anchoMenu, 0);
                btnMenu.setLocation(0, btnMenu.getY());

                btnMenu.setEnabled(true);
                timer.stop();
            }
        } else {
            // ABRIR
            if (xMenu < 0) {
                panelMenu.setLocation(xMenu + 5, 0);
                btnMenu.setLocation(xBoton + 5, btnMenu.getY());
            } else {
                panelMenu.setLocation(0, 0);
                btnMenu.setLocation(anchoMenu, btnMenu.getY());

                btnMenu.setEnabled(true);
                timer.stop();
            }
        }
    });

    timer.start();
    }//GEN-LAST:event_btnMenuActionPerformed
// </editor-fold>

    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Clientes">    
    
    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground(new Color(250,250,250));
        btnClientes.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        btnClientes.setBackground(new Color(0,0,60));
        btnClientes.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        mostrarPanel(new panelClientes());
    }//GEN-LAST:event_btnClientesActionPerformed
// </editor-fold>
    
    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Productos">
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        mostrarPanel(new panelProductos());
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setBackground(new Color(250,250,250));
        btnProductos.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnProductosMouseEntered
 
    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(new Color(0,0,60));
        btnProductos.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnProductosMouseExited
// </editor-fold>

    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Proveedores">
    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        mostrarPanel(new panelProveedores());
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        btnProveedores.setBackground(new Color(250,250,250));
        btnProveedores.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnProveedoresMouseEntered

    private void btnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseExited
        btnProveedores.setBackground(new Color(0,0,60));
        btnProveedores.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnProveedoresMouseExited
// </editor-fold>    
    
    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Empleados">
    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseEntered
        btnEmpleados.setBackground(new Color(250,250,250));
        btnEmpleados.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnEmpleadosMouseEntered

    private void btnEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseExited
        btnEmpleados.setBackground(new Color(0,0,60));
        btnEmpleados.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnEmpleadosMouseExited
// </editor-fold>    

    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Boleta Venta">
    private void btnBoletaPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaPagoMouseEntered
        btnBoletaPago.setBackground(new Color(250,250,250));
        btnBoletaPago.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnBoletaPagoMouseEntered

    private void btnBoletaPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaPagoMouseExited
        btnBoletaPago.setBackground(new Color(0,0,60));
        btnBoletaPago.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnBoletaPagoMouseExited

    private void btnBoletaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoletaPagoActionPerformed
// </editor-fold>

    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Boleta Pago">    
    private void btnBoletaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoletaVentaActionPerformed

    private void btnBoletaVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaVentaMouseEntered
        btnBoletaVenta.setBackground(new Color(250,250,250));
        btnBoletaVenta.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnBoletaVentaMouseEntered

    private void btnBoletaVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaVentaMouseExited
        btnBoletaVenta.setBackground(new Color(0,0,60));
        btnBoletaVenta.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnBoletaVentaMouseExited
// </editor-fold>    

    
    
    
    
// <editor-fold defaultstate="collapsed" desc="Boton Información">
    private void btnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseEntered
        btnInfo.setBackground(new Color(250,250,250));
        btnInfo.setForeground(new Color(0,0,60));
    }//GEN-LAST:event_btnInfoMouseEntered

    private void btnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseExited
        btnInfo.setBackground(new Color(0,0,60));
        btnInfo.setForeground(new Color(240,240,240));
    }//GEN-LAST:event_btnInfoMouseExited
   
    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoActionPerformed
// </editor-fold>
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoletaPago;
    private javax.swing.JButton btnBoletaVenta;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
