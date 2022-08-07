package vista;

import javax.swing.JPanel;

public class form_registroClientes extends javax.swing.JFrame {

    public form_registroClientes() {
        initComponents();
    }
    
    public JPanel getFondo(){
        return JPregistroClientes;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPregistroClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTnuevocliente = new javax.swing.JButton();
        BTguardar = new javax.swing.JButton();
        BTactualizar = new javax.swing.JButton();
        BTlimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLclientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex){
                return false;
            }
        };
        TXTcod_cliente = new javax.swing.JTextField();
        TXTnombres = new javax.swing.JTextField();
        TXTdireccionCliente = new javax.swing.JTextField();
        TXTapellido = new javax.swing.JTextField();
        CBtipoDocCliente = new javax.swing.JComboBox<>();
        TXTdocCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPregistroClientes.setBackground(new java.awt.Color(18, 22, 31));
        JPregistroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPregistroClientesMouseEntered(evt);
            }
        });
        JPregistroClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE CLIENTES");
        JPregistroClientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 60));

        BTnuevocliente.setBackground(new java.awt.Color(18, 22, 31));
        BTnuevocliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTnuevocliente.setForeground(new java.awt.Color(255, 255, 255));
        BTnuevocliente.setText("NUEVO CLIENTE");
        BTnuevocliente.setBorder(null);
        BTnuevocliente.setFocusPainted(false);
        BTnuevocliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTnuevoclienteMouseEntered(evt);
            }
        });
        JPregistroClientes.add(BTnuevocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 134, 46));

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
        JPregistroClientes.add(BTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 134, 46));

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
        JPregistroClientes.add(BTactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 134, 46));

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
        JPregistroClientes.add(BTlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 134, 46));
        JPregistroClientes.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 960, 10));

        TBLclientes.setBackground(new java.awt.Color(18, 22, 31));
        TBLclientes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLclientes.setForeground(new java.awt.Color(255, 255, 255));
        TBLclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD_CLIENTE", "NOMBRES", "APELLIDO", "TIPO DE DOCUMENTO", "DOCUMENTO", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLclientes.setGridColor(new java.awt.Color(21, 25, 34));
        TBLclientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLclientes);

        JPregistroClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 720, 410));

        TXTcod_cliente.setEditable(false);
        TXTcod_cliente.setBackground(new java.awt.Color(18, 22, 31));
        TXTcod_cliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTcod_cliente.setForeground(new java.awt.Color(255, 255, 255));
        TXTcod_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COD_CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientes.add(TXTcod_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 190, 50));

        TXTnombres.setEditable(false);
        TXTnombres.setBackground(new java.awt.Color(18, 22, 31));
        TXTnombres.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTnombres.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientes.add(TXTnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 190, 50));

        TXTdireccionCliente.setEditable(false);
        TXTdireccionCliente.setBackground(new java.awt.Color(18, 22, 31));
        TXTdireccionCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTdireccionCliente.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccionCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientes.add(TXTdireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 190, 50));

        TXTapellido.setEditable(false);
        TXTapellido.setBackground(new java.awt.Color(18, 22, 31));
        TXTapellido.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTapellido.setForeground(new java.awt.Color(255, 255, 255));
        TXTapellido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientes.add(TXTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 190, 50));

        CBtipoDocCliente.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoDocCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoDocCliente.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoDocCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE" }));
        CBtipoDocCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DOCUMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPregistroClientes.add(CBtipoDocCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 190, 50));

        TXTdocCliente.setEditable(false);
        TXTdocCliente.setBackground(new java.awt.Color(18, 22, 31));
        TXTdocCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTdocCliente.setForeground(new java.awt.Color(255, 255, 255));
        TXTdocCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DOCUMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroClientes.add(TXTdocCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 190, 50));

        getContentPane().add(JPregistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTnuevoclienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTnuevoclienteMouseEntered
        BTnuevocliente.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTnuevoclienteMouseEntered

    private void BTguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTguardarMouseEntered
        BTguardar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTguardarMouseEntered

    private void BTactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTactualizarMouseEntered
        BTactualizar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTactualizarMouseEntered

    private void BTlimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTlimpiarMouseEntered
        BTlimpiar.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTlimpiarMouseEntered

    private void JPregistroClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPregistroClientesMouseEntered
        BTnuevocliente.setBackground(new java.awt.Color(18,22,31));
        BTguardar.setBackground(new java.awt.Color(18,22,31));
        BTactualizar.setBackground(new java.awt.Color(18,22,31));
        BTlimpiar.setBackground(new java.awt.Color(18,22,31));
    }//GEN-LAST:event_JPregistroClientesMouseEntered

    
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
            java.util.logging.Logger.getLogger(form_registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_registroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_registroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTactualizar;
    public javax.swing.JButton BTguardar;
    public javax.swing.JButton BTlimpiar;
    public javax.swing.JButton BTnuevocliente;
    public javax.swing.JComboBox<String> CBtipoDocCliente;
    private javax.swing.JPanel JPregistroClientes;
    public javax.swing.JTable TBLclientes;
    public javax.swing.JTextField TXTapellido;
    public javax.swing.JTextField TXTcod_cliente;
    public javax.swing.JTextField TXTdireccionCliente;
    public javax.swing.JTextField TXTdocCliente;
    public javax.swing.JTextField TXTnombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
