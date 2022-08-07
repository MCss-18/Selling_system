package vista;

import javax.swing.JPanel;

public class form_registroClientesEmpresa extends javax.swing.JFrame {

    public form_registroClientesEmpresa() {
        initComponents();
    }

    public JPanel getFondo(){
        return JPregistroClientesEmpresa;
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPregistroClientesEmpresa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTnuevoClienteE = new javax.swing.JButton();
        BTguardar = new javax.swing.JButton();
        BTactualizar = new javax.swing.JButton();
        BTlimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLclientesEmpresa = new javax.swing.JTable();
        TXTcod_clienteEmpresa = new javax.swing.JTextField();
        TXTnombres = new javax.swing.JTextField();
        TXTdireccionCliente = new javax.swing.JTextField();
        TXTrucEmpresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPregistroClientesEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        JPregistroClientesEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPregistroClientesEmpresaMouseEntered(evt);
            }
        });
        JPregistroClientesEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE CLIENTES EMPRESA");
        JPregistroClientesEmpresa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 60));

        BTnuevoClienteE.setBackground(new java.awt.Color(18, 22, 31));
        BTnuevoClienteE.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTnuevoClienteE.setForeground(new java.awt.Color(255, 255, 255));
        BTnuevoClienteE.setText("NUEVO CLIENTE");
        BTnuevoClienteE.setBorder(null);
        BTnuevoClienteE.setFocusPainted(false);
        BTnuevoClienteE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTnuevoClienteEMouseEntered(evt);
            }
        });
        JPregistroClientesEmpresa.add(BTnuevoClienteE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 134, 46));

        BTguardar.setBackground(new java.awt.Color(18, 22, 31));
        BTguardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTguardar.setForeground(new java.awt.Color(255, 255, 255));
        BTguardar.setText("GUARDAR");
        BTguardar.setBorder(null);
        BTguardar.setFocusPainted(false);
        BTguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTguardarMouseEntered(evt);
            }
        });
        JPregistroClientesEmpresa.add(BTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 134, 46));

        BTactualizar.setBackground(new java.awt.Color(18, 22, 31));
        BTactualizar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTactualizar.setForeground(new java.awt.Color(255, 255, 255));
        BTactualizar.setText("ACTUALIZAR");
        BTactualizar.setBorder(null);
        BTactualizar.setFocusPainted(false);
        BTactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTactualizarMouseEntered(evt);
            }
        });
        JPregistroClientesEmpresa.add(BTactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 134, 46));

        BTlimpiar.setBackground(new java.awt.Color(18, 22, 31));
        BTlimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        BTlimpiar.setText("LIMPIAR");
        BTlimpiar.setBorder(null);
        BTlimpiar.setFocusPainted(false);
        BTlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTlimpiarMouseEntered(evt);
            }
        });
        JPregistroClientesEmpresa.add(BTlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 134, 46));
        JPregistroClientesEmpresa.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 960, 10));

        TBLclientesEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        TBLclientesEmpresa.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLclientesEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        TBLclientesEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD_CLIENTE", "NOMBRE EMPRESA", "RUC", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLclientesEmpresa.setGridColor(new java.awt.Color(21, 25, 34));
        TBLclientesEmpresa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLclientesEmpresa);

        JPregistroClientesEmpresa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 720, 410));

        TXTcod_clienteEmpresa.setEditable(false);
        TXTcod_clienteEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        TXTcod_clienteEmpresa.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTcod_clienteEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        TXTcod_clienteEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COD_CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientesEmpresa.add(TXTcod_clienteEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 190, 50));

        TXTnombres.setEditable(false);
        TXTnombres.setBackground(new java.awt.Color(18, 22, 31));
        TXTnombres.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTnombres.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE EMPRESA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientesEmpresa.add(TXTnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 190, 50));

        TXTdireccionCliente.setEditable(false);
        TXTdireccionCliente.setBackground(new java.awt.Color(18, 22, 31));
        TXTdireccionCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTdireccionCliente.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientesEmpresa.add(TXTdireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 190, 50));

        TXTrucEmpresa.setEditable(false);
        TXTrucEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        TXTrucEmpresa.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTrucEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        TXTrucEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientesEmpresa.add(TXTrucEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPregistroClientesEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPregistroClientesEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTnuevoClienteEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTnuevoClienteEMouseEntered
        BTnuevoClienteE.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTnuevoClienteEMouseEntered

    private void BTguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTguardarMouseEntered
        BTguardar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTguardarMouseEntered

    private void BTlimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTlimpiarMouseEntered
        BTlimpiar.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTlimpiarMouseEntered

    private void JPregistroClientesEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPregistroClientesEmpresaMouseEntered
        BTnuevoClienteE.setBackground(new java.awt.Color(18,22,31));
        BTguardar.setBackground(new java.awt.Color(18,22,31));
        BTactualizar.setBackground(new java.awt.Color(18,22,31));
        BTlimpiar.setBackground(new java.awt.Color(18,22,31));
    }//GEN-LAST:event_JPregistroClientesEmpresaMouseEntered

    private void BTactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTactualizarMouseEntered
        BTactualizar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTactualizarMouseEntered

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in JBTnuevoClienteEt available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(form_registroClientesEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_registroClientesEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_registroClientesEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_registroClientesEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_registroClientesEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTactualizar;
    public javax.swing.JButton BTguardar;
    public javax.swing.JButton BTlimpiar;
    public javax.swing.JButton BTnuevoClienteE;
    private javax.swing.JPanel JPregistroClientesEmpresa;
    public javax.swing.JTable TBLclientesEmpresa;
    public javax.swing.JTextField TXTcod_clienteEmpresa;
    public javax.swing.JTextField TXTdireccionCliente;
    public javax.swing.JTextField TXTnombres;
    public javax.swing.JTextField TXTrucEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
