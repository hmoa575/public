package udemy.uni.Section_12_POO.Ventas;



public class Orden {
    
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes; 


public Orden(){
   this.idOrden = ++Orden.contadorOrdenes; 
   this.productos = new Producto[Orden.MAX_PRODUCTOS];
}

  //  List<Producto> productos = new ArrayList<>();

    public void agregarProductos(Producto newProduct){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
        this.productos[this.contadorProductos] = newProduct;
        this.contadorProductos++;
        }else{
        System.out.println("Se ha superado el limite de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++){
            var producto =  this.productos[i];
           total += producto.getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("ID Orden: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: " + totalOrden);
        System.out.println("\tProductos de la Orden: ");
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println("\t\t" + this.productos[i]);
        }
    }
    public void eliminarProducto(){

    }   
    public void modificarProducto(){

    }
    @Override
    public String toString() {
        return "Orden{" +
                "productos=" + productos +
                '}';
    }   
}
