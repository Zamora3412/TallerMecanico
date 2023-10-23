package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ModificarProducto extends javax.swing.JFrame {

    int IDPro, IdProducto, idUnidadMedida, idProveedor, idCategoria, idEstatus;

    public ModificarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(800, 500);
        this.setTitle("Modificar Productos");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        IdProducto = JIExistencias.producto_update;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreUDM from unidaddemedida");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbUDM.addItem(rs.getString("NombreUDM"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar las unidades de medida. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreProveedor from proveedor");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbProveedores.addItem(rs.getString("NombreProveedor"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los proveedores. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreCategoria from categorias");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbCategorias.addItem(rs.getString("NombreCategoria"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar las categorias. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreE from estatusproducto");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbEstatus.addItem(rs.getString("NombreE"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los estatus. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select CodigoBarras, NombreProducto, Existencia, NombreUDM, NombreProveedor, NombreCategoria, PrecioCompra, "
                    + "PrecioVenta, NombreE from productos, unidaddemedida, proveedor, categorias, estatusproducto "
                    + "where idProductos = '" + IdProducto + "' and UnidaddeMedida_idUnidaddeMedida = idUnidaddeMedida "
                    + "and Proveedor_idProveedor = idProveedor and Categorias_idCategorias = idCategorias "
                    + "and EstatusProducto_idEstatusP = idEstatusP");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtCodigo.setText(rs.getString("CodigoBarras"));
                txtProducto.setText(rs.getString("NombreProducto"));
                txtExistencia.setText(rs.getString("Existencia"));
                cmbUDM.setSelectedItem(rs.getString("NombreUDM"));
                cmbProveedores.setSelectedItem(rs.getString("NombreProveedor"));
                cmbCategorias.setSelectedItem(rs.getString("NombreCategoria"));
                txtPrecioC.setText(rs.getString("PrecioCompra"));
                txtPrecioV.setText(rs.getString("PrecioVenta"));
                cmbEstatus.setSelectedItem(rs.getString("NombreE"));
                
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar producto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Taller P.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        lblExistencia = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        lblExistencia1 = new javax.swing.JLabel();
        cmbUDM = new javax.swing.JComboBox<>();
        lblProveedor = new javax.swing.JLabel();
        cmbProveedores = new javax.swing.JComboBox<>();
        lblCategorias = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        lblPrecioCompra = new javax.swing.JLabel();
        txtPrecioC = new javax.swing.JTextField();
        lblPrecioVenta = new javax.swing.JLabel();
        txtPrecioV = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        lblExistencia2 = new javax.swing.JLabel();
        cmbEstatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código de Barras:");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 87, 210, 25));

        lblProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Nombre del Producto:");
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 150, -1, -1));

        txtProducto.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 145, 210, 25));

        lblExistencia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia.setText("Existencia:");
        jPanel1.add(lblExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        txtExistencia.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtExistencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 205, 210, 25));

        lblExistencia1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia1.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia1.setText("Unidad de Medida:");
        jPanel1.add(lblExistencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        cmbUDM.setEditable(true);
        cmbUDM.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbUDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 265, 210, 25));

        lblProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("Proveedores:");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        cmbProveedores.setEditable(true);
        cmbProveedores.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 85, 210, 25));

        lblCategorias.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias:");
        jPanel1.add(lblCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        cmbCategorias.setEditable(true);
        cmbCategorias.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 145, 210, 25));

        lblPrecioCompra.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecioCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioCompra.setText("Precio Compra:");
        jPanel1.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        txtPrecioC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecioC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPrecioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 205, 210, 25));

        lblPrecioVenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioVenta.setText("Precio Venta:");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        txtPrecioV.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecioV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPrecioV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 265, 210, 25));

        btnModificar.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ActualizarProducto.png"))); // NOI18N
        btnModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 120, 120));

        lblExistencia2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia2.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia2.setText("Estatus del Producto:");
        jPanel1.add(lblExistencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        cmbEstatus.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 210, 25));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped

        if (txtCodigo.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped

        if (txtProducto.getText().length() >= 45) {
            evt.consume();
        }

    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtPrecioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCKeyTyped

        if (txtPrecioC.getText().length() >= 5) {
            evt.consume();
        }

    }//GEN-LAST:event_txtPrecioCKeyTyped

    private void txtPrecioVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVKeyTyped

        if (txtPrecioV.getText().length() >= 5) {
            evt.consume();
        }

    }//GEN-LAST:event_txtPrecioVKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int validacion = 0;
        String CB, NP, Ex, PC, PV;

        CB = txtCodigo.getText().trim();
        NP = txtProducto.getText().trim();
        Ex = txtExistencia.getText().trim();
        PC = txtPrecioC.getText().trim();
        PV = txtPrecioV.getText().trim();

        idUnidadMedida = cmbUDM.getSelectedIndex() + 1;
        consultarID();
        idCategoria = cmbCategorias.getSelectedIndex() + 1;
        idEstatus = cmbEstatus.getSelectedIndex() + 1;

        if (CB.equals("")) {
            validacion++;
        }
        if (NP.equals("")) {
            validacion++;
        }
        if (Ex.equals("")) {
            validacion++;
        }
        if (PC.equals("")) {
            validacion++;
        }
        if (PV.equals("")) {
            validacion++;
        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select NombreProducto from productos where NombreProducto = '" + NP + "' and not idProductos = '" + IdProducto + "'");

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    txtProducto.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de producto no disponible");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "update productos set CodigoBarras = ? ,NombreProducto = ?, Existencia = ?, UnidaddeMedida_idUnidaddeMedida = ?,"
                            + " Proveedor_idProveedor = ?, Categorias_idCategorias = ?, PrecioCompra = ?, PrecioVenta = ?, EstatusProducto_idEstatusP = ? "
                            + "where idProductos = '" + IdProducto + "'");
                    pst2.setString(1, CB);
                    pst2.setString(2, NP);
                    pst2.setString(3, Ex);
                    pst2.setInt(4, idUnidadMedida);
                    pst2.setInt(5, idProveedor);
                    pst2.setInt(6, idCategoria);
                    pst2.setFloat(7, Float.parseFloat(PC));
                    pst2.setFloat(8, Float.parseFloat(PV));
                    pst2.setInt(9, idEstatus);

                    pst2.executeUpdate();
                    cn2.close();

                    txtProducto.setText("");
                    txtCodigo.setText("");
                    txtExistencia.setText("");
                    txtPrecioC.setText("");
                    txtPrecioV.setText("");
                    cmbCategorias.setSelectedIndex(0);
                    cmbProveedores.setSelectedIndex(0);
                    cmbEstatus.setSelectedIndex(0);
                    cmbUDM.setSelectedIndex(0);


                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    this.dispose();
                }

            } catch (SQLException e) {
                System.err.println("Error al actualizar " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    public void consultarID() {
        String proveedor;

        proveedor = cmbProveedores.getSelectedItem().toString();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProveedor from proveedor where NombreProveedor = '" + proveedor + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idProveedor = rs.getInt("idProveedor");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar datos: ID Ciudad " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JComboBox<String> cmbEstatus;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JComboBox<String> cmbUDM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblExistencia1;
    private javax.swing.JLabel lblExistencia2;
    private javax.swing.JLabel lblPrecioCompra;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtPrecioV;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
