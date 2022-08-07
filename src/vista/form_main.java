package vista;
//LIBRERIAS
//        PANELS REDONDOS
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class form_main extends javax.swing.JFrame {

    public form_main() {
        initComponents();
        
        Image icon=new ImageIcon(this.getClass().getResource("/img/pc_master_race_logo2.png")).getImage();
        this.setIconImage(icon);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPmenuL = new RoundedPanel(20,new java.awt.Color(18, 22, 31));
        ;
        BTemitirFactura = new javax.swing.JButton();
        BTconsultaBoletas = new javax.swing.JButton();
        BTconsultaProductos = new javax.swing.JButton();
        BTconsultaFacturas = new javax.swing.JButton();
        BTregistroProductos = new javax.swing.JButton();
        BTregistroUsuario = new javax.swing.JButton();
        BTemitirBoleta = new javax.swing.JButton();
        BTregistroClientes = new javax.swing.JButton();
        BTregistroClientesEmpresa = new javax.swing.JButton();
        JPnameUser = new RoundedPanel(20,new java.awt.Color(18, 22, 31));
        LBnombreUsuario = new javax.swing.JLabel();
        LBrolUsuario = new javax.swing.JLabel();
        BTsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LBcodUsuario = new javax.swing.JLabel();
        JPcontenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PC MASTER");
        setBackground(new java.awt.Color(46, 52, 66));
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(46, 52, 66));
        jPanel1.setForeground(new java.awt.Color(125, 126, 98));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPmenuL.setBackground(new java.awt.Color(46, 52, 66));
        JPmenuL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPmenuLMouseEntered(evt);
            }
        });

        BTemitirFactura.setBackground(new java.awt.Color(18, 22, 31));
        BTemitirFactura.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTemitirFactura.setForeground(new java.awt.Color(255, 255, 255));
        BTemitirFactura.setText("EMITIR FACTURA");
        BTemitirFactura.setBorder(null);
        BTemitirFactura.setBorderPainted(false);
        BTemitirFactura.setFocusPainted(false);
        BTemitirFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTemitirFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTemitirFacturaMouseEntered(evt);
            }
        });

        BTconsultaBoletas.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaBoletas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTconsultaBoletas.setForeground(new java.awt.Color(255, 255, 255));
        BTconsultaBoletas.setText("CONSULTAS DE BOLETAS");
        BTconsultaBoletas.setBorder(null);
        BTconsultaBoletas.setFocusPainted(false);
        BTconsultaBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTconsultaBoletasMouseEntered(evt);
            }
        });

        BTconsultaProductos.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaProductos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTconsultaProductos.setForeground(new java.awt.Color(255, 255, 255));
        BTconsultaProductos.setText("CONSULTA DE PRODUCTOS");
        BTconsultaProductos.setBorder(null);
        BTconsultaProductos.setFocusPainted(false);
        BTconsultaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTconsultaProductosMouseEntered(evt);
            }
        });

        BTconsultaFacturas.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaFacturas.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTconsultaFacturas.setForeground(new java.awt.Color(255, 255, 255));
        BTconsultaFacturas.setText("CONSULTA DE FACTURAS");
        BTconsultaFacturas.setBorder(null);
        BTconsultaFacturas.setFocusPainted(false);
        BTconsultaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTconsultaFacturasMouseEntered(evt);
            }
        });

        BTregistroProductos.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroProductos.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTregistroProductos.setForeground(new java.awt.Color(255, 255, 255));
        BTregistroProductos.setText("REGISTRO DE PRODUCTOS");
        BTregistroProductos.setBorder(null);
        BTregistroProductos.setFocusPainted(false);
        BTregistroProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTregistroProductosMouseEntered(evt);
            }
        });

        BTregistroUsuario.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTregistroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BTregistroUsuario.setText("REGISTRO DE USUARIOS");
        BTregistroUsuario.setBorder(null);
        BTregistroUsuario.setFocusPainted(false);
        BTregistroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTregistroUsuarioMouseEntered(evt);
            }
        });

        BTemitirBoleta.setBackground(new java.awt.Color(18, 22, 31));
        BTemitirBoleta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTemitirBoleta.setForeground(new java.awt.Color(255, 255, 255));
        BTemitirBoleta.setText("EMITIR BOLETA");
        BTemitirBoleta.setBorder(null);
        BTemitirBoleta.setBorderPainted(false);
        BTemitirBoleta.setFocusPainted(false);
        BTemitirBoleta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTemitirBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTemitirBoletaMouseEntered(evt);
            }
        });

        BTregistroClientes.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroClientes.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTregistroClientes.setForeground(new java.awt.Color(255, 255, 255));
        BTregistroClientes.setText("REGISTRO DE CLIENTES");
        BTregistroClientes.setBorder(null);
        BTregistroClientes.setFocusPainted(false);
        BTregistroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTregistroClientesMouseEntered(evt);
            }
        });

        BTregistroClientesEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroClientesEmpresa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTregistroClientesEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        BTregistroClientesEmpresa.setText("REGISTRO DE CLIENTE EMPRESA");
        BTregistroClientesEmpresa.setBorder(null);
        BTregistroClientesEmpresa.setFocusPainted(false);
        BTregistroClientesEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTregistroClientesEmpresaMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout JPmenuLLayout = new javax.swing.GroupLayout(JPmenuL);
        JPmenuL.setLayout(JPmenuLLayout);
        JPmenuLLayout.setHorizontalGroup(
            JPmenuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPmenuLLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPmenuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTregistroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTregistroClientesEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPmenuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BTconsultaProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTregistroClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JPmenuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTconsultaBoletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTemitirFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTconsultaFacturas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(BTregistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTemitirBoleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        JPmenuLLayout.setVerticalGroup(
            JPmenuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPmenuLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTemitirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTemitirBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTconsultaBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTconsultaFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTconsultaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTregistroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTregistroClientesEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTregistroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTregistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(JPmenuL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 480));

        JPnameUser.setBackground(new java.awt.Color(46, 52, 66));
        JPnameUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPnameUserMouseEntered(evt);
            }
        });

        LBnombreUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        LBnombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LBnombreUsuario.setText("UserName");

        LBrolUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LBrolUsuario.setForeground(new java.awt.Color(255, 255, 255));

        BTsalir.setBackground(new java.awt.Color(18, 22, 31));
        BTsalir.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTsalir.setForeground(new java.awt.Color(255, 255, 255));
        BTsalir.setText("SALIR");
        BTsalir.setBorder(null);
        BTsalir.setBorderPainted(false);
        BTsalir.setFocusPainted(false);
        BTsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTsalirMouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prolife_icon.png"))); // NOI18N

        LBcodUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        LBcodUsuario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JPnameUserLayout = new javax.swing.GroupLayout(JPnameUser);
        JPnameUser.setLayout(JPnameUserLayout);
        JPnameUserLayout.setHorizontalGroup(
            JPnameUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnameUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPnameUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPnameUserLayout.createSequentialGroup()
                        .addComponent(LBrolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LBcodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPnameUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        JPnameUserLayout.setVerticalGroup(
            JPnameUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnameUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPnameUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPnameUserLayout.createSequentialGroup()
                        .addComponent(LBnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPnameUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBrolUsuario)
                            .addComponent(LBcodUsuario)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(JPnameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 140));

        JPcontenido.setBackground(new java.awt.Color(18, 22, 31));
        JPcontenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(JPcontenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 990, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    private void BTemitirFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTemitirFacturaMouseEntered
       BTemitirFactura.setBackground(new java.awt.Color(46,52,66));
       
    }//GEN-LAST:event_BTemitirFacturaMouseEntered

    private void BTconsultaBoletasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTconsultaBoletasMouseEntered
        BTconsultaBoletas.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTconsultaBoletasMouseEntered

    private void BTsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTsalirMouseEntered
        BTsalir.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTsalirMouseEntered

    private void JPmenuLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPmenuLMouseEntered
        BTemitirFactura.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaBoletas.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroClientes.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaFacturas.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroProductos.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroUsuario.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroClientesEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaProductos.setBackground(new java.awt.Color(18, 22, 31));
        BTemitirBoleta.setBackground(new java.awt.Color(18, 22, 31));
        
    }//GEN-LAST:event_JPmenuLMouseEntered

    private void JPnameUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPnameUserMouseEntered
        BTsalir.setBackground(new java.awt.Color(18, 22, 31));
        BTemitirFactura.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaBoletas.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroClientes.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaFacturas.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroProductos.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroUsuario.setBackground(new java.awt.Color(18, 22, 31));
        BTregistroClientesEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        BTconsultaProductos.setBackground(new java.awt.Color(18, 22, 31));
        BTemitirBoleta.setBackground(new java.awt.Color(18, 22, 31));
    }//GEN-LAST:event_JPnameUserMouseEntered

    private void BTregistroClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTregistroClientesMouseEntered
        BTregistroClientes.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTregistroClientesMouseEntered

    private void BTconsultaFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTconsultaFacturasMouseEntered
        BTconsultaFacturas.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTconsultaFacturasMouseEntered

    private void BTemitirBoletaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTemitirBoletaMouseEntered
        BTemitirBoleta.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTemitirBoletaMouseEntered

    private void BTconsultaProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTconsultaProductosMouseEntered
        BTconsultaProductos.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTconsultaProductosMouseEntered

    private void BTregistroUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTregistroUsuarioMouseEntered
        BTregistroUsuario.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTregistroUsuarioMouseEntered

    private void BTregistroProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTregistroProductosMouseEntered
        BTregistroProductos.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTregistroProductosMouseEntered

    private void BTregistroClientesEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTregistroClientesEmpresaMouseEntered
        BTregistroClientesEmpresa.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTregistroClientesEmpresaMouseEntered
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTconsultaBoletas;
    public javax.swing.JButton BTconsultaFacturas;
    public javax.swing.JButton BTconsultaProductos;
    public javax.swing.JButton BTemitirBoleta;
    public javax.swing.JButton BTemitirFactura;
    public javax.swing.JButton BTregistroClientes;
    public javax.swing.JButton BTregistroClientesEmpresa;
    public javax.swing.JButton BTregistroProductos;
    public javax.swing.JButton BTregistroUsuario;
    public javax.swing.JButton BTsalir;
    public javax.swing.JPanel JPcontenido;
    private javax.swing.JPanel JPmenuL;
    private javax.swing.JPanel JPnameUser;
    public javax.swing.JLabel LBcodUsuario;
    public javax.swing.JLabel LBnombreUsuario;
    public javax.swing.JLabel LBrolUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
}
