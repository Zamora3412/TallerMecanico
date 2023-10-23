package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIClientes extends javax.swing.JInternalFrame {

    int idNivc, limMin, limMax;
    DefaultTableModel model = new DefaultTableModel();

    public JIClientes() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Clientes");

        tblClientes = new JTable(model);
        jScrollPane1.setViewportView(tblClientes);

        model.addColumn("ID Cliente");
        model.addColumn("Nombre");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Telefono");
        model.addColumn("Nivel de Confianza");
        model.addColumn("Límite de Credito");

        actualizarTabla();
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select DescripciónConfianza from nc_cliente");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbNivC.addItem(rs.getString("DescripciónConfianza"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los niveles de confianza. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAmaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtApaterno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmbNivC = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtLC = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, 25));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido Materno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, -1));

        txtAmaterno.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtAmaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAmaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmaternoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 250, 25));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 175, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 250, 25));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 90, -1));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 100, -1));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, -1));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 110, -1));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 720, 150));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido Paterno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 75, -1, -1));

        txtApaterno.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtApaterno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApaternoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 250, 25));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 125, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 250, 25));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nivel de Confianza:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 225, -1, -1));

        cmbNivC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cmbNivC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivCActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNivC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 190, 25));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Limite de Credito:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 225, -1, -1));

        txtLC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtLC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 250, 25));

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
       int idClientes = Integer.parseInt(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0).toString());
       
       try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreC, APaternoC, AMaternoC, Telefono, Dirección, Correo, DescripciónConfianza, LimiteCredito "
                    + " from clientes, nc_cliente  where idClientes = '"+idClientes+"' and NC_Cliente_idNC_Cliente = idNC_Cliente");
           
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtNombre.setText(rs.getString("NombreC"));
                txtDireccion.setText(rs.getString("Dirección"));
                cmbNivC.setSelectedItem(rs.getString("DescripciónConfianza"));
                txtAmaterno.setText(rs.getString("AMaternoC"));
                txtApaterno.setText(rs.getString("APaternoC"));
                txtTelefono.setText(rs.getString("Telefono"));
                txtCorreo.setText(rs.getString("Correo"));
                txtLC.setText(rs.getString("LimiteCredito"));

            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar cliente " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
       
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idClientes = Integer.parseInt(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0).toString());
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from clientes where idClientes = '" + idClientes + "'");
            pst.executeUpdate();
            cn.close();
        } catch (SQLException er) {
            System.err.println("Error en eliminar cliente " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int idClientes = Integer.parseInt(tblClientes.getValueAt(tblClientes.getSelectedRow(), 0).toString());
        int validacion = 0;
        String nombre, apaterno, amaterno, telefono, direccion, limite, correo;

        idNivc = cmbNivC.getSelectedIndex() + 1;
        nombre = txtNombre.getText().trim();
        apaterno = txtApaterno.getText().trim();
        amaterno = txtAmaterno.getText().trim();
        telefono = txtTelefono.getText().trim();
        direccion = txtDireccion.getText().trim();
        correo = txtCorreo.getText().trim();
        limite = txtLC.getText().trim();

        if (nombre.equals("")) {
            validacion++;
        }
        if (apaterno.equals("")) {
            validacion++;
        }
        if (amaterno.equals("")) {
            validacion++;
        }
        if (direccion.equals("")) {
            validacion++;
        }
        if (telefono.equals("")) {
            validacion++;
        }
        if (correo.equals("")) {
            validacion++;
        }
        if (limite.equals("")) {
            validacion++;
        }
        
        if (validacion == 0) {

            if (Integer.parseInt(limite) >= limMin && Integer.parseInt(limite) <= limMax) {
                Connection cn = Conexion.conectar();
                PreparedStatement pst;
                try {
                    pst = cn.prepareStatement(
                            "update clientes set NombreC = ?, APaternoC = ?, AMaternoC = ?, Telefono = ?, Dirección = ?, Correo = ?, NC_Cliente_idNC_Cliente = ?, "
                                    + "LimiteCredito = ?, CreditoRestante = ? where idClientes = '"+idClientes+"'");
                    pst.setString(1, nombre);
                    pst.setString(2, apaterno);
                    pst.setString(3, amaterno);
                    pst.setString(4, telefono);
                    pst.setString(5, direccion);
                    pst.setString(6, correo);
                    pst.setInt(7, idNivc);
                    pst.setString(8, limite);
                    pst.setFloat(9, Float.parseFloat(limite));

                    pst.executeUpdate();
                    cn.close();
                    
                } catch (SQLException e) {
                    System.err.println("Error al actualizar Cliente." + e);
                    JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
                }

                txtNombre.setText("");
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtAmaterno.setText("");
                txtTelefono.setText("");
                cmbNivC.setSelectedIndex(0);
                txtApaterno.setText("");
                txtLC.setText("");
                actualizarTabla();
                
                JOptionPane.showMessageDialog(null, "Actualización de Cliente Exitoso");
            } else {
                
                JOptionPane.showMessageDialog(null, "El limite ingresado no coincide con el parametro establecido");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
        String nombre, apaterno, amaterno, telefono, direccion, limite, correo;

        idNivc = cmbNivC.getSelectedIndex() + 1;
        nombre = txtNombre.getText().trim();
        apaterno = txtApaterno.getText().trim();
        amaterno = txtAmaterno.getText().trim();
        telefono = txtTelefono.getText().trim();
        direccion = txtDireccion.getText().trim();
        correo = txtCorreo.getText().trim();
        limite = txtLC.getText().trim();

        if (nombre.equals("")) {
            
            validacion++;
        }
        if (apaterno.equals("")) {
            validacion++;
        }
        if (amaterno.equals("")) {
            validacion++;
        }
        if (direccion.equals("")) {
            validacion++;
        }
        if (telefono.equals("")) {
            validacion++;
        }
        if (correo.equals("")) {
            validacion++;
        }
        if (limite.equals("")) {
            validacion++;
        }

        if (validacion == 0) {

            if (Integer.parseInt(limite) >= limMin && Integer.parseInt(limite) <= limMax) {
                Connection cn = Conexion.conectar();
                PreparedStatement pst;
                try {
                    pst = cn.prepareStatement(
                            "insert into clientes values (?,?,?,?,?,?,?,?,?,?)");
                    pst.setString(1, "0");
                    pst.setString(2, nombre);
                    pst.setString(3, apaterno);
                    pst.setString(4, amaterno);
                    pst.setString(5, telefono);
                    pst.setString(6, direccion);
                    pst.setString(7, correo);
                    pst.setInt(8, idNivc);
                    pst.setInt(9, Integer.parseInt(limite));
                    pst.setFloat(10, Float.parseFloat(limite));

                    pst.executeUpdate();
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Error en Registrar Cliente." + e);
                    JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
                }

                txtNombre.setText("");
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtAmaterno.setText("");
                txtTelefono.setText("");
                cmbNivC.setSelectedIndex(0);
                txtApaterno.setText("");
                txtLC.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Cliente Exitoso");
                actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "El limite ingresado no coincide con el parametro establecido");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbNivCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivCActionPerformed
        idNivc = cmbNivC.getSelectedIndex() + 1;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select LimiteMin, LimiteMax from nc_cliente where idNC_Cliente = '" + idNivc + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                limMin = rs.getInt("LimiteMin");
                limMax = rs.getInt("LimiteMax");
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar datos " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_cmbNivCActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 25) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApaternoKeyTyped
        if (txtApaterno.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApaternoKeyTyped

    private void txtAmaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmaternoKeyTyped
       if (txtAmaterno.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAmaternoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 150) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[7];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select "
                    + "idClientes, NombreC, APaternoC, AMaternoC, Telefono, DescripciónConfianza, LimiteCredito"
                    + " from clientes, nc_cliente where NC_Cliente_idNC_Cliente = idNC_Cliente order by idClientes");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbNivC;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtAmaterno;
    private javax.swing.JTextField txtApaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLC;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
