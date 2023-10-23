package Interfaces;

import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JINuevaCompra extends javax.swing.JInternalFrame {

    String user;

    float total;
    String idUsuario;
    String idCompra;
    int idProveedor, idProducto;
    int nuevaCant, cantidad, existencia, cantidadVieja;
    DefaultTableModel model = new DefaultTableModel();

    public JINuevaCompra() {
        initComponents();
        setSize(794, 548);
        setTitle("Nueva Orden de Compra");

        jTable_Compra = new JTable(model);
        jScrollPane1.setViewportView(jTable_Compra);

        model.addColumn("ID Producto");
        model.addColumn("Descripción");
        model.addColumn("Cantidad a Comprar");
        model.addColumn("Precio Unitario de Compra");
        model.addColumn("Subtotal");

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
            System.err.println("Error en cargar proveedores " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblSKU = new javax.swing.JLabel();
        cmbProveedores = new javax.swing.JComboBox<>();
        btBuscar = new javax.swing.JButton();
        LbDescripción = new javax.swing.JLabel();
        cmbProductos = new javax.swing.JComboBox<>();
        LblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        LblCodigo1 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Compra = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        LblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Orden de Compra");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 740, -1));

        LblSKU.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblSKU.setForeground(new java.awt.Color(255, 255, 255));
        LblSKU.setText("Proveedor:");
        jPanel1.add(LblSKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 95, 80, -1));

        cmbProveedores.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cmbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(cmbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, 25));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 40, 40));

        LbDescripción.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LbDescripción.setForeground(new java.awt.Color(255, 255, 255));
        LbDescripción.setText("Producto:");
        jPanel1.add(LbDescripción, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 95, -1, -1));

        cmbProductos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });
        jPanel1.add(cmbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 210, 25));

        LblCantidad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        LblCantidad.setText("Cantidad:");
        jPanel1.add(LblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 165, 130, 25));

        LblCodigo1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigo1.setText("Precio de Compra:");
        jPanel1.add(LblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        txtPrecioCompra.setEditable(false);
        txtPrecioCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioCompra.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecioCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 165, 190, 25));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 90, 80));

        jTable_Compra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Compra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 740, 120));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        btnBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, 70));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 90, 70));

        LblTotal.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblTotal.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal.setText("Total a pagar:");
        jPanel1.add(LblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        txtTotal.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 385, 150, 30));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Orden.png"))); // NOI18N
        btnPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 435, 90, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        idProveedor = cmbProveedores.getSelectedIndex() + 1;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreProducto from productos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbProductos.addItem(rs.getString("NombreProducto"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar proveedores " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }//GEN-LAST:event_btBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        idProducto = cmbProductos.getSelectedIndex() + 1;
        Object[] columna = new Object[5];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idProductos, NombreProducto, PrecioCompra from productos where idProductos ='" + idProducto + "'");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cantidad = Integer.parseInt(txtCantidad.getText().trim());
                columna[0] = rs.getObject(1);
                columna[1] = rs.getObject(2);
                columna[2] = txtCantidad.getText().trim();
                columna[3] = rs.getObject(3);
                float precio = rs.getFloat(3);
                columna[4] = cantidad * precio;
                model.addRow(columna);
                calcularTotal();
                txtCantidad.setText("");
                cmbProductos.setSelectedIndex(0);
            }

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, ¡Contacte al administrador!");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        model.removeRow(jTable_Compra.getSelectedRow());
        calcularTotal();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        float sub2;
        int cant;
        cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad"));
        jTable_Compra.setValueAt(cant, jTable_Compra.getSelectedRow(), 2);
        sub2 = cant * (Float.parseFloat(jTable_Compra.getValueAt(jTable_Compra.getSelectedRow(), 3).toString()));
        jTable_Compra.setValueAt(sub2, jTable_Compra.getSelectedRow(), 4);
        calcularTotal();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        int pago;
        float cambio;

        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fechaCompra = new java.sql.Date(d);

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        java.util.Date time = new java.util.Date();
        long t = time.getTime();
        java.sql.Time horaCompra = new java.sql.Time(t);

        pago = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad con la que pagara la empresa",
                    "Billete", JOptionPane.QUESTION_MESSAGE));
            cambio = pago - total;
        
        try {
            
            Connection cn2 = Conexion.conectar();
            PreparedStatement pst2 = cn2.prepareStatement(
                    "insert into compras values (?,?,?,?,?,?,?)");
            pst2.setString(1, "0");
            pst2.setDate(2, fechaCompra);
            pst2.setTime(3, horaCompra);
            pst2.setFloat(4, total);
            pst2.setString(5, "16%");
            pst2.setFloat(6, pago);
            pst2.setFloat(7, cambio);
            pst2.executeUpdate();
            cn2.close();
            txtCantidad.setText("");
            txtPrecioCompra.setText("");
            txtTotal.setText("");

            JOptionPane.showMessageDialog(null, "El cambio de la empresa es de: $" + cambio);
            JOptionPane.showMessageDialog(null, "Registro de compra exitoso");
            cn2.close();

            try {
                Connection conex = Conexion.conectar();
                PreparedStatement prep = conex.prepareStatement(
                        "select * from compras where HoraCompra = '" + horaCompra + "'");
                ResultSet resul = prep.executeQuery();

                if (resul.next()) {
                    idCompra = resul.getString("idCompras");
                }
                conex.close();
            } catch (SQLException e) {
                System.err.println("Error al cargar el folio de compra " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar folio de venta!!, contacte al administrador.");
            }

            try {
                Connection conx = Conexion.conectar();
                PreparedStatement pesnt = conx.prepareStatement(
                        "insert into detallecompra values (?,?,?,?)");

                for (int i = 0; i < jTable_Compra.getRowCount(); i++) {
                    String clave, cnt, subt;
                    clave = jTable_Compra.getValueAt(i, 0).toString();
                    cnt = jTable_Compra.getValueAt(i, 2).toString();
                    subt = jTable_Compra.getValueAt(i, 4).toString();

                    pesnt.setString(1, clave);
                    pesnt.setString(2, cnt);
                    pesnt.setString(3, subt);
                    pesnt.setString(4, idCompra);
                    pesnt.executeUpdate();

                }
                conx.close();
            } catch (SQLException e) {
                System.err.println("Error al generar el folio de detalle de compra " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de detalle de venta!!, contacte al administrador.");
            }
            
            for (int i = 0; i < jTable_Compra.getRowCount(); i++) {
                try {

                    Connection cn3 = Conexion.conectar();
                    PreparedStatement pt = cn3.prepareStatement(
                            "select * from productos where idProductos = '" + jTable_Compra.getValueAt(i, 0) + "'");
                    ResultSet rs2 = pt.executeQuery();

                    if (rs2.next()) {
                        cantidadVieja = Integer.parseInt(rs2.getString(4));
                    }

                    cn2.close();
                } catch (SQLException e) {
                    System.err.println("Error al obtener la existencia del producto");
                    JOptionPane.showMessageDialog(null, "¡¡ERROR al obtener existencias!!, contacte al administrador.");
                }
                try {
                    Connection con = Conexion.conectar();
                    PreparedStatement pest = con.prepareStatement(
                            "update productos set Existencia=? where idProductos = '" + jTable_Compra.getValueAt(i, 0) + "'");
                    nuevaCant = cantidadVieja + (Integer.parseInt(jTable_Compra.getValueAt(i, 2).toString()));
                    pest.setInt(1, nuevaCant);
                    pest.executeUpdate();
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Error al actualizar existencias " + e);
                }
            }
            this.dispose();

        } catch (SQLException e) {
            System.err.println("Error en Registrar Compra." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");

        }


    }//GEN-LAST:event_btnPagarActionPerformed

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
        idProducto = cmbProductos.getSelectedIndex() + 1;
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select PrecioCompra from productos where idProductos = '" + idProducto + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtPrecioCompra.setText(rs.getString("PrecioCompra"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar datos del producto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_cmbProductosActionPerformed

    private void cmbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProveedoresActionPerformed

    public void calcularTotal() {

        float sub = 0.0f;
        for (int i = 0; i < jTable_Compra.getRowCount(); i++) {
            sub += Float.parseFloat(jTable_Compra.getValueAt(i, 4).toString());
        }
        total = sub * 1.16f;
        if (total == 0) {
            txtTotal.setText("");
        } else {
            txtTotal.setText(String.valueOf(total));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbDescripción;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblCodigo1;
    private javax.swing.JLabel LblSKU;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_Compra;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
