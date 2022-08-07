package vista;

import javax.swing.JPanel;

public class form_ConsultasProductos extends javax.swing.JFrame {

    public form_ConsultasProductos() {
        initComponents();
    }

    public JPanel getFondo(){
        return JPconsultasProductos;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        enviarProd = new javax.swing.JMenuItem();
        JPconsultasProductos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTbuscar = new javax.swing.JButton();
        CBtipoBusqueda = new javax.swing.JComboBox<>();
        TXTbuscador = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLproductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex){
                return false;
            }
        };
        BTmostrarTodo = new javax.swing.JButton();

        jPopupMenu1.setComponentPopupMenu(jPopupMenu1);

        enviarProd.setText("enviar Producto");
        enviarProd.setComponentPopupMenu(jPopupMenu1);
        jPopupMenu1.add(enviarProd);

        jPopupMenu1.getAccessibleContext().setAccessibleParent(jPopupMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPconsultasProductos.setBackground(new java.awt.Color(18, 22, 31));
        JPconsultasProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPconsultasProductosMouseEntered(evt);
            }
        });
        JPconsultasProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTA DE PRODUCTOS");
        JPconsultasProductos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 40));

        BTbuscar.setBackground(new java.awt.Color(18, 22, 31));
        BTbuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BTbuscar.setForeground(new java.awt.Color(255, 255, 255));
        BTbuscar.setText("BUSCAR");
        BTbuscar.setBorder(null);
        BTbuscar.setFocusPainted(false);
        BTbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTbuscarMouseEntered(evt);
            }
        });
        JPconsultasProductos.add(BTbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 134, 46));

        CBtipoBusqueda.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoBusqueda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO PRODUCTO", "NOMBRE PRODUCTO", "CATEGORIA" }));
        JPconsultasProductos.add(CBtipoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 60));

        TXTbuscador.setBackground(new java.awt.Color(18, 22, 31));
        TXTbuscador.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTbuscador.setForeground(new java.awt.Color(255, 255, 255));
        JPconsultasProductos.add(TXTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 290, 40));

        TBLproductos.setBackground(new java.awt.Color(18, 22, 31));
        TBLproductos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLproductos.setForeground(new java.awt.Color(255, 255, 255));
        TBLproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD_PRODUCTO", "DESCRIPCION", "CATEGORIA", "CANTIDAD", "PRECIO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLproductos.setToolTipText("");
        TBLproductos.setComponentPopupMenu(jPopupMenu1);
        TBLproductos.setGridColor(new java.awt.Color(21, 25, 34));
        TBLproductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TBLproductos);

        JPconsultasProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 930, 420));

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
        JPconsultasProductos.add(BTmostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 134, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPconsultasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPconsultasProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPconsultasProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPconsultasProductosMouseEntered
        BTbuscar.setBackground(new java.awt.Color(18,22,31));
        BTmostrarTodo.setBackground(new java.awt.Color(18,22,31));
    }//GEN-LAST:event_JPconsultasProductosMouseEntered

    private void BTbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarMouseEntered
        BTbuscar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarMouseEntered

    private void BTmostrarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTmostrarTodoMouseEntered
        BTmostrarTodo.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTmostrarTodoMouseEntered

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(form_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ConsultasProductos().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTbuscar;
    public javax.swing.JButton BTmostrarTodo;
    public javax.swing.JComboBox<String> CBtipoBusqueda;
    private javax.swing.JPanel JPconsultasProductos;
    public javax.swing.JTable TBLproductos;
    public javax.swing.JTextField TXTbuscador;
    public javax.swing.JMenuItem enviarProd;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
