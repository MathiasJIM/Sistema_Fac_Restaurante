package sis_fac_restaurante;

//Se importa el JOPtionPane
import javax.swing.JOptionPane;

//Source del Menu_Bienvenida
public class Menu_Bienvenida extends javax.swing.JFrame {
    
    //Se declara la variable de nombreUsuario
    public String nombreUsuario = "";
    
    //Se declara el formulario Mesas como una variable para llamar luego en el programa
    Mesas menuMesas = new Mesas();
    
    public Menu_Bienvenida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFot = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        pnlInicioSesion = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblInicioSesion = new javax.swing.JLabel();
        lblcontrasena = new javax.swing.JLabel();
        lblPista = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        lblTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Facturacion Ripichip's");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblFot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sis_fac_restaurante/ripichip´s.png"))); // NOI18N

        lblTitulo2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        lblTitulo2.setText("Ripichip's Fast Food");

        pnlInicioSesion.setBackground(new java.awt.Color(140, 81, 36));
        pnlInicioSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblNombre.setFont(new java.awt.Font("Microsoft Tai Le", 0, 16)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblInicioSesion.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        lblInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioSesion.setText("Iniciar Sesión");

        lblcontrasena.setFont(new java.awt.Font("Microsoft Tai Le", 0, 16)); // NOI18N
        lblcontrasena.setForeground(new java.awt.Color(255, 255, 255));
        lblcontrasena.setText("Contraseña:");

        lblPista.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        lblPista.setForeground(new java.awt.Color(255, 255, 255));
        lblPista.setText("Pista contraseña: Nombre del profe más tuanis de programación");

        txtNombre.setNextFocusableComponent(txtContrasena);

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnIngresar.setNextFocusableComponent(txtNombre);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtContrasena.setNextFocusableComponent(btnIngresar);
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInicioSesionLayout = new javax.swing.GroupLayout(pnlInicioSesion);
        pnlInicioSesion.setLayout(pnlInicioSesionLayout);
        pnlInicioSesionLayout.setHorizontalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcontrasena)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblInicioSesion))
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPista)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInicioSesionLayout.setVerticalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblInicioSesion)
                .addGap(30, 30, 30)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcontrasena)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblPista)
                .addContainerGap())
        );

        lblTitulo1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 20)); // NOI18N
        lblTitulo1.setText("Sistema de Facturación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitulo2)
                                .addGap(199, 199, 199))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTitulo1)
                                .addGap(180, 180, 180))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pnlInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addComponent(lblFot))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo2)
                .addGap(33, 33, 33)
                .addComponent(pnlInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblFot, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Al presionar el boton "Ingresar"
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //Se guarda el contenido de txtNombre en la variable nombreUsuario
        nombreUsuario = txtNombre.getText();
        
        //Condicional para revisar si la contraseña esta en lo correcto
        if (!"Robert".equals(txtContrasena.getText()))
        {
            JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA, INTENTELO DE NUEVO...", "Contraseña incorrecta", JOptionPane.OK_OPTION);
            txtContrasena.setText("");
        }
        else
        {
            //Si la contraseña esta en lo correcto se ingresa al menuMesas que va a ser el Formulario central del programa
            this.setVisible(false);
            menuMesas.show();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        
    }//GEN-LAST:event_txtContrasenaActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblFot;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPista;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JPanel pnlInicioSesion;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
