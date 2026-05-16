package udemy.uni.Section_12_POO.Ventas;

public class Producto {
    
   private final int idProducto;
   private String nombreProducto;
   private double precio;
   private static int contadorProductos;

    
    public Producto(String nombreProducto, double precio){

if(nombreProducto == null){
        throw new IllegalArgumentException("Error: El valor no puede ser null.");
    }
if(precio <= 0){
        throw new IllegalArgumentException("Error: El valor no puede ser igual o menor a 0.");
    }
        this.idProducto = ++Producto.contadorProductos;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

public int getIdProducto(){
    return this.idProducto;
}
public String getNombreProducto(){
    return this.nombreProducto;
}
public void setNombreProducto(String newName){
    this.nombreProducto = newName;
}
public double getPrecio(){
    return this.precio;
}
public void setPrecio(double newPrice){
    this.precio = newPrice;
}
@Override
public String toString() {
    return "Producto{" +
            "idProducto=" + this.idProducto +
            ", nombreProducto='" + this.nombreProducto + '\'' +
            ", precio=" + this.precio +
            '}';

    }
}
