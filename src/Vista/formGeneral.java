package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;

public class formGeneral extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(formGeneral.class.getName());
 // Estas dos variables van FUERA del método, al inicio de la clase
private Timer timerMenu;            // el "reloj" que repite el código
private boolean menuAbierto = true; // true = menú abierto, false = menú cerrado

    public formGeneral() {
        initComponents();
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
            btndesplegarMenu.setText(menuAbierto ? "<" : ">"); // cambiar la flecha
        }
    });

    // 4. Encender el reloj (hasta aquí solo estaba preparado)
    timerMenu.start();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnBoletaPago = new javax.swing.JButton();
        btnBoletaVenta1 = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btndesplegarMenu = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.GridLayout(10, 0));

        btnClientes.setBackground(new java.awt.Color(0, 102, 102));
        btnClientes.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(240, 240, 240));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.addActionListener(this::btnClientesActionPerformed);
        jPanel6.add(btnClientes);

        btnProductos.setBackground(new java.awt.Color(0, 102, 102));
        btnProductos.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(240, 240, 240));
        btnProductos.setText("Productos");
        btnProductos.setBorder(null);
        jPanel6.add(btnProductos);

        btnProveedores.setBackground(new java.awt.Color(0, 102, 102));
        btnProveedores.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(240, 240, 240));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(null);
        jPanel6.add(btnProveedores);

        btnEmpleados.setBackground(new java.awt.Color(0, 102, 102));
        btnEmpleados.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(240, 240, 240));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        jPanel6.add(btnEmpleados);

        btnBoletaPago.setBackground(new java.awt.Color(0, 102, 102));
        btnBoletaPago.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnBoletaPago.setForeground(new java.awt.Color(240, 240, 240));
        btnBoletaPago.setText("Boletas de Pago");
        btnBoletaPago.setBorder(null);
        jPanel6.add(btnBoletaPago);

        btnBoletaVenta1.setBackground(new java.awt.Color(0, 102, 102));
        btnBoletaVenta1.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnBoletaVenta1.setForeground(new java.awt.Color(240, 240, 240));
        btnBoletaVenta1.setText("Venta");
        btnBoletaVenta1.setBorder(null);
        jPanel6.add(btnBoletaVenta1);

        btnInventario.setBackground(new java.awt.Color(0, 102, 102));
        btnInventario.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(240, 240, 240));
        btnInventario.setText("Inventario");
        btnInventario.setBorder(null);
        jPanel6.add(btnInventario);

        btnUsuarios.setBackground(new java.awt.Color(0, 102, 102));
        btnUsuarios.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(240, 240, 240));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        jPanel6.add(btnUsuarios);

        btnInfo.setBackground(new java.awt.Color(0, 102, 102));
        btnInfo.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(240, 240, 240));
        btnInfo.setText("Información");
        btnInfo.setBorder(null);
        jPanel6.add(btnInfo);

        btnSalir.setBackground(new java.awt.Color(0, 102, 102));
        btnSalir.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(240, 240, 240));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(this::btnSalirActionPerformed);
        jPanel6.add(btnSalir);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btndesplegarMenu.setBackground(new java.awt.Color(0, 0, 60));
        btndesplegarMenu.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btndesplegarMenu.setForeground(new java.awt.Color(240, 240, 240));
        btndesplegarMenu.setText("<");
        btndesplegarMenu.setToolTipText("");
        btndesplegarMenu.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btndesplegarMenu.addActionListener(this::btndesplegarMenuActionPerformed);
        jPanel5.add(btndesplegarMenu, java.awt.BorderLayout.LINE_START);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido.setLayout(new java.awt.BorderLayout());
        jPanel3.add(panelContenido, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        mostrarPanel(new Clien());
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btndesplegarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesplegarMenuActionPerformed
        animarMenu();
    }//GEN-LAST:event_btndesplegarMenuActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoletaPago;
    private javax.swing.JButton btnBoletaVenta1;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btndesplegarMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables
}
