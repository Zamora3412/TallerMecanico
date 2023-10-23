package Interfaces;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JICiudades extends javax.swing.JInternalFrame {

    int idEstado;
    DefaultTableModel model = new DefaultTableModel();

    public JICiudades() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Ciudades");

        tblCiudades = new JTable(model);
        jScrollPane1.setViewportView(tblCiudades);

        model.addColumn("ID de la Ciudad");
        model.addColumn("Nombre de la Ciudad");
        model.addColumn("Código Postal");
        model.addColumn("Estado");

        actualizarTabla();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreEstado from estado");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbEstado.addItem(rs.getString("NombreEstado"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los estados. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCiudades = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ciudades");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de la Ciudad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtCiudad.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCiudad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 75, 190, 25));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 80, 25));

        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 90, 25));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 80, 25));

        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 90, 25));

        tblCiudades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCiudades);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 720, 170));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código Postal:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        txtCP.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtCP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPKeyTyped(evt);
            }
        });
        jPanel1.add(txtCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 75, 190, 25));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        cmbEstado.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 145, 190, 25));

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
        int idCiudad = Integer.parseInt(tblCiudades.getValueAt(tblCiudades.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select NombreCiudad, CP, NombreEstado from ciudad, estado where idCiudad = '" + idCiudad + "'"
                    + "and Estado_idEstado = idEstado");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtCiudad.setText(rs.getString("NombreCiudad"));
                txtCP.setText(rs.getString("CP"));
                cmbEstado.setSelectedItem(rs.getString("NombreEstado"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar ciudad " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idCiudad = Integer.parseInt(tblCiudades.getValueAt(tblCiudades.getSelectedRow(), 0).toString());

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from ciudad where idCiudad = '" + idCiudad + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "La ciudad seleccionada fue dado de baja");
            actualizarTabla();
        } catch (SQLException er) {
            System.err.println("Error en eliminar ciudad " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int validacion = 0;
        int idCiudad = Integer.parseInt(tblCiudades.getValueAt(tblCiudades.getSelectedRow(), 0).toString());
        String nombreCiudad, CP;
        nombreCiudad = txtCiudad.getText().trim();
        CP = txtCP.getText().trim();
        idEstado = cmbEstado.getSelectedIndex() + 1;

        if (nombreCiudad.equals("")) {
            validacion++;
        }
        if (CP.equals("")) {
            validacion++;
        }

        if (validacion == 0) {
            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select NombreCiudad from ciudad where NombreCiudad = '" + nombreCiudad + "' and not idCiudad = '" + idCiudad + "'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txtCiudad.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nombre de ciudad no disponible");
                    cn.close();
                } else {
                    Connection cn2 = Conexion.conectar();
                    PreparedStatement pest = cn2.prepareStatement(
                            "update ciudad set NombreCiudad=?, CP=?, Estado_idEstado=? where idCiudad = '" + idCiudad + "'");
                    pest.setString(1, nombreCiudad);
                    pest.setString(2, CP);
                    pest.setInt(3, idEstado);

                    pest.executeUpdate();
                    cn2.close();

                    JOptionPane.showMessageDialog(null, "Modificación correcta");
                    txtCiudad.setText("");
                    txtCP.setText("");
                    cmbEstado.setSelectedIndex(0);
                }
                actualizarTabla();

            } catch (SQLException e) {
                System.err.println("Error al actualizar la ciudad " + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int validacion = 0;
        String nombreCiudad, CP;

        nombreCiudad = txtCiudad.getText().trim();
        CP = txtCP.getText().trim();
        idEstado = cmbEstado.getSelectedIndex() + 1;

        if (nombreCiudad.equals("")) {
            validacion++;
        }
        if (CP.equals("")) {
            validacion++;
        }

        if (validacion == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into ciudad values (?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, nombreCiudad);
                pst.setString(3, CP);
                pst.setInt(4, idEstado);

                pst.executeUpdate();
                cn.close();

                txtCiudad.setText("");
                txtCP.setText("");
                cmbEstado.setSelectedIndex(0);

                JOptionPane.showMessageDialog(null, "Registro de Ciudad Exitoso");
            } catch (SQLException e) {
                System.err.println("Error en Registrar Ciudad." + e);
                JOptionPane.showMessageDialog(null, "¡¡ERROR al registrar!!, contacte al administrador.");

            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        if (txtCiudad.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPKeyTyped
        if (txtCP.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCPKeyTyped

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[4];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idCiudad, NombreCiudad, CP, NombreEstado from ciudad, estado where Estado_idEstado = idEstado");

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
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCiudades;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCiudad;
    // End of variables declaration//GEN-END:variables
}
