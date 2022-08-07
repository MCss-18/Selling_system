package vista;
//Librerias
import javax.swing.JPanel;

public class form_registroUsuario extends javax.swing.JFrame {
//   CONSTRUCTOR
    public form_registroUsuario() {
        initComponents();

    }
    
    public JPanel getFondo(){
        return JPcrearusuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPcrearusuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLusuarios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex){
                return false;
            }
        };
        BTnuevoUsuario = new javax.swing.JButton();
        CBestado = new javax.swing.JComboBox<>();
        TXTcodUsuario = new javax.swing.JTextField();
        CBrol = new javax.swing.JComboBox<>();
        TXTclaveUsuario = new javax.swing.JTextField();
        TXTnombre = new javax.swing.JTextField();
        TXTnombreUsuario = new javax.swing.JTextField();
        BTlimpiar = new javax.swing.JButton();
        BTguardarUsuario = new javax.swing.JButton();
        BTactualizarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPcrearusuario.setBackground(new java.awt.Color(18, 22, 31));
        JPcrearusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPcrearusuarioMouseEntered(evt);
            }
        });
        JPcrearusuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE USUARIO");
        JPcrearusuario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 60));

        TBLusuarios.setBackground(new java.awt.Color(18, 22, 31));
        TBLusuarios.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLusuarios.setForeground(new java.awt.Color(255, 255, 255));
        TBLusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD_USUARIO", "NOMBRE", "NOMBRE_USUARIO", "CLAVE_USUARIO", "ROL_USUARIO", "ESTADO_USURIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLusuarios.setGridColor(new java.awt.Color(21, 25, 34));
        TBLusuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLusuarios);

        JPcrearusuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 950, 320));

        BTnuevoUsuario.setBackground(new java.awt.Color(18, 22, 31));
        BTnuevoUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTnuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BTnuevoUsuario.setText("NUEVO USUARIO");
        BTnuevoUsuario.setBorder(null);
        BTnuevoUsuario.setFocusPainted(false);
        BTnuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTnuevoUsuarioMouseEntered(evt);
            }
        });
        JPcrearusuario.add(BTnuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 140, 50));

        CBestado.setBackground(new java.awt.Color(21, 112, 144));
        CBestado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBestado.setForeground(new java.awt.Color(0, 0, 0));
        CBestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));
        CBestado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPcrearusuario.add(CBestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 220, 60));

        TXTcodUsuario.setEditable(false);
        TXTcodUsuario.setBackground(new java.awt.Color(18, 22, 31));
        TXTcodUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TXTcodUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TXTcodUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COD_USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        JPcrearusuario.add(TXTcodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 60));

        CBrol.setBackground(new java.awt.Color(255, 100, 85));
        CBrol.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBrol.setForeground(new java.awt.Color(0, 0, 0));
        CBrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "VENDEDOR" }));
        CBrol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ROL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPcrearusuario.add(CBrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 220, 60));

        TXTclaveUsuario.setBackground(new java.awt.Color(18, 22, 31));
        TXTclaveUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TXTclaveUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TXTclaveUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLAVE USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPcrearusuario.add(TXTclaveUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 220, 60));

        TXTnombre.setBackground(new java.awt.Color(18, 22, 31));
        TXTnombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TXTnombre.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPcrearusuario.add(TXTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 60));

        TXTnombreUsuario.setBackground(new java.awt.Color(18, 22, 31));
        TXTnombreUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TXTnombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombreUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPcrearusuario.add(TXTnombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, 60));

        BTlimpiar.setBackground(new java.awt.Color(18, 22, 31));
        BTlimpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BTlimpiar.setText("LIMPIAR");
        BTlimpiar.setBorder(null);
        BTlimpiar.setFocusPainted(false);
        BTlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTlimpiarMouseEntered(evt);
            }
        });
        JPcrearusuario.add(BTlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 140, 50));

        BTguardarUsuario.setBackground(new java.awt.Color(18, 22, 31));
        BTguardarUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTguardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BTguardarUsuario.setText("GUARDAR USUARIO");
        BTguardarUsuario.setBorder(null);
        BTguardarUsuario.setFocusPainted(false);
        BTguardarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTguardarUsuarioMouseEntered(evt);
            }
        });
        JPcrearusuario.add(BTguardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 140, 50));

        BTactualizarUsuario.setBackground(new java.awt.Color(18, 22, 31));
        BTactualizarUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BTactualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BTactualizarUsuario.setText("ACTUALIZAR");
        BTactualizarUsuario.setBorder(null);
        BTactualizarUsuario.setFocusPainted(false);
        BTactualizarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTactualizarUsuarioMouseEntered(evt);
            }
        });
        JPcrearusuario.add(BTactualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 140, 50));

        getContentPane().add(JPcrearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


//  FUNCIONES(BOTONES, JPANLES, TEXT AREA, COMBO BOX)    
    private void BTlimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTlimpiarMouseEntered
        BTlimpiar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTlimpiarMouseEntered

    private void JPcrearusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPcrearusuarioMouseEntered
        BTlimpiar.setBackground(new java.awt.Color(18,22,31));
        BTnuevoUsuario.setBackground(new java.awt.Color(18,22,31));
        BTguardarUsuario.setBackground(new java.awt.Color(18,22,31));
        BTactualizarUsuario.setBackground(new java.awt.Color(18,22,31));
    }//GEN-LAST:event_JPcrearusuarioMouseEntered

    private void BTnuevoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTnuevoUsuarioMouseEntered
        BTnuevoUsuario.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTnuevoUsuarioMouseEntered

    private void BTguardarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTguardarUsuarioMouseEntered
        BTguardarUsuario.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTguardarUsuarioMouseEntered

    private void BTactualizarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTactualizarUsuarioMouseEntered
        BTactualizarUsuario.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTactualizarUsuarioMouseEntered

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
            java.util.logging.Logger.getLogger(form_registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_registroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_registroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTactualizarUsuario;
    public javax.swing.JButton BTguardarUsuario;
    public javax.swing.JButton BTlimpiar;
    public javax.swing.JButton BTnuevoUsuario;
    public javax.swing.JComboBox<String> CBestado;
    public javax.swing.JComboBox<String> CBrol;
    private javax.swing.JPanel JPcrearusuario;
    public javax.swing.JTable TBLusuarios;
    public javax.swing.JTextField TXTclaveUsuario;
    public javax.swing.JTextField TXTcodUsuario;
    public javax.swing.JTextField TXTnombre;
    public javax.swing.JTextField TXTnombreUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
