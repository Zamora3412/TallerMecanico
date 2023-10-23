package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JINivelesCon extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public JINivelesCon() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Niveles de Confianza");
        
        tblNiveles = new JTable(model);
            jScrollPane1.setViewportView(tblNiveles);
            
            model.addColumn("ID");
            model.addColumn("Descripción");
            model.addColumn("Límite Mínimo");
            model.addColumn("Límite Máximo");
            
            actualizarTabla();
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLimMini = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLimMax = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNiveles = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Niveles de Confianza");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción de Nivel de Confianza:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, -1, -1));

        txtNivel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNivelKeyTyped(evt);
            }
        });
        jPanel1.add(txtNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 210, 25));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Límite Minimo de Credito:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 140, -1, -1));

        txtLimMini.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtLimMini.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtLimMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 135, 250, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Límite Máximo de Credito:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 195, -1, -1));

        txtLimMax.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtLimMax.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtLimMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 250, 25));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, 25));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 90, 25));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 100, 25));

        tblNiveles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblNiveles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 710, 140));

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
        int idIdCon = Integer.parseInt(tblNiveles.getValueAt(tblNiveles.getSelectedRow(), 0).toString());
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from nc_cliente where idNC_Cliente = '"+idIdCon+"'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txtNivel.setText(rs.getString("DescripciónConfianza"));
                txtLimMini.setText(rs.getString("LimiteMin"));
                txtLimMax.setText(rs.getString("LimiteMax"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar nivel confianza " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idIdCon = Integer.parseInt(tblNiveles.getValueAt(tblNiveles.getSelectedRow(), 0).toString());
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("delete from nc_cliente where idNC_Cliente = '"+idIdCon+"'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "El nivel de confianza seleccionado fue dado de baja");
            actualizarTabla();
        } catch (SQLException e) {
            System.err.println("Error en eliminar nivel confianza " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int validacion = 0;
        String nivel, limMax, limMin;
        int idIdCon = Integer.parseInt(tblNiveles.getValueAt(tblNiveles.getSelectedRow(), 0).toString());
        
        nivel = txtNivel.getText().trim();
        limMax = txtLimMax.getText().trim();
        limMin = txtLimMini.getText().trim();
        
        if (nivel.equals("")) {
            validacion++;
        }
        if (limMax.equals("")) {
            validacion++;
        }
        if (limMin.equals("")) {
            validacion++;
        }
        
        if (validacion == 0) {
            try {
                 Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                            "update nc_cliente set DescripciónConfianza=?, LimiteMin=?, LimiteMax=? where idNC_Cliente = '" + idIdCon + "'");
                    pest.setString(1, nivel);
                    pest.setInt(2, Integer.parseInt(limMin));
                    pest.setInt(3, Integer.parseInt(limMax));

                    pest.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    txtNivel.setText("");
                    txtLimMax.setText("");
                    txtLimMini.setText("");
                    actualizarTabla();
            } catch (SQLException e) {
                System.err.println("Error al actualizar nivel de confianza " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         int validacion = 0;
        String nivel, limMax, limMin;
        
        nivel = txtNivel.getText().trim();
        limMax = txtLimMax.getText().trim();
        limMin = txtLimMini.getText().trim();
        
        if (nivel.equals("")) {
            validacion++;
        }
        if (limMax.equals("")) {
            validacion++;
        }
        if (limMin.equals("")) {
            validacion++;
        }
        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into nc_cliente values (?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, nivel);
                pst.setInt(3, Integer.parseInt(limMin));
                pst.setInt(4, Integer.parseInt(limMax));

                pst.executeUpdate();
                cn.close();

                txtNivel.setText("");
                txtLimMini.setText("");
                txtLimMax.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Nivel de Confianza Exitoso");
            } catch (SQLException e) {
                System.err.println("Error en Registrar Nivel de Confianza ." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtNivelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNivelKeyTyped
        if (txtNivel.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNivelKeyTyped

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[4];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from nc_cliente");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNiveles;
    private javax.swing.JTextField txtLimMax;
    private javax.swing.JTextField txtLimMini;
    private javax.swing.JTextField txtNivel;
    // End of variables declaration//GEN-END:variables
}
