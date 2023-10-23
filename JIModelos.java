package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JIModelos extends javax.swing.JInternalFrame {

    int idMarca;
    DefaultTableModel model = new DefaultTableModel();
    
    public JIModelos() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Registro de Modelos");
        
        tblModelo = new JTable(model);
        jScrollPane1.setViewportView(tblModelo);

        model.addColumn("ID de la Modelo");
        model.addColumn("Nombre del modelo");
        model.addColumn("Marca");

        actualizarTabla();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreMarca from marca");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbMarca.addItem(rs.getString("NombreMarca"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los marcas. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModelo = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registros de Modelos de Autos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del Modelo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtmodelo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtmodelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, 210, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 155, 210, 25));

        tblModelo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblModelo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 660, 210));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 90, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 100, 25));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 90, 25));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 100, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
         int idModelo = Integer.parseInt(tblModelo.getValueAt(tblModelo.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreModelo, NombreMarca from modelo, marca where idModelo= '" + idModelo+ "'"
                    + "and Marca_idMarca = idMarca");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtmodelo.setText(rs.getString("NombreModelo"));
                cmbMarca.setSelectedItem(rs.getString("NombreMarca"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar Modelo " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int idModelo = Integer.parseInt(tblModelo.getValueAt(tblModelo.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from modelo where idModelo = '" + idModelo + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "el modelo seleccionada fue dado de baja");
            actualizarTabla();
        } catch (SQLException er) {
            System.err.println("Error en eliminar modelo " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       int validacion = 0;
        int idModelo = Integer.parseInt(tblModelo.getValueAt(tblModelo.getSelectedRow(), 0).toString());
        String nombreModelo;
        nombreModelo = txtmodelo.getText().trim();
        idMarca = cmbMarca.getSelectedIndex() + 1;

        if (nombreModelo.equals("")) {
            validacion++;
        }
        
        if (validacion == 0) {
            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select NombreModelo from modelo where NombreModelo = '" + nombreModelo + "' and not idModelo = '" + idModelo + "'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txtmodelo.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de Modelo no disponible");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                            "update modelo set NombreModelo=?, Marca_idMarca=? where idModelo = '" + idModelo + "'");
                    pest.setString(1, nombreModelo);
                    pest.setInt(2, idMarca);

                    pest.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    txtmodelo.setText("");
                    cmbMarca.setSelectedIndex(0);
                }
                actualizarTabla();

            } catch (SQLException e) {
                System.err.println("Error al actualizar la modelo " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
        String nombreModelo;

        nombreModelo = txtmodelo.getText().trim();
        idMarca = cmbMarca.getSelectedIndex() + 1;

        if (nombreModelo.equals("")) {
            validacion++;
        }

        if (validacion == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into modelo values (?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, nombreModelo);
                pst.setInt(3, idMarca);

                pst.executeUpdate();
                cn.close();

                txtmodelo.setText("");
                cmbMarca.setSelectedIndex(0);

                JOptionPane.showMessageDialog(null, "Registro de Moldelo Exitoso");
            } catch (SQLException e) {
                System.err.println("Error en Registrar Modelo." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");

            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[3];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idModelo, NombreModelo, NombreMarca from modelo, marca where Marca_idMarca = idMarca");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
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
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblModelo;
    private javax.swing.JTextField txtmodelo;
    // End of variables declaration//GEN-END:variables
}
