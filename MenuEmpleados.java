package Interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MenuEmpleados extends javax.swing.JFrame {

    public MenuEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menú");
        this.setSize(800, 600);
        this.setResizable(false);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Taller P.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo Menú.jpg"));
        Image img = icon.getImage();
        DPEscritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(), this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivos = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();
        MenuProductos = new javax.swing.JMenu();
        MNuevoProd = new javax.swing.JMenuItem();
        MExistenciasProd = new javax.swing.JMenuItem();
        MCategorias = new javax.swing.JMenuItem();
        MEstatusProd = new javax.swing.JMenuItem();
        MUDM = new javax.swing.JMenuItem();
        MenuAutos = new javax.swing.JMenu();
        AutosC = new javax.swing.JMenuItem();
        Modelos = new javax.swing.JMenuItem();
        Marcas = new javax.swing.JMenuItem();
        MAutos_Clientes = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        Clientes = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        NuevaVenta = new javax.swing.JMenuItem();
        MenuCreditos = new javax.swing.JMenu();
        MDeudasCl = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DPEscritorio.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout DPEscritorioLayout = new javax.swing.GroupLayout(DPEscritorio);
        DPEscritorio.setLayout(DPEscritorioLayout);
        DPEscritorioLayout.setHorizontalGroup(
            DPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        DPEscritorioLayout.setVerticalGroup(
            DPEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        getContentPane().add(DPEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MenuArchivos.setText("Archivo");

        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        MenuArchivos.add(CerrarSesion);

        jMenuBar1.add(MenuArchivos);

        MenuProductos.setText("Productos");

        MNuevoProd.setText("Nuevo Producto");
        MNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNuevoProdActionPerformed(evt);
            }
        });
        MenuProductos.add(MNuevoProd);

        MExistenciasProd.setText("Existencias de Productos");
        MExistenciasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MExistenciasProdActionPerformed(evt);
            }
        });
        MenuProductos.add(MExistenciasProd);

        MCategorias.setText("Categorias");
        MCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCategoriasActionPerformed(evt);
            }
        });
        MenuProductos.add(MCategorias);

        MEstatusProd.setText("Estatus de los Productos");
        MEstatusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEstatusProdActionPerformed(evt);
            }
        });
        MenuProductos.add(MEstatusProd);

        MUDM.setText("Unidades de Medida");
        MUDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUDMActionPerformed(evt);
            }
        });
        MenuProductos.add(MUDM);

        jMenuBar1.add(MenuProductos);

        MenuAutos.setText("Autos");

        AutosC.setText("Autos");
        AutosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutosCActionPerformed(evt);
            }
        });
        MenuAutos.add(AutosC);

        Modelos.setText("Modelos");
        Modelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelosActionPerformed(evt);
            }
        });
        MenuAutos.add(Modelos);

        Marcas.setText("Marcas");
        Marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcasActionPerformed(evt);
            }
        });
        MenuAutos.add(Marcas);

        MAutos_Clientes.setText("Autos - Clientes");
        MAutos_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAutos_ClientesActionPerformed(evt);
            }
        });
        MenuAutos.add(MAutos_Clientes);

        jMenuBar1.add(MenuAutos);

        MenuClientes.setText("Clientes");

        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(Clientes);

        jMenuBar1.add(MenuClientes);

        MenuVentas.setText("Ventas");

        NuevaVenta.setText("Nueva Venta");
        NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVentaActionPerformed(evt);
            }
        });
        MenuVentas.add(NuevaVenta);

        jMenuBar1.add(MenuVentas);

        MenuCreditos.setText("Creditos");

        MDeudasCl.setText("Deudas de Clientes");
        MDeudasCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDeudasClActionPerformed(evt);
            }
        });
        MenuCreditos.add(MDeudasCl);

        jMenuBar1.add(MenuCreditos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNuevoProdActionPerformed
       JINuevoProducto JINP = new JINuevoProducto();
        DPEscritorio.add(JINP);
        JINP.show();
    }//GEN-LAST:event_MNuevoProdActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void MExistenciasProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MExistenciasProdActionPerformed
        JIExistencias JIE = new JIExistencias();
        DPEscritorio.add(JIE);
        JIE.show();
    }//GEN-LAST:event_MExistenciasProdActionPerformed

    private void AutosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutosCActionPerformed
        JIAutos JIA = new JIAutos();
        DPEscritorio.add(JIA);
        JIA.show();
    }//GEN-LAST:event_AutosCActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        JIClientes JIC = new JIClientes();
        DPEscritorio.add(JIC);
        JIC.show();
    }//GEN-LAST:event_ClientesActionPerformed

    private void MDeudasClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDeudasClActionPerformed
       JIDeudas JIDe = new JIDeudas();
       DPEscritorio.add(JIDe);
       JIDe.show();
    }//GEN-LAST:event_MDeudasClActionPerformed

    private void MarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcasActionPerformed
        JIMarca JIM = new JIMarca();
        DPEscritorio.add(JIM);
        JIM.show();
    }//GEN-LAST:event_MarcasActionPerformed

    private void ModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelosActionPerformed
        JIModelos JIMO = new JIModelos();
        DPEscritorio.add(JIMO);
        JIMO.show();
    }//GEN-LAST:event_ModelosActionPerformed

    private void MEstatusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEstatusProdActionPerformed
        JIEstatusProducto JIEP = new JIEstatusProducto();
        DPEscritorio.add(JIEP);
        JIEP.show();
    }//GEN-LAST:event_MEstatusProdActionPerformed

    private void MUDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUDMActionPerformed
        JIUnidadesDeMedida JIUDM = new JIUnidadesDeMedida();
        DPEscritorio.add(JIUDM);
        JIUDM.show();
    }//GEN-LAST:event_MUDMActionPerformed

    private void NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVentaActionPerformed
        JINuevaVenta JINV = new JINuevaVenta();
        DPEscritorio.add(JINV);
        JINV.show();
    }//GEN-LAST:event_NuevaVentaActionPerformed

    private void MAutos_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAutos_ClientesActionPerformed
        JIAutosClientes JIAC = new JIAutosClientes();
        DPEscritorio.add(JIAC);
        JIAC.show();
    }//GEN-LAST:event_MAutos_ClientesActionPerformed

    private void MCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCategoriasActionPerformed
        JICategorias JICA = new JICategorias();
        DPEscritorio.add(JICA);
        JICA.show();
    }//GEN-LAST:event_MCategoriasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AutosC;
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JMenuItem Clientes;
    private javax.swing.JDesktopPane DPEscritorio;
    private javax.swing.JMenuItem MAutos_Clientes;
    private javax.swing.JMenuItem MCategorias;
    private javax.swing.JMenuItem MDeudasCl;
    private javax.swing.JMenuItem MEstatusProd;
    private javax.swing.JMenuItem MExistenciasProd;
    private javax.swing.JMenuItem MNuevoProd;
    private javax.swing.JMenuItem MUDM;
    private javax.swing.JMenuItem Marcas;
    private javax.swing.JMenu MenuArchivos;
    private javax.swing.JMenu MenuAutos;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuCreditos;
    private javax.swing.JMenu MenuProductos;
    private javax.swing.JMenu MenuVentas;
    private javax.swing.JMenuItem Modelos;
    private javax.swing.JMenuItem NuevaVenta;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
