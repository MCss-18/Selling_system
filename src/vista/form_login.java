package vista;
import java.awt.Image;
import javax.swing.ImageIcon;
public class form_login extends javax.swing.JFrame {

    public form_login() {
        initComponents();
        
        Image icon=new ImageIcon(this.getClass().getResource("/img/pc_master_race_logo2.png")).getImage();
        this.setIconImage(icon);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TXTnombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTiniciarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TXTclaveUsuario = new javax.swing.JPasswordField();
        LBclaveIncorrecta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 32, 32));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });

        TXTnombreUsuario.setBackground(new java.awt.Color(32, 32, 32));
        TXTnombreUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TXTnombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombreUsuario.setActionCommand("<Not Set>");
        TXTnombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166, 163, 160)));
        TXTnombreUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        TXTnombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTnombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXTnombreUsuarioMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");

        BTiniciarSesion.setBackground(new java.awt.Color(0, 116, 228));
        BTiniciarSesion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BTiniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTiniciarSesion.setText("Iniciar sesion");
        BTiniciarSesion.setBorder(null);
        BTiniciarSesion.setFocusPainted(false);
        BTiniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTiniciarSesionMouseEntered(evt);
            }
        });
        BTiniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTiniciarSesionActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pc_master_race_logo.png"))); // NOI18N

        TXTclaveUsuario.setBackground(new java.awt.Color(32, 32, 32));
        TXTclaveUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TXTclaveUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TXTclaveUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 129, 143)));
        TXTclaveUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXTclaveUsuarioMouseEntered(evt);
            }
        });

        LBclaveIncorrecta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        LBclaveIncorrecta.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(TXTnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTclaveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(LBclaveIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(BTiniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTnombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTclaveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBclaveIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BTiniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 390, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTiniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTiniciarSesionMouseEntered
        BTiniciarSesion.setBackground(new java.awt.Color(40, 138, 232));
    }//GEN-LAST:event_BTiniciarSesionMouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        BTiniciarSesion.setBackground(new java.awt.Color(0, 116, 228));
        TXTclaveUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166,163,160)));
        TXTnombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166,163,160)));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void TXTclaveUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTclaveUsuarioMouseEntered
        TXTclaveUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 116, 228)));
        
    }//GEN-LAST:event_TXTclaveUsuarioMouseEntered

    private void TXTnombreUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTnombreUsuarioMouseEntered
        TXTnombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 116, 228)));
    }//GEN-LAST:event_TXTnombreUsuarioMouseEntered

    private void BTiniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTiniciarSesionActionPerformed

//        if(this.TXTnombreUsuario.getText().equals("HOLAMUNDO") && this.TXTclaveUsuario.getText().equals("HOLAMUNDO")){
//            this.setVisible(false);
//            form_main_admin mainAdmin=new form_main_admin();
//            mainAdmin.LBnombreUsuario.setText("HOLAMUNDO"); 
//            mainAdmin.setVisible(true);
//            this.LBclaveIncorrecta.setText(""); 
//        }else{
//            this.LBclaveIncorrecta.setText("Contraseña incorrecta"); 
//            
//        }
    }//GEN-LAST:event_BTiniciarSesionActionPerformed
        
    
    
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
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTiniciarSesion;
    public javax.swing.JLabel LBclaveIncorrecta;
    public javax.swing.JPasswordField TXTclaveUsuario;
    public javax.swing.JTextField TXTnombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
