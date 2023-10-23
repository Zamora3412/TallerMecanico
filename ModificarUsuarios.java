package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class ModificarUsuarios extends javax.swing.JFrame {

    int ID, IdUsuario;

    public ModificarUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(800, 500);
        this.setTitle("Modificar Usuarios");
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        IdUsuario = JIGestionUsuario.usuario_update;

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
                cmbPuesto.addItem(rs.getString("NombrePuesto"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los puestos. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreEstatus from estatus");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbEstatus.addItem(rs.getString("NombreEstatus"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los estatus. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreEmpleado, APaterno, AMaterno, CorreoE, TelefonoE, Usuario, Contraseña, "
                    + "NombrePuesto, NombrePermisos,  NombreEstatus from empleados, permisos, puestos, estatus where idEmpleados = '" + IdUsuario + "' "
                    + "and Puestos_idPuestos = IdPuestos and Permisos_idPermisos = idPermisos and Estatus_idEstatus = idEstatus");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtnombre.setText(rs.getString("NombreEmpleado"));
                txtApellidoP.setText(rs.getString("Apaterno"));
                txtApellidoM.setText(rs.getString("Amaterno"));
                txtUser.setText(rs.getString("Usuario"));
                txtEmail.setText(rs.getString("CorreoE"));
                txtelefono.setText(rs.getString("TelefonoE"));
                cmbPuesto.setSelectedItem(rs.getString("NombrePuesto"));
                cmbPermisos.setSelectedItem(rs.getString("NombrePermisos"));
                cmbEstatus.setSelectedItem(rs.getString("NombreEstatus"));

            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar empleado " + e);
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
        cmbPuesto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbEstatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

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
        txtnombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido Materno");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtApellidoM.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtApellidoM.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtEmail.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 210, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Télefono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        txtelefono.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 210, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Permisos de:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        cmbPermisos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 160, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Puesto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        cmbPuesto.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido Paterno:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        txtApellidoP.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtApellidoP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 210, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        txtUser.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 210, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Desarrollado por Golden Software Systems.S.A ©");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar usuario");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 210, 35));

        btnRestaurar.setBackground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnRestaurar.setText("Restaurar contraseña");
        btnRestaurar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 210, 35));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estatus:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        cmbEstatus.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 160, -1));

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

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String nombre, apellidoP, apellidoM, mail, telefono, username;
        int puestos_cmb, validacion = 0, permisos_cmb, estatus_cmb;

        nombre = txtnombre.getText().trim();
        apellidoP = txtApellidoP.getText().trim();
        apellidoM = txtApellidoM.getText().trim();
        mail = txtEmail.getText().trim();
        telefono = txtelefono.getText().trim();
        username = txtUser.getText();
        estatus_cmb = cmbEstatus.getSelectedIndex() + 1;
        puestos_cmb = cmbPuesto.getSelectedIndex() + 1;
        permisos_cmb = cmbPermisos.getSelectedIndex() + 1;

        if (mail.equals("")) {
            validacion++;
        }
        if (username.equals("")) {
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

        if (validacion == 0) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select NombreEmpleado from empleados where Usuario = '" + username
                        + "' and not idEmpleados = '" + IdUsuario + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    txtUser.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                    cn.close();

                } else {

                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "update empleados set NombreEmpleado = ?, APaterno = ?, AMaterno = ?,"
                            + " CorreoE = ?, TelefonoE = ?, Usuario = ?, Puestos_idPuestos = ?, Permisos_idPermisos = ?, Estatus_idEstatus = ? "
                            + "where idEmpleados = '" + IdUsuario + "'");

                    pst2.setString(1, nombre);
                    pst2.setString(2, apellidoP);
                    pst2.setString(3, apellidoM);
                    pst2.setString(4, mail);
                    pst2.setString(5, telefono);
                    pst2.setString(6, username);
                    pst2.setInt(7, puestos_cmb);
                    pst2.setInt(8, permisos_cmb);
                    pst2.setInt(9, estatus_cmb);

                    pst2.executeUpdate();
                    cn2.close();

                    txtEmail.setText("");
                    txtelefono.setText("");
                    txtnombre.setText("");
                    txtUser.setText("");
                    txtApellidoM.setText("");
                    txtApellidoP.setText("");
                    cmbPermisos.setSelectedIndex(0);
                    cmbPuesto.setSelectedIndex(0);
                    cmbEstatus.setSelectedIndex(0);

                    txtEmail.setBackground(Color.green);
                    txtelefono.setBackground(Color.green);
                    txtnombre.setBackground(Color.green);
                    txtUser.setBackground(Color.green);
                    txtApellidoM.setBackground(Color.green);
                    txtApellidoP.setBackground(Color.green);

                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    this.dispose();
                }

            } catch (SQLException e) {
                System.err.println("Error al actualizar " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed

        RestaurarContraseñas restaurarcontraseñas = new RestaurarContraseñas();
        restaurarcontraseñas.setVisible(true);

    }//GEN-LAST:event_btnRestaurarActionPerformed

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
        }
    }//GEN-LAST:event_txtApellidoMKeyTyped

    private void txtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelefonoKeyTyped
        if (txtelefono.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtelefonoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if (txtUser.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserKeyTyped

                                        
    
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
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JComboBox<String> cmbEstatus;
    private javax.swing.JComboBox<String> cmbPermisos;
    private javax.swing.JComboBox<String> cmbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtelefono;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
