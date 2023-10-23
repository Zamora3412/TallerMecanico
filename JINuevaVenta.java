package Interfaces;

import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JINuevaVenta extends javax.swing.JInternalFrame {

    String user;
    String idProducto = "";
    int idProd;
    float total;
    int idUsuario;
    String idVenta;
    int nuevaCant, cantidad, existencia, cantidadVieja;
    DefaultTableModel model = new DefaultTableModel();

    public JINuevaVenta() {
        initComponents();

        setSize(794, 548);
        setTitle("Venta de productos");
        setResizable(false);
        user = Login.usuario;

        jTable_Venta = new JTable(model);
        jScrollPane1.setViewportView(jTable_Venta);

        model.addColumn("ID Producto");
        model.addColumn("Descripción");
        model.addColumn("Cantidad");
        model.addColumn("Precio Unitario");
        model.addColumn("Subtotal");

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from empleados where Usuario = '" + user + "' ");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                idUsuario = rs.getInt("idEmpleados");
            }
            cn.close();
            
        } catch (SQLException e) {
            System.err.println("Error en buscar ID del empleado." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al buscar!!, contacte al administrador.");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreC, APaternoC, AMaternoC from clientes");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbCliente.addItem(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));

            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar clientes " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblSKU = new javax.swing.JLabel();
        LbDescripción = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        txtNombreProducto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        LblCodigo1 = new javax.swing.JLabel();
        txtUDM = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Venta = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        LblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LblCantidad1 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        LblCantidad2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        LblCodigo2 = new javax.swing.JLabel();
        cmbProductos = new javax.swing.JComboBox<>();
        btnBusDes = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblSKU.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblSKU.setForeground(new java.awt.Color(255, 255, 255));
        LblSKU.setText("ID Producto:");
        jPanel1.add(LblSKU, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 65, 100, -1));

        LbDescripción.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LbDescripción.setForeground(new java.awt.Color(255, 255, 255));
        LbDescripción.setText("Descripción:");
        jPanel1.add(LbDescripción, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 65, -1, -1));

        txtIdProducto.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtIdProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 90, 25));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 40, 40));

        txtNombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNombreProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 240, 25));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 740, -1));

        LblCantidad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        LblCantidad.setText("Cantidad:");
        jPanel1.add(LblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 115, 60, 25));

        LblCodigo1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigo1.setText("Unidad de Medida:");
        jPanel1.add(LblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        txtUDM.setEditable(false);
        txtUDM.setBackground(new java.awt.Color(255, 255, 255));
        txtUDM.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtUDM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtUDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 115, 80, 25));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito(1).png"))); // NOI18N
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 90, 70));

        jTable_Venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Venta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 740, 120));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 740, -1));

        LblTotal.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblTotal.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal.setText("Total + IVA:");
        jPanel1.add(LblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 385, 150, 30));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pagar.png"))); // NOI18N
        btnPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 435, 90, 70));

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

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venta de Productos/Servicios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        LblCantidad1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        LblCantidad1.setText("Cliente:");
        jPanel1.add(LblCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 175, -1, -1));

        cmbCliente.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 25));

        LblCantidad2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        LblCantidad2.setText("Precio:");
        jPanel1.add(LblCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPrecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 80, 25));

        LblCodigo2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigo2.setText("Producto:");
        jPanel1.add(LblCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        cmbProductos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });
        jPanel1.add(cmbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 115, 260, 25));

        btnBusDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBusDes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBusDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusDesActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        int validacion = 0;
        cmbProductos.removeAllItems();
        idProducto = txtIdProducto.getText().trim();

        if (idProducto.equals("")) {
            
            validacion++;
        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select idProductos, NombreProducto, NombreUDM, PrecioVenta from productos, unidaddemedida where idProductos = '" + idProducto + "' "
                        + "and UnidaddeMedida_idUnidaddeMedida = idUnidaddeMedida");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txtIdProducto.setText(rs.getString("idProductos"));
                    txtNombreProducto.setText(rs.getString("NombreProducto"));
                    txtUDM.setText(rs.getString("NombreUDM"));
                    txtPrecio.setText(rs.getString("PrecioVenta"));
                    cmbProductos.addItem(rs.getString("NombreProducto"));
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no existe");
                }
                cn.close();

            } catch (SQLException e) {
                System.err.println("Error en buscar producto." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al buscar!!, contacte al administrador.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar el campo del ID del producto");
        }


    }//GEN-LAST:event_btBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String cantemp = txtCantidad.getText().trim();
        idProducto = txtIdProducto.getText().trim();
        
        if (cantemp.equals("")) {
            JOptionPane.showMessageDialog(null, "Debes agregar la cantidad del producto a comprar");
        } else {
            try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idProductos, NombreProducto, PrecioVenta, Existencia from productos where idProductos ='" + idProducto + "'");
            ResultSet rs = pst.executeQuery();

            Object[] columna = new Object[5];
            while (rs.next()) {
                existencia = rs.getInt("Existencia");
                cantidad = Integer.parseInt(txtCantidad.getText().trim());

                if (cantidad <= existencia) {
                    columna[0] = rs.getObject(1);
                    columna[1] = rs.getObject(2);
                    columna[2] = txtCantidad.getText().trim();
                    columna[3] = rs.getObject(3);
                    float precio = rs.getFloat(3);
                    columna[4] = cantidad * precio;
                    model.addRow(columna);
                    calcularTotal();
                    txtCantidad.setText("");
                    txtNombreProducto.setText("");
                    txtIdProducto.setText("");
                    txtUDM.setText("");
                    txtPrecio.setText("");
                    txtIdProducto.setBackground(Color.WHITE);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad solicitada es mayor a la registrada en el sistema");
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, ¡Contacte al administrador!");
        }
        }
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        int pago, nvc, idCliente, respNVC = 0, saldoLinea, numPagos;
        float cambio, creditoRes;
        String cliente = cmbCliente.getSelectedItem().toString();
        idCliente = cmbCliente.getSelectedIndex() + 1;

        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fechaVenta = new java.sql.Date(d);

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        java.util.Date time = new java.util.Date();
        long t = time.getTime();
        java.sql.Time horaVenta = new java.sql.Time(t);

        java.util.Date date3 = new java.util.Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date3);
        c.add(Calendar.DATE, 15);
        date3 = c.getTime();
        long dat = date3.getTime();
        java.sql.Date fechaPago = new java.sql.Date(dat);
        

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idNC_Cliente, LimiteCredito, CreditoRestante "
                    + "from nc_cliente, clientes where idClientes = '" + idCliente + "'"
                    + "and NC_Cliente_idNC_Cliente = idNC_Cliente");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                nvc = rs.getInt("idNC_Cliente");
                saldoLinea = rs.getInt("LimiteCredito");
                creditoRes = rs.getFloat("CreditoRestante");
                if (nvc > 1) {
                    do {
                        respNVC = Integer.parseInt(JOptionPane.showInputDialog(null, "El cliente " + cliente + " cuenta con una linea de credito : $" + creditoRes + 
                                " \n¿Desea pagar con la linea de credito?"));
                    } while (respNVC < 1 || respNVC > 2);
                    //A partir de abajo es pago con linea de credito
                    if (respNVC == 1) {
                       
                        if (creditoRes >= total) {
                            try {
                                Connection cn2 = Conexion.conectar();
                                PreparedStatement pst2 = cn2.prepareStatement(
                                        "insert into venta values (?,?,?,?,?,?,?)");
                                pst2.setString(1, "0");
                                pst2.setDate(2, fechaVenta);
                                pst2.setTime(3, horaVenta);
                                pst2.setString(4, "16%");
                                pst2.setFloat(5, total);
                                pst2.setFloat(6, total);
                                pst2.setFloat(7, 0.0f);
                                pst2.executeUpdate();
                                cn2.close();
                                txtIdProducto.setText("");
                                txtNombreProducto.setText("");
                                txtCantidad.setText("");
                                txtUDM.setText("");
                                txtPrecio.setText("");
                                txtTotal.setText("");

                                txtCantidad.setBackground(Color.green);
                                txtNombreProducto.setBackground(Color.green);
                                txtIdProducto.setBackground(Color.green);
                                txtTotal.setBackground(Color.green);
                                txtUDM.setBackground(Color.green);

                                JOptionPane.showMessageDialog(null, "Registro de venta exitoso");
                                cn2.close();

                                try {
                                    Connection conex = Conexion.conectar();
                                    PreparedStatement prep = conex.prepareStatement(
                                            "select * from venta where HoraVenta = '" + horaVenta + "'");
                                    ResultSet resul = prep.executeQuery();

                                    if (resul.next()) {
                                        idVenta = resul.getString("idVenta");
                                    }
                                    conex.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al cargar el folio de venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar folio de venta!!, contacte al administrador.");
                                }

                                try {
                                    Connection conexi = Conexion.conectar();
                                    PreparedStatement prestat = conexi.prepareStatement(
                                            "insert into clientes_has_venta values (?,?)");

                                    prestat.setInt(1, idCliente);
                                    prestat.setString(2, idVenta);
                                    prestat.executeUpdate();
                                } catch (SQLException e) {
                                    System.err.println("Error al generar el folio de relacion cliente venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion cliente venta!!, contacte al administrador.");
                                }

                                try {
                                    Connection cn4 = Conexion.conectar();
                                    PreparedStatement pst4 = cn4.prepareStatement(
                                            "insert into empleados_has_venta values (?,?)");

                                    pst4.setInt(1, idUsuario);
                                    pst4.setInt(2, Integer.parseInt(idVenta));
                                    pst4.executeUpdate();
                                } catch (SQLException e) {
                                    System.err.println("Error al generar el folio de relacion usuario venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion usuario venta!!, contacte al administrador.");
                                }

                                try {
                                    Connection conx = Conexion.conectar();
                                    PreparedStatement pesnt = conx.prepareStatement(
                                            "insert into detalleventa values (?,?,?,?)");

                                    for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                                        String clave, cnt, subt;
                                        clave = jTable_Venta.getValueAt(i, 0).toString();
                                        cnt = jTable_Venta.getValueAt(i, 2).toString();
                                        subt = jTable_Venta.getValueAt(i, 4).toString();

                                        pesnt.setString(1, clave);
                                        pesnt.setString(2, cnt);
                                        pesnt.setString(3, subt);
                                        pesnt.setString(4, idVenta);
                                        pesnt.executeUpdate();

                                    }
                                    conx.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al generar el folio de detalle de venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de detalle de venta!!, contacte al administrador.");
                                }

                                for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                                    try {

                                        Connection cn3 = Conexion.conectar();
                                        PreparedStatement pt = cn3.prepareStatement(
                                                "select * from productos where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
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
                                                "update productos set Existencia=? where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
                                        nuevaCant = cantidadVieja - (Integer.parseInt(jTable_Venta.getValueAt(i, 2).toString()));
                                        pest.setInt(1, nuevaCant);
                                        pest.executeUpdate();
                                        con.close();
                                    } catch (SQLException e) {
                                        System.err.println("Error al actualizar existencias " + e);
                                        JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar existencias de productos !!, contacte al administrador.");
                                    }
                                }
                                // try catch para agregar detalle de deuda de clientes
                                do {
                                    numPagos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿A cuantos pagos quincenales desea pagarlo? \n "
                                            + "Número Máximo de Pagos: 12",
                                            JOptionPane.QUESTION_MESSAGE));
                                } while (numPagos < 1 || numPagos > 12);
                                try {
                                    Connection cn5 = Conexion.conectar();
                                    PreparedStatement prst = cn5.prepareStatement(
                                            "insert into detalledeuda values (?,?,?,?,?,?,?,?,?)");
                                    prst.setString(1, "0");
                                    prst.setInt(2, numPagos);
                                    prst.setInt(3, 0);
                                    prst.setDate(4, fechaVenta);
                                    prst.setDate(5, fechaPago);
                                    prst.setFloat(6, 0.0f);
                                    prst.setFloat(7, total);
                                    prst.setInt(8, idCliente);
                                    prst.setInt(9, Integer.parseInt(idVenta));

                                    prst.executeUpdate();
                                    cn5.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al generar el folio de detalle de deuda " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de detalle de deuda!!, contacte al administrador.");
                                }
                                float nCrRes;
                                nCrRes = (float) creditoRes - total;
                                try {
                                    Connection cn6 = Conexion.conectar();
                                    PreparedStatement pst3 = cn6.prepareStatement(
                                            "update clientes set CreditoRestante = ? where idClientes = '" + idCliente + "'");

                                    pst3.setFloat(1, nCrRes);
                                    pst3.executeUpdate();
                                    cn6.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al actualizar el credito restante del cliente " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar folio credito restante del cliente!!, contacte al administrador.");
                                }
                                JOptionPane.showMessageDialog(null, "¡Venta realizada exitosamente, Vuelva Pronto!.");
                                this.dispose();

                            } catch (SQLException e) {
                                System.err.println("Error en Registrar venta." + e);
                                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");

                            }

                            // A partir de abajo es para noticar al cliente que su credito actual es insuficiente para pagar el total por lo que se procede al pago en efectivo   
                        } else {
                            JOptionPane.showMessageDialog(null, "El credito restante del cliente es insuficiente para pagar el total de la venta\n\n"
                                    + "Se procedera al pago en efectivo");
                            pago = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad con la que pagara el cliente",
                                    "Billete", JOptionPane.QUESTION_MESSAGE));
                            cambio = pago - total;

                            try {
                                Connection cn2 = Conexion.conectar();
                                PreparedStatement pst2 = cn2.prepareStatement(
                                        "insert into venta values (?,?,?,?,?,?,?)");
                                pst2.setString(1, "0");
                                pst2.setDate(2, fechaVenta);
                                pst2.setTime(3, horaVenta);
                                pst2.setString(4, "16%");
                                pst2.setFloat(5, total);
                                pst2.setFloat(6, pago);
                                pst2.setFloat(7, cambio);
                                pst2.executeUpdate();
                                cn2.close();
                                txtIdProducto.setText("");
                                txtNombreProducto.setText("");
                                txtCantidad.setText("");
                                txtUDM.setText("");
                                txtPrecio.setText("");
                                txtTotal.setText("");

                                txtCantidad.setBackground(Color.green);
                                txtNombreProducto.setBackground(Color.green);
                                txtIdProducto.setBackground(Color.green);
                                txtTotal.setBackground(Color.green);
                                txtUDM.setBackground(Color.green);

                                JOptionPane.showMessageDialog(null, "El cambio del cliente es de: $" + cambio);
                                JOptionPane.showMessageDialog(null, "Registro de venta exitoso");
                                cn.close();

                                try {
                                    Connection conex = Conexion.conectar();
                                    PreparedStatement prep = conex.prepareStatement(
                                            "select * from venta where HoraVenta = '" + horaVenta + "'");
                                    ResultSet resul = prep.executeQuery();

                                    if (resul.next()) {
                                        idVenta = resul.getString("idVenta");
                                    }
                                    conex.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al cargar el folio de venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar folio de venta!!, contacte al administrador.");
                                }

                                try {
                                    Connection conexi = Conexion.conectar();
                                    PreparedStatement prestat = conexi.prepareStatement(
                                            "insert into clientes_has_venta values (?,?)");

                                    prestat.setInt(1, idCliente);
                                    prestat.setString(2, idVenta);
                                    prestat.executeUpdate();
                                } catch (SQLException e) {
                                    System.err.println("Error al generar el folio de relacion cliente venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion cliente venta!!, contacte al administrador.");
                                }

                                try {
                                    Connection cn4 = Conexion.conectar();
                                    PreparedStatement pst4 = cn4.prepareStatement(
                                            "insert into empleados_has_venta values (?,?)");

                                    pst4.setInt(1, idUsuario);
                                    pst4.setInt(2, Integer.parseInt(idVenta));
                                    pst4.executeUpdate();
                                } catch (SQLException e) {
                                    System.err.println("Error al generar el folio de relacion usuario venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion usuario venta!!, contacte al administrador.");
                                }

                                try {
                                    Connection conx = Conexion.conectar();
                                    PreparedStatement pesnt = conx.prepareStatement(
                                            "insert into detalleventa values (?,?,?,?)");

                                    for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                                        String clave, cnt, subt;
                                        clave = jTable_Venta.getValueAt(i, 0).toString();
                                        cnt = jTable_Venta.getValueAt(i, 2).toString();
                                        subt = jTable_Venta.getValueAt(i, 4).toString();

                                        pesnt.setString(1, clave);
                                        pesnt.setString(2, cnt);
                                        pesnt.setString(3, subt);
                                        pesnt.setString(4, idVenta);
                                        pesnt.executeUpdate();

                                    }
                                    conx.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al generar el folio de detalle de venta " + e);
                                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de detalle de venta!!, contacte al administrador.");
                                }

                                for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                                    try {

                                        Connection cn3 = Conexion.conectar();
                                        PreparedStatement pt = cn3.prepareStatement(
                                                "select * from productos where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
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
                                                "update productos set Existencia=? where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
                                        nuevaCant = cantidadVieja - (Integer.parseInt(jTable_Venta.getValueAt(i, 2).toString()));
                                        pest.setInt(1, nuevaCant);
                                        pest.executeUpdate();
                                        con.close();
                                    } catch (SQLException e) {
                                        System.err.println("Error al actualizar existencias " + e);
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "¡Venta realizada exitosamente, Vuelva Pronto!.");
                                this.dispose();

                            } catch (SQLException e) {
                                System.err.println("Error en Registrar venta." + e);
                                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
                            }
                        }
                        //A partir de abajo es pago en efectivo pero si el cliente dice que no quiere pagar su linea de credito 
                    } else {
                        pago = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad con la que pagara el cliente",
                                "Billete", JOptionPane.QUESTION_MESSAGE));
                        cambio = pago - total;

                        try {
                            Connection cn2 = Conexion.conectar();
                            PreparedStatement pst2 = cn2.prepareStatement(
                                    "insert into venta values (?,?,?,?,?,?,?)");
                            pst2.setString(1, "0");
                            pst2.setDate(2, fechaVenta);
                            pst2.setTime(3, horaVenta);
                            pst2.setString(4, "16%");
                            pst2.setFloat(5, total);
                            pst2.setFloat(6, pago);
                            pst2.setFloat(7, cambio);
                            pst2.executeUpdate();
                            cn2.close();
                            txtIdProducto.setText("");
                            txtNombreProducto.setText("");
                            txtCantidad.setText("");
                            txtUDM.setText("");
                            txtPrecio.setText("");
                            txtTotal.setText("");

                            txtCantidad.setBackground(Color.green);
                            txtNombreProducto.setBackground(Color.green);
                            txtIdProducto.setBackground(Color.green);
                            txtTotal.setBackground(Color.green);
                            txtUDM.setBackground(Color.green);

                            JOptionPane.showMessageDialog(null, "El cambio del cliente es de: $" + cambio);
                            JOptionPane.showMessageDialog(null, "Registro de venta exitoso");
                            cn.close();

                            try {
                                Connection conex = Conexion.conectar();
                                PreparedStatement prep = conex.prepareStatement(
                                        "select * from venta where HoraVenta = '" + horaVenta + "'");
                                ResultSet resul = prep.executeQuery();

                                if (resul.next()) {
                                    idVenta = resul.getString("idVenta");
                                }
                                conex.close();
                            } catch (SQLException e) {
                                System.err.println("Error al cargar el folio de venta " + e);
                                JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar folio de venta!!, contacte al administrador.");
                            }

                            try {
                                Connection conexi = Conexion.conectar();
                                PreparedStatement prestat = conexi.prepareStatement(
                                        "insert into clientes_has_venta values (?,?)");

                                prestat.setInt(1, idCliente);
                                prestat.setString(2, idVenta);
                                prestat.executeUpdate();
                            } catch (SQLException e) {
                                System.err.println("Error al generar el folio de relacion cliente venta " + e);
                                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion cliente venta!!, contacte al administrador.");
                            }

                            try {
                                Connection cn4 = Conexion.conectar();
                                PreparedStatement pst4 = cn4.prepareStatement(
                                        "insert into empleados_has_venta values (?,?)");

                                pst4.setInt(1, idUsuario);
                                pst4.setInt(2, Integer.parseInt(idVenta));
                                pst4.executeUpdate();
                            } catch (SQLException e) {
                                System.err.println("Error al generar el folio de relacion usuario venta " + e);
                                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion usuario venta!!, contacte al administrador.");
                            }

                            try {
                                Connection conx = Conexion.conectar();
                                PreparedStatement pesnt = conx.prepareStatement(
                                        "insert into detalleventa values (?,?,?,?)");

                                for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                                    String clave, cnt, subt;
                                    clave = jTable_Venta.getValueAt(i, 0).toString();
                                    cnt = jTable_Venta.getValueAt(i, 2).toString();
                                    subt = jTable_Venta.getValueAt(i, 4).toString();

                                    pesnt.setString(1, clave);
                                    pesnt.setString(2, cnt);
                                    pesnt.setString(3, subt);
                                    pesnt.setString(4, idVenta);
                                    pesnt.executeUpdate();

                                }
                                conx.close();
                            } catch (SQLException e) {
                                System.err.println("Error al generar el folio de detalle de venta " + e);
                                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de detalle de venta!!, contacte al administrador.");
                            }

                            for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                                try {

                                    Connection cn3 = Conexion.conectar();
                                    PreparedStatement pt = cn3.prepareStatement(
                                            "select * from productos where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
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
                                            "update productos set Existencia=? where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
                                    nuevaCant = cantidadVieja - (Integer.parseInt(jTable_Venta.getValueAt(i, 2).toString()));
                                    pest.setInt(1, nuevaCant);
                                    pest.executeUpdate();
                                    con.close();
                                } catch (SQLException e) {
                                    System.err.println("Error al actualizar existencias " + e);
                                }
                            }
                            JOptionPane.showMessageDialog(null, "¡Venta realizada exitosamente, Vuelva Pronto!.");
                            this.dispose();
                        } catch (SQLException e) {
                            System.err.println("Error en Registrar venta." + e);
                            JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
                        }
                    }
                    //A partir de abajo es pago con Efectivo
                } else {

                    pago = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad con la que pagara el cliente",
                            "Billete", JOptionPane.QUESTION_MESSAGE));
                    cambio = pago - total;
                    //
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "insert into venta values (?,?,?,?,?,?,?)");
                        pst2.setString(1, "0");
                        pst2.setDate(2, fechaVenta);
                        pst2.setTime(3, horaVenta);
                        pst2.setString(4, "16%");
                        pst2.setFloat(5, total);
                        pst2.setFloat(6, pago);
                        pst2.setFloat(7, cambio);
                        pst2.executeUpdate();
                        cn2.close();
                        txtIdProducto.setText("");
                        txtNombreProducto.setText("");
                        txtCantidad.setText("");
                        txtUDM.setText("");
                        txtPrecio.setText("");
                        txtTotal.setText("");

                        txtCantidad.setBackground(Color.green);
                        txtNombreProducto.setBackground(Color.green);
                        txtIdProducto.setBackground(Color.green);
                        txtTotal.setBackground(Color.green);
                        txtUDM.setBackground(Color.green);

                        JOptionPane.showMessageDialog(null, "El cambio del cliente es de: $" + cambio);
                        JOptionPane.showMessageDialog(null, "Registro de venta exitoso");
                        cn2.close();

                        try {
                            Connection conex = Conexion.conectar();
                            PreparedStatement prep = conex.prepareStatement(
                                    "select * from venta where HoraVenta = '" + horaVenta + "'");
                            ResultSet resul = prep.executeQuery();

                            if (resul.next()) {
                                idVenta = resul.getString("idVenta");
                            }
                            conex.close();
                        } catch (SQLException e) {
                            System.err.println("Error al cargar el folio de venta " + e);
                            JOptionPane.showMessageDialog(null, "¡¡ERROR al cargar folio de venta!!, contacte al administrador.");
                        }

                        try {
                            Connection conexi = Conexion.conectar();
                            PreparedStatement prestat = conexi.prepareStatement(
                                    "insert into clientes_has_venta values (?,?)");

                            prestat.setInt(1, idCliente);
                            prestat.setString(2, idVenta);
                            prestat.executeUpdate();
                        } catch (SQLException e) {
                            System.err.println("Error al generar el folio de relacion cliente venta " + e);
                            JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion cliente venta!!, contacte al administrador.");
                        }

                        try {
                            Connection cn4 = Conexion.conectar();
                            PreparedStatement pst4 = cn4.prepareStatement(
                                    "insert into empleados_has_venta values (?,?)");

                            pst4.setInt(1, idUsuario);
                            pst4.setInt(2, Integer.parseInt(idVenta));
                            pst4.executeUpdate();
                        } catch (SQLException e) {
                            System.err.println("Error al generar el folio de relacion usuario venta " + e);
                            JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de relacion usuario venta!!, contacte al administrador.");
                        }

                        try {
                            Connection conx = Conexion.conectar();
                            PreparedStatement pesnt = conx.prepareStatement(
                                    "insert into detalleventa values (?,?,?,?)");

                            for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                                String clave, cnt, subt;
                                clave = jTable_Venta.getValueAt(i, 0).toString();
                                cnt = jTable_Venta.getValueAt(i, 2).toString();
                                subt = jTable_Venta.getValueAt(i, 4).toString();

                                pesnt.setString(1, clave);
                                pesnt.setString(2, cnt);
                                pesnt.setString(3, subt);
                                pesnt.setString(4, idVenta);
                                pesnt.executeUpdate();

                            }
                            conx.close();
                        } catch (SQLException e) {
                            System.err.println("Error al generar el folio de detalle de venta " + e);
                            JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar folio de detalle de venta!!, contacte al administrador.");
                        }

                        for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
                            try {

                                Connection cn3 = Conexion.conectar();
                                PreparedStatement pt = cn3.prepareStatement(
                                        "select * from productos where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
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
                                        "update productos set Existencia=? where idProductos = '" + jTable_Venta.getValueAt(i, 0) + "'");
                                nuevaCant = cantidadVieja - (Integer.parseInt(jTable_Venta.getValueAt(i, 2).toString()));
                                pest.setInt(1, nuevaCant);
                                pest.executeUpdate();
                                con.close();
                            } catch (SQLException e) {
                                System.err.println("Error al actualizar existencias " + e);
                            }
                        }

                        JOptionPane.showMessageDialog(null, "¡Venta realizada exitosamente, Vuelva Pronto!.");
                        this.dispose();

                    } catch (SQLException e) {
                        System.err.println("Error en Registrar venta." + e);
                        JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");

                    }
                    
                }
            }

        } catch (SQLException e) {
            System.err.println("Error en buscar nivel de confianza de cliente." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al buscar!!, contacte al administrador.");
        }


    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        model.removeRow(jTable_Venta.getSelectedRow());
        calcularTotal();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        float sub2;
        int cant;
        int tblIdProducto;
        tblIdProducto = Integer.parseInt(jTable_Venta.getValueAt(jTable_Venta.getSelectedRow(), 0).toString());
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select Existencia from productos where idProductos ='" + tblIdProducto + "'");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                existencia = rs.getInt("Existencia");
                cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad"));

                if (cant <= existencia) {
                    jTable_Venta.setValueAt(cant, jTable_Venta.getSelectedRow(), 2);
                    sub2 = cant * (Float.parseFloat(jTable_Venta.getValueAt(jTable_Venta.getSelectedRow(), 3).toString()));
                    jTable_Venta.setValueAt(sub2, jTable_Venta.getSelectedRow(), 4);
                    calcularTotal();
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad solicitada es mayor a la registrada en el sistema");
                }
            }
            txtCantidad.setText("");
            txtNombreProducto.setText("");
            txtIdProducto.setText("");
            txtUDM.setText("");
            calcularTotal();
        } catch (SQLException e) {
            System.err.println("Error al llenar tabla " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, ¡Contacte al administrador!");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBusDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusDesActionPerformed
        String nombre;
        cmbProductos.removeAllItems();
       
        nombre = txtNombreProducto.getText().trim();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreProducto from productos where NombreProducto like '%"+nombre+"%'");
            ResultSet rs = pst.executeQuery();
           
            while (rs.next()) {
                cmbProductos.addItem(rs.getString("NombreProducto"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        
        
    }//GEN-LAST:event_btnBusDesActionPerformed

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
        
        if (cmbProductos.getItemCount() !=0) {
            consultarID();
            try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProductos, NombreProducto, NombreUDM, PrecioVenta from productos, unidaddemedida where "
                    + "idProductos = '" + idProd + "' and UnidaddeMedida_idUnidaddeMedida = idUnidaddeMedida ");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtIdProducto.setText(rs.getString("idProductos"));
                txtNombreProducto.setText(rs.getString("NombreProducto"));
                txtPrecio.setText(rs.getString("PrecioVenta"));
                txtUDM.setText(rs.getString("NombreUDM"));
           }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar datos del producto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
        }
        
    }//GEN-LAST:event_cmbProductosActionPerformed

    public void calcularTotal() {

        float sub = 0.0f;
        for (int i = 0; i < jTable_Venta.getRowCount(); i++) {
            sub += Float.parseFloat(jTable_Venta.getValueAt(i, 4).toString());
        }
        total = sub * 1.16f;
        if (total == 0) {
            txtTotal.setText("");
        } else {
            txtTotal.setText(String.valueOf(total));
        }

    }
    
    public void consultarID(){
        String nombrePro;
        
        nombrePro = cmbProductos.getSelectedItem().toString();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProductos from productos where NombreProducto = '" + nombrePro + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idProd = rs.getInt("idProductos");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar datos: ID Producto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbDescripción;
    private javax.swing.JLabel LblCantidad;
    private javax.swing.JLabel LblCantidad1;
    private javax.swing.JLabel LblCantidad2;
    private javax.swing.JLabel LblCodigo1;
    private javax.swing.JLabel LblCodigo2;
    private javax.swing.JLabel LblSKU;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusDes;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable_Venta;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUDM;
    // End of variables declaration//GEN-END:variables
}
