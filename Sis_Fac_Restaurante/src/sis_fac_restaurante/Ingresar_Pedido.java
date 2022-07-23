
package sis_fac_restaurante;


//Se importa DefaultTableModel para el control de la tabla en el formulario
import javax.swing.JOptionPane;

//Source de Ingresar_Pedido
public class Ingresar_Pedido extends javax.swing.JFrame {

    //Se declara la Menus como variable para poder accesar a todos los menus del restaurante y mostrarlos en la tabla del formulario
    Menus menu = new Menus();
    
    //Se declara la Mesas como variable para poder accesar a la variable mesaSeleccionada mas adelante en el programa y mostrar de nuevo el form de mesas al salir
    static Mesas mesa = new Mesas();
    
    //Se declara la clase principal en una variable para pode accesar a el arreglo pedidosMesas donde se van a encontrar todos los pedidos del programa
    Sis_Fac_Restaurante principal = new Sis_Fac_Restaurante();
    
    //Variable para guardar la cantidad de productos que se van a demostrar en la tabla
    public int cantidadProductos;
    
    //Se crea la variable funciones para traerse la funcion MostrarTabla
    public Funciones funciones = new Funciones();
    
    public Ingresar_Pedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblCategorias = new javax.swing.JLabel();
        btnComidaRapida = new javax.swing.JButton();
        btnLicores = new javax.swing.JButton();
        txtCodigoProducto = new javax.swing.JTextField();
        btnTipico = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnBebidasNaturales = new javax.swing.JButton();
        btnVegetariano = new javax.swing.JButton();
        btnGaseosas = new javax.swing.JButton();
        lblCodProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar Pedido");
        setBackground(new java.awt.Color(163, 96, 10));

        jPanel1.setBackground(new java.awt.Color(163, 96, 10));

        lblCategorias.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias");

        btnComidaRapida.setText("Comida Rapida");
        btnComidaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComidaRapidaActionPerformed(evt);
            }
        });

        btnLicores.setText("Licores");
        btnLicores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicoresActionPerformed(evt);
            }
        });

        txtCodigoProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        btnTipico.setText("Tipico");
        btnTipico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipicoActionPerformed(evt);
            }
        });

        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnBebidasNaturales.setText("Bebidas Naturales");
        btnBebidasNaturales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasNaturalesActionPerformed(evt);
            }
        });

        btnVegetariano.setText("Vegetariano");
        btnVegetariano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVegetarianoActionPerformed(evt);
            }
        });

        btnGaseosas.setText("Gaseosas");
        btnGaseosas.setActionCommand("Gaseosas   ");
        btnGaseosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaseosasActionPerformed(evt);
            }
        });

        lblCodProducto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblCodProducto.setText("Codigo Producto:");

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("Cantidad:");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblProductos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setText("Productos");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Producto", "Producto", "Precio"
            }
        ));
        tblProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProductos.setEnabled(false);
        tblProductos.setGridColor(java.awt.Color.black);
        tblProductos.setSelectionBackground(java.awt.Color.lightGray);
        jScrollPane4.setViewportView(tblProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblProductos)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblCodProducto)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblCantidad)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTipico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLicores, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnComidaRapida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBebidasNaturales))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVegetariano)
                                .addComponent(btnGaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategorias)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblCategorias)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTipico, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComidaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVegetariano, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLicores, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnBebidasNaturales, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGaseosas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodProducto)
                            .addComponent(lblCantidad)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Al presionar el boton Guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //Ciclo para verificar en cual espacio vacio del arreglo ingresar la siguiente orden
        for (int i = 0; i<100; i++)
        {
            //Si detecta un registro vacio en el arreglo, ingresa para agregar la info en este espacio
            if (principal.pedidosMesas[i].NumeroMesa == 0)
            {
                //Recorre el menu entero en busca del producto y la informacion del producto para el registro
                for(int y = 0; y<(menu.menuEntero.length); y++)
                {
                    //Si el ID del producto en el menuEntero coincide con el ID del producto que se desea ordenar, ingresa el registro con la informacion de este producto
                    if (menu.menuEntero[y][1].equals(txtCodigoProducto.getText()))
                    {
                        //Se ingresa el registro en el primer espacio vacio de pedidosMesas[] con la info del prodcuto deseado y la cantidad de productos ordenados
                        principal.pedidosMesas[i] = new Pedidos(mesa.mesaSeleccionada, Integer.parseInt(txtCantidad.getText()), menu.menuEntero[y][2], Integer.parseInt(menu.menuEntero[y][3]), (Integer.parseInt(menu.menuEntero[y][3])) * (Integer.parseInt(txtCantidad.getText())));
                        
                        JOptionPane.showMessageDialog(null, "Orden Ingresada con Exito:\n\nNumero de Mesa: " + mesa.mesaSeleccionada + "\nCantidad: " + txtCantidad.getText() + "\nProducto: " + menu.menuEntero[y][2] + "\nPrecio Unitario: " + menu.menuEntero[y][3] + "\nPrecio Total: " + (Integer.parseInt(menu.menuEntero[y][3])) * (Integer.parseInt(txtCantidad.getText())));
                    }
                }
                //Luego de detectar el espacio vacio en el arreglo y rellenarlo con el registro de la orden, se sale del ciclo
                break;
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Al seleccionar el boton para ver el menu Tipico
    private void btnTipicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipicoActionPerformed
        funciones.Mostrar_Tabla("t", tblProductos);
    }//GEN-LAST:event_btnTipicoActionPerformed

    //Al seleccionar el boton para ver el menu Comida Rapida
    private void btnComidaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComidaRapidaActionPerformed
        funciones.Mostrar_Tabla("r", tblProductos);
    }//GEN-LAST:event_btnComidaRapidaActionPerformed

    //Al seleccionar el boton para ver el menu Vegetariano
    private void btnVegetarianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVegetarianoActionPerformed
        funciones.Mostrar_Tabla("v", tblProductos);
    }//GEN-LAST:event_btnVegetarianoActionPerformed

    //Al seleccionar el boton para ver el menu Licores
    private void btnLicoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicoresActionPerformed
        funciones.Mostrar_Tabla("l", tblProductos);
    }//GEN-LAST:event_btnLicoresActionPerformed

    //Al seleccionar el boton para ver el menu Frescos Naturales
    private void btnBebidasNaturalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasNaturalesActionPerformed
        funciones.Mostrar_Tabla("n", tblProductos);
    }//GEN-LAST:event_btnBebidasNaturalesActionPerformed

    //Al seleccionar el boton para ver el menu Gaseosas
    private void btnGaseosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaseosasActionPerformed
        funciones.Mostrar_Tabla("g", tblProductos);
    }//GEN-LAST:event_btnGaseosasActionPerformed

    //Al presionar el boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.setVisible(false);
        mesa.setVisible(true);
    }                                        

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }    
    

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
            java.util.logging.Logger.getLogger(Ingresar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebidasNaturales;
    private javax.swing.JButton btnComidaRapida;
    private javax.swing.JButton btnGaseosas;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLicores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTipico;
    private javax.swing.JButton btnVegetariano;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblCodProducto;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    // End of variables declaration//GEN-END:variables
}
