package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public static String usuario = "";
    String contraseña;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setResizable(false);
        this.setSize(800, 600);

    }
    
    

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Taller P.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        icono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Iniciar2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(224, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Login.setText("Iniciar Sesión");
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 280, -1));

        Usuario.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Usuario.setText("USUARIO:");
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 220, -1));

        txtUser.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUser.setToolTipText("Ingrese su nombre de usuario:");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 260, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 270, 10));

        Contraseña.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Contraseña.setText("CONTRASEÑA:");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 220, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 270, 10));

        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("********");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 260, 30));

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login (1).jpg"))); // NOI18N
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 140, 130));

        jPanel2.setBackground(new java.awt.Color(19, 20, 22));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        Iniciar2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        Iniciar2.setForeground(new java.awt.Color(255, 255, 255));
        Iniciar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Iniciar2.setText("Iniciar");
        Iniciar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Iniciar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 170, 50));

        jPanel3.setBackground(new java.awt.Color(29, 81, 81));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Final.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if (txtUser.getText().equals("Ingrese su nombre de usuario:")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
        if (String.valueOf(txtPass.getPassword()).isEmpty()) {
            txtPass.setText("********");
            txtPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if (String.valueOf(txtPass.getPassword()).equals("********")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingrese su nombre de usuario:");
            txtUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPassMousePressed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(121, 128, 140));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(19, 20, 22));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        usuario = txtUser.getText().trim();
        contraseña = txtPass.getText().trim();

        if (!usuario.equals("") || !contraseña.equals("")) {
            try{
          Connection cn = Conexion.conectar();
          PreparedStatement pst = cn.prepareStatement(
                  "select Permisos_idPermisos , Estatus_idEstatus from empleados where Usuario = '" +usuario
                    + "' and Contraseña = '" + contraseña + "'");

          ResultSet rs = pst.executeQuery();
         
          if(rs.next()){
              
              int permiso = rs.getInt("Permisos_idPermisos");
              int estatus = rs.getInt("Estatus_idEstatus");
              
              if (permiso == 1 && estatus == 1) {
                  JOptionPane.showMessageDialog(null, "Entrando al Menú de Administrador");
                  dispose();
                  new MenuAdministrador().setVisible(true);
              } else if(permiso == 2 && estatus == 1){
                  JOptionPane.showMessageDialog(null, "Entrando al Menú de Empleado");
                  dispose();
                  new MenuEmpleados().setVisible(true);
              } else{
                  JOptionPane.showMessageDialog(null, "El usuario "+usuario+" no esta activo");
              }
              
          }else{
              JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos");
              txtUser.setText("");
              txtPass.setText("");
          }
         
        }catch(SQLException e){
            System.err.println("Error en el boton acceder " + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al iniciar sesion!!, contacte al administrador"); 
        }
        }else{
           JOptionPane.showMessageDialog(null, "Debes llenar todos los campos"); 
        }

    }//GEN-LAST:event_jPanel2MouseClicked

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_TAB) {
            txtPass.requestFocus();
             if (String.valueOf(txtPass.getPassword()).equals("********")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingrese su nombre de usuario:");
            txtUser.setForeground(Color.gray);
        }
        }
    }//GEN-LAST:event_txtPassKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Iniciar2;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
