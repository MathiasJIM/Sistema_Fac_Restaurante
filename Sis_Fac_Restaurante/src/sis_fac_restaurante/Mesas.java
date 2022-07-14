package sis_fac_restaurante;

import javax.swing.JOptionPane;

public class Mesas extends javax.swing.JFrame {

    public int mesaSeleccionada = 0;
    Ingresar_Pedido ingresarPedido = new Ingresar_Pedido();
    Cobrar_Mesa cobrarMesa = new Cobrar_Mesa();
    
    public Mesas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMesas = new javax.swing.JPanel();
        tglMesa1 = new javax.swing.JToggleButton();
        tglMesa2 = new javax.swing.JToggleButton();
        tglMesa3 = new javax.swing.JToggleButton();
        tglMesa4 = new javax.swing.JToggleButton();
        tglMesa5 = new javax.swing.JToggleButton();
        tglMesa6 = new javax.swing.JToggleButton();
        tglMesa7 = new javax.swing.JToggleButton();
        tglMesa8 = new javax.swing.JToggleButton();
        pnlMenuMesas = new javax.swing.JPanel();
        lblFotoMenuMesas = new javax.swing.JLabel();
        btnCobrarMesa = new javax.swing.JButton();
        btnIngresarPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPedidoActual = new javax.swing.JList<>();
        lblPedidoActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);

        pnlMesas.setBackground(java.awt.Color.darkGray);

        tglMesa1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa1.setText("Mesa 1");
        tglMesa1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa1ActionPerformed(evt);
            }
        });

        tglMesa2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa2.setText("Mesa 2");
        tglMesa2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa2ActionPerformed(evt);
            }
        });

        tglMesa3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa3.setText("Mesa 3");
        tglMesa3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa3ActionPerformed(evt);
            }
        });

        tglMesa4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa4.setText("Mesa 4");
        tglMesa4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa4ActionPerformed(evt);
            }
        });

        tglMesa5.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa5.setText("Mesa 5");
        tglMesa5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa5ActionPerformed(evt);
            }
        });

        tglMesa6.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa6.setText("Mesa 6");
        tglMesa6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa6ActionPerformed(evt);
            }
        });

        tglMesa7.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa7.setText("Mesa 7");
        tglMesa7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa7ActionPerformed(evt);
            }
        });

        tglMesa8.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        tglMesa8.setText("Mesa 8");
        tglMesa8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tglMesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglMesa8ActionPerformed(evt);
            }
        });

        pnlMenuMesas.setBackground(new java.awt.Color(163, 96, 10));
        pnlMenuMesas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblFotoMenuMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis_fac_restaurante/ripichip´s cropped.png"))); // NOI18N
        lblFotoMenuMesas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCobrarMesa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCobrarMesa.setText("Cobrar Mesa");
        btnCobrarMesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCobrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarMesaActionPerformed(evt);
            }
        });

        btnIngresarPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresarPedido.setText("Ingresar Pedido");
        btnIngresarPedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnIngresarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPedidoActionPerformed(evt);
            }
        });

        lstPedidoActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(lstPedidoActual);

        lblPedidoActual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPedidoActual.setForeground(new java.awt.Color(255, 255, 255));
        lblPedidoActual.setText("Pedido Actual");

        javax.swing.GroupLayout pnlMenuMesasLayout = new javax.swing.GroupLayout(pnlMenuMesas);
        pnlMenuMesas.setLayout(pnlMenuMesasLayout);
        pnlMenuMesasLayout.setHorizontalGroup(
            pnlMenuMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuMesasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnIngresarPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCobrarMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuMesasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPedidoActual)
                .addGap(30, 30, 30))
            .addComponent(lblFotoMenuMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuMesasLayout.setVerticalGroup(
            pnlMenuMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuMesasLayout.createSequentialGroup()
                .addComponent(lblFotoMenuMesas)
                .addGap(21, 21, 21)
                .addComponent(btnIngresarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCobrarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPedidoActual)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMesasLayout = new javax.swing.GroupLayout(pnlMesas);
        pnlMesas.setLayout(pnlMesasLayout);
        pnlMesasLayout.setHorizontalGroup(
            pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMesasLayout.createSequentialGroup()
                        .addComponent(tglMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tglMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMesasLayout.createSequentialGroup()
                        .addComponent(tglMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tglMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75)
                .addGroup(pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tglMesa6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tglMesa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tglMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(pnlMenuMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlMesasLayout.setVerticalGroup(
            pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMesasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlMesasLayout.createSequentialGroup()
                        .addGroup(pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tglMesa6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tglMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tglMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addComponent(pnlMenuMesas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tglMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa1ActionPerformed
        
        mesaSeleccionada = 1;
        tglMesa2.setSelected(false);
        tglMesa3.setSelected(false);
        tglMesa4.setSelected(false);
        tglMesa5.setSelected(false);
        tglMesa6.setSelected(false);
        tglMesa7.setSelected(false);
        tglMesa8.setSelected(false);
    }//GEN-LAST:event_tglMesa1ActionPerformed

    private void tglMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa2ActionPerformed
        
        mesaSeleccionada = 2;
        tglMesa1.setSelected(false);
        tglMesa3.setSelected(false);
        tglMesa4.setSelected(false);
        tglMesa5.setSelected(false);
        tglMesa6.setSelected(false);
        tglMesa7.setSelected(false);
        tglMesa8.setSelected(false);
    }//GEN-LAST:event_tglMesa2ActionPerformed

    private void tglMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa3ActionPerformed
        
        mesaSeleccionada = 3;
        tglMesa1.setSelected(false);
        tglMesa2.setSelected(false);
        tglMesa4.setSelected(false);
        tglMesa5.setSelected(false);
        tglMesa6.setSelected(false);
        tglMesa7.setSelected(false);
        tglMesa8.setSelected(false);
    }//GEN-LAST:event_tglMesa3ActionPerformed

    private void tglMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa4ActionPerformed
        
        mesaSeleccionada = 4;
        tglMesa2.setSelected(false);
        tglMesa3.setSelected(false);
        tglMesa1.setSelected(false);
        tglMesa5.setSelected(false);
        tglMesa6.setSelected(false);
        tglMesa7.setSelected(false);
        tglMesa8.setSelected(false);
    }//GEN-LAST:event_tglMesa4ActionPerformed

    private void tglMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa5ActionPerformed

        mesaSeleccionada = 5;
        tglMesa2.setSelected(false);
        tglMesa3.setSelected(false);
        tglMesa4.setSelected(false);
        tglMesa1.setSelected(false);
        tglMesa6.setSelected(false);
        tglMesa7.setSelected(false);
        tglMesa8.setSelected(false);
    }//GEN-LAST:event_tglMesa5ActionPerformed

    private void tglMesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa6ActionPerformed
        mesaSeleccionada = 6;
        tglMesa2.setSelected(false);
        tglMesa3.setSelected(false);
        tglMesa4.setSelected(false);
        tglMesa5.setSelected(false);
        tglMesa1.setSelected(false);
        tglMesa7.setSelected(false);
        tglMesa8.setSelected(false);
    }//GEN-LAST:event_tglMesa6ActionPerformed

    private void tglMesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa7ActionPerformed
        mesaSeleccionada = 7;
        tglMesa2.setSelected(false);
        tglMesa3.setSelected(false);
        tglMesa4.setSelected(false);
        tglMesa5.setSelected(false);
        tglMesa6.setSelected(false);
        tglMesa1.setSelected(false);
        tglMesa8.setSelected(false);
    }//GEN-LAST:event_tglMesa7ActionPerformed

    private void tglMesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglMesa8ActionPerformed
        mesaSeleccionada = 8;
        tglMesa2.setSelected(false);
        tglMesa3.setSelected(false);
        tglMesa4.setSelected(false);
        tglMesa5.setSelected(false);
        tglMesa6.setSelected(false);
        tglMesa7.setSelected(false);
        tglMesa1.setSelected(false);
    }//GEN-LAST:event_tglMesa8ActionPerformed

    private void btnIngresarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPedidoActionPerformed
         this.setVisible(false);
        ingresarPedido.show();
    }//GEN-LAST:event_btnIngresarPedidoActionPerformed

    private void btnCobrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarMesaActionPerformed
        this.setVisible(false);
        cobrarMesa.show();
    }//GEN-LAST:event_btnCobrarMesaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCobrarMesa;
    private javax.swing.JButton btnIngresarPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFotoMenuMesas;
    private javax.swing.JLabel lblPedidoActual;
    private javax.swing.JList<String> lstPedidoActual;
    private javax.swing.JPanel pnlMenuMesas;
    private javax.swing.JPanel pnlMesas;
    private javax.swing.JToggleButton tglMesa1;
    private javax.swing.JToggleButton tglMesa2;
    private javax.swing.JToggleButton tglMesa3;
    private javax.swing.JToggleButton tglMesa4;
    private javax.swing.JToggleButton tglMesa5;
    private javax.swing.JToggleButton tglMesa6;
    private javax.swing.JToggleButton tglMesa7;
    private javax.swing.JToggleButton tglMesa8;
    // End of variables declaration//GEN-END:variables
}
