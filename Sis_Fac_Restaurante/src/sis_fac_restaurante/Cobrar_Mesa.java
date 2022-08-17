
package sis_fac_restaurante;

//Source de Cobrar_Mesa
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Cobrar_Mesa extends javax.swing.JFrame {

    //Se crea la variable que va a poseer las funciones
    public Funciones funciones = new Funciones();;
    
    //Se crea la variable que va a llamar al form Mesas de nuevo
    public static Mesas mesas = new Mesas();
    
    //Se crea la variable que va a llamar el form principal
    public Sis_Fac_Restaurante principal = new Sis_Fac_Restaurante();
    
    public Cobrar_Mesa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCobrarMesa = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblPedido = new javax.swing.JLabel();
        lblServicio = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();
        lblImpuestos = new javax.swing.JLabel();
        txtImpuestos = new javax.swing.JTextField();
        txtTotalFinal = new javax.swing.JTextField();
        lblTotalFinal = new javax.swing.JLabel();
        txtMontoCliente = new javax.swing.JTextField();
        lblMontoCliente = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedidosCobrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cobrar Mesa");

        jPanel1.setBackground(new java.awt.Color(163, 96, 10));

        lblCobrarMesa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCobrarMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblCobrarMesa.setText("COBRAR MESA");

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotal.setText("Subtotal:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblPedido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblPedido.setText("PEDIDO");

        lblServicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblServicio.setText("10% Servicio:");

        txtServicio.setEditable(false);
        txtServicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblImpuestos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblImpuestos.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestos.setText("13% I.V.A:");

        txtImpuestos.setEditable(false);
        txtImpuestos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpuestos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTotalFinal.setEditable(false);
        txtTotalFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTotalFinal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalFinal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalFinal.setText("Total Final: ");

        txtMontoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoClienteKeyTyped(evt);
            }
        });

        lblMontoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMontoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblMontoCliente.setText("Monto Cliente:");

        tblPedidosCobrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Producto", "Cantidad", "P. Unitario", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPedidosCobrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lblPedido)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblImpuestos)
                                .addGap(18, 18, 18)
                                .addComponent(txtImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblServicio)
                                .addGap(18, 18, 18)
                                .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTotalFinal)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMontoCliente)
                                .addGap(18, 18, 18)
                                .addComponent(txtMontoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSubtotal)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblCobrarMesa)
                                        .addGap(47, 47, 47)))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCobrarMesa)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubtotal)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblServicio)
                            .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImpuestos)
                            .addComponent(txtImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalFinal)
                            .addComponent(txtTotalFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMontoCliente)
                            .addComponent(txtMontoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Al presionar el boton btnPagar
    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        
        //Condicional que va a comprobar si el monto ingresado al sistema es suficiente o no
        if ((Integer.parseInt(txtMontoCliente.getText())) < (Integer.parseInt(txtTotalFinal.getText())))
        {
            //Cuando el monto no es suficiente
            JOptionPane.showMessageDialog(null, """
                                                                                                         MONTO INSUFICIENTE
                                                
                                                El monto ingresado para pagar la cuenta es insuficiente, favor vuelva a ingresar un monto mayor
                                                al total final de la cuenta.
                                                """
                                                );
        }
        else
        {
            //Cuando el monto es suficiente
            JOptionPane.showMessageDialog(null,"PAGO REALIZADO CON EXITO\n\nSu vuelto: " + ((Integer.parseInt(txtMontoCliente.getText())) - (Integer.parseInt(txtTotalFinal.getText()))) + "\n\n\nGracias por su preferencia!");
            
            //Se borran todos los pedidos de la mesa que se pagò
            for (int i = 0; i < principal.pedidosMesas.length; i++)
            {
                if (mesas.mesaSeleccionada == principal.pedidosMesas[i].NumeroMesa)
                {
                    principal.pedidosMesas[i].NumeroMesa = 0;
                    principal.pedidosMesas[i].CantidadProducto = 0;
                    principal.pedidosMesas[i].NombreProducto = "";
                    principal.pedidosMesas[i].PrecioUnitario = 0;
                    principal.pedidosMesas[i].PrecioFinal = 0;
                }
            }
            
            //Se cierra el form actual y se vuelve a Mesas
            this.setVisible(false);
            mesas.setVisible(true);
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    //Al presionar salir se oculta el form Cobrar_Mesa y se muestra el form Mesas
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        mesas.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtMontoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoClienteKeyTyped
                
        /*Funcion que se va a encargar de admitir solo numeros en el textbox txtMontoCliente*/
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoClienteKeyTyped


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
            java.util.logging.Logger.getLogger(Cobrar_Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cobrar_Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cobrar_Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cobrar_Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cobrar_Mesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCobrarMesa;
    private javax.swing.JLabel lblImpuestos;
    private javax.swing.JLabel lblMontoCliente;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JLabel lblServicio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotalFinal;
    private javax.swing.JTable tblPedidosCobrar;
    private javax.swing.JTextField txtImpuestos;
    private javax.swing.JTextField txtMontoCliente;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotalFinal;
    // End of variables declaration//GEN-END:variables

    //Se crea el getter de tblPedidos para utilizarlo en Mesas.java
    public JTable getTblPedidosCobrar() {
        return tblPedidosCobrar;
    }

    //Se crean los getter de los textbox
    public javax.swing.JTextField getTxtImpuestos() {
        return txtImpuestos;
    }
    public javax.swing.JTextField getTxtServicio() {
        return txtServicio;
    }
    public javax.swing.JTextField getTxtSubtotal() {
        return txtSubtotal;
    }
    public javax.swing.JTextField getTxtTotalFinal() {
        return txtTotalFinal;
    }
}
