
package autocine_arreglodeobjetos;

import javax.swing.JOptionPane;


public class Autocine {
    public static String autocine[][] = new String [3][4];
    
    public static String Placa;
    
    public void Menu_Autocine()
    {
        boolean continuar = true;
        
        while (continuar)
        {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                            BIENVENIDO AL AUTOCINE
                                                                            
                                                                            
                                                                            Seleccione una opcion:
                                                                            
                                                                            1. Registrar reserva
                                                                            2. Modificar reserva
                                                                            3. Eliminar Reserva
                                                                            4. Consultar Reserva
                                                                            5. Consultar Disponibilidad
                                                                            
                                                                            6. Salir del Programa"""));
            
            switch(opcion)
            {
                case 1 -> Registrar_Placa();
                case 2 -> Modificar_Placa();
                case 3 -> Eliminar_Placa();
                case 4 -> Consultar_Placa();
                case 5 -> Consultar_Arreglo();
                case 6 -> continuar = false;
                default -> JOptionPane.showMessageDialog(null, "Ha ingresado un valor erroneo, favor ingresar un valor entre el 1 y el 6...");   
            }
        }
    }
    
    public void Registrar_Placa()
    {
        
    }
    
    public void Modificar_Placa()
    {
        
    }
    
    public void Eliminar_Placa()
    {
        
    }
    
    public void Consultar_Placa()
    {
        
    }
    
    public void Consultar_Arreglo()
    {
        
    }
}
