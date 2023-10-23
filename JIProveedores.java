package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIProveedores extends javax.swing.JInternalFrame {

    int idCiudad;
    DefaultTableModel model = new DefaultTableModel();

    public JIProveedores() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Proveedores");

        tblProveedores = new JTable(model);
        jScrollPane1.setViewportView(tblProveedores);

        model.addColumn("ID del Proveedor");
        model.addColumn("Nombre del Proveedor");
        model.addColumn("Dirección");
        model.addColumn("Ciudad");
        model.addColumn("Telefono");
        model.addColumn("Correo");

        actualizarTabla();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreCiudad from ciudad");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbCiudad.addItem(rs.getString("NombreCiudad"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los estados. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proveedores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        txtNombrePro.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNombrePro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombrePro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, 25));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 75, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, -1, -1));

        cmbCiudad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cmbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 132, 250, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código Postal:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 135, -1, -1));

        txtCP.setEditable(false);
        txtCP.setBackground(new java.awt.Color(255, 255, 255));
        txtCP.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 240, 25));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, -1, -1));

        txtEstado.setEditable(false);
        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 250, 25));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teléfono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 195, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 240, 25));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 255, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 250, 25));

        txtDireccion.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 240, 25));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RFC:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 255, -1, -1));

        txtRFC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtRFC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        jPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 240, 25));

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProveedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 710, 120));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 100, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 110, 25));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 25));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 110, 25));

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
        int idProveedor = Integer.parseInt(tblProveedores.getValueAt(tblProveedores.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreProveedor, DirecciónP, NombreCiudad, CP, NombreEstado,"
                    + " TelefonoP, CorreoP, RFCP from proveedor, ciudad, estado  where idProveedor = '" + idProveedor + "' and Ciudad_idCiudad = idCiudad "
                    + "and Estado_idEstado = idEstado");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtNombrePro.setText(rs.getString("NombreProveedor"));
                txtDireccion.setText(rs.getString("DirecciónP"));
                cmbCiudad.setSelectedItem(rs.getString("NombreCiudad"));
                txtCP.setText(rs.getString("CP"));
                txtEstado.setText(rs.getString("NombreEstado"));
                txtTelefono.setText(rs.getString("TelefonoP"));
                txtCorreo.setText(rs.getString("CorreoP"));
                txtRFC.setText(rs.getString("RFCP"));

            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar ciudad " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idProveedor = Integer.parseInt(tblProveedores.getValueAt(tblProveedores.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from proveedor where idProveedor = '" + idProveedor + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "El proveedor seleccionado fue dado de baja");
            actualizarTabla();
        } catch (SQLException er) {
            System.err.println("Error en eliminar proveedor " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int validacion = 0;
        String nombrePro, direccion, telefono, correo, rfc;
        int idProveedor = Integer.parseInt(tblProveedores.getValueAt(tblProveedores.getSelectedRow(), 0).toString());

        nombrePro = txtNombrePro.getText().trim();
        direccion = txtDireccion.getText().trim();
        telefono = txtTelefono.getText().trim();
        correo = txtCorreo.getText().trim();
        rfc = txtRFC.getText().trim();
        idCiudad = cmbCiudad.getSelectedIndex() + 1;

        if (nombrePro.equals("")) {
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
        if (rfc.equals("")) {
            validacion++;
        }
        consultarID();
        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select * from proveedor where NombreProveedor = '" + nombrePro + "' and not idProveedor = '" + idProveedor + "'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txtNombrePro.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de proveedor no disponible");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                            "update proveedor set NombreProveedor=?, DirecciónP=?, Ciudad_idCiudad=?, TelefonoP=?, CorreoP=?, RFCP=? "
                            + "where idProveedor = '" + idProveedor + "'");
                    pest.setString(1, nombrePro);
                    pest.setString(2, direccion);
                    pest.setInt(3, idCiudad);
                    pest.setString(4, telefono);
                    pest.setString(5, correo);
                    pest.setString(6, rfc);

                    pest.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    txtNombrePro.setText("");
                    txtCorreo.setText("");
                    txtDireccion.setText("");
                    txtRFC.setText("");
                    txtTelefono.setText("");
                    cmbCiudad.setSelectedIndex(0);
                }
                actualizarTabla();

            } catch (SQLException e) {
                System.err.println("Error al actualizar el proveedor " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
        String nombrePro, direccion, telefono, correo, rfc;

        nombrePro = txtNombrePro.getText().trim();
        direccion = txtDireccion.getText().trim();
        telefono = txtTelefono.getText().trim();
        correo = txtCorreo.getText().trim();
        rfc = txtRFC.getText().trim();
        idCiudad = cmbCiudad.getSelectedIndex() + 1;

        if (nombrePro.equals("")) {
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
        if (rfc.equals("")) {
            validacion++;
        }
        consultarID();
        if (validacion == 0) {
            Connection cn = Conexion.conectar();
            PreparedStatement pst;
            try {
                pst = cn.prepareStatement(
                        "insert into proveedor values (?,?,?,?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, nombrePro);
                pst.setString(3, direccion);
                pst.setInt(4, idCiudad);
                pst.setString(5, telefono);
                pst.setString(6, correo);
                pst.setString(7, rfc);

                pst.executeUpdate();
                cn.close();

                txtNombrePro.setText("");
                txtCorreo.setText("");
                txtDireccion.setText("");
                txtRFC.setText("");
                txtTelefono.setText("");
                cmbCiudad.setSelectedIndex(0);

                JOptionPane.showMessageDialog(null, "Registro de Proveedor Exitoso");
            } catch (SQLException e) {
                System.err.println("Error en Registrar Proveedor." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadActionPerformed
        consultarID();
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select CP, NombreEstado from ciudad, estado where idCiudad = '" + idCiudad + "' and "
                    + "Estado_idEstado = idEstado");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtCP.setText(rs.getString("CP"));
                txtEstado.setText(rs.getString("NombreEstado"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar datos " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }//GEN-LAST:event_cmbCiudadActionPerformed

    private void txtNombreProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProKeyTyped
        if (txtNombrePro.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 150) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() >= 35) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if (txtRFC.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRFCKeyTyped

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select "
                    + "idProveedor, NombreProveedor, DirecciónP, NombreCiudad, TelefonoP, CorreoP from proveedor, ciudad  where Ciudad_idCiudad = idCiudad");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
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
    
    public void consultarID(){
        String ciudad;
        
        ciudad = cmbCiudad.getSelectedItem().toString();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idCiudad from ciudad, estado where NombreCiudad = '" + ciudad + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idCiudad = rs.getInt("idCiudad");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar datos: ID Ciudad " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
