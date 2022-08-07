package vista;

import javax.swing.JPanel;

public class form_factura extends javax.swing.JFrame {

    public form_factura() {
        initComponents();
    }

    public JPanel getFondo(){
        return JPfactura;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPfactura = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLprodFactura = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex){
                return false;
            }
        };
        BTrealizarVenta = new javax.swing.JButton();
        BTeliminar = new javax.swing.JButton();
        TXTcod_clienteEm = new javax.swing.JTextField();
        TXTnFactura = new javax.swing.JTextField();
        TXTruc = new javax.swing.JTextField();
        TXTdireccion = new javax.swing.JTextField();
        BTbuscarProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTsubTotal = new javax.swing.JTextField();
        BTcalcular = new javax.swing.JButton();
        TXTfecha = new javax.swing.JTextField();
        TXTtotal = new javax.swing.JTextField();
        TXTigv = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TXTnombreEmpresa = new javax.swing.JTextField();
        BTbuscarCliente = new javax.swing.JButton();
        CBtipoMoneda = new javax.swing.JComboBox<>();
        CBtipoPago = new javax.swing.JComboBox<>();
        BTlimpiarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPfactura.setBackground(new java.awt.Color(18, 22, 31));
        JPfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPfacturaMouseEntered(evt);
            }
        });
        JPfactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLprodFactura.setBackground(new java.awt.Color(21, 25, 34));
        TBLprodFactura.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLprodFactura.setForeground(new java.awt.Color(255, 255, 255));
        TBLprodFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD_PRODUCTO", "DESCRIPCION", "PRECIO", "CANTIDAD", "IMPORTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLprodFactura.setToolTipText("");
        TBLprodFactura.setGridColor(new java.awt.Color(21, 25, 34));
        TBLprodFactura.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLprodFactura);

        JPfactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, 790, 290));

        BTrealizarVenta.setBackground(new java.awt.Color(18, 22, 31));
        BTrealizarVenta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTrealizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        BTrealizarVenta.setText("REALIZAR VENTA");
        BTrealizarVenta.setBorder(null);
        BTrealizarVenta.setFocusPainted(false);
        BTrealizarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTrealizarVentaMouseEntered(evt);
            }
        });
        JPfactura.add(BTrealizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 134, 46));

        BTeliminar.setBackground(new java.awt.Color(18, 22, 31));
        BTeliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTeliminar.setForeground(new java.awt.Color(255, 255, 255));
        BTeliminar.setText("ELIMINAR");
        BTeliminar.setBorder(null);
        BTeliminar.setFocusPainted(false);
        BTeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTeliminarMouseEntered(evt);
            }
        });
        JPfactura.add(BTeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 134, 46));

        TXTcod_clienteEm.setEditable(false);
        TXTcod_clienteEm.setBackground(new java.awt.Color(18, 22, 31));
        TXTcod_clienteEm.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTcod_clienteEm.setForeground(new java.awt.Color(255, 255, 255));
        TXTcod_clienteEm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COD_CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTcod_clienteEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 50));

        TXTnFactura.setEditable(false);
        TXTnFactura.setBackground(new java.awt.Color(18, 22, 31));
        TXTnFactura.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTnFactura.setForeground(new java.awt.Color(255, 255, 255));
        TXTnFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° FACTURA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 190, 50));

        TXTruc.setEditable(false);
        TXTruc.setBackground(new java.awt.Color(18, 22, 31));
        TXTruc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTruc.setForeground(new java.awt.Color(255, 255, 255));
        TXTruc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 50));

        TXTdireccion.setEditable(false);
        TXTdireccion.setBackground(new java.awt.Color(18, 22, 31));
        TXTdireccion.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTdireccion.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 220, 50));

        BTbuscarProducto.setBackground(new java.awt.Color(18, 22, 31));
        BTbuscarProducto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTbuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        BTbuscarProducto.setText("BUSCAR PRODUCTO");
        BTbuscarProducto.setBorder(null);
        BTbuscarProducto.setFocusPainted(false);
        BTbuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTbuscarProductoMouseEntered(evt);
            }
        });
        JPfactura.add(BTbuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 134, 46));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMITIR FACTURA DE VENTA");
        JPfactura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 60));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PC MASTER S.A.C");
        JPfactura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 150, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RUC: 20869478212");
        JPfactura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 130, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Av. Inca Garcilaso de la Vega 1348, Cercado de Lima 15001");
        JPfactura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 430, 30));

        TXTsubTotal.setEditable(false);
        TXTsubTotal.setBackground(new java.awt.Color(18, 22, 31));
        TXTsubTotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTsubTotal.setForeground(new java.awt.Color(255, 255, 255));
        TXTsubTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUB. TOTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTsubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 190, 50));

        BTcalcular.setBackground(new java.awt.Color(18, 22, 31));
        BTcalcular.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTcalcular.setForeground(new java.awt.Color(255, 255, 255));
        BTcalcular.setText("CALCULAR");
        BTcalcular.setBorder(null);
        BTcalcular.setFocusPainted(false);
        BTcalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTcalcularMouseEntered(evt);
            }
        });
        JPfactura.add(BTcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 134, 46));

        TXTfecha.setEditable(false);
        TXTfecha.setBackground(new java.awt.Color(18, 22, 31));
        TXTfecha.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTfecha.setForeground(new java.awt.Color(255, 255, 255));
        TXTfecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 190, 50));

        TXTtotal.setEditable(false);
        TXTtotal.setBackground(new java.awt.Color(18, 22, 31));
        TXTtotal.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTtotal.setForeground(new java.awt.Color(255, 255, 255));
        TXTtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 190, 50));

        TXTigv.setEditable(false);
        TXTigv.setBackground(new java.awt.Color(18, 22, 31));
        TXTigv.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTigv.setForeground(new java.awt.Color(255, 255, 255));
        TXTigv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "I.G.V", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTigv, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 190, 50));
        JPfactura.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 950, 10));

        TXTnombreEmpresa.setEditable(false);
        TXTnombreEmpresa.setBackground(new java.awt.Color(18, 22, 31));
        TXTnombreEmpresa.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTnombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombreEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE EMPRESA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPfactura.add(TXTnombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 50));

        BTbuscarCliente.setBackground(new java.awt.Color(18, 22, 31));
        BTbuscarCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTbuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        BTbuscarCliente.setText("BUSCAR CLIENTE");
        BTbuscarCliente.setBorder(null);
        BTbuscarCliente.setFocusPainted(false);
        BTbuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTbuscarClienteMouseEntered(evt);
            }
        });
        JPfactura.add(BTbuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 134, 46));

        CBtipoMoneda.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoMoneda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoMoneda.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLES", "DOLARES" }));
        CBtipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE MONEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPfactura.add(CBtipoMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 190, 50));

        CBtipoPago.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoPago.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoPago.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TARJETA", "APP BANCARIA" }));
        CBtipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPfactura.add(CBtipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 190, 50));

        BTlimpiarTodo.setBackground(new java.awt.Color(18, 22, 31));
        BTlimpiarTodo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTlimpiarTodo.setForeground(new java.awt.Color(255, 255, 255));
        BTlimpiarTodo.setText("LIMPIAR TODO");
        BTlimpiarTodo.setBorder(null);
        BTlimpiarTodo.setFocusPainted(false);
        BTlimpiarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTlimpiarTodoMouseEntered(evt);
            }
        });
        JPfactura.add(BTlimpiarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 134, 46));

        getContentPane().add(JPfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTrealizarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTrealizarVentaMouseEntered
        BTrealizarVenta.setBackground(new java.awt.Color(0, 205, 86));
    }//GEN-LAST:event_BTrealizarVentaMouseEntered

    private void JPfacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPfacturaMouseEntered
        BTrealizarVenta.setBackground(new java.awt.Color(18,22,31));
        BTeliminar.setBackground(new java.awt.Color(18,22,31));
        BTlimpiarTodo.setBackground(new java.awt.Color(18,22,31));
        BTbuscarCliente.setBackground(new java.awt.Color(18, 22, 31));
        BTbuscarProducto.setBackground(new java.awt.Color(18, 22, 31));
        BTcalcular.setBackground(new java.awt.Color(18, 22, 31));
    }//GEN-LAST:event_JPfacturaMouseEntered

    private void BTeliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTeliminarMouseEntered
        BTeliminar.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTeliminarMouseEntered

    private void BTbuscarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarProductoMouseEntered
        BTbuscarProducto.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarProductoMouseEntered

    private void BTcalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTcalcularMouseEntered
        BTcalcular.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTcalcularMouseEntered

    private void BTbuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarClienteMouseEntered
        BTbuscarCliente.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarClienteMouseEntered

    private void BTlimpiarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTlimpiarTodoMouseEntered
        BTlimpiarTodo.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTlimpiarTodoMouseEntered
    
    
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
            java.util.logging.Logger.getLogger(form_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTbuscarCliente;
    public javax.swing.JButton BTbuscarProducto;
    public javax.swing.JButton BTcalcular;
    public javax.swing.JButton BTeliminar;
    public javax.swing.JButton BTlimpiarTodo;
    public javax.swing.JButton BTrealizarVenta;
    public javax.swing.JComboBox<String> CBtipoMoneda;
    public javax.swing.JComboBox<String> CBtipoPago;
    private javax.swing.JPanel JPfactura;
    public javax.swing.JTable TBLprodFactura;
    public javax.swing.JTextField TXTcod_clienteEm;
    public javax.swing.JTextField TXTdireccion;
    public javax.swing.JTextField TXTfecha;
    public javax.swing.JTextField TXTigv;
    public javax.swing.JTextField TXTnFactura;
    public javax.swing.JTextField TXTnombreEmpresa;
    public javax.swing.JTextField TXTruc;
    public javax.swing.JTextField TXTsubTotal;
    public javax.swing.JTextField TXTtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
