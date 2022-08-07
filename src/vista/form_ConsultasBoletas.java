package vista;

import javax.swing.JPanel;

public class form_ConsultasBoletas extends javax.swing.JFrame {

    public form_ConsultasBoletas() {
        initComponents();
    }

    public JPanel getFondo(){
        return JPconsultasBoletas;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PMverDetalles = new javax.swing.JPopupMenu();
        MIverDetalles = new javax.swing.JMenuItem();
        JPconsultasBoletas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLregistroBoletas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex){
                return false;
            }
        };
        BTmostrarTodo = new javax.swing.JButton();
        CBtipoBusqueda = new javax.swing.JComboBox<>();
        TXTbuscador = new javax.swing.JTextField();
        BTbuscar = new javax.swing.JButton();

        MIverDetalles.setText("Ver detalles");
        MIverDetalles.setComponentPopupMenu(PMverDetalles);
        PMverDetalles.add(MIverDetalles);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPconsultasBoletas.setBackground(new java.awt.Color(18, 22, 31));
        JPconsultasBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPconsultasBoletasMouseEntered(evt);
            }
        });
        JPconsultasBoletas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTA DE BOLETAS");
        JPconsultasBoletas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 40));

        TBLregistroBoletas.setBackground(new java.awt.Color(18, 22, 31));
        TBLregistroBoletas.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLregistroBoletas.setForeground(new java.awt.Color(255, 255, 255));
        TBLregistroBoletas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COD_BOLETA", "COD_CLIENTE", "COD_USUARIO", "FECHA", "TIPO_MONEDA", "TIPO_PAGO", "TOTAL", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLregistroBoletas.setToolTipText("");
        TBLregistroBoletas.setComponentPopupMenu(PMverDetalles);
        TBLregistroBoletas.setGridColor(new java.awt.Color(21, 25, 34));
        TBLregistroBoletas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLregistroBoletas);

        JPconsultasBoletas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 950, 460));

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
        JPconsultasBoletas.add(BTmostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 134, 46));

        CBtipoBusqueda.setBackground(new java.awt.Color(21, 112, 144));
        CBtipoBusqueda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CBtipoBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO BOLETA", "CODIGO CLIENTE", "FECHA" }));
        JPconsultasBoletas.add(CBtipoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 60));

        TXTbuscador.setBackground(new java.awt.Color(18, 22, 31));
        TXTbuscador.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTbuscador.setForeground(new java.awt.Color(255, 255, 255));
        JPconsultasBoletas.add(TXTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 290, 40));

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
        JPconsultasBoletas.add(BTbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 134, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPconsultasBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPconsultasBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarMouseEntered
        BTbuscar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarMouseEntered

    private void BTmostrarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTmostrarTodoMouseEntered
        BTmostrarTodo.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTmostrarTodoMouseEntered

    private void JPconsultasBoletasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPconsultasBoletasMouseEntered
        BTbuscar.setBackground(new java.awt.Color(18,22,31));
        BTmostrarTodo.setBackground(new java.awt.Color(18,22,31));
    }//GEN-LAST:event_JPconsultasBoletasMouseEntered

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
            java.util.logging.Logger.getLogger(form_ConsultasBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ConsultasBoletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ConsultasBoletas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTbuscar;
    public javax.swing.JButton BTmostrarTodo;
    public javax.swing.JComboBox<String> CBtipoBusqueda;
    private javax.swing.JPanel JPconsultasBoletas;
    public javax.swing.JMenuItem MIverDetalles;
    public javax.swing.JPopupMenu PMverDetalles;
    public javax.swing.JTable TBLregistroBoletas;
    public javax.swing.JTextField TXTbuscador;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
