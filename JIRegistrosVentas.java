package Interfaces;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.table.TableColumnModel;

public class JIRegistrosVentas extends javax.swing.JInternalFrame {

    int idProducto, idCompra, idCliente;
    String importe;
    DefaultTableModel model = new DefaultTableModel();

    public JIRegistrosVentas() {
        initComponents();
        setSize(794, 548);
        setTitle("Historial de ventas");
        setResizable(false);

        jTable_ventas = new JTable(model);
        jScrollPane1.setViewportView(jTable_ventas);

        model.addColumn("ID Ventas");
        model.addColumn("Fecha de Venta");
        model.addColumn("Producto");
        model.addColumn("Cantidad Comprada");
        model.addColumn("Cliente");
        model.addColumn("Total Vendido");

        TableColumnModel modelo = jTable_ventas.getColumnModel();

        modelo.getColumn(0).setPreferredWidth(60);
        modelo.getColumn(1).setPreferredWidth(100);
        modelo.getColumn(2).setPreferredWidth(150);
        modelo.getColumn(3).setPreferredWidth(60);
        modelo.getColumn(4).setPreferredWidth(60);
        modelo.getColumn(5).setPreferredWidth(60);

        actualizarTabla();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreC, APaternoC, AMaternoC from clientes");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbClientes.addItem(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los clientes. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select NombreProducto from productos");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbProductos.addItem(rs.getString("NombreProducto"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los productos. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select TotalVenta from venta");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                cmbImportes.addItem(rs.getString("TotalVenta"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar los importes de venta. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ventas = new javax.swing.JTable();
        LblFecha1 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        LblFecha4 = new javax.swing.JLabel();
        FechaCompraIn = new com.toedter.calendar.JDateChooser();
        LblFecha = new javax.swing.JLabel();
        FechaCompraFin = new com.toedter.calendar.JDateChooser();
        LblFecha2 = new javax.swing.JLabel();
        cmbProductos = new javax.swing.JComboBox<>();
        btnBuscarProd = new javax.swing.JButton();
        ImprimirProd = new javax.swing.JButton();
        LblFecha3 = new javax.swing.JLabel();
        cmbImportes = new javax.swing.JComboBox<>();
        btnBuscarImporte = new javax.swing.JButton();
        ImprimirImpor = new javax.swing.JButton();
        ImprimirFec = new javax.swing.JButton();
        btnBuscarFec = new javax.swing.JButton();
        btnBuscarClie = new javax.swing.JButton();
        ImprimirClie = new javax.swing.JButton();
        ImprimirTodo = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taller P.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(29, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial de Ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jTable_ventas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_ventas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 760, 190));

        LblFecha1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha1.setText("Clientes:");
        jPanel1.add(LblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cmbClientes.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 65, 190, 25));

        LblFecha4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha4.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha4.setText("Inicio:");
        jPanel1.add(LblFecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        FechaCompraIn.setBackground(new java.awt.Color(204, 204, 204));
        FechaCompraIn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(FechaCompraIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 25));

        LblFecha.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha.setText("Fin:");
        jPanel1.add(LblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 135, -1, -1));

        FechaCompraFin.setBackground(new java.awt.Color(204, 204, 204));
        FechaCompraFin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel1.add(FechaCompraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 130, 140, 25));

        LblFecha2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha2.setText("Producto:");
        jPanel1.add(LblFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        cmbProductos.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 65, 170, 25));

        btnBuscarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBuscarProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 32, 32));

        ImprimirProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora 2.png"))); // NOI18N
        ImprimirProd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ImprimirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirProdActionPerformed(evt);
            }
        });
        jPanel1.add(ImprimirProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 32, 32));

        LblFecha3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        LblFecha3.setForeground(new java.awt.Color(255, 255, 255));
        LblFecha3.setText("Importe:");
        jPanel1.add(LblFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 135, -1, -1));

        cmbImportes.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jPanel1.add(cmbImportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 140, 25));

        btnBuscarImporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBuscarImporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarImporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 125, 32, 32));

        ImprimirImpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora 2.png"))); // NOI18N
        ImprimirImpor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ImprimirImpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirImporActionPerformed(evt);
            }
        });
        jPanel1.add(ImprimirImpor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 125, 32, 32));

        ImprimirFec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora 2.png"))); // NOI18N
        ImprimirFec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ImprimirFec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirFecActionPerformed(evt);
            }
        });
        jPanel1.add(ImprimirFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 125, 32, 32));

        btnBuscarFec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBuscarFec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarFec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFecActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarFec, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 125, 32, 32));

        btnBuscarClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnBuscarClie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClieActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 60, 32, 32));

        ImprimirClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora 2.png"))); // NOI18N
        ImprimirClie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ImprimirClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirClieActionPerformed(evt);
            }
        });
        jPanel1.add(ImprimirClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 32, 32));

        ImprimirTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        ImprimirTodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ImprimirTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirTodoActionPerformed(evt);
            }
        });
        jPanel1.add(ImprimirTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        model.setRowCount(0);
        consultarIDProducto();
        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idVenta , FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where idProductos = '" + idProducto + "' and '" + idProducto + "' = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta "
                    + "and Clientes_idClientes = idClientes ORDER BY idVenta ASC");
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {

                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3) + " - " + rs.getObject(4);
                fila[3] = rs.getObject(5);
                fila[4] = rs.getObject(6) + " " + rs.getObject(7) + " " + rs.getObject(8);
                fila[5] = rs.getObject(9);
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla desde busqueda por producto. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        cmbImportes.setSelectedIndex(0);
        cmbClientes.setSelectedIndex(0);
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void ImprimirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirProdActionPerformed
        Document documento = new Document();
        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fechaHoy = new java.sql.Date(d);
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, new FileOutputStream(ruta + "/Reportes/Taller Mecanico/Reporte de Ventas/"
                    + "Reportes por Productos/Reporte de Ventas por Productos - " + fechaHoy + " .pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/Banner Venta.png");
            header.scaleToFit(550, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nRegistro de Ventas a Clientes \n \n ");
            parrafo.setFont(FontFactory.getFont("Arial", 18, java.awt.Font.BOLD, BaseColor.BLACK));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell(new Paragraph("Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Fecha de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Producto", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cantidad", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cliente", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Total del Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));

            consultarIDProducto();

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select idVenta , FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                        + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                        + "where idProductos = '" + idProducto + "' and '" + idProducto + "' = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta "
                        + "and Clientes_idClientes = idClientes ORDER BY idVenta ASC");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {

                        tabla.addCell(rs.getString("idVenta"));
                        tabla.addCell(rs.getString("FechaVenta"));
                        tabla.addCell(rs.getString("idProductos") + " - " + rs.getString("NombreProducto"));
                        tabla.addCell(rs.getString("CantidadVendida"));
                        tabla.addCell(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
                        tabla.addCell(rs.getString("TotalVenta"));

                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.err.println("Error al generar lista de compras por Productos. " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente");

        } catch (DocumentException | HeadlessException | IOException e) {
            System.err.println("Error al generar el PDF. " + e);

        }
    }//GEN-LAST:event_ImprimirProdActionPerformed

    private void btnBuscarImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarImporteActionPerformed
        model.setRowCount(0);
        consultarImporteVenta();
        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idVenta , FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where idProductos = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta and TotalVenta = '"+importe+"' and "
                            + "Clientes_idClientes = idClientes ORDER BY idVenta ASC");
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {

                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3) + " - " + rs.getObject(4);
                fila[3] = rs.getObject(5);
                fila[4] = rs.getObject(6) + " " + rs.getObject(7) + " " + rs.getObject(8);
                fila[5] = "$ " +rs.getObject(9)+ " MXN";
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla desde busqueda por proveedor. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        cmbProductos.setSelectedIndex(0);
        cmbClientes.setSelectedIndex(0);

    }//GEN-LAST:event_btnBuscarImporteActionPerformed

    private void ImprimirImporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirImporActionPerformed
        consultarImporteVenta();
        Document documento = new Document();
        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fechaHoy = new java.sql.Date(d);
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, new FileOutputStream(ruta + "/Reportes/Taller Mecanico/Reporte de Ventas/"
                    + "Reportes por Importes/Reporte de Ventas por Total de Compra - " + fechaHoy + " .pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/Banner Venta.png");
            header.scaleToFit(550, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nRegistro de Ventas a Clientes \n \n ");
            parrafo.setFont(FontFactory.getFont("Arial", 18, java.awt.Font.BOLD, BaseColor.BLACK));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell(new Paragraph("Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Fecha de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Producto", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cantidad", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cliente", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Total del Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select idVenta , FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where idProductos = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta and TotalVenta = '"+importe+"' and "
                            + "Clientes_idClientes = idClientes ORDER BY idVenta ASC");
            ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {

                        tabla.addCell(rs.getString("idVenta"));
                        tabla.addCell(rs.getString("FechaVenta"));
                        tabla.addCell(rs.getString("idProductos") + " - " + rs.getString("NombreProducto"));
                        tabla.addCell(rs.getString("CantidadVendida"));
                        tabla.addCell(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
                        tabla.addCell(rs.getString("TotalVenta"));

                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.err.println("Error al generar lista de ventas por total de compra. " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente");

        } catch (DocumentException | HeadlessException | IOException e) {
            System.err.println("Error al generar el PDF. " + e);

        }
    }//GEN-LAST:event_ImprimirImporActionPerformed

    private void ImprimirFecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirFecActionPerformed
        java.util.Date date = FechaCompraIn.getDate();
        long d = date.getTime();
        java.sql.Date fechaInicio = new java.sql.Date(d);

        java.util.Date date2 = FechaCompraFin.getDate();
        long da = date2.getTime();
        java.sql.Date fechaFin = new java.sql.Date(da);

        Document documento = new Document();
        java.util.Date date3 = new java.util.Date();
        long dat = date3.getTime();
        java.sql.Date fechaHoy = new java.sql.Date(dat);
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, new FileOutputStream(ruta + "/Reportes/Taller Mecanico/Reporte de Ventas/"
                    + "Reportes por Fechas/Reporte de Ventas por Fechas - " + fechaHoy + " .pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/Banner Venta.png");
            header.scaleToFit(550, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nRegistro de Ventas a Clientes \n \n ");
            parrafo.setFont(FontFactory.getFont("Arial", 18, java.awt.Font.BOLD, BaseColor.BLACK));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell(new Paragraph("Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Fecha de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Producto", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cantidad", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cliente", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Total del Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));

            consultarIDProducto();

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                         "select idVenta, FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where FechaVenta BETWEEN '" + fechaInicio + "' and '" + fechaFin + "' and idVenta = Venta_idVentas "
                    + "and idProductoDV = idProductos and Venta_idVenta = idVenta and Clientes_idClientes = idClientes ORDER BY idVenta ASC");
            ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {

                       tabla.addCell(rs.getString("idVenta"));
                        tabla.addCell(rs.getString("FechaVenta"));
                        tabla.addCell(rs.getString("idProductos") + " - " + rs.getString("NombreProducto"));
                        tabla.addCell(rs.getString("CantidadVendida"));
                        tabla.addCell(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
                        tabla.addCell(rs.getString("TotalVenta"));

                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.err.println("Error al generar lista de ventas por fechas. " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente");

        } catch (DocumentException | HeadlessException | IOException e) {
            System.err.println("Error al generar el PDF. " + e);

        }
    }//GEN-LAST:event_ImprimirFecActionPerformed

    private void btnBuscarFecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFecActionPerformed
        model.setRowCount(0);
        java.util.Date date = FechaCompraIn.getDate();
        long d = date.getTime();
        java.sql.Date fechaInicio = new java.sql.Date(d);

        java.util.Date date2 = FechaCompraFin.getDate();
        long da = date2.getTime();
        java.sql.Date fechaFin = new java.sql.Date(da);

        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idVenta, FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where FechaVenta BETWEEN '" + fechaInicio + "' and '" + fechaFin + "' and idVenta = Venta_idVentas "
                    + "and idProductoDV = idProductos and Venta_idVenta = idVenta and Clientes_idClientes = idClientes ORDER BY idVenta ASC");
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {

                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3) + " - " + rs.getObject(4);
                fila[3] = rs.getObject(5);
                fila[4] = rs.getObject(6) + " " + rs.getObject(7) + " " + rs.getObject(8);
                fila[5] = rs.getObject(9);
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla desde busqueda por fechas. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        cmbImportes.setSelectedIndex(0);
        cmbProductos.setSelectedIndex(0);
        cmbClientes.setSelectedIndex(0);
    }//GEN-LAST:event_btnBuscarFecActionPerformed

    private void btnBuscarClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClieActionPerformed
        model.setRowCount(0);
        idCliente = cmbClientes.getSelectedIndex() + 1;
        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idVenta , FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where idProductos = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta and Clientes_idClientes = idClientes and "
                    + "idClientes = '" + idCliente + "' ORDER BY idVenta ASC");
            ResultSet rs = pst.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {

                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3) + " - " + rs.getObject(4);
                fila[3] = rs.getObject(5);
                fila[4] = rs.getObject(6) + " " + rs.getObject(7) + " " + rs.getObject(8);
                fila[5] = rs.getObject(9);
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla desde busqueda por clientes " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
        cmbImportes.setSelectedIndex(0);
        cmbProductos.setSelectedIndex(0);
    }//GEN-LAST:event_btnBuscarClieActionPerformed

    private void ImprimirClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirClieActionPerformed
        idCliente = cmbClientes.getSelectedIndex() + 1;
        Document documento = new Document();
        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fechaHoy = new java.sql.Date(d);
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, new FileOutputStream(ruta + "/Reportes/Taller Mecanico/Reporte de Ventas/"
                    + "Reportes por Clientes/Reporte de Compras por Clientes - " + fechaHoy + " .pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/Banner Venta.png");
            header.scaleToFit(550, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nRegistro de Ventas a Clientes \n \n ");
            parrafo.setFont(FontFactory.getFont("Arial", 18, java.awt.Font.BOLD, BaseColor.BLACK));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell(new Paragraph("Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Fecha de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Producto", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cantidad", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cliente", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Total del Folio de Venta", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select idVenta , FechaVenta, idProductos, NombreProducto, CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                        + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                        + "where idProductos = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta and Clientes_idClientes = idClientes and "
                        + "idClientes = '" + idCliente + "' ORDER BY idVenta ASC");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {

                        tabla.addCell(rs.getString("idVenta"));
                        tabla.addCell(rs.getString("FechaVenta"));
                        tabla.addCell(rs.getString("idProductos") + " - " + rs.getString("NombreProducto"));
                        tabla.addCell(rs.getString("CantidadVendida"));
                        tabla.addCell(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
                        tabla.addCell(rs.getString("TotalVenta"));

                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.err.println("Error al Generar Lista de Compras por Clientes. " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente");

        } catch (DocumentException | HeadlessException | IOException e) {
            System.err.println("Error al generar el PDF. " + e);

        }
    }//GEN-LAST:event_ImprimirClieActionPerformed

    private void ImprimirTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirTodoActionPerformed

        Document documento = new Document();
        java.util.Date date = new java.util.Date();
        long d = date.getTime();
        java.sql.Date fechaHoy = new java.sql.Date(d);
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, new FileOutputStream(ruta + "/Reportes/Taller Mecanico/Reporte de Ventas/"
                    + "Reporte de Ventas Global - " + fechaHoy + " .pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/Imagenes/Banner Venta.png");
            header.scaleToFit(550, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\nRegistro de Ventas a Clientes \n \n ");
            parrafo.setFont(FontFactory.getFont("Arial", 18, java.awt.Font.BOLD, BaseColor.BLACK));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell(new Paragraph("Folio de Compra", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Fecha de Compra", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Producto", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Cantidad", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Proveedor", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));
            tabla.addCell(new Paragraph("Total del Folio de Compra", FontFactory.getFont("Arial", 12, java.awt.Font.BOLD)));

            try {
                Connection cn = Conexion.conectar();
                 PreparedStatement pst = cn.prepareStatement("select idVenta, FechaVenta, idProductos, NombreProducto, "
                    + "CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where idProductos = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta and Clientes_idClientes = idClientes "
                    + "ORDER BY idVenta ASC");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {

                        tabla.addCell(rs.getString("idVenta"));
                        tabla.addCell(rs.getString("FechaVenta"));
                        tabla.addCell(rs.getString("idProductos") + " - " + rs.getString("NombreProducto"));
                        tabla.addCell(rs.getString("CantidadVendida"));
                        tabla.addCell(rs.getString("NombreC") + " " + rs.getString("APaternoC") + " " + rs.getString("AMaternoC"));
                        tabla.addCell(rs.getString("TotalVenta"));

                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (SQLException e) {
                System.err.println("Error al generar lista de compras a Proveedores. " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF creado correctamente");

        } catch (DocumentException | HeadlessException | IOException e) {
            System.err.println("Error al generar el PDF. " + e);

        }

    }//GEN-LAST:event_ImprimirTodoActionPerformed

    public void actualizarTabla() {

        model.setRowCount(0);
        Object[] fila = new Object[6];
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idVenta, FechaVenta, idProductos, NombreProducto, "
                    + "CantidadVendida, NombreC, APaternoC, AMaternoC, TotalVenta "
                    + "from venta, productos, clientes, detalleventa, clientes_has_venta "
                    + "where idProductos = idProductoDV and Venta_idVentas = idVenta and idVenta = Venta_idVenta and Clientes_idClientes = idClientes "
                    + "ORDER BY idVenta ASC");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                fila[0] = rs.getObject(1);
                fila[1] = rs.getObject(2);
                fila[2] = rs.getObject(3) + " - " + rs.getObject(4);
                fila[3] = rs.getObject(5);
                fila[4] = rs.getObject(6) + " " + rs.getObject(7) + " " + rs.getObject(8);
                fila[5] = rs.getObject(9);
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla. " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información, Contacte al Administrador");
        }
    }

    public void consultarIDProducto() {
        String producto;

        producto = cmbProductos.getSelectedItem().toString();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select idProductos from productos where NombreProducto = '" + producto + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                idProducto = rs.getInt("idProductos");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar datos: ID Productos " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }

    public void consultarImporteVenta() {
        String importes;

        importes = cmbImportes.getSelectedItem().toString();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select TotalVenta from venta where TotalVenta = '" + importes + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                importe = rs.getString("TotalVenta");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error en cargar datos: Importe de Ventas " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar, contacte al administrador");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaCompraFin;
    private com.toedter.calendar.JDateChooser FechaCompraIn;
    private javax.swing.JButton ImprimirClie;
    private javax.swing.JButton ImprimirFec;
    private javax.swing.JButton ImprimirImpor;
    private javax.swing.JButton ImprimirProd;
    private javax.swing.JButton ImprimirTodo;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblFecha1;
    private javax.swing.JLabel LblFecha2;
    private javax.swing.JLabel LblFecha3;
    private javax.swing.JLabel LblFecha4;
    private javax.swing.JButton btnBuscarClie;
    private javax.swing.JButton btnBuscarFec;
    private javax.swing.JButton btnBuscarImporte;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JComboBox<String> cmbImportes;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_ventas;
    // End of variables declaration//GEN-END:variables
}
