package udemy.uni.Section_12_POO.Ventas;

public class Main{

    public static void main(String[] args) {
        System.out.println("#### Sistema de Ventas ####/n");

        Producto producto1 = new Producto("Camiseta", 10);
        System.out.println(producto1.toString());
        Producto producto2 = new Producto("Pantalon", 20);
        System.out.println(producto2);
        Producto producto3 = new Producto("Cobata", 15);
        System.out.println(producto3);

        Orden orden1 = new Orden();
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        orden1.agregarProductos(producto3);
        orden1.mostrarOrden();

    }
}
