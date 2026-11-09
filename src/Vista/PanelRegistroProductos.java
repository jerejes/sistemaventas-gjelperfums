package Vista;

import dao.AccesorioDAO;
import dao.InventarioDAO;
import dao.PerfumeDAO;
import dao.ProductoDAO;
import javax.swing.JOptionPane;
import modelo.Accesorio;
import modelo.Inventario;
import modelo.Perfume;
import modelo.Producto;
public class PanelRegistroProductos extends javax.swing.JPanel {
    private final ProductoDAO dao = new ProductoDAO();
    private final PerfumeDAO daoper = new PerfumeDAO();
    private final AccesorioDAO daoasc = new AccesorioDAO();


    public PanelRegistroProductos() {
        initComponents();
        chkperfume.setSelected(true);
        panelperfume.setVisible(true);
        panelaccesorio.setVisible(false);
        btncerrar.setIcon(icono("/imagenes/logout.png", 30));
        btnguardarprod.setIcon(icono("/imagenes/finalizarcompra.png", 20));
        btnguardarprod.setIcon(icono("/imagenes/finalizarcompra.png", 20));
        btnlimpiar.setIcon(icono("/imagenes/Limpiar.png", 20));
        cmbgenero.removeAllItems();
        cmbgenero.addItem("Masculino");
        cmbgenero.addItem("Femenino");
    }  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new modelo.PanelRedondeado()
        ;
        btnguardarprod = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtPrecioProd = new javax.swing.JTextField();
        chkperfume = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        chkaccesorio = new javax.swing.JCheckBox();
        txtNombreProd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        panelaccesorio = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtmaterial = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txttipoac = new javax.swing.JTextField();
        panelperfume = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtcont_ml = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmbgenero = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardarprod.setBackground(new java.awt.Color(0, 102, 102));
        btnguardarprod.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnguardarprod.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarprod.setText("Guardar");
        btnguardarprod.addActionListener(this::btnguardarprodActionPerformed);
        jPanel1.add(btnguardarprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 150, 40));

        btnlimpiar.setBackground(new java.awt.Color(0, 102, 204));
        btnlimpiar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setText("Limpiar");
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 150, 40));

        jLabel15.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Precio Unitario(*)");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtPrecioProd.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecioProd.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtPrecioProd.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioProd.setBorder(null);
        jPanel1.add(txtPrecioProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 140, 40));

        buttonGroup1.add(chkperfume);
        chkperfume.setForeground(new java.awt.Color(0, 0, 0));
        chkperfume.setText("Perfume");
        chkperfume.addActionListener(this::chkperfumeActionPerformed);
        jPanel1.add(chkperfume, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tipo De Producto:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        buttonGroup1.add(chkaccesorio);
        chkaccesorio.setForeground(new java.awt.Color(0, 0, 0));
        chkaccesorio.setText("Accesorio");
        chkaccesorio.addActionListener(this::chkaccesorioActionPerformed);
        jPanel1.add(chkaccesorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        txtNombreProd.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreProd.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtNombreProd.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProd.setBorder(null);
        jPanel1.add(txtNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 320, 40));

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre (*)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NUEVO PRODUCTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        btncerrar.setBackground(new java.awt.Color(255, 51, 51));
        btncerrar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btncerrar.addActionListener(this::btncerrarActionPerformed);
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 40, 30));

        panelaccesorio.setBackground(new java.awt.Color(255, 255, 255));
        panelaccesorio.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Material(*)");
        panelaccesorio.add(jLabel17);
        jLabel17.setBounds(0, 80, 57, 21);

        txtmaterial.setBackground(new java.awt.Color(51, 51, 51));
        txtmaterial.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtmaterial.setForeground(new java.awt.Color(255, 255, 255));
        txtmaterial.setBorder(null);
        panelaccesorio.add(txtmaterial);
        txtmaterial.setBounds(0, 100, 140, 40);

        jLabel14.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tipo Accesorio(*)");
        panelaccesorio.add(jLabel14);
        jLabel14.setBounds(0, 0, 92, 21);

        txttipoac.setBackground(new java.awt.Color(51, 51, 51));
        txttipoac.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txttipoac.setForeground(new java.awt.Color(255, 255, 255));
        txttipoac.setBorder(null);
        panelaccesorio.add(txttipoac);
        txttipoac.setBounds(0, 30, 140, 40);

        jPanel1.add(panelaccesorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 150, 150));

        panelperfume.setBackground(new java.awt.Color(255, 255, 255));
        panelperfume.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cont Ml (*)");
        panelperfume.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        txtcont_ml.setBackground(new java.awt.Color(51, 51, 51));
        txtcont_ml.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txtcont_ml.setForeground(null);
        txtcont_ml.setBorder(null);
        panelperfume.add(txtcont_ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 40));

        jLabel18.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Genero(*)");
        panelperfume.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 60, 20));

        cmbgenero.setForeground(null);
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelperfume.add(cmbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 40));

        jPanel1.add(panelperfume, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 150, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    private javax.swing.ImageIcon icono(String ruta, int tam) {
        java.awt.Image img = new javax.swing.ImageIcon(getClass().getResource(ruta)).getImage();
        return new javax.swing.ImageIcon(img.getScaledInstance(tam, tam, java.awt.Image.SCALE_SMOOTH));
    }
    private void chkperfumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkperfumeActionPerformed
        panelperfume.setVisible(true);
        panelaccesorio.setVisible(false);
    }//GEN-LAST:event_chkperfumeActionPerformed

    private void chkaccesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkaccesorioActionPerformed
        panelperfume.setVisible(false);
        panelaccesorio.setVisible(true);
    }//GEN-LAST:event_chkaccesorioActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btncerrarActionPerformed
    private void btnguardarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarprodActionPerformed
        Inventario inv = new InventarioDAO().obtener();
        if (inv == null) {
            JOptionPane.showMessageDialog(this, "No hay un inventario registrado.");
            return;
        }
        if (txtNombreProd.getText().trim().isEmpty()
            || txtPrecioProd.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Completa el nombre y el precio.");
            return ;
        }
        try {
            double precio = Double.parseDouble(txtPrecioProd.getText());
            if (precio <= 0) {
                JOptionPane.showMessageDialog(this, "El precio debe ser mayor que cero.");
                return;
            }
            Producto pro;
            if (chkperfume.isSelected()) {
                if (!txtcont_ml.getText().trim().isEmpty()) {
                    int ml = Integer.parseInt(txtcont_ml.getText().trim());
                    try {
                        String genero = cmbgenero.getSelectedItem().toString();
                        pro = new Perfume(txtNombreProd.getText(), precio, inv, genero, ml);
                        Perfume perf = (Perfume) pro;
                        if (daoper.buscarproducto(perf)) 
                        {
                            JOptionPane.showMessageDialog(null, "producto existente");
                            return;
                        } else 
                        {
                            if (dao.insertarProducto(perf)) {
                                JOptionPane.showMessageDialog(this, "Producto guardado: "
                                        + perf.getNumSerie());
                                limpiar();
                            }
                        }
                    } catch (Exception x) {
                        JOptionPane.showMessageDialog(this, "El contenido de ml debe ser numeros.");
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(this, "Ingresa el contenido en ml.");
                    return;
                }
            } 
            else if (chkaccesorio.isSelected()) 
            {
                if (txttipoac.getText().isEmpty() || txtmaterial.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Completa el tipo y el material.");
                    return;
                }
                pro = new Accesorio(txtNombreProd.getText(), precio, inv, txttipoac.getText(),
                        txtmaterial.getText());
                Accesorio asc = (Accesorio) pro;
                    if (daoasc.buscarproducto(asc)) 
                    {
                    JOptionPane.showMessageDialog(null, "producto existente");
                    return;
                     } 
                    else 
                    {
                        if (dao.insertarProducto(pro)) 
                        {
                            JOptionPane.showMessageDialog(this, "Producto guardado: "
                                    + pro.getNumSerie());
                            limpiar();
                        }
                    }
            } else 
            {
                JOptionPane.showMessageDialog(this, "Elige el tipo de producto.");
                return;
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "El precio solo debe ser números.");
        }
    }//GEN-LAST:event_btnguardarprodActionPerformed
    private void limpiar() {
        txtNombreProd.setText("");
        txtPrecioProd.setText("");
        txtcont_ml.setText("");
        txttipoac.setText("");
        txtmaterial.setText("");
        cmbgenero.setSelectedIndex(0);
        chkperfume.setSelected(true);
        panelperfume.setVisible(true);
        panelaccesorio.setVisible(false);
        txtNombreProd.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnguardarprod;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkaccesorio;
    private javax.swing.JCheckBox chkperfume;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelaccesorio;
    private javax.swing.JPanel panelperfume;
    private javax.swing.JTextField txtNombreProd;
    private javax.swing.JTextField txtPrecioProd;
    private javax.swing.JTextField txtcont_ml;
    private javax.swing.JTextField txtmaterial;
    private javax.swing.JTextField txttipoac;
    // End of variables declaration//GEN-END:variables
}
