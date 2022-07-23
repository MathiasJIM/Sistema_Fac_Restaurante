
package sis_fac_restaurante;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Funciones {
    
    //Se declara cantidad de Productos que va a contar los productos que se van a desplegar en el formulario
    public int cantidadProductos;
    
    //Se declara menu para poder ingresar a el menu del sistema
    Menus menu = new Menus();
    Sis_Fac_Restaurante principal = new Sis_Fac_Restaurante();
    
    
    /*ESTA FUNCION SE VA A ENCARGAR DE RECIBIR LA CATEGORIA DE EL MENU Y LA TABLA DEL FORMULARIO PARA IMPRIMIR DENTRO DE LA TABLA
      TODOS LOS PRODUCTOS DE ESA CATEGORIA DEL MENU                                                                              */
    public void Mostrar_Tabla(String categoria, javax.swing.JTable tblProductos)
    {
        //Se inicializa cantidad productos en 0 que va a contar los productos que se van a desplegar en el formulario
        cantidadProductos = 0;
        
        //Utilizando DefaultTableModel se genera la variable modeloTabla que va a controlar los tamaños de las tablas
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        
        //Se declara la variable que va a controlar el tamaño de las columnas
        TableColumnModel columnSize = tblProductos.getColumnModel();
        
        //Variable que se encarga del centrado de las columnas
        DefaultTableCellRenderer centradoColumna = new DefaultTableCellRenderer();
                
        //Se define la cantidad de filas en 100 para inicializar la tabla
        modeloTabla.setRowCount(100);
        
        //Se define la cantidad de columnas
        modeloTabla.setColumnCount(3);
        
        //Se le da tamaño a las columnas
        columnSize.getColumn(0).setMaxWidth(30);
        columnSize.getColumn(0).setPreferredWidth(30);
        columnSize.getColumn(2).setMaxWidth(110);
        columnSize.getColumn(2).setPreferredWidth(80);
        
        //Se Centran los valores de las columnas en la tabla
        centradoColumna.setHorizontalAlignment(0);
        tblProductos.getColumnModel().getColumn(0).setCellRenderer(centradoColumna);
        tblProductos.getColumnModel().getColumn(2).setCellRenderer(centradoColumna);
        
        //Ciclo para rellenar la tabla de el formulario con los valores dentro del menu
        for (int j=0; j<(menu.menuEntero.length); j++)
        {
            for (int i=0; i<3; i++)
            {
                //Si la categoria del producto en el menu coincide con lo que se requiere, se acomoda en la tabla
                if (categoria.equals(menu.menuEntero[j][0]))
                {
                    //Se agrega 1 por 1 los valores del menu en la tabla, duplicando el menu en la tabla del formulario
                    tblProductos.setValueAt(menu.menuEntero[j][i+1], cantidadProductos, i);
                }
            }
            
            //Condicion para contar la cantidad de productos en la tabla
            if (categoria.equals(menu.menuEntero[j][0]))
            {
                //Se suma 1 valor a la cantidad de productos para determinar el tamaño de la tabla al final del ciclo
                cantidadProductos += 1;
            }
        }
        
        //Se ajusta el tamaño de la tabla dependiendo del numero de productos en el menu
        modeloTabla.setRowCount(cantidadProductos);
    }
    
    public void Mostrar_Pedidos(javax.swing.JTable tblPedidos, int numeroMesa)
    {
        //Se inicializa cantidad productos en 0 que va a contar los productos que se van a desplegar en el formulario
        cantidadProductos = 0;
        
        //Utilizando DefaultTableModel se genera la variable modeloTabla que va a controlar los tamaños de las tablas
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPedidos.getModel();
        
        //Se declara la variable que va a controlar el tamaño de las columnas
        TableColumnModel columnSize = tblPedidos.getColumnModel();
        
        //Variable que se encarga el centrado de las columnas
        DefaultTableCellRenderer centradoColumna = new DefaultTableCellRenderer();
        
        //Se define la cantidad de filas en 100 para inicializar la tabla
        modeloTabla.setRowCount(100);
        
        //Se define la cantidad de columnas
        modeloTabla.setColumnCount(2);
        
        //Se le da tamaño a las columnas
        columnSize.getColumn(0).setMaxWidth(30);
        columnSize.getColumn(0).setPreferredWidth(30);
        
        //Se Centran los valores de las columnas en la tabla
        centradoColumna.setHorizontalAlignment(0);
        tblPedidos.getColumnModel().getColumn(0).setCellRenderer(centradoColumna);
        
        //Ciclo para rellenar la tabla de el formulario con los valores dentro del menu
        for (int j=0; j<(principal.pedidosMesas.length); j++)
        {
            for (int i=0; i<3; i++)
            {
                //Si la categoria del producto en el menu coincide con lo que se requiere, se acomoda en la tabla
                if (numeroMesa == principal.pedidosMesas[j].NumeroMesa)
                {
                    //Se agrega 1 por 1 los valores del menu en la tabla, duplicando el menu en la tabla del formulario
                    tblPedidos.setValueAt(principal.pedidosMesas[j], cantidadProductos, i);
                }
            }
            
            //Condicion para contar la cantidad de productos en la tabla
            if (numeroMesa == principal.pedidosMesas[j].NumeroMesa)
            {
                //Se suma 1 valor a la cantidad de productos para determinar el tamaño de la tabla al final del ciclo
                cantidadProductos += 1;
            }
        }
        
        //Se ajusta el tamaño de la tabla dependiendo del numero de productos en el menu
        modeloTabla.setRowCount(cantidadProductos);
    }
}
