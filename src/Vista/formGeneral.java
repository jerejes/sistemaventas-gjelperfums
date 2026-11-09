package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;
import javax.swing.Timer;

public class formGeneral extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(formGeneral.class.getName());
 // Estas dos variables van FUERA del método, al inicio de la clase
private Timer timerMenu;            // el "reloj" que repite el código
private boolean menuAbierto = true; // true = menú abierto, false = menú cerrado

    public formGeneral() {
        initComponents();
        btnClientes.setIcon(icono("/imagenes/users (1).png", 20));
        btnProductos.setIcon(icono("/imagenes/perfume.png", 20));
        btnVenta.setIcon(icono("/imagenes/shopping-cart.png", 20));
        btnEmpleados.setIcon(icono("/imagenes/id-badge-2.png", 20));
        btnProductos.setIcon(icono("/imagenes/perfume.png", 20));
        btnInventario.setIcon(icono("/imagenes/box.png", 20));
        btnProveedores.setIcon(icono("/imagenes/truck-delivery.png", 20));
        btnUsuarios.setIcon(icono("/imagenes/user-cog.png", 20));
        btnCompra.setIcon(icono("/imagenes/package.png", 20));
        btndesplegarMenu.setIcon(icono("/imagenes/menu-2.png", 30));
        btnSalir.setIcon(icono("/imagenes/logoutrojo.png", 20));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        new Timer(1000, e -> lblhora.setText(LocalTime.now().format(formato))).start();
        lblhora.setIcon(icono("/imagenes/clock-hour-3.png", 20));
        lblhora.setIconTextGap(8);

    }
    
    private javax.swing.ImageIcon icono(String ruta, int tam) 
    {
    java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
    return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    
    private void mostrarPanel(JPanel p) {

    panelContenido.removeAll();

    panelContenido.add(p, BorderLayout.CENTER);

    panelContenido.revalidate();
    panelContenido.repaint();
}
    
   private void animarMenu() {

    // 1. Si el reloj ya está funcionando, no hagas nada.
    //    (Evita que el usuario haga clic dos veces y se mezclen dos animaciones)
    if (timerMenu != null && timerMenu.isRunning()) {
        return;
    }

    // 2. Decidir la META (hasta qué ancho tiene que llegar el menú)
    int destino;
    if (menuAbierto) {
        destino = 0;     // está abierto, entonces queremos cerrarlo: meta = 0
    } else {
        destino = 300;   // está cerrado, entonces queremos abrirlo: meta = 300
    }

    // 3. Crear el reloj: "cada 10 ms ejecuta lo que hay entre llaves"
    timerMenu = new Timer(10, e -> {

        // 3.1 Ver cuánto mide el menú AHORA
        int w = jPanel2.getPreferredSize().width;

        // 3.2 Calcular el siguiente ancho
        if (menuAbierto) {
            w = w - 20;           // cerrando: restamos 20
            if (w < destino) {    // si nos pasamos de la meta...
                w = destino;      // ...nos quedamos exactamente en la meta
            }
        } else {
            w = w + 20;           // abriendo: sumamos 20
            if (w > destino) {
                w = destino;
            }
        }

        // 3.3 Aplicar el nuevo ancho y redibujar
        jPanel2.setPreferredSize(new java.awt.Dimension(w, 100));
        getContentPane().revalidate();  // "recalcula dónde va cada cosa"
        getContentPane().repaint();     // "vuelve a dibujar la pantalla"

        // 3.4 ¿Llegamos a la meta?
        if (w == destino) {
            timerMenu.stop();                 // apagar el reloj
            menuAbierto = !menuAbierto;       // invertir estado (abierto <-> cerrado)
        }
    });

    // 4. Encender el reloj (hasta aquí solo estaba preparado)
    timerMenu.start();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btnClientes = new modelo.BotonRedondeado();
        btnProveedores = new modelo.BotonRedondeado();
        btnEmpleados = new modelo.BotonRedondeado();
        btnProductos = new modelo.BotonRedondeado();
        btnCompra = new modelo.BotonRedondeado();
        btnVenta = new modelo.BotonRedondeado();
        btnInventario = new modelo.BotonRedondeado();
        btnUsuarios = new modelo.BotonRedondeado();
        btnInfo = new modelo.BotonRedondeado();
        btnSalir = new modelo.BotonRedondeado();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btndesplegarMenu = new javax.swing.JButton();
        lblhora = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 0, 102));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(31, 42, 55));
        jPanel6.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel8.setBackground(new java.awt.Color(31, 42, 55));
        jPanel8.setLayout(new java.awt.BorderLayout());
        jPanel8.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel6.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(31, 42, 55));
        jPanel12.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel9.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setLayout(new java.awt.GridLayout(10, 0));

        btnClientes.setBackground(new java.awt.Color(31, 42, 55));
        btnClientes.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.addActionListener(this::btnClientesActionPerformed);
        jPanel13.add(btnClientes);

        btnProveedores.setBackground(new java.awt.Color(31, 42, 55));
        btnProveedores.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(null);
        btnProveedores.addActionListener(this::btnProveedoresActionPerformed);
        jPanel13.add(btnProveedores);

        btnEmpleados.setBackground(new java.awt.Color(31, 42, 55));
        btnEmpleados.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.addActionListener(this::btnEmpleadosActionPerformed);
        jPanel13.add(btnEmpleados);

        btnProductos.setBackground(new java.awt.Color(31, 42, 55));
        btnProductos.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.setBorder(null);
        btnProductos.addActionListener(this::btnProductosActionPerformed);
        jPanel13.add(btnProductos);

        btnCompra.setBackground(new java.awt.Color(31, 42, 55));
        btnCompra.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCompra.setText("Compra");
        btnCompra.setBorder(null);
        btnCompra.addActionListener(this::btnCompraActionPerformed);
        jPanel13.add(btnCompra);

        btnVenta.setBackground(new java.awt.Color(31, 42, 55));
        btnVenta.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setText("Venta");
        btnVenta.setBorder(null);
        btnVenta.addActionListener(this::btnVentaActionPerformed);
        jPanel13.add(btnVenta);

        btnInventario.setBackground(new java.awt.Color(31, 42, 55));
        btnInventario.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.setBorder(null);
        jPanel13.add(btnInventario);

        btnUsuarios.setBackground(new java.awt.Color(31, 42, 55));
        btnUsuarios.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        jPanel13.add(btnUsuarios);

        btnInfo.setBackground(new java.awt.Color(31, 42, 55));
        btnInfo.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("Información");
        btnInfo.setBorder(null);
        jPanel13.add(btnInfo);

        btnSalir.setBackground(new java.awt.Color(31, 42, 55));
        btnSalir.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 0));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(this::btnSalirActionPerformed);
        jPanel13.add(btnSalir);

        jPanel9.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(31, 42, 55));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btndesplegarMenu.setBackground(new java.awt.Color(31, 42, 55));
        btndesplegarMenu.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btndesplegarMenu.setForeground(new java.awt.Color(240, 240, 240));
        btndesplegarMenu.setToolTipText("");
        btndesplegarMenu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btndesplegarMenu.addActionListener(this::btndesplegarMenuActionPerformed);
        jPanel5.add(btndesplegarMenu, java.awt.BorderLayout.LINE_START);

        lblhora.setFont(new java.awt.Font("Verdana Pro Cond Black", 1, 18)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 255, 255));
        lblhora.setPreferredSize(new java.awt.Dimension(120, 23));
        jPanel5.add(lblhora, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido.setLayout(new java.awt.BorderLayout());
        jPanel3.add(panelContenido, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndesplegarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesplegarMenuActionPerformed
        animarMenu();
    }//GEN-LAST:event_btndesplegarMenuActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        mostrarPanel(new PanelCliente());
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        mostrarPanel(new PanelProveedores());
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        mostrarPanel(new PanelEmpledos());
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        mostrarPanel(new PanelCompra());
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        mostrarPanel(new PanelProd());
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        mostrarPanel(new PanelVen());
    }//GEN-LAST:event_btnVentaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btndesplegarMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblhora;
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables
}
