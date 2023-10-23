package Interfaces;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIAutos extends javax.swing.JInternalFrame {

    int idModelo;
    DefaultTableModel model = new DefaultTableModel();

    public JIAutos() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Autos");

        tblAutos = new JTable(model);
        jScrollPane1.setViewportView(tblAutos);

        model.addColumn("ID Auto");
        model.addColumn("Modelo");
        model.addColumn("Marca");
        model.addColumn("Color");
        model.addColumn("Transmisión");
        model.addColumn("Caballos de Fuerza");

        actualizarTabla();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreModelo from modelo");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                cmbModelo.addItem(rs.getString("NombreModelo"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los Modelos. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSerie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTrans = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCaballo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        consultar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtRendimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtano = new javax.swing.JTextField();
        cmbModelo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSerie.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtSerie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerieKeyTyped(evt);
            }
        });
        jPanel1.add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 230, 25));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Serie:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 115, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Motor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 155, -1, -1));

        txtMotor.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtMotor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMotor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMotorKeyTyped(evt);
            }
        });
        jPanel1.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 230, 25));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Trasmisiones:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, -1));

        txtTrans.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtTrans.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTransKeyTyped(evt);
            }
        });
        jPanel1.add(txtTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirreccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 230, 25));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Caballo fuerza:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 195, -1, -1));

        txtCaballo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCaballo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCaballo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaballoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCaballo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 230, 25));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Color:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 75, -1, -1));

        txtColor.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 230, 25));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Año:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 155, -1, -1));

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtMarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 230, 25));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Autos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        consultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        consultar.setText("Consultar");
        consultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 100, 25));

        agregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        agregar.setText("Agregar");
        agregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 90, 25));

        eliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 100, 25));

        actualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 110, 25));

        tblAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblAutos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 720, 130));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Redimiento:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 235, -1, -1));

        txtRendimiento.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtRendimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRendimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRendimientoKeyTyped(evt);
            }
        });
        jPanel1.add(txtRendimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 230, 25));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Marca:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 115, -1, -1));

        txtano.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanoKeyTyped(evt);
            }
        });
        jPanel1.add(txtano, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 230, 25));

        cmbModelo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cmbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModeloActionPerformed(evt);
            }
        });
        jPanel1.add(cmbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 230, 25));

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

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        int validacion = 0;
        String serie, motor, trasmisiones, direccion, rendimiento, color, marca, caballo, ano;
        consultarIDModelo();

        serie = txtSerie.getText().trim();
        motor = txtMotor.getText().trim();
        trasmisiones = txtTrans.getText().trim();
        direccion = txtDireccion.getText().trim();
        rendimiento = txtRendimiento.getText().trim();
        color = txtColor.getText().trim();
        marca = txtMarca.getText().trim();
        caballo = txtCaballo.getText().trim();
        ano = txtano.getText().trim();

        if (serie.equals("")) {
            
            validacion++;
        }
        if (motor.equals("")) {
            
            validacion++;
        }
        if (trasmisiones.equals("")) {
            validacion++;
        }
        if (direccion.equals("")) {
            validacion++;
        }
        if (rendimiento.equals("")) {
            validacion++;
        }
        if (color.equals("")) {
            validacion++;
        }

        if (marca.equals("")) {
            validacion++;
        }
        if (ano.equals("")) {
            validacion++;
        }

        if (validacion == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into autos values (?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, "0");
                pst.setInt(2, idModelo);
                pst.setString(3, serie);
                pst.setString(4, ano);
                pst.setString(5, motor);
                pst.setString(6, rendimiento);
                pst.setString(7, caballo);
                pst.setString(8, color);
                pst.setString(9, direccion);
                pst.setString(10, trasmisiones);

                pst.executeUpdate();
                cn.close();

                txtColor.setText("");
                txtDireccion.setText("");
                txtMarca.setText("");
                txtMotor.setText("");
                txtRendimiento.setText("");
                txtSerie.setText("");
                txtTrans.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Auto Exitoso");
            } catch (SQLException e) {
                System.err.println("Error en Registrar auto " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }

            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }


    }//GEN-LAST:event_agregarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed

        int idAutos = Integer.parseInt(tblAutos.getValueAt(tblAutos.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NumeroSerie, Año, NumeroMotor, Rendimiento, CaballosdeFuerza, Color, Direccion, Transmisión, NombreModelo, NombreMarca "
                    + "from autos, modelo, marca where idAutos = '" + idAutos + "' and Modelo_idModelo = idModelo and Marca_idMarca = idMarca ");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtSerie.setText(rs.getString("NumeroSerie"));
                cmbModelo.setSelectedItem(rs.getString("NombreModelo"));
                txtMarca.setText(rs.getNString("NombreMarca"));
                txtColor.setText(rs.getString("Color"));
                txtMotor.setText(rs.getString("NumeroMotor"));
                txtTrans.setText(rs.getString("Transmisión"));
                txtDireccion.setText(rs.getString("Direccion"));
                txtRendimiento.setText(rs.getString("Rendimiento"));
                txtCaballo.setText(rs.getString("CaballosdeFuerza"));
                txtano.setText(rs.getString("Año"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar Auto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }


    }//GEN-LAST:event_consultarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

        int validacion = 0;
        String serie, motor, trasmisiones, direccion, rendimiento, color, marca, caballo, ano;
        int idAutos = Integer.parseInt(tblAutos.getValueAt(tblAutos.getSelectedRow(), 0).toString());

        consultarIDModelo();
        serie = txtSerie.getText().trim();
        motor = txtMotor.getText().trim();
        trasmisiones = txtTrans.getText().trim();
        direccion = txtDireccion.getText().trim();
        rendimiento = txtRendimiento.getText().trim();
        color = txtColor.getText().trim();
        marca = txtMarca.getText().trim();
        caballo = txtCaballo.getText().trim();
        ano = txtano.getText().trim();

        if (serie.equals("")) {
            validacion++;
        }
        if (motor.equals("")) {
            validacion++;
        }
        if (trasmisiones.equals("")) {
            validacion++;
        }
        if (direccion.equals("")) {
            validacion++;
        }
        if (rendimiento.equals("")) {
            validacion++;
        }
        if (color.equals("")) {
            validacion++;
        }

        if (marca.equals("")) {
            validacion++;
        }
        if (ano.equals("")) {
            validacion++;
        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select * from autos where NumeroSerie = '" + serie + "' and not idAutos = '" + idAutos + "'");
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    txtSerie.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Numero de Serie No Disponible");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                            "update autos set Modelo_idModelo = ?, NumeroSerie = ?, Año = ?, NumeroMotor = ?, Rendimiento = ?, CaballosdeFuerza = ?, Color = ?, "
                            + "Direccion = ? ,Transmisión = ? where idAutos = '" + idAutos + "'");
                    pest.setInt(1, idModelo);
                    pest.setString(2, serie);
                    pest.setString(3, ano);
                    pest.setString(4, motor);
                    pest.setString(5, rendimiento);
                    pest.setString(6, caballo);
                    pest.setString(7, color);
                    pest.setString(8, direccion);
                    pest.setString(9, trasmisiones);

                    pest.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    txtSerie.setText("");
                    txtMarca.setText("");
                    txtColor.setText("");
                    txtMotor.setText("");
                    txtTrans.setText("");
                    txtDireccion.setText("");
                    txtRendimiento.setText("");
                    txtCaballo.setText("");
                    cmbModelo.setSelectedIndex(0);
                }
                actualizarTabla();
            } catch (SQLException e) {
                System.err.println("Error al actualizar auto " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        int idAuto = Integer.parseInt(tblAutos.getValueAt(tblAutos.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from autos where idAutos = '" + idAuto + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "El Auto seleccionado fue dado de baja");
            actualizarTabla();
        } catch (SQLException er) {
            System.err.println("Error en eliminar Autos " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void cmbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModeloActionPerformed
        consultarIDModelo();
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreMarca from modelo, marca where idModelo = '" + idModelo + "' and "
                    + "Marca_idMarca = idMarca");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtMarca.setText(rs.getString("NombreMarca"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar datos de la marca " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_cmbModeloActionPerformed

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        if (txtColor.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieKeyTyped
        if (txtSerie.getText().length() >= 25) {
            evt.consume();
        }    }//GEN-LAST:event_txtSerieKeyTyped

    private void txtMotorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMotorKeyTyped
        if (txtMotor.getText().length() >= 35) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMotorKeyTyped

    private void txtanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanoKeyTyped
        if (txtano.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtanoKeyTyped

    private void txtTransKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTransKeyTyped
        if (txtTrans.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTransKeyTyped

    private void txtCaballoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaballoKeyTyped
        if (txtCaballo.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCaballoKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtRendimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRendimientoKeyTyped
        if (txtRendimiento.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRendimientoKeyTyped

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idAutos, NombreModelo, NombreMarca, Color, Transmisión, CaballosdeFuerza "
                    + "from autos, modelo, marca where Modelo_idModelo = idModelo and Marca_idMarca = idMarca  ");

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

    public void consultarIDModelo() {
        String modelo;

        modelo = cmbModelo.getSelectedItem().toString();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idModelo from modelo, estado where NombreModelo = '" + modelo + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idModelo = rs.getInt("idModelo");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar datos: ID Modelo " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTable tblAutos;
    private javax.swing.JTextField txtCaballo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtRendimiento;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTrans;
    private javax.swing.JTextField txtano;
    // End of variables declaration//GEN-END:variables
}
