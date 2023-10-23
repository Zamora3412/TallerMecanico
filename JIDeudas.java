package Interfaces;

import java.awt.Color;
import static java.lang.Math.random;
import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIDeudas extends javax.swing.JInternalFrame {

    int idDetalleDeuda, idCliente;

    DefaultTableModel model = new DefaultTableModel();

    public JIDeudas() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Deudas de Clientes");

        tblDeudas = new JTable(model);
        jScrollPane2.setViewportView(tblDeudas);

        model.addColumn("ID Deuda");
        model.addColumn("ID del Cliente");
        model.addColumn("Nombre Cliente");
        model.addColumn("ID Venta");
        model.addColumn("Saldo por Pagar");
        model.addColumn("Credito Restante");
        model.addColumn("Proxima Fecha de Pago");

        actualizarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNPagos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProxFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUFecPag = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUCanPag = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeudas = new javax.swing.JTable();
        btnPagoParcial = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCanResPag = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCreditoRes = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deudas de Clientes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número de Pagos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 75, -1, -1));

        txtNPagos.setEditable(false);
        txtNPagos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNPagos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 240, 25));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de Pagos Actual:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, -1));

        txtNActual.setEditable(false);
        txtNActual.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNActual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proxima Fecha de Pago:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, -1, -1));

        txtProxFecha.setEditable(false);
        txtProxFecha.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtProxFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtProxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, 25));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ultima Fecha de Pago:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 125, -1, -1));

        txtUFecPag.setEditable(false);
        txtUFecPag.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtUFecPag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtUFecPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 220, 25));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ultima Cantidad Pagada:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 175, -1, -1));

        txtUCanPag.setEditable(false);
        txtUCanPag.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtUCanPag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtUCanPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 200, 25));

        tblDeudas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDeudas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 710, 150));

        btnPagoParcial.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnPagoParcial.setText("Pago de Adeudo");
        btnPagoParcial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagoParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoParcialActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagoParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 130, 25));

        txtCliente.setEditable(false);
        txtCliente.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, 25));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad Restante por Pagar:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 225, -1, -1));

        txtCanResPag.setEditable(false);
        txtCanResPag.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCanResPag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCanResPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 120, 25));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Credito Restante:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 225, -1, -1));

        txtCreditoRes.setEditable(false);
        txtCreditoRes.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCreditoRes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCreditoRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 25));

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        idDetalleDeuda = Integer.parseInt(tblDeudas.getValueAt(tblDeudas.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreC, APaternoC, AMaternoC, NumerodePagos, NumerodePagoActual, UltimaFechaPagoActual, ProximaFechaPago, UltimaCantidadPagada,"
                    + " Cantidad_restante, CreditoRestante from clientes, detalledeuda "
                    + "where idDetalleDeuda = '" + idDetalleDeuda + "' and idCliente_detalledeuda = idClientes");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtCliente.setText(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
                txtNPagos.setText(rs.getString("NumerodePagos"));
                txtNActual.setText(rs.getString("NumerodePagoActual"));
                txtUFecPag.setText(rs.getString("UltimaFechaPagoActual"));
                txtProxFecha.setText(rs.getString("ProximaFechaPago"));
                txtUCanPag.setText(rs.getString("UltimaCantidadPagada"));
                txtCanResPag.setText(rs.getString("Cantidad_restante"));
                txtCreditoRes.setText(rs.getString("CreditoRestante"));

            }
        } catch (SQLException e) {
            System.err.println("Error en cargar detalle de deuda " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnPagoParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoParcialActionPerformed
        idDetalleDeuda = Integer.parseInt(tblDeudas.getValueAt(tblDeudas.getSelectedRow(), 0).toString());
        idCliente = Integer.parseInt(tblDeudas.getValueAt(tblDeudas.getSelectedRow(), 1).toString());
        
        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fechaPago = new java.sql.Date(d);

        java.util.Date date3 = new java.util.Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date3);
        c.add(Calendar.DATE, 15);
        date3 = c.getTime();
        long dat = date3.getTime();
        java.sql.Date proxFechaPago = new java.sql.Date(dat);

        int respuesta, numPagos, numAct;
        float pago, pagoMas, totalVenta, cantRes, cantidadTot, credRest, totalRes;
        numAct = Integer.parseInt(txtNActual.getText().trim()) + 1;

        cantidadTot = Float.parseFloat(txtCanResPag.getText().trim());

        credRest = Float.parseFloat(txtCreditoRes.getText().trim());
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select TotalVenta from venta, detalledeuda where idVenta = idDeuda_Venta and idDetalleDeuda = '" + idDetalleDeuda + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                totalVenta = rs.getFloat("TotalVenta");
                
                numPagos = Integer.parseInt(txtNPagos.getText().trim());
                pago = (float) totalVenta / numPagos;

                do {
                    respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "El pago correspondiente es de $" + pago + "."
                            + "\n¿Desea realizar el pago por esa cantidad o pagar más?\n1.- Pagar esa cantidad\n2.- Pagar más"));
                } while (respuesta < 1 || respuesta > 2);
                if (respuesta == 1) {
                    cantRes = Float.parseFloat(txtCanResPag.getText().trim());
                    if (pago > cantRes) {
                         try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pest = cn2.prepareStatement(
                                "update detalledeuda set NumerodePagoActual = ?, UltimaFechaPagoActual = ?, ProximaFechaPago = ?, "
                                + "UltimaCantidadPagada = ?, Cantidad_restante = ? where idDetalleDeuda  = '" + idDetalleDeuda + "'");
                        pest.setInt(1, numAct);
                        pest.setDate(2, fechaPago);
                        pest.setDate(3, proxFechaPago);
                        pest.setFloat(4, pago);
                        pest.setFloat(5, cantRes);

                        pest.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error actualizar detalle de deuda " + e);
                        JOptionPane.showMessageDialog(null, "Error en actualizar, contacte al administrador");
                    }
                    Float crRes;
                    crRes = credRest + pago;
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pest = cn2.prepareStatement(
                                "update clientes set CreditoRestante = ? where idClientes  = '" + idCliente + "'");
                        pest.setFloat(1, crRes);

                        pest.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error actualizar credito restante del cliente " + e);
                        JOptionPane.showMessageDialog(null, "Error en actualizar credito restante, contacte al administrador");
                    }
                    

                    try {
                        Connection cn5 = Conexion.conectar();
                        PreparedStatement pst5 = cn5.prepareStatement(
                                "select Cantidad_restante from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                        ResultSet rs5 = pst5.executeQuery();

                        if (rs5.next()) {
                            cantidadTot = rs5.getFloat("Cantidad_restante");
                            if (cantidadTot <= 0) {
                                try {
                                    Connection cn4 = Conexion.conectar();
                                    PreparedStatement pst4 = cn4.prepareStatement(
                                            "delete from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                                    pst4.executeUpdate();
                                    cn4.close();
                                    JOptionPane.showMessageDialog(null, "Felicidades ha terminado de pagar su adeudo");
                                } catch (SQLException e) {
                                    System.err.println("Error en eliminar detalle de deuda " + e);
                                    JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

                                }
                            }
                        }

                    } catch (SQLException e) {
                        System.err.println("Error en consultar cantidad restante del adeudo " + e);
                        JOptionPane.showMessageDialog(null, "Error en consultar cantidad restante, contacte al administrador");
                    }
                    actualizarTabla();
                    limpiar();
                    }else{
                        cantRes = Float.parseFloat(txtCanResPag.getText().trim()) - pago;
                        try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pest = cn2.prepareStatement(
                                "update detalledeuda set NumerodePagoActual = ?, UltimaFechaPagoActual = ?, ProximaFechaPago = ?, "
                                + "UltimaCantidadPagada = ?, Cantidad_restante = ? where idDetalleDeuda  = '" + idDetalleDeuda + "'");
                        pest.setInt(1, numAct);
                        pest.setDate(2, fechaPago);
                        pest.setDate(3, proxFechaPago);
                        pest.setFloat(4, pago);
                        pest.setFloat(5, cantRes);

                        pest.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error actualizar detalle de deuda " + e);
                        JOptionPane.showMessageDialog(null, "Error en actualizar, contacte al administrador");
                    }
                    Float crRes;
                    crRes = credRest + pago;
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pest = cn2.prepareStatement(
                                "update clientes set CreditoRestante = ? where idClientes  = '" + idCliente + "'");
                        pest.setFloat(1, crRes);

                        pest.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error actualizar credito restante del cliente " + e);
                        JOptionPane.showMessageDialog(null, "Error en actualizar credito restante, contacte al administrador");
                    }
                    

                    try {
                        Connection cn5 = Conexion.conectar();
                        PreparedStatement pst5 = cn5.prepareStatement(
                                "select Cantidad_restante from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                        ResultSet rs5 = pst5.executeQuery();

                        if (rs5.next()) {
                            cantidadTot = rs5.getFloat("Cantidad_restante");
                            if (cantidadTot <= 0) {
                                try {
                                    Connection cn4 = Conexion.conectar();
                                    PreparedStatement pst4 = cn4.prepareStatement(
                                            "delete from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                                    pst4.executeUpdate();
                                    cn4.close();
                                    JOptionPane.showMessageDialog(null, "Felicidades ha terminado de pagar su adeudo");
                                } catch (SQLException e) {
                                    System.err.println("Error en eliminar detalle de deuda " + e);
                                    JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

                                }
                            }
                        }

                    } catch (SQLException e) {
                        System.err.println("Error en consultar cantidad restante del adeudo " + e);
                        JOptionPane.showMessageDialog(null, "Error en consultar cantidad restante, contacte al administrador");
                    }
                    actualizarTabla();
                    limpiar();  
                    }
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pest = cn2.prepareStatement(
                                "update detalledeuda set NumerodePagoActual = ?, UltimaFechaPagoActual = ?, ProximaFechaPago = ?, "
                                + "UltimaCantidadPagada = ?, Cantidad_restante = ? where idDetalleDeuda  = '" + idDetalleDeuda + "'");
                        pest.setInt(1, numAct);
                        pest.setDate(2, fechaPago);
                        pest.setDate(3, proxFechaPago);
                        pest.setFloat(4, pago);
                        pest.setFloat(5, cantRes);

                        pest.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error actualizar detalle de deuda " + e);
                        JOptionPane.showMessageDialog(null, "Error en actualizar, contacte al administrador");
                    }
                    Float crRes;
                    crRes = credRest + pago;
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pest = cn2.prepareStatement(
                                "update clientes set CreditoRestante = ? where idClientes  = '" + idCliente + "'");
                        pest.setFloat(1, crRes);

                        pest.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error actualizar credito restante del cliente " + e);
                        JOptionPane.showMessageDialog(null, "Error en actualizar credito restante, contacte al administrador");
                    }
                    

                    try {
                        Connection cn5 = Conexion.conectar();
                        PreparedStatement pst5 = cn5.prepareStatement(
                                "select Cantidad_restante from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                        ResultSet rs5 = pst5.executeQuery();

                        if (rs5.next()) {
                            cantidadTot = rs5.getFloat("Cantidad_restante");
                            if (cantidadTot <= 0) {
                                try {
                                    Connection cn4 = Conexion.conectar();
                                    PreparedStatement pst4 = cn4.prepareStatement(
                                            "delete from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                                    pst4.executeUpdate();
                                    cn4.close();
                                    JOptionPane.showMessageDialog(null, "Felicidades ha terminado de pagar su adeudo");
                                } catch (SQLException e) {
                                    System.err.println("Error en eliminar detalle de deuda " + e);
                                    JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

                                }
                            }
                        }

                    } catch (SQLException e) {
                        System.err.println("Error en consultar cantidad restante del adeudo " + e);
                        JOptionPane.showMessageDialog(null, "Error en consultar cantidad restante, contacte al administrador");
                    }
                    actualizarTabla();
                    limpiar();
                } else {
                    pagoMas = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea abonar"));
                    totalRes = cantidadTot - pagoMas;
                    do {
                        try {
                            Connection cn3 = Conexion.conectar();
                            PreparedStatement pesta = cn3.prepareStatement(
                                    "update detalledeuda set NumerodePagoActual = ?, UltimaFechaPagoActual = ?, ProximaFechaPago = ?, "
                                    + "UltimaCantidadPagada = ?, Cantidad_restante = ? where idDetalleDeuda  = '" + idDetalleDeuda + "'");
                            pesta.setInt(1, numAct);
                            pesta.setDate(2, fechaPago);
                            pesta.setDate(3, proxFechaPago);
                            pesta.setFloat(4, pago);
                            pesta.setFloat(5, totalRes);

                            pesta.executeUpdate();
                            cn3.close();
                        } catch (SQLException e) {
                            System.err.println("Error actualizar detalle de deuda " + e);
                            JOptionPane.showMessageDialog(null, "Error en actualizar, contacte al administrador");
                        }
                    } while (pagoMas < pago || pagoMas > cantidadTot);
                    
                    Float crRes;
                    crRes = credRest + pagoMas;
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pest = cn2.prepareStatement(
                                "update clientes set CreditoRestante = ? where idClientes  = '" + idCliente + "'");
                        pest.setFloat(1, crRes);

                        pest.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error actualizar credito restante del cliente " + e);
                        JOptionPane.showMessageDialog(null, "Error en actualizar credito restante, contacte al administrador");
                    }
                    
                    try {
                        Connection cn5 = Conexion.conectar();
                        PreparedStatement pst5 = cn5.prepareStatement(
                                "select Cantidad_restante from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                        ResultSet rs5 = pst5.executeQuery();

                        if (rs5.next()) {
                            cantidadTot = rs5.getFloat("Cantidad_restante");
                            if (cantidadTot <= 0) {
                                try {
                                    Connection cn4 = Conexion.conectar();
                                    PreparedStatement pst4 = cn4.prepareStatement(
                                            "delete from detalledeuda where idDetalleDeuda = '" + idDetalleDeuda + "'");
                                    pst4.executeUpdate();
                                    cn4.close();
                                    JOptionPane.showMessageDialog(null, "Felicidades ha terminado de pagar su adeudo");
                                } catch (SQLException e) {
                                    System.err.println("Error en eliminar detalle de deuda " + e);
                                    JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

                                }
                            }
                        }

                    } catch (SQLException e) {
                        System.err.println("Error en consultar cantidad restante del adeudo " + e);
                        JOptionPane.showMessageDialog(null, "Error en consultar cantidad restante, contacte al administrador");
                    }
                    actualizarTabla();
                    limpiar();
                }
                
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar Total de la Venta " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar el total de la venta, Contacte al Administrador!!!!");
        }


    }//GEN-LAST:event_btnPagoParcialActionPerformed

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[7];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select "
                    + "idDetalleDeuda, idClientes, NombreC, APaternoC, AMaternoC, idVenta, Cantidad_restante, "
                    + "CreditoRestante, ProximaFechaPago from clientes, detalledeuda "
                    + ", venta where idClientes = idCliente_detalledeuda and idVenta = idDeuda_Venta  ORDER BY idDetalleDeuda ASC");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                fila[0] = rs.getObject("idDetalleDeuda");
                fila[1] = rs.getObject("idClientes");
                fila[2] = rs.getObject("NombreC") + " " + rs.getObject("APaternoC") + " " + rs.getObject("AMaternoC");
                fila[3] = rs.getObject("idVenta");
                fila[4] = rs.getObject("Cantidad_restante");
                fila[5] = rs.getObject("CreditoRestante");
                fila[6] = rs.getObject("ProximaFechaPago");
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
    }
    
    public void limpiar(){
        txtCanResPag.setText("");
        txtCliente.setText("");
        txtCreditoRes.setText("");
        txtNActual.setText("");
        txtNPagos.setText("");
        txtProxFecha.setText("");
        txtUCanPag.setText("");
        txtUFecPag.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnPagoParcial;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeudas;
    private javax.swing.JTextField txtCanResPag;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCreditoRes;
    private javax.swing.JTextField txtNActual;
    private javax.swing.JTextField txtNPagos;
    private javax.swing.JTextField txtProxFecha;
    private javax.swing.JTextField txtUCanPag;
    private javax.swing.JTextField txtUFecPag;
    // End of variables declaration//GEN-END:variables
}
