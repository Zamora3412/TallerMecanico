package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RestaurarContraseñas extends javax.swing.JFrame {

    int idUsuario;

    public RestaurarContraseñas() {
        initComponents();

        this.setSize(400, 330);
        this.setResizable(false);
        this.setTitle("Cambio de Contraseña ");
        this.setLocationRelativeTo(null);
        idUsuario = JIGestionUsuario.usuario_update;

        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtPassconfir = new javax.swing.JPasswordField();
        btnRestaurar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cambio de Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nuevo Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirmar Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtPass.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, -1));

        txtPassconfir.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtPassconfir.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassconfir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPassconfir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassconfirKeyTyped(evt);
            }
        });
        jPanel1.add(txtPassconfir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, -1));

        btnRestaurar.setBackground(new java.awt.Color(255, 255, 255));
        btnRestaurar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnRestaurar.setText("Restaurar contraseña");
        btnRestaurar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 35));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Desarrollado por Golden Software Systems.S.A ©");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed

        String password, confirmacion;

        password = txtPass.getText().trim();
        confirmacion = txtPassconfir.getText().trim();

        if (!password.equals("") && !confirmacion.equals("")) {

            if (password.equals(confirmacion)) {
                try {

                    Connection cn = Conexion.conectar();
                    PreparedStatement pst = cn.prepareStatement(
                            "update empleados set Contraseña=? where idEmpleados = '" + idUsuario + "'");

                    pst.setString(1, password);

                    pst.executeUpdate();
                    cn.close();

                    txtPass.setBackground(Color.green);
                    txtPassconfir.setBackground(Color.green);

                    JOptionPane.showMessageDialog(null, "Restauración exitosa.");

                    this.dispose();

                } catch (SQLException e) {
                    System.err.println("Error en restaurar password " + e);
                }

            } else {
                txtPassconfir.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            }

        } else {
            txtPass.setBackground(Color.red);
            txtPassconfir.setBackground(Color.red);
            JOptionPane.showMessageDialog(null, "No se admiten contraseñas vacias.");
        }


    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        if (txtPass.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtPassconfirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassconfirKeyTyped
        if (txtPassconfir.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPassconfirKeyTyped

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
            java.util.logging.Logger.getLogger(RestaurarContraseñas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurarContraseñas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurarContraseñas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurarContraseñas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurarContraseñas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassconfir;
    // End of variables declaration//GEN-END:variables
}
