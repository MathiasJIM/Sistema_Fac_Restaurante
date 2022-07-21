
package sis_fac_restaurante;

//La clase Pedidos va a ser el molde de los pedidos del programa, donde se van a almacenar todos los pedidos realizados en el programa en desorden
public class Pedidos {
    
    //El orden de la informacion dentro de los pedidos va a ser el siguiente:
    public int NumeroMesa;
    public int CantidadProducto;
    public String NombreProducto;
    public int PrecioUnitario;
    public int PrecioFinal;
    
    //Constructores
    public Pedidos(int numeroMesa, int cantidadProducto, String nombreProducto, int precioUnitario, int precioFinal)
    {
        this.NumeroMesa = numeroMesa;
        this.CantidadProducto = cantidadProducto;
        this.NombreProducto = nombreProducto;
        this.PrecioUnitario = precioUnitario;
        this.PrecioFinal = precioFinal;
    }
}
