package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JICategorias extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();

    public JICategorias() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Categorias de Productos");

        tblCategorias = new JTable(model);
        jScrollPane1.setViewportView(tblCategorias);

        model.addColumn("ID de la Categoria");
        model.addColumn("Nombre de la Categoria");
        model.addColumn("Nomenclatura");
        actualizarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomen = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categorias de Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la Categoria:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 130, -1, -1));

        txtCategoria.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 125, 200, 25));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nomenclatura:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        txtNomen.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNomen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNomen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomenKeyTyped(evt);
            }
        });
        jPanel1.add(txtNomen, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 125, 200, 25));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 25));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 100, 25));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 120, 25));

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCategorias);

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
        int idCategoria = Integer.parseInt(tblCategorias.getValueAt(tblCategorias.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreCategoria, Nomenclatura from categorias where idCategorias= '" + idCategoria + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtCategoria.setText(rs.getString("NombreCategoria"));
                txtNomen.setText(rs.getString("Nomenclatura"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar categoria " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idCategoria = Integer.parseInt(tblCategorias.getValueAt(tblCategorias.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("delete from categorias where idCategorias= '" + idCategoria + "'");
            pst.executeUpdate();
            cn.close();
            actualizarTabla();
            JOptionPane.showMessageDialog(null, "La Categoria seleccionada fue dada de baja");

        } catch (SQLException e) {
            System.err.println("Error en eliminar categoria " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int idCategoria = Integer.parseInt(tblCategorias.getValueAt(tblCategorias.getSelectedRow(), 0).toString());
        String nombre, nomenclatura;
        int validacion = 0;

        nombre = txtCategoria.getText().trim();
        nomenclatura = txtNomen.getText().trim();

        if (nombre.equals("")) {
            validacion++;
        }
        if (nomenclatura.equals("")) {
            validacion++;
        }

        if (validacion == 0) {
            try {

                Connection cn2 = Conexion.conectar();
                PreparedStatement pest = cn2.prepareStatement(
                        "update categorias set NombreCategoria=?, Nomenclatura=? where idCategorias = '" + idCategoria + "'");
                pest.setString(1, nombre);
                pest.setString(2, nomenclatura);
                pest.executeUpdate();
                cn2.close();

                JOptionPane.showMessageDialog(null, "Modificación correcta");
                txtCategoria.setText("");
                txtNomen.setText("");
                actualizarTabla();
            } catch (SQLException e) {
                System.err.println("Error al actualizar categoria" + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
        String nombre, nomenclatura;

        nombre = txtCategoria.getText().trim();
        nomenclatura = txtNomen.getText().trim();

        if (nombre.equals("")) {
            validacion++;
        }
        if (nomenclatura.equals("")) {
            validacion++;
        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into categorias values (?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, nombre);
                pst.setString(3, nomenclatura);

                pst.executeUpdate();

                cn.close();

                txtCategoria.setText("");
                txtNomen.setText("");

                JOptionPane.showMessageDialog(null, "Registro de Categoria Exitoso");

            } catch (SQLException e) {
                System.err.println("Error en Registrar Categoria." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        if (txtCategoria.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtNomenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomenKeyTyped
        if (txtNomen.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNomenKeyTyped

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[3];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from categorias");

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNomen;
    // End of variables declaration//GEN-END:variables
}
