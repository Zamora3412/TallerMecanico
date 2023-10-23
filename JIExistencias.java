package Interfaces;

import static Interfaces.JIGestionUsuario.usuario_update;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

public class JIExistencias extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    public static int producto_update = 0;
    int idProveedor;
    public JIExistencias() {
        initComponents();
        this.setSize(794, 548);
        this.setTitle("Existencias de Productos");
        
        tblProductos = new JTable(model);
            jScrollPane1.setViewportView(tblProductos);

            model.addColumn("ID Producto");
            model.addColumn("Codigo de Barras");
            model.addColumn("Descripcion");
            model.addColumn("Existencias");
            model.addColumn("UDM");
            model.addColumn("Precio de Venta");
            
            TableColumnModel modelo = tblProductos.getColumnModel();

            modelo.getColumn(0).setPreferredWidth(60);
            modelo.getColumn(1).setPreferredWidth(100);
            modelo.getColumn(2).setPreferredWidth(150);
            modelo.getColumn(3).setPreferredWidth(60);
            modelo.getColumn(4).setPreferredWidth(60);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProductos, CodigoBarras, NombreProducto, Existencia, NombreUDM, PrecioVenta  "
                    + "from productos, unidaddemedida where UnidaddeMedida_idUnidaddeMedida = idUnidaddeMedida");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[6];

                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);

            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreProveedor from proveedor");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbProveedores.addItem(rs.getString("NombreProveedor"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los proveedores. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        
        tblProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tblProductos.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    producto_update = (int) model.getValueAt(fila_point, columna_point);

                    ModificarProducto MP = new ModificarProducto();
                    MP.setVisible(true);

                }

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        LblFecha2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnBusquedaID = new javax.swing.JButton();
        LblFecha3 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        btnBusquedaNom = new javax.swing.JButton();
        LblFecha4 = new javax.swing.JLabel();
        btnBusquedaProv = new javax.swing.JButton();
        cmbProveedores = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Existencias de Productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 700, 150));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Desarrollado por Golden Software Systems.S.A ©");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        LblFecha2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha2.setText("ID Producto:");
        jPanel1.add(LblFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtID.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, 25));

        btnBusquedaID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBusquedaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaIDActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusquedaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 95, 32, 32));

        LblFecha3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha3.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha3.setText("Nombre Producto:");
        jPanel1.add(LblFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        txtNombrePro.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        txtNombrePro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombrePro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 180, 25));

        btnBusquedaNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBusquedaNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaNomActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusquedaNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 95, 32, 32));

        LblFecha4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha4.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha4.setText("Proveedor:");
        jPanel1.add(LblFecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        btnBusquedaProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBusquedaProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaProvActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusquedaProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 165, 32, 32));

        cmbProveedores.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, -1));

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

    private void btnBusquedaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaIDActionPerformed
        int idProducto;
        
        idProducto = Integer.parseInt(txtID.getText().trim());
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProductos, CodigoBarras, NombreProducto, Existencia, NombreUDM, PrecioVenta  "
                    + "from productos, unidaddemedida where UnidaddeMedida_idUnidaddeMedida = idUnidaddeMedida and idProductos = '"+idProducto+"'");
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        cmbProveedores.setSelectedIndex(0);
        txtNombrePro.setText("");
    }//GEN-LAST:event_btnBusquedaIDActionPerformed

    private void btnBusquedaNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaNomActionPerformed
        String nombre;
        
        nombre = txtNombrePro.getText().trim();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProductos, CodigoBarras, NombreProducto, Existencia, NombreUDM, PrecioVenta  "
                    + "from productos, unidaddemedida where UnidaddeMedida_idUnidaddeMedida = idUnidaddeMedida and NombreProducto like '%"+nombre+"%'");
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        txtID.setText("");
        cmbProveedores.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnBusquedaNomActionPerformed

    private void btnBusquedaProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaProvActionPerformed
        
        consultarID();
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProductos, CodigoBarras, NombreProducto, Existencia, NombreUDM, PrecioVenta  "
            + "from productos, unidaddemedida where UnidaddeMedida_idUnidaddeMedida = idUnidaddeMedida and Proveedor_idProveedor = '"+idProveedor+"'");
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        txtID.setText("");
        txtNombrePro.setText("");
        
    }//GEN-LAST:event_btnBusquedaProvActionPerformed

    public void consultarID(){
        String proveedor;
        
        proveedor = cmbProveedores.getSelectedItem().toString();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProveedor from proveedor where NombreProveedor = '" + proveedor + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idProveedor = rs.getInt("idProveedor");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar datos: ID Proveedor " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFecha2;
    private javax.swing.JLabel LblFecha3;
    private javax.swing.JLabel LblFecha4;
    private javax.swing.JButton btnBusquedaID;
    private javax.swing.JButton btnBusquedaNom;
    private javax.swing.JButton btnBusquedaProv;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombrePro;
    // End of variables declaration//GEN-END:variables
}
