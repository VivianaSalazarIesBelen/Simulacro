
package vehiculo;

/**
 *
 * @author 
 */
/**
 * Clase que representa un vehículo con nombre, precio, precio con IVA y stock.
 */
public class VehiculoXXX2223 {

    /**
     * Devuelve el nombre del vehículo.
     *
     * @return El nombre del vehículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del vehículo.
     *
     * @param nombre El nombre del vehículo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del vehículo sin IVA.
     *
     * @return El precio del vehículo sin IVA.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del vehículo sin IVA.
     *
     * @param precio El precio del vehículo sin IVA.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el precio del vehículo con IVA.
     *
     * @return El precio del vehículo con IVA.
*/
public double getPrecioIVA() {
return precioIVA;
}
     /**
 * Establece el precio del vehículo con IVA.
 *
 * @param precioIVA El precio del vehículo con IVA.
 */
public void setPrecioIVA(double precioIVA) {
    this.precioIVA = precioIVA;
}

/**
 * Devuelve el stock actual de vehículos disponibles.
 *
 * @return El stock actual de vehículos disponibles.
 */
public int getStock() {
    return stock;
}

/**
 * Establece el stock de vehículos disponibles.
 *
 * @param stock El stock de vehículos disponibles.
 */
public void setStock(int stock) {
    this.stock = stock;
}


    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public VehiculoXXX2223 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    
    public VehiculoXXX2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del vehiculo
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del vehiculo
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

