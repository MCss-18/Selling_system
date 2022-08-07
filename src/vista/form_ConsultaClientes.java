package vista;

import java.awt.Image;
import javax.swing.ImageIcon;

public class form_ConsultaClientes extends javax.swing.JFrame {

    public form_ConsultaClientes() {
        initComponents();
        
        Image icon=new ImageIcon(this.getClass().getResource("/img/pc_master_race_logo2.png")).getImage();
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PMconsCliente = new javax.swing.JPopupMenu();
        enviarDatos = new javax.swing.JMenuItem();
        JPconsultasClientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BTmostrarTodo = new javax.swing.JButton();
        CBtipoBusqueda = new javax.swing.JComboBox<>();
        TXTbuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLclientes = new javax.swing.JTable();
        BTbuscar = new javax.swing.JButton();

        enviarDatos.setText("Enviar datos");
        enviarDatos.setComponentPopupMenu(PMconsCliente);
        enviarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarDatosActionPerformed(evt);
            }
        });
        PMconsCliente.add(enviarDatos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PC MASTER");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPconsultasClientes.setBackground(new java.awt.Color(18, 22, 31));
        JPconsultasClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPconsultasClientesMouseEntered(evt);
            }
        });
        JPconsultasClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTA DE CLIENTES");
        JPconsultasClientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 40));

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
        JPconsultasClientes.add(BTmostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 134, 46));

        CBtipoBusqueda.setBackground(new java.awt.Color(69, 148, 58));
        CBtipoBusqueda.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CBtipoBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        CBtipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CODIGO CLIENTE", "NOMBRE CLIENTE", "DOCUMENTO" }));
        CBtipoBusqueda.setFocusable(false);
        JPconsultasClientes.add(CBtipoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 60));

        TXTbuscador.setBackground(new java.awt.Color(18, 22, 31));
        TXTbuscador.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TXTbuscador.setForeground(new java.awt.Color(255, 255, 255));
        JPconsultasClientes.add(TXTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 290, 40));

        TBLclientes.setBackground(new java.awt.Color(18, 22, 31));
        TBLclientes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TBLclientes.setForeground(new java.awt.Color(255, 255, 255));
        TBLclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        TBLclientes.setComponentPopupMenu(PMconsCliente);
        TBLclientes.setGridColor(new java.awt.Color(21, 25, 34));
        TBLclientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBLclientes);

        JPconsultasClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 830, 340));

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
        JPconsultasClientes.add(BTbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 134, 46));

        getContentPane().add(JPconsultasClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarDatosActionPerformed
        
    }//GEN-LAST:event_enviarDatosActionPerformed

    private void BTbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTbuscarMouseEntered
        BTbuscar.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTbuscarMouseEntered

    private void BTmostrarTodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTmostrarTodoMouseEntered
        BTmostrarTodo.setBackground(new java.awt.Color(46,52,66));
    }//GEN-LAST:event_BTmostrarTodoMouseEntered

    private void JPconsultasClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPconsultasClientesMouseEntered
        BTbuscar.setBackground(new java.awt.Color(18, 22, 31));
        BTmostrarTodo.setBackground(new java.awt.Color(18, 22, 31));
    }//GEN-LAST:event_JPconsultasClientesMouseEntered

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
            java.util.logging.Logger.getLogger(form_ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_ConsultaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTbuscar;
    public javax.swing.JButton BTmostrarTodo;
    public javax.swing.JComboBox<String> CBtipoBusqueda;
    private javax.swing.JPanel JPconsultasClientes;
    public javax.swing.JPopupMenu PMconsCliente;
    public javax.swing.JTable TBLclientes;
    public javax.swing.JTextField TXTbuscador;
    public javax.swing.JMenuItem enviarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
