package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIEstatusProducto extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public JIEstatusProducto() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Estatus de los Productos");
        
        tblEstatusPro = new JTable(model);
        jScrollPane1.setViewportView(tblEstatusPro);

        model.addColumn("ID del Estatus");
        model.addColumn("Nombre del Estatus del Producto");
        actualizarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEstatusPro = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstatusPro = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estatus de los Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Estatus:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtEstatusPro.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtEstatusPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEstatusPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstatusProKeyTyped(evt);
            }
        });
        jPanel1.add(txtEstatusPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 125, 280, 25));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 90, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 100, 25));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 90, 25));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 100, 25));

        tblEstatusPro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblEstatusPro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 720, 190));

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
         int idEstatus = Integer.parseInt(tblEstatusPro.getValueAt(tblEstatusPro.getSelectedRow(), 0).toString());
         
         try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreE from estatusproducto where idEstatusP= '" + idEstatus + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtEstatusPro.setText(rs.getString("NombreE"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar estatus de producto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idEstatus = Integer.parseInt(tblEstatusPro.getValueAt(tblEstatusPro.getSelectedRow(), 0).toString());
         
         try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("delete from estatusproducto where idEstatusP= '" + idEstatus + "'");
            pst.executeUpdate();
            cn.close();
            actualizarTabla();
            JOptionPane.showMessageDialog(null, "El estatus del producto seleccionado fue dado de baja");
            
            actualizarTabla();
        } catch (SQLException e) {
            System.err.println("Error en eliminar estatus de producto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int idEstatus = Integer.parseInt(tblEstatusPro.getValueAt(tblEstatusPro.getSelectedRow(), 0).toString());
        int validacion = 0;
        String nombre;
        
        nombre = txtEstatusPro.getText().trim();
        
        if (nombre.equals("")) {
            validacion++;
        }
        
         if (validacion == 0) {
             try {
                 Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "select NombreE from estatusproducto where NombreE = '"+ nombre +"' and not idEstatusP = '"+idEstatus+"'");
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    txtEstatusPro.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de estatus no disponible");
                    cn.close();
                }else{
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                    "update estatusproducto set NombreE=? where idEstatusP = '" + idEstatus + "'");
                    pest.setString(1, nombre);
                    pest.executeUpdate();
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    txtEstatusPro.setText("");
                }
                actualizarTabla();
             } catch (SQLException e) {
                 System.err.println("Error al actualizar estatus" +e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
             }
        } else {
             JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
        String nombre;

        nombre = txtEstatusPro.getText().trim();

        if (nombre.equals("")) {
            validacion++;
        }
        
        if (validacion == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into estatusproducto values (?,?)");
                pst.setString(1, "0");
                pst.setString(2, nombre);

                pst.executeUpdate();

                cn.close();

                txtEstatusPro.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Estatus de Producto Exitoso");

            } catch (SQLException e) {
                System.err.println("Error en Registrar Unidad de Medida." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtEstatusProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstatusProKeyTyped
        if (txtEstatusPro.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEstatusProKeyTyped

        public void actualizarTabla() {

            model.setRowCount(0);
            Object[] fila = new Object[2];
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from estatusproducto");

                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    for (int i = 0; i < 2; i++) {
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstatusPro;
    private javax.swing.JTextField txtEstatusPro;
    // End of variables declaration//GEN-END:variables
}
