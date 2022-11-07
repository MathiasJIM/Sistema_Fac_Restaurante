
//Package principal
package sis_fac_restaurante;

//Clase principal
public class Sis_Fac_Restaurante {
    
    /*Se declara la variable pedidosMesas[] que es tipo clase Pedidos y va a tener un tamaño de 100 registros
      en donde se van a agregar todos los pedidos de todas las mesas en desorden*/
    public static Pedidos pedidosMesas[] = new Pedidos[100];
    
    /*Se declara la variable usuarios[][] que va a contener los usuarios dentro del sistema y las contraseñas*/
    public static String usuarios[][] = new String[10][2];
    
    //Main
    public static void main(String[] args) {
        
        //Se declara como variable el formulario del Menu_Bienvenida
        Menu_Bienvenida inicioSesion = new Menu_Bienvenida();
        
        //Se asignan valores vacios iniciales a pedidosMesas[]
        for (int i = 0; i<100; i++)
        {
            pedidosMesas[i]= new Pedidos(0, 0, "", 0, 0);
        }
        
        //Se asignan valores vacios iniciales a usuarios[][]
        for (int i = 0; i<10; i++)
        {
            for (int j = 0; j<2; j++)
            usuarios[i][j]= " ";
        }
        
        //Se muestra el primer formulario del programa, el inicio de sesion
        inicioSesion.show();
    }
}
