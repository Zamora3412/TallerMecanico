package Interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class MenuAdministrador extends javax.swing.JFrame {

    public MenuAdministrador() {
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
        NUsuario = new javax.swing.JMenuItem();
        MUsuario = new javax.swing.JMenuItem();
        MPermisos = new javax.swing.JMenuItem();
        MEstatus = new javax.swing.JMenuItem();
        MPuestos = new javax.swing.JMenuItem();
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
        MenuCompras = new javax.swing.JMenu();
        NuevaCompra = new javax.swing.JMenuItem();
        MRegistrosCompras = new javax.swing.JMenuItem();
        MenuVentas = new javax.swing.JMenu();
        NuevaVenta = new javax.swing.JMenuItem();
        RegistrosVentas = new javax.swing.JMenuItem();
        MenuProveedores = new javax.swing.JMenu();
        MProveedores = new javax.swing.JMenuItem();
        MCiudades = new javax.swing.JMenuItem();
        MEstados = new javax.swing.JMenuItem();
        MenuCreditos = new javax.swing.JMenu();
        MNVC = new javax.swing.JMenuItem();
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

        NUsuario.setText("Nuevo Usuario");
        NUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUsuarioActionPerformed(evt);
            }
        });
        MenuArchivos.add(NUsuario);

        MUsuario.setText("Gestión de Usuarios");
        MUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUsuarioActionPerformed(evt);
            }
        });
        MenuArchivos.add(MUsuario);

        MPermisos.setText("Permisos");
        MPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPermisosActionPerformed(evt);
            }
        });
        MenuArchivos.add(MPermisos);

        MEstatus.setText("Estatus");
        MEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEstatusActionPerformed(evt);
            }
        });
        MenuArchivos.add(MEstatus);

        MPuestos.setText("Puestos");
        MPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPuestosActionPerformed(evt);
            }
        });
        MenuArchivos.add(MPuestos);

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

        MenuCompras.setText("Compras");

        NuevaCompra.setText("Nueva Compra");
        NuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaCompraActionPerformed(evt);
            }
        });
        MenuCompras.add(NuevaCompra);

        MRegistrosCompras.setText("Historial de Compras");
        MRegistrosCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRegistrosComprasActionPerformed(evt);
            }
        });
        MenuCompras.add(MRegistrosCompras);

        jMenuBar1.add(MenuCompras);

        MenuVentas.setText("Ventas");

        NuevaVenta.setText("Nueva Venta");
        NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVentaActionPerformed(evt);
            }
        });
        MenuVentas.add(NuevaVenta);

        RegistrosVentas.setText("Historial de Ventas");
        RegistrosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosVentasActionPerformed(evt);
            }
        });
        MenuVentas.add(RegistrosVentas);

        jMenuBar1.add(MenuVentas);

        MenuProveedores.setText("Proveedores");

        MProveedores.setText("Proveedores");
        MProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MProveedoresActionPerformed(evt);
            }
        });
        MenuProveedores.add(MProveedores);

        MCiudades.setText("Ciudades");
        MCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCiudadesActionPerformed(evt);
            }
        });
        MenuProveedores.add(MCiudades);

        MEstados.setText("Estados");
        MEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEstadosActionPerformed(evt);
            }
        });
        MenuProveedores.add(MEstados);

        jMenuBar1.add(MenuProveedores);

        MenuCreditos.setText("Creditos");

        MNVC.setText("Niveles de Confianza");
        MNVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNVCActionPerformed(evt);
            }
        });
        MenuCreditos.add(MNVC);

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

    private void NUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUsuarioActionPerformed
       JINuevoUsuario NU = new JINuevoUsuario();
       DPEscritorio.add(NU);
       NU.show();
    }//GEN-LAST:event_NUsuarioActionPerformed

    private void MNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNuevoProdActionPerformed
       JINuevoProducto JINP = new JINuevoProducto();
        DPEscritorio.add(JINP);
        JINP.show();
    }//GEN-LAST:event_MNuevoProdActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void MUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUsuarioActionPerformed
        JIGestionUsuario JIGU = new JIGestionUsuario();
        DPEscritorio.add(JIGU);
        JIGU.show();
    }//GEN-LAST:event_MUsuarioActionPerformed

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

    private void MNVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNVCActionPerformed
        JINivelesCon JINCON = new JINivelesCon();
        DPEscritorio.add(JINCON);
        JINCON.show();
    }//GEN-LAST:event_MNVCActionPerformed

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

    private void MProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MProveedoresActionPerformed
        JIProveedores JIPro = new JIProveedores();
        DPEscritorio.add(JIPro);
        JIPro.show();
    }//GEN-LAST:event_MProveedoresActionPerformed

    private void MCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCategoriasActionPerformed
        JICategorias JICA = new JICategorias();
        DPEscritorio.add(JICA);
        JICA.show();
    }//GEN-LAST:event_MCategoriasActionPerformed

    private void MEstatusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEstatusProdActionPerformed
        JIEstatusProducto JIEP = new JIEstatusProducto();
        DPEscritorio.add(JIEP);
        JIEP.show();
    }//GEN-LAST:event_MEstatusProdActionPerformed

    private void MEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEstadosActionPerformed
        JIEstados JIEst = new JIEstados();
        DPEscritorio.add(JIEst);
        JIEst.show();
    }//GEN-LAST:event_MEstadosActionPerformed

    private void MCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCiudadesActionPerformed
        JICiudades JICi = new JICiudades();
        DPEscritorio.add(JICi);
        JICi.show();
    }//GEN-LAST:event_MCiudadesActionPerformed

    private void MPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPermisosActionPerformed
        JIPermisos JIPer = new JIPermisos();
        DPEscritorio.add(JIPer);
        JIPer.show();
    }//GEN-LAST:event_MPermisosActionPerformed

    private void MEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEstatusActionPerformed
        JIEstatus JIEstat = new JIEstatus();
        DPEscritorio.add(JIEstat);
        JIEstat.show();
    }//GEN-LAST:event_MEstatusActionPerformed

    private void MPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPuestosActionPerformed
        JIPuestos JIPues = new JIPuestos();
        DPEscritorio.add(JIPues);
        JIPues.show();
    }//GEN-LAST:event_MPuestosActionPerformed

    private void MUDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUDMActionPerformed
        JIUnidadesDeMedida JIUDM = new JIUnidadesDeMedida();
        DPEscritorio.add(JIUDM);
        JIUDM.show();
    }//GEN-LAST:event_MUDMActionPerformed

    private void RegistrosVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosVentasActionPerformed
        JIRegistrosVentas JIRV = new JIRegistrosVentas();
        DPEscritorio.add(JIRV);
        JIRV.show();
    }//GEN-LAST:event_RegistrosVentasActionPerformed

    private void NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVentaActionPerformed
        JINuevaVenta JINV = new JINuevaVenta();
        DPEscritorio.add(JINV);
        JINV.show();
    }//GEN-LAST:event_NuevaVentaActionPerformed

    private void NuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaCompraActionPerformed
        JINuevaCompra JINC = new JINuevaCompra();
        DPEscritorio.add(JINC);
        JINC.show();
    }//GEN-LAST:event_NuevaCompraActionPerformed

    private void MRegistrosComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRegistrosComprasActionPerformed
        JIRegistrosCompras JIRC = new JIRegistrosCompras();
        DPEscritorio.add(JIRC);
        JIRC.show();
    }//GEN-LAST:event_MRegistrosComprasActionPerformed

    private void MAutos_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAutos_ClientesActionPerformed
        JIAutosClientes JIAC = new JIAutosClientes();
        DPEscritorio.add(JIAC);
        JIAC.show();
    }//GEN-LAST:event_MAutos_ClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
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
    private javax.swing.JMenuItem MCiudades;
    private javax.swing.JMenuItem MDeudasCl;
    private javax.swing.JMenuItem MEstados;
    private javax.swing.JMenuItem MEstatus;
    private javax.swing.JMenuItem MEstatusProd;
    private javax.swing.JMenuItem MExistenciasProd;
    private javax.swing.JMenuItem MNVC;
    private javax.swing.JMenuItem MNuevoProd;
    private javax.swing.JMenuItem MPermisos;
    private javax.swing.JMenuItem MProveedores;
    private javax.swing.JMenuItem MPuestos;
    private javax.swing.JMenuItem MRegistrosCompras;
    private javax.swing.JMenuItem MUDM;
    private javax.swing.JMenuItem MUsuario;
    private javax.swing.JMenuItem Marcas;
    private javax.swing.JMenu MenuArchivos;
    private javax.swing.JMenu MenuAutos;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuCompras;
    private javax.swing.JMenu MenuCreditos;
    private javax.swing.JMenu MenuProductos;
    private javax.swing.JMenu MenuProveedores;
    private javax.swing.JMenu MenuVentas;
    private javax.swing.JMenuItem Modelos;
    private javax.swing.JMenuItem NUsuario;
    private javax.swing.JMenuItem NuevaCompra;
    private javax.swing.JMenuItem NuevaVenta;
    private javax.swing.JMenuItem RegistrosVentas;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
