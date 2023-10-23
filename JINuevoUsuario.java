package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class JINuevoUsuario extends javax.swing.JInternalFrame {

    public JINuevoUsuario() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Nuevo Usuario");

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombrePermisos from permisos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbPermisos.addItem(rs.getString("NombrePermisos"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los permisos. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombrePuesto from puestos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbPuestos.addItem(rs.getString("NombrePuesto"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los puestos. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbPermisos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmbPuestos = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtuser_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de usuarios ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtnombre.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, 25));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido Materno");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtApellidoM.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtApellidoM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 25));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtEmail.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 210, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Télefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtelefono.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Permisos de:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        cmbPermisos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 160, 25));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Puesto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        cmbPuestos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 160, 25));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 120, 100));

        txtPass.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 210, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        txtuser_name.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtuser_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtuser_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuser_nameKeyTyped(evt);
            }
        });
        jPanel1.add(txtuser_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 210, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        txtApellidoP.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtApellidoP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 210, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido Paterno:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

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


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre, apellidoP, apellidoM, mail, telefono, username, pass, permisos_string = "", puestos = "";
        int puestos_cmb, validacion = 0, permisos_cmb;

        nombre = txtnombre.getText().trim();
        apellidoP = txtApellidoP.getText().trim();
        apellidoM = txtApellidoM.getText().trim();
        mail = txtEmail.getText().trim();
        telefono = txtelefono.getText().trim();
        username = txtuser_name.getText();
        pass = txtPass.getText().trim();
        puestos_cmb = cmbPuestos.getSelectedIndex() + 1;
        permisos_cmb = cmbPermisos.getSelectedIndex() + 1;

        if (mail.equals("")) {
            validacion++;
        }
        if (username.equals("")) {
            validacion++;
        }
        if (pass.equals("")) {
            validacion++;
        }
        if (nombre.equals("")) {
            validacion++;
        }
        if (apellidoP.equals("")) {
            validacion++;
        }
        if (apellidoM.equals("")) {
            validacion++;
        }
        if (telefono.equals("")) {
            validacion++;
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select Usuario from empleados where Usuario = '" + username + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtuser_name.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                cn.close();
            } else {

                cn.close();

                if (validacion == 0) {
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "insert into empleados values (?,?,?,?,?,?,?,?,?,?,?)");

                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, apellidoP);
                        pst2.setString(4, apellidoM);
                        pst2.setString(5, mail);
                        pst2.setString(6, telefono);
                        pst2.setString(7, username);
                        pst2.setString(8, pass);
                        pst2.setInt(9, puestos_cmb);
                        pst2.setInt(10, permisos_cmb);
                        pst2.setInt(11, 1);

                        pst2.executeUpdate();

                        cn2.close();

                        txtEmail.setText("");
                        txtPass.setText("");
                        txtelefono.setText("");
                        txtnombre.setText("");
                        txtuser_name.setText("");
                        txtApellidoM.setText("");
                        txtApellidoP.setText("");
                        cmbPermisos.setSelectedIndex(0);
                        cmbPuestos.setSelectedIndex(0);

                        txtEmail.setBackground(Color.green);
                        txtPass.setBackground(Color.green);
                        txtelefono.setBackground(Color.green);
                        txtnombre.setBackground(Color.green);
                        txtuser_name.setBackground(Color.green);
                        txtApellidoM.setBackground(Color.green);
                        txtApellidoP.setBackground(Color.green);

                        JOptionPane.showMessageDialog(null, "Registro Exitoso");
                        this.dispose();

                    } catch (SQLException e) {
                        System.err.println("Error en Registrar usuario." + e);
                        JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "¡¡Debes llenar todos los campos.!!");
                }

            }

        } catch (SQLException e) {
            System.err.println("Error en validar nombre de usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al comparar usuario!!, contacte al administrador.");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        if (txtnombre.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPKeyTyped
        if (txtApellidoP.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPKeyTyped

    private void txtApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyTyped
        if (txtApellidoM.getText().length() >= 20) {
            evt.consume();
        }    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtuser_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuser_nameKeyTyped
        if (txtuser_name.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtuser_nameKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        if (txtPass.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelefonoKeyTyped
        if (txtelefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbPermisos;
    private javax.swing.JComboBox<String> cmbPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtelefono;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtuser_name;
    // End of variables declaration//GEN-END:variables
}
