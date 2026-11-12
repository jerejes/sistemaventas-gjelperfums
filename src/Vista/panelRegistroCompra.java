package Vista;
import dao.CompraDAO;
import dao.ProductoDAO;
import dao.ProveedorDAO;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;
import modelo.Producto;
import modelo.Proveedor;
import modelo.compraproducto;
import render.EstiloTabla;
public class panelRegistroCompra extends modelo.JdialogRedondeado {
    private Compra comp = new Compra();
    private static final CompraDAO daocomp = new CompraDAO();
    public static final ProveedorDAO prov = new ProveedorDAO();
    public static final ProductoDAO prod = new ProductoDAO();
    DefaultTableModel modelotabla ;
    public panelRegistroCompra(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        String [] titulos = {"N°serie","Nombre","Tipo","Precio","Cantidad","Sub Total"};
        modelotabla = new DefaultTableModel(null,titulos);
        actualizarTabla(modelotabla);
        spncant.setModel(new SpinnerNumberModel(1, 1, 10000, 1));
        cmbproveedor.setModel(prov.listaproveedores());
        btnagregarProducto.setIcon(icono("/imagenes/carritoagregar.png", 20));
        btnEliminarProducto.setIcon(icono("/imagenes/trash.png", 20));
        btnlimpiar.setIcon(icono("/imagenes/Limpiar.png", 20));
        btnmodificar.setIcon(icono("/imagenes/edit.png", 20));
        btnfinalizarcompra.setIcon(icono("/imagenes/finalizarcompra.png", 20));
        btnsalir.setIcon(icono("/imagenes/square-x (1).png", 30));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 =   new modelo.PanelRedondeado();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbpago = new javax.swing.JComboBox<>();
        cmbproveedor = new javax.swing.JComboBox<>();
        txtfechacom = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmostrarcompras = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spncant = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txtpreciocomp = new javax.swing.JTextField();
        btnEliminarProducto = new javax.swing.JButton();
        btnagregarProducto = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btnfinalizarcompra = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Proveedor | RUC");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("COMPRA DE PRODUCTOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 186, -1));

        jLabel6.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Compra");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        cmbpago.setForeground(new java.awt.Color(255, 255, 255));
        cmbpago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TRANSFERENCIA" }));
        jPanel2.add(cmbpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 137, 40));

        cmbproveedor.setForeground(new java.awt.Color(255, 255, 255));
        cmbproveedor.setToolTipText("");
        jPanel2.add(cmbproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 137, 40));

        txtfechacom.setBackground(new java.awt.Color(204, 204, 204));
        txtfechacom.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtfechacom, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 140, 40));

        jLabel8.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Pago");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        btnsalir.setBackground(new java.awt.Color(255, 51, 51));
        btnsalir.addActionListener(this::btnsalirActionPerformed);
        jPanel2.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 30));

        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 13)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 1, 13)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblmostrarcompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblmostrarcompras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 530, 365));

        jLabel5.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Producto | numero serie");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtproducto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 40));

        jLabel3.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));
        jPanel1.add(spncant, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 90, 40));

        jLabel7.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio Compra");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        txtpreciocomp.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtpreciocomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 137, 40));

        btnEliminarProducto.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminarProducto.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.addActionListener(this::btnEliminarProductoActionPerformed);
        jPanel1.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 120, 50));

        btnagregarProducto.setBackground(new java.awt.Color(255, 51, 102));
        btnagregarProducto.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnagregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarProducto.setText("Agregar ");
        btnagregarProducto.addActionListener(this::btnagregarProductoActionPerformed);
        jPanel1.add(btnagregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 120, 40));

        btnmodificar.setBackground(new java.awt.Color(0, 153, 102));
        btnmodificar.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 120, 50));

        jLabel17.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        jLabel17.setText("Total:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btnlimpiar.setBackground(new java.awt.Color(0, 102, 204));
        btnlimpiar.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(this::btnlimpiarActionPerformed);
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 120, 50));

        jTabbedPane1.addTab("Productos", jPanel1);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 570, 570));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Productos");

        btnfinalizarcompra.setBackground(new java.awt.Color(0, 102, 102));
        btnfinalizarcompra.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 13)); // NOI18N
        btnfinalizarcompra.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizarcompra.setText("Finalizar compra");
        btnfinalizarcompra.addActionListener(this::btnfinalizarcompraActionPerformed);
        jPanel2.add(btnfinalizarcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 730, 160, 50));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    public void actualizarTabla(DefaultTableModel modelo)
    {
        tblmostrarcompras.setModel(modelo);
        EstiloTabla.aplicar(tblmostrarcompras);
    }
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        int r = JOptionPane.showConfirmDialog(this,"¿Cerrar sin guardar la compra?", 
                "Confirmar",JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnsalirActionPerformed
    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if (comp.getListaDetalleCompra().size() == 0)
        {
            JOptionPane.showMessageDialog(this, "Lista vacia","Error al Eliminar"
            ,JOptionPane.WARNING_MESSAGE);
            return;
        }    
        int fila = tblmostrarcompras.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un producto de la tabla","Aviso", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
        compraproducto detalle = comp.getListaDetalleCompra().get(fila);
        comp.eliminar(detalle);
        actualizarTabla(comp.mostrar());
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed
    private void btnagregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarProductoActionPerformed
        String producto = txtproducto.getText().trim();
        String precioTexto = txtpreciocomp.getText().trim();

        if (producto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto");
            txtproducto.requestFocus();
            return;
        }

        if (precioTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el precio de compra");
            txtpreciocomp.requestFocus();
            return;
        }

        double precioCompra;

        try {
            precioCompra = Double.parseDouble(precioTexto);

            if (precioCompra <= 0) {
                JOptionPane.showMessageDialog(this, "El precio debe ser mayor que cero");
                txtpreciocomp.requestFocus();
                return;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un precio válido");
            txtpreciocomp.requestFocus();
            return;
        }

        int cantidad = (int) spncant.getValue();

        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero");
            spncant.requestFocus();
            return;
        }

        Producto pro = prod.existefk(producto);

        if (pro == null) {
            JOptionPane.showMessageDialog(this, "El producto " + producto + " no existe");
            txtproducto.requestFocus();
            return;
        }
        compraproducto detalle = new compraproducto(pro, precioCompra, cantidad);
        boolean agregado = comp.agregar(detalle);
        if (!agregado) {
            JOptionPane.showMessageDialog(this,
                    "Este producto ya está agregado con otro precio de compra.",
                    "Precio diferente",
                    JOptionPane.WARNING_MESSAGE);
            txtpreciocomp.requestFocus();
            return;
        }
        actualizarTabla(comp.mostrar());
    }//GEN-LAST:event_btnagregarProductoActionPerformed
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed
    public void limpiar()
    {
        txtproducto.setText("");
        txtpreciocomp.setText("");
        spncant.setValue(1);
        txtproducto.requestFocus();    
    }
    private void btnfinalizarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarcompraActionPerformed
        if (comp.getListaDetalleCompra().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Agregue al menos un producto");
            return;
        }

        if (cmbproveedor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un proveedor");
            cmbproveedor.requestFocus();
            return;
        }

        if (cmbpago.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un tipo de pago");
            cmbpago.requestFocus();
            return;
        }

        if (txtfechacom.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una fecha de compra");
            txtfechacom.requestFocus();
            return;
        }
        int finalizar = JOptionPane.showConfirmDialog(this, "¿Seguro que desea finalizar la compra?",
            "Finalizar",JOptionPane.YES_NO_OPTION);
        if (finalizar == JOptionPane.YES_OPTION) {
            Proveedor proveedor = (Proveedor) cmbproveedor.getSelectedItem();
            String tipoPago = cmbpago.getSelectedItem().toString();
            LocalDate fechaCompra = txtfechacom.getDate().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            comp.setProveedor(proveedor);
            comp.setTipoPago(tipoPago);
            comp.setFechaCompra(fechaCompra);
            comp.setEstadoCompra("COMPLETADO");
            
            boolean registrado = daocomp.insertarCompra(comp);
            if (registrado) {
                JOptionPane.showMessageDialog(this,"Compra registrada correctamente");
                dispose();
            } 
            else 
            {
                JOptionPane.showMessageDialog(this,"Error al registrar la compra", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnfinalizarcompraActionPerformed
    public javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnagregarProducto;
    private javax.swing.JButton btnfinalizarcompra;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbpago;
    private javax.swing.JComboBox<Proveedor> cmbproveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spncant;
    private javax.swing.JTable tblmostrarcompras;
    private com.toedter.calendar.JDateChooser txtfechacom;
    private javax.swing.JTextField txtpreciocomp;
    private javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}
