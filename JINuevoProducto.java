package Interfaces;


import java.sql.*;
import javax.swing.JOptionPane;

public class JINuevoProducto extends javax.swing.JInternalFrame {

    int idUnidadMedida;
    int idProveedor;
    int idCategoria;

    public JINuevoProducto() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Nuevo Producto");

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
        btnAgregarPro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código de Barras:");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 165, 200, 25));

        lblProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Nombre del Producto:");
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, -1, -1));

        txtProducto.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtProducto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 105, 200, 25));

        lblExistencia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia.setText("Existencia:");
        jPanel1.add(lblExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        txtExistencia.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtExistencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtExistencia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistenciaKeyTyped(evt);
            }
        });
        jPanel1.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 225, 200, 25));

        lblExistencia1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblExistencia1.setForeground(new java.awt.Color(255, 255, 255));
        lblExistencia1.setText("Unidad de Medida:");
        jPanel1.add(lblExistencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 290, -1, -1));

        cmbUDM.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbUDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 285, 200, 25));

        lblProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("Proveedores:");
        jPanel1.add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        cmbProveedores.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 105, 200, 25));

        lblCategorias.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias:");
        jPanel1.add(lblCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        cmbCategorias.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 165, 200, 25));

        lblPrecioCompra.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecioCompra.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioCompra.setText("Precio Compra:");
        jPanel1.add(lblPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        txtPrecioC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecioC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrecioC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 225, 200, 25));

        lblPrecioVenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPrecioVenta.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecioVenta.setText("Precio Venta:");
        jPanel1.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        txtPrecioV.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecioV.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrecioV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPrecioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 285, 200, 25));

        btnAgregarPro.setFont(new java.awt.Font("Roboto Light", 0, 11)); // NOI18N
        btnAgregarPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregarPro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 120, 120));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
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

    private void txtExistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExistenciaKeyTyped

        if (txtExistencia.getText().length() >= 5) {
            evt.consume();
        }

    }//GEN-LAST:event_txtExistenciaKeyTyped

    private void btnAgregarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProActionPerformed

        int validacion = 0;

        String CB, NP, Ex, PC, PV;

        CB = txtCodigo.getText().trim();
        NP = txtProducto.getText().trim();
        Ex = txtExistencia.getText().trim();
        PC = txtPrecioC.getText().trim();
        PV = txtPrecioV.getText().trim();

        idUnidadMedida = cmbUDM.getSelectedIndex() + 1;
        idCategoria = cmbCategorias.getSelectedIndex() + 1;

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
        consultarID();
        if (validacion == 0) {
            Connection cn = Conexion.conectar();
            PreparedStatement pst;
            try {
                pst = cn.prepareStatement(
                        "insert into productos values(?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, CB);
                pst.setString(3, NP);
                pst.setString(4, Ex);
                pst.setInt(5, idUnidadMedida);
                pst.setInt(6, idProveedor);
                pst.setInt(7, idCategoria);
                pst.setString(8, PC);
                pst.setString(9, PV);
                pst.setInt(10, 1);

                pst.executeUpdate();
                cn.close();

                txtCodigo.setText("");
                txtProducto.setText("");
                txtExistencia.setText("");
                cmbUDM.setSelectedIndex(0);
                cmbProveedores.setSelectedIndex(0);
                cmbCategorias.setSelectedIndex(0);
                txtPrecioC.setText("");
                txtPrecioV.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Producto Exitoso");
            } catch (SQLException e) {
                System.err.println("Error en Registrar Producto." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            } 

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_btnAgregarProActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPro;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JComboBox<String> cmbUDM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblExistencia;
    private javax.swing.JLabel lblExistencia1;
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
