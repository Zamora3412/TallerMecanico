package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIUnidadesDeMedida extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    public JIUnidadesDeMedida() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Unidades de Medida de los Productos");
        
        tblUDM = new JTable(model);
        jScrollPane1.setViewportView(tblUDM);

        model.addColumn("ID de la Unidad de Medida");
        model.addColumn("Nombre de la Unidad de Medida");
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUDM = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUDM = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unidades de Medida");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la Unidad de Medida:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtUDM.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtUDM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUDM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUDMKeyTyped(evt);
            }
        });
        jPanel1.add(txtUDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 115, 230, 25));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 100, 25));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, 25));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 110, 25));

        tblUDM.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUDM);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 720, 180));

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
        int idUDM = Integer.parseInt(tblUDM.getValueAt(tblUDM.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreUDM from unidaddemedida where idUnidaddeMedida= '" + idUDM + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtUDM.setText(rs.getString("NombreUDM"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar Unidad de Medida " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idUDM = Integer.parseInt(tblUDM.getValueAt(tblUDM.getSelectedRow(), 0).toString());
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("delete from unidaddemedida where idUnidaddeMedida= '" + idUDM + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "La Unidad de Medida seleccionada fue dada de baja");
            
            actualizarTabla();
        } catch (SQLException e) {
            System.err.println("Error en eliminar Unidad de Medida " + e);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int validacion = 0;
        int idUDM = Integer.parseInt(tblUDM.getValueAt(tblUDM.getSelectedRow(), 0).toString());
        String nombre;

        nombre = txtUDM.getText().trim();

        if (nombre.equals("")) {
            validacion++;
        }
        
        if (validacion == 0) {
             try {
                 Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "select NombreUDM from unidaddemedida where NombreUDM = '"+ nombre +"' and not idUnidaddeMedida = '"+idUDM+"'");
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    txtUDM.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de Unidad de Medida no disponible");
                    cn.close();
                }else{
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                    "update unidaddemedida set NombreUDM=? where idUnidaddeMedida = '" + idUDM + "'");
                    pest.setString(1, nombre);
                    pest.executeUpdate();
                    cn2.close();
                    
                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    txtUDM.setText("");
                }
                actualizarTabla();
             } catch (SQLException e) {
                 System.err.println("Error al actualizar Unidad de Medida" +e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
             }
        } else {
             JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
        String nombre;

        nombre = txtUDM.getText().trim();

        if (nombre.equals("")) {
            validacion++;
        }
        if (validacion == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into unidaddemedida values (?,?)");
                pst.setString(1, "0");
                pst.setString(2, nombre);

                pst.executeUpdate();

                cn.close();

                txtUDM.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Unidad de Medida Exitoso");

            } catch (SQLException e) {
                System.err.println("Error en Registrar Unidad de Medida." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtUDMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUDMKeyTyped
        if (txtUDM.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUDMKeyTyped

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[2];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from unidaddemedida");

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
    private javax.swing.JTable tblUDM;
    private javax.swing.JTextField txtUDM;
    // End of variables declaration//GEN-END:variables
}
