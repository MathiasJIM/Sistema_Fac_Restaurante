package sis_fac_restaurante;

import javax.swing.JOptionPane;
import javax.swing.JTable;

//Form RegistroUsuarios
public class RegistroUsuarios extends javax.swing.JFrame {

    //Variable principal que va a representar la clase Sis_Fac_Restaurante
    public static Sis_Fac_Restaurante principal = new Sis_Fac_Restaurante();
    
    //Variable funciones que va a representar la clase Funciones
    public static Funciones funciones = new Funciones();
    
    //Variable admin que va a representar la clase Administrativo
    public static Administrativo admin = new Administrativo();
    
    //Variable nombreUsuario que se va a encargar de los cambios que se realicen con respecto al nombre del usuario
    public String nombreUsuario; 
    
    //Variable para anotar la contraseña en el programa
    public String contrasenaUno;
    
    //Variable para confirmar la contraseña
    public String contrasenaDos;
    
    //Variable para avisar si se encontro el valor que se busca, y si no, se le informa al usuario
    public boolean encontrado;
    
    public RegistroUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 219, 244));

        lblUsuarios.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarios.setText("Usuarios");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Usuarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnModificar.setText("Cambiar Contr.");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Se solicitan el nombre de usuario y contraseña para el nuevo usuario
        nombreUsuario = JOptionPane.showInputDialog("                       AGREGAR USUARIO\nFavor ingresar el nombre del nuevo usuario:");
        
        //Ciclo para que se confirme la contraseña antes de ingresarla al sistema
        while (true)
        {
            contrasenaUno = JOptionPane.showInputDialog("                      AGREGAR USUARIO\nFavor ingresar la contraseña para el usuario:");
            contrasenaDos = JOptionPane.showInputDialog("                             AGREGAR USUARIO\nFavor confirmar la contraseña para el usuario imgresamdola de nuevo:");
            
            //Si las contraseñas coinciden, se rompe el ciclo
            if (contrasenaUno.equals(contrasenaDos))
            {
                break;
            }
            //Sino coinciden, se le informa al usuario para que vuelva a intentar
            else
            {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, favor volver a intentarlo...");
            }
        }
        
        //Ciclo que se va a encargar de buscar el espacio en blanco de la matriz para ingresar los valores
        for (int i = 0; i<10; i++)
        {
            //Cuando se encuentre el espacio en blanco se registran los valores en la matriz y rompe el ciclo despues
            if (" ".equals(principal.usuarios[i][0]))
            {
                principal.usuarios[i][0] = nombreUsuario;
                principal.usuarios[i][1] = contrasenaUno;
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Usuario y contraseña guardados con exito!");
        
        //Se refresca la tabla de Usuarios
        funciones.MostrarUsuarios(tblUsuarios);
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Al presionar el boton de salir se devuelve al menu del form Administrativo
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        admin.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Se solicitan el nombre de usuario que se desea eliminar
        nombreUsuario = JOptionPane.showInputDialog("                    AGREGAR USUARIO\nFavor ingresar el nombre del usuario que desea eliminar:");
        
        //Se reinicia la variable encontrado
        encontrado = false;
        
        //Ciclo que va a buscar el nombre del usuario y cuando lo encuentre, borra el dato del usuario junto a su conbtraseña
        for (int i = 0; i<10; i++)
        {
            if (principal.usuarios[i][0].equals(nombreUsuario))
            {
                principal.usuarios[i][0] = " ";
                principal.usuarios[i][1] = " ";
                encontrado = true;
            }
        }
        
        //Si se encuentra el valor buscado, se le informa al usuario
        if (encontrado == true)
        {
            JOptionPane.showMessageDialog(null, "Usuario y contraseña eliminados con exito!");

        }
        //Si no se encuentra, se le informa al usuario
        else
        {
            JOptionPane.showMessageDialog(null, "El nombre ingresado no coincide con ninguno de los usuarios dentro en el sistema");
        }
        
        //Se refresca la tabla de Usuarios
        funciones.MostrarUsuarios(tblUsuarios);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Se solicitan el nombre de usuario que se desea modificar
        nombreUsuario = JOptionPane.showInputDialog("                    AGREGAR USUARIO\nFavor ingresar el nombre del usuario que desea modificar:");
        
        //Se reinicia la variable encontrado
        encontrado = false;
        
        //Ciclo que va a buscar el valor que desea ser mmodificado
        for (int i = 0; i<10; i++)
        {
            //Si el dato coincide con un usuario en el sistema, se le pide al usuario que ingrese la nueva contraseña para realizar el cambio
            if (principal.usuarios[i][0].equals(nombreUsuario))
            {
                principal.usuarios[i][1] = JOptionPane.showInputDialog("                    AGREGAR USUARIO\nFavor ingresar la nueva contraseña de " + principal.usuarios[i][0] + ":");
                encontrado = true;
            }
        }
        
        //Si se encuentra el valor buscado, se le informa al usuario
        if (encontrado == true)
        {
            JOptionPane.showMessageDialog(null, "Contraseña modificada con exito!");

        }
        //Si el valor no se encuentra, se le informa la usuario
        else
        {
            JOptionPane.showMessageDialog(null, "El nombre ingresado no coincide con ninguno de los usuarios dentro en el sistema");
        }
        
        //Se refresca la tabla de Usuarios
        funciones.MostrarUsuarios(tblUsuarios);
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables

    //Getter de tblUsuarios para poder refrescar la tabla apenas se entre al formulario
    public JTable getTblUsuarios() {
        return tblUsuarios;
    }
}
