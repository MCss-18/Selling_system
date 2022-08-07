package vista;
//Librerias

import javax.swing.JPanel;


public class form_registroProductos extends javax.swing.JFrame {
//  CONTRUCTOR
    public form_registroProductos() {
        initComponents();
//        lockTXTs(false);
//        cargarTablaProd();
//        updateCodigoProd();
        
//        BTguardar.setEnabled(false);    //DESHABILITAR BOTON GUARDAR
//        BTactualizar.setEnabled(false);  //DESHABILITAR BOTON ACTUALIZAR
    }

    public JPanel getFondo(){
        return JPregistroProductos;
    }
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPregistroProductos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLproductos = new javax.swing.JTable();
        TXTcantidadProd = new javax.swing.JTextField();
        TXTcod_prod = new javax.swing.JTextField();
        TXTdescripcionProd = new javax.swing.JTextField();
        TXTprecioProd = new javax.swing.JTextField();
        BTnuevoProducto = new javax.swing.JButton();
        BTguardar = new javax.swing.JButton();
        BTactualizar = new javax.swing.JButton();
        BTlimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CBcategoriaProd = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPregistroProductos.setBackground(new java.awt.Color(18, 22, 31));
        JPregistroProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPregistroProductosMouseEntered(evt);
            }
        });
        JPregistroProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE PRODUCTOS");
        JPregistroProductos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 60));

        TBLproductos.setBackground(new java.awt.Color(18, 22, 31));
        TBLproductos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLproductos.setForeground(new java.awt.Color(255, 255, 255));
        TBLproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD_PROD", "DESCRIPCION", "CATEGORIA", "CANTIDAD", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
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
        TBLproductos.setGridColor(new java.awt.Color(21, 25, 34));
        TBLproductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLproductos);

        JPregistroProductos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 730, 370));

        TXTcantidadProd.setBackground(new java.awt.Color(18, 22, 31));
        TXTcantidadProd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTcantidadProd.setForeground(new java.awt.Color(255, 255, 255));
        TXTcantidadProd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroProductos.add(TXTcantidadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 190, 50));

        TXTcod_prod.setEditable(false);
        TXTcod_prod.setBackground(new java.awt.Color(18, 22, 31));
        TXTcod_prod.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTcod_prod.setForeground(new java.awt.Color(255, 255, 255));
        TXTcod_prod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COD_PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroProductos.add(TXTcod_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 190, 50));

        TXTdescripcionProd.setBackground(new java.awt.Color(18, 22, 31));
        TXTdescripcionProd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTdescripcionProd.setForeground(new java.awt.Color(255, 255, 255));
        TXTdescripcionProd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroProductos.add(TXTdescripcionProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 190, 50));

        TXTprecioProd.setBackground(new java.awt.Color(18, 22, 31));
        TXTprecioProd.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTprecioProd.setForeground(new java.awt.Color(255, 255, 255));
        TXTprecioProd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        JPregistroProductos.add(TXTprecioProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 190, 50));

        BTnuevoProducto.setBackground(new java.awt.Color(18, 22, 31));
        BTnuevoProducto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTnuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        BTnuevoProducto.setText("NUEVO PRODUCTO");
        BTnuevoProducto.setBorder(null);
        BTnuevoProducto.setFocusPainted(false);
        BTnuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTnuevoProductoMouseEntered(evt);
            }
        });
        JPregistroProductos.add(BTnuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 134, 46));

        BTguardar.setBackground(new java.awt.Color(18, 22, 31));
        BTguardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTguardar.setForeground(new java.awt.Color(255, 255, 255));
        BTguardar.setText("GUARDAR");
        BTguardar.setToolTipText("");
        BTguardar.setBorder(null);
        BTguardar.setFocusPainted(false);
        BTguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTguardarMouseEntered(evt);
            }
        });
        JPregistroProductos.add(BTguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 134, 46));

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
        JPregistroProductos.add(BTactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 134, 46));

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
        JPregistroProductos.add(BTlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 134, 46));
        JPregistroProductos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 960, 10));

        CBcategoriaProd.setBackground(new java.awt.Color(255, 100, 85));
        CBcategoriaProd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBcategoriaProd.setForeground(new java.awt.Color(0, 0, 0));
        CBcategoriaProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TARJETA GRAFICA", "PLACA MADRE", "PERIFERICOS", "MONITORES", "MEMORIAS", "VENTILADORES", "PROCESADORES", "CASES", "FUENTES DE PODER" }));
        CBcategoriaProd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12), new java.awt.Color(21, 25, 34))); // NOI18N
        JPregistroProductos.add(CBcategoriaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 190, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPregistroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPregistroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//  FUNCIONES(BOTONES, JPANLES, TEXT AREA, COMBO BOX)    
    private void BTnuevoProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTnuevoProductoMouseEntered
        BTnuevoProducto.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTnuevoProductoMouseEntered

    private void BTguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTguardarMouseEntered
        BTguardar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTguardarMouseEntered

    private void BTactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTactualizarMouseEntered
        BTactualizar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTactualizarMouseEntered

    private void BTlimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTlimpiarMouseEntered
        BTlimpiar.setBackground(new java.awt.Color(255, 51, 0));
    }//GEN-LAST:event_BTlimpiarMouseEntered

    private void JPregistroProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPregistroProductosMouseEntered
        BTnuevoProducto.setBackground(new java.awt.Color(18,22,31));
        BTguardar.setBackground(new java.awt.Color(18,22,31));
        BTactualizar.setBackground(new java.awt.Color(18,22,31));
        BTlimpiar.setBackground(new java.awt.Color(18,22,31));
    }//GEN-LAST:event_JPregistroProductosMouseEntered

    
    
    
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
            java.util.logging.Logger.getLogger(form_registroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_registroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_registroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_registroProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_registroProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTactualizar;
    public javax.swing.JButton BTguardar;
    public javax.swing.JButton BTlimpiar;
    public javax.swing.JButton BTnuevoProducto;
    public javax.swing.JComboBox<String> CBcategoriaProd;
    private javax.swing.JPanel JPregistroProductos;
    public javax.swing.JTable TBLproductos;
    public javax.swing.JTextField TXTcantidadProd;
    public javax.swing.JTextField TXTcod_prod;
    public javax.swing.JTextField TXTdescripcionProd;
    public javax.swing.JTextField TXTprecioProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    
}
