package Interfaces;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class JIAutosClientes extends javax.swing.JInternalFrame {

    String user;
    
    DefaultTableModel model = new DefaultTableModel();

    public JIAutosClientes() {
        initComponents();
        setSize(794, 548);
        setTitle("Asignar Autos a Clientes");
        setResizable(false);

        tblAutoCli = new JTable(model);
        jScrollPane1.setViewportView(tblAutoCli);

        model.addColumn("ID Auto");
        model.addColumn("Modelo");
        model.addColumn("Numero de Serie");
        model.addColumn("ID Cliente");
        model.addColumn("Nombre del Cliente");

        TableColumnModel modelo = tblAutoCli.getColumnModel();

        modelo.getColumn(0).setPreferredWidth(50);
        modelo.getColumn(1).setPreferredWidth(100);
        modelo.getColumn(2).setPreferredWidth(80);
        modelo.getColumn(3).setPreferredWidth(50);
        modelo.getColumn(4).setPreferredWidth(150);
        
        actualizarTabla();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idClientes, NombreC, APaternoC, AMaternoC from clientes");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbClientes.addItem(rs.getString("idClientes") + " " + rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar clientes " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idAutos, NombreModelo from autos, modelo where Modelo_idModelo = idModelo ");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbAutos.addItem(rs.getString("idAutos") + " " + rs.getString("NombreModelo"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar autos" + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbAutos = new javax.swing.JComboBox<>();
        cmbClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutoCli = new javax.swing.JTable();
        btnAgregarAC = new javax.swing.JButton();
        btnActAC = new javax.swing.JButton();
        btnEliminarAC = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbAutos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 220, 30));

        cmbClientes.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 250, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autos - Clientes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Autos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));

        tblAutoCli.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAutoCli);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 700, 190));

        btnAgregarAC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnAgregarAC.setText("Asignar Auto - Cliente");
        btnAgregarAC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarACActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 190, 30));

        btnActAC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnActAC.setText("Actualizar Auto - Cliente");
        btnActAC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActACActionPerformed(evt);
            }
        });
        jPanel1.add(btnActAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 190, 30));

        btnEliminarAC.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnEliminarAC.setText("Eliminar Auto - Cliente");
        btnEliminarAC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarACActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 190, 30));

        btnConsulta.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        btnConsulta.setText("Consultar Auto - Cliente");
        btnConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarACActionPerformed
        int idC, idA;
        idC = cmbClientes.getSelectedIndex() + 1;
        idA = cmbAutos.getSelectedIndex() + 1; 
        
        try {
                Connection conx = Conexion.conectar();
                PreparedStatement pesnt = conx.prepareStatement(
                    "insert into autos_has_clientes values (?,?)");
                pesnt.setInt(1, idA);
                pesnt.setInt(2, idC);
                
                pesnt.executeUpdate();
                
                
                conx.close();
                JOptionPane.showMessageDialog(null, "Asignación exitosa de Clientes Autos");
                actualizarTabla();
            } catch (SQLException e) {
                System.err.println("Error al asignar Clientes a Autos " + e);
                JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador", "Error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnAgregarACActionPerformed

    private void btnActACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActACActionPerformed
        int idCliente = Integer.parseInt(tblAutoCli.getValueAt(tblAutoCli.getSelectedRow(), 3).toString());
       int idAutos = Integer.parseInt(tblAutoCli.getValueAt(tblAutoCli.getSelectedRow(), 0).toString());
        try {
                Connection conx = Conexion.conectar();
                PreparedStatement pesnt = conx.prepareStatement(
                "update autos_has_clientes set Autos_idAutos = ?, Clientes_idClientes = ? where Autos_idAutos = '"+idAutos+"' "
                        + "and Clientes_idClientes = '"+idCliente+"'");
                int idC, idA;
                 idC = cmbClientes.getSelectedIndex() + 1;
                    idA = cmbAutos.getSelectedIndex() + 1;
                
                pesnt.setInt(1, idA);
                pesnt.setInt(2, idC);
                
                pesnt.executeUpdate();
                
                conx.close();
                JOptionPane.showMessageDialog(null, "Actualización exitosa de Clientes Autos");
                actualizarTabla();
            } catch (SQLException e) {
                System.err.println("Error al actualizar Clientes a Autos " + e);
                JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador", "Error",JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_btnActACActionPerformed

    private void btnEliminarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarACActionPerformed
        int idCliente = Integer.parseInt(tblAutoCli.getValueAt(tblAutoCli.getSelectedRow(), 3).toString());
       int idAutos = Integer.parseInt(tblAutoCli.getValueAt(tblAutoCli.getSelectedRow(), 0).toString());
       
       try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "delete from autos_has_clientes where idAutos_idAutos  = '" + idAutos + "' and Clientes_idClientes = '"+idCliente+"'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "El proveedor seleccionado fue dado de baja");
            actualizarTabla();
        } catch (SQLException er) {
            System.err.println("Error en eliminar proveedor " + er);
            JOptionPane.showMessageDialog(null, "Error en eliminar, contacte al administrador");
        }
       
       
    }//GEN-LAST:event_btnEliminarACActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
       int idCliente = Integer.parseInt(tblAutoCli.getValueAt(tblAutoCli.getSelectedRow(), 3).toString());
       int idAutos = Integer.parseInt(tblAutoCli.getValueAt(tblAutoCli.getSelectedRow(), 0).toString());
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select NombreModelo from autos, modelo where idAutos = '"+idAutos+"' and Modelo_idModelo = idModelo");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cmbAutos.setSelectedItem(rs.getString("NombreModelo"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar auto " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
            "select idClientes, NombreC, APaternoC, AMaternoC from clientes where idClientes = '"+idCliente+"'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cmbClientes.setSelectedItem(rs.getString("idClientes")+" "+rs.getString("NombreC")+" "+rs.getString("APaternoC")+" "+rs.getString("AMaternoC"));
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar cliente " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
       
    }//GEN-LAST:event_btnConsultaActionPerformed

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[5];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select "
                    + "idAutos, NombreModelo, NumeroSerie, idClientes, NombreC, APaternoC, AMaternoC from autos, modelo, clientes, autos_has_clientes where "
                    + "Autos_idAutos = idAutos and Clientes_idClientes = idClientes and Modelo_idModelo = idModelo");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                    fila[4] = rs.getObject(5) +" "+rs.getObject(6)+" "+rs.getObject(7);
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
    private javax.swing.JButton btnActAC;
    private javax.swing.JButton btnAgregarAC;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEliminarAC;
    private javax.swing.JComboBox<String> cmbAutos;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutoCli;
    // End of variables declaration//GEN-END:variables
}
