package vista;

import javax.swing.JPanel;
public class form_boletas extends javax.swing.JFrame {

    
    public form_boletas() {
        initComponents();
    }
    
    public JPanel getFondo(){
        return JPboleta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPboleta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTfecha = new javax.swing.JTextField();
        TXTnBoleta = new javax.swing.JTextField();
        TXTcod_cliente = new javax.swing.JTextField();
        TXTapellidoCliente = new javax.swing.JTextField();
        TXTdniOpasaporte = new javax.swing.JTextField();
        TXTdireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BTbuscarCliente = new javax.swing.JButton();
        BTbuscarProducto = new javax.swing.JButton();
        BTcalcular = new javax.swing.JButton();
        BTeliminar = new javax.swing.JButton();
        BTrealizarVenta = new javax.swing.JButton();
        TXTtotalBoleta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLprodBoleta = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex){
                return false;
            }
        };
        CBtipoPago = new javax.swing.JComboBox<>();
        CBtipoMoneda = new javax.swing.JComboBox<>();
        TXTnombreCliente = new javax.swing.JTextField();
        BTelimContTbl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPboleta.setBackground(new java.awt.Color(18, 22, 31));
        JPboleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPboletaMouseEntered(evt);
            }
        });
        JPboleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMITIR BOLETA DE VENTA");
        JPboleta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 60));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PC MASTER S.A.C");
        JPboleta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 150, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Av. Inca Garcilaso de la Vega 1348, Cercado de Lima 15001");
        JPboleta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 430, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RUC: 20869478212");
        JPboleta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 130, 30));

        TXTfecha.setEditable(false);
        TXTfecha.setBackground(new java.awt.Color(18, 22, 31));
        TXTfecha.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTfecha.setForeground(new java.awt.Color(255, 255, 255));
        TXTfecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 190, 50));

        TXTnBoleta.setEditable(false);
        TXTnBoleta.setBackground(new java.awt.Color(18, 22, 31));
        TXTnBoleta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTnBoleta.setForeground(new java.awt.Color(255, 255, 255));
        TXTnBoleta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N°  BOLETA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTnBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 190, 50));

        TXTcod_cliente.setEditable(false);
        TXTcod_cliente.setBackground(new java.awt.Color(18, 22, 31));
        TXTcod_cliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTcod_cliente.setForeground(new java.awt.Color(255, 255, 255));
        TXTcod_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COD_CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTcod_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 50));

        TXTapellidoCliente.setEditable(false);
        TXTapellidoCliente.setBackground(new java.awt.Color(18, 22, 31));
        TXTapellidoCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTapellidoCliente.setForeground(new java.awt.Color(255, 255, 255));
        TXTapellidoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTapellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 50));

        TXTdniOpasaporte.setEditable(false);
        TXTdniOpasaporte.setBackground(new java.awt.Color(18, 22, 31));
        TXTdniOpasaporte.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTdniOpasaporte.setForeground(new java.awt.Color(255, 255, 255));
        TXTdniOpasaporte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI O PASAPORTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTdniOpasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 220, 50));

        TXTdireccion.setEditable(false);
        TXTdireccion.setBackground(new java.awt.Color(18, 22, 31));
        TXTdireccion.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTdireccion.setForeground(new java.awt.Color(255, 255, 255));
        TXTdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 220, 50));
        JPboleta.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 950, 10));

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
        JPboleta.add(BTbuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 134, 46));

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
        JPboleta.add(BTbuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 134, 46));

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
        JPboleta.add(BTcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 134, 46));

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
        JPboleta.add(BTeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 134, 46));

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
        JPboleta.add(BTrealizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 134, 46));

        TXTtotalBoleta.setEditable(false);
        TXTtotalBoleta.setBackground(new java.awt.Color(18, 22, 31));
        TXTtotalBoleta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        TXTtotalBoleta.setForeground(new java.awt.Color(255, 255, 255));
        TXTtotalBoleta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TXTtotalBoleta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTtotalBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 190, 50));

        TBLprodBoleta.setBackground(new java.awt.Color(21, 25, 34));
        TBLprodBoleta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLprodBoleta.setForeground(new java.awt.Color(255, 255, 255));
        TBLprodBoleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD_PRODUCTO", "DESCRIPCION", "PRECIO", "CANTIDAD", "IMPORTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLprodBoleta.setToolTipText("");
        TBLprodBoleta.setGridColor(new java.awt.Color(21, 25, 34));
        TBLprodBoleta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLprodBoleta);

        JPboleta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, 790, 290));

        CBtipoPago.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoPago.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoPago.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "TARJETA", "APP BANCARIA" }));
        CBtipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE PAGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPboleta.add(CBtipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 190, 50));

        CBtipoMoneda.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoMoneda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoMoneda.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLES", "DOLARES" }));
        CBtipoMoneda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO DE MONEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPboleta.add(CBtipoMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 190, 50));

        TXTnombreCliente.setEditable(false);
        TXTnombreCliente.setBackground(new java.awt.Color(18, 22, 31));
        TXTnombreCliente.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTnombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        TXTnombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPboleta.add(TXTnombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 50));

        BTelimContTbl.setBackground(new java.awt.Color(18, 22, 31));
        BTelimContTbl.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTelimContTbl.setForeground(new java.awt.Color(255, 255, 255));
        BTelimContTbl.setText("LIMPIAR TODO");
        BTelimContTbl.setBorder(null);
        BTelimContTbl.setFocusPainted(false);
        BTelimContTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTelimContTblMouseEntered(evt);
            }
        });
        JPboleta.add(BTelimContTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 134, 46));

        getContentPane().add(JPboleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTbuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarClienteMouseEntered
        BTbuscarCliente.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarClienteMouseEntered

    private void BTbuscarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarProductoMouseEntered
        BTbuscarProducto.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarProductoMouseEntered

    private void BTcalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTcalcularMouseEntered
        BTcalcular.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTcalcularMouseEntered

    private void BTeliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTeliminarMouseEntered
        BTeliminar.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTeliminarMouseEntered

    private void BTrealizarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTrealizarVentaMouseEntered
        BTrealizarVenta.setBackground(new java.awt.Color(0, 205, 86));
    }//GEN-LAST:event_BTrealizarVentaMouseEntered

    private void JPboletaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPboletaMouseEntered
        BTrealizarVenta.setBackground(new java.awt.Color(18,22,31));
        BTeliminar.setBackground(new java.awt.Color(18,22,31));
        BTelimContTbl.setBackground(new java.awt.Color(18,22,31));
        BTbuscarCliente.setBackground(new java.awt.Color(18, 22, 31));
        BTbuscarProducto.setBackground(new java.awt.Color(18, 22, 31));
        BTcalcular.setBackground(new java.awt.Color(18, 22, 31));
    }//GEN-LAST:event_JPboletaMouseEntered

    private void BTelimContTblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTelimContTblMouseEntered
        BTelimContTbl.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTelimContTblMouseEntered

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
            java.util.logging.Logger.getLogger(form_boletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_boletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_boletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_boletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_boletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTbuscarCliente;
    public javax.swing.JButton BTbuscarProducto;
    public javax.swing.JButton BTcalcular;
    public javax.swing.JButton BTelimContTbl;
    public javax.swing.JButton BTeliminar;
    public javax.swing.JButton BTrealizarVenta;
    public javax.swing.JComboBox<String> CBtipoMoneda;
    public javax.swing.JComboBox<String> CBtipoPago;
    private javax.swing.JPanel JPboleta;
    public javax.swing.JTable TBLprodBoleta;
    public javax.swing.JTextField TXTapellidoCliente;
    public javax.swing.JTextField TXTcod_cliente;
    public javax.swing.JTextField TXTdireccion;
    public javax.swing.JTextField TXTdniOpasaporte;
    public javax.swing.JTextField TXTfecha;
    public javax.swing.JTextField TXTnBoleta;
    public javax.swing.JTextField TXTnombreCliente;
    public javax.swing.JTextField TXTtotalBoleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
