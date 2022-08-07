package vista;

import javax.swing.JPanel;

public class form_ConsultasFacturas extends javax.swing.JFrame {

    public form_ConsultasFacturas() {
        initComponents();
    }
    public JPanel getFondo(){
        return JPregistroFacBol;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MIverDetalles = new javax.swing.JMenuItem();
        JPregistroFacBol = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBLregistroFacturas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex){
                return false;
            }
        };
        BTbuscarFactura = new javax.swing.JButton();
        CBtipoBusqueda = new javax.swing.JComboBox<>();
        TXTbuscador = new javax.swing.JTextField();
        BTmostrarTodo = new javax.swing.JButton();

        MIverDetalles.setText("Ver detalles");
        jPopupMenu1.add(MIverDetalles);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPregistroFacBol.setBackground(new java.awt.Color(18, 22, 31));
        JPregistroFacBol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPregistroFacBolMouseEntered(evt);
            }
        });
        JPregistroFacBol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTA DE FACTURAS");
        JPregistroFacBol.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 40));

        TBLregistroFacturas.setBackground(new java.awt.Color(18, 22, 31));
        TBLregistroFacturas.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLregistroFacturas.setForeground(new java.awt.Color(255, 255, 255));
        TBLregistroFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COD_FACTURA", "COD_CLIENTE", "USUARIO", "FECHA", "TIPO_MONEDA", "TIPO_PAGO", "SUBTOTAL", "I.G.V (18%)", "TOTAL", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLregistroFacturas.setToolTipText("");
        TBLregistroFacturas.setComponentPopupMenu(jPopupMenu1);
        TBLregistroFacturas.setGridColor(new java.awt.Color(21, 25, 34));
        TBLregistroFacturas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TBLregistroFacturas);

        JPregistroFacBol.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 950, 450));

        BTbuscarFactura.setBackground(new java.awt.Color(18, 22, 31));
        BTbuscarFactura.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTbuscarFactura.setForeground(new java.awt.Color(255, 255, 255));
        BTbuscarFactura.setText("BUSCAR");
        BTbuscarFactura.setBorder(null);
        BTbuscarFactura.setFocusPainted(false);
        BTbuscarFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTbuscarFacturaMouseEntered(evt);
            }
        });
        JPregistroFacBol.add(BTbuscarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 134, 46));

        CBtipoBusqueda.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoBusqueda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO FACTURA", "CODIGO CLIENTE", "FECHA" }));
        JPregistroFacBol.add(CBtipoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 60));

        TXTbuscador.setBackground(new java.awt.Color(18, 22, 31));
        TXTbuscador.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTbuscador.setForeground(new java.awt.Color(255, 255, 255));
        JPregistroFacBol.add(TXTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 290, 40));

        BTmostrarTodo.setBackground(new java.awt.Color(18, 22, 31));
        BTmostrarTodo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTmostrarTodo.setForeground(new java.awt.Color(255, 255, 255));
        BTmostrarTodo.setText("MOSTRAR TODO");
        BTmostrarTodo.setBorder(null);
        BTmostrarTodo.setFocusPainted(false);
        BTmostrarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTmostrarTodoMouseEntered(evt);
            }
        });
        JPregistroFacBol.add(BTmostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 134, 46));

        getContentPane().add(JPregistroFacBol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTbuscarFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarFacturaMouseEntered
        BTbuscarFactura.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarFacturaMouseEntered

    private void JPregistroFacBolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPregistroFacBolMouseEntered
        BTbuscarFactura.setBackground(new java.awt.Color(18,22,31));
        BTmostrarTodo.setBackground(new java.awt.Color(18,22,31));
    }//GEN-LAST:event_JPregistroFacBolMouseEntered

    private void BTmostrarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTmostrarTodoMouseEntered
        BTmostrarTodo.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTmostrarTodoMouseEntered

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
            java.util.logging.Logger.getLogger(form_ConsultasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ConsultasFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTbuscarFactura;
    public javax.swing.JButton BTmostrarTodo;
    public javax.swing.JComboBox<String> CBtipoBusqueda;
    private javax.swing.JPanel JPregistroFacBol;
    public javax.swing.JMenuItem MIverDetalles;
    public javax.swing.JTable TBLregistroFacturas;
    public javax.swing.JTextField TXTbuscador;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
