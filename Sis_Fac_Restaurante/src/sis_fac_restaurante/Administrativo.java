package sis_fac_restaurante;

//Clase Administrativo donde van a estar las opciones de administrador
public class Administrativo extends javax.swing.JFrame {
    //Variable mesas que representara el formulario Mesas
    public static Mesas mesas = new Mesas();
    
    //Variable users que representara el formulario RegistroUsuarios
    public static RegistroUsuarios users = new RegistroUsuarios();
    
    //Variable funciones que representara el formulario Funciones
    public static Funciones funciones = new Funciones();
    
    public Administrativo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdministrativo = new javax.swing.JPanel();
        lblAdministrativo = new javax.swing.JLabel();
        btnRegUsuarios = new javax.swing.JButton();
        btnRegClientes = new javax.swing.JButton();
        btnEditMenu = new javax.swing.JButton();
        btnSalirAdministrativo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(168, 66, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlAdministrativo.setBackground(new java.awt.Color(204, 102, 0));
        pnlAdministrativo.setForeground(new java.awt.Color(153, 51, 0));

        lblAdministrativo.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        lblAdministrativo.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministrativo.setText("Administrativo");

        btnRegUsuarios.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnRegUsuarios.setText("Registro Usuarios");
        btnRegUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUsuariosActionPerformed(evt);
            }
        });

        btnRegClientes.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnRegClientes.setText("Registro Clientes");
        btnRegClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegClientesActionPerformed(evt);
            }
        });

        btnEditMenu.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnEditMenu.setText("Editar Menu");
        btnEditMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMenuActionPerformed(evt);
            }
        });

        btnSalirAdministrativo.setFont(new java.awt.Font("Myanmar Text", 3, 14)); // NOI18N
        btnSalirAdministrativo.setText("Salir");
        btnSalirAdministrativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalirAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAdministrativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdministrativoLayout = new javax.swing.GroupLayout(pnlAdministrativo);
        pnlAdministrativo.setLayout(pnlAdministrativoLayout);
        pnlAdministrativoLayout.setHorizontalGroup(
            pnlAdministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministrativoLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(pnlAdministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalirAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAdministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRegClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        pnlAdministrativoLayout.setVerticalGroup(
            pnlAdministrativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministrativoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblAdministrativo)
                .addGap(18, 18, 18)
                .addComponent(btnRegUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Boton para ingresar a Registro de Usuarios
    private void btnRegUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUsuariosActionPerformed
        this.setVisible(false);
        users.setVisible(true);
        
        //Se imprimen los usuarios actuales en la tabla de Usuarios
        funciones.MostrarUsuarios(users.getTblUsuarios());
    }//GEN-LAST:event_btnRegUsuariosActionPerformed

    //Boton para ingresar a Registro de Clientes
    private void btnRegClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegClientesActionPerformed

    //Boton para ingresar a el editor del menu
    private void btnEditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMenuActionPerformed

    //Boton para salir y volver al form de Mesas
    private void btnSalirAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAdministrativoActionPerformed
        this.setVisible(false);
        mesas.setVisible(true);
    }//GEN-LAST:event_btnSalirAdministrativoActionPerformed

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
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditMenu;
    private javax.swing.JButton btnRegClientes;
    private javax.swing.JButton btnRegUsuarios;
    private javax.swing.JButton btnSalirAdministrativo;
    private javax.swing.JLabel lblAdministrativo;
    private javax.swing.JPanel pnlAdministrativo;
    // End of variables declaration//GEN-END:variables
}
