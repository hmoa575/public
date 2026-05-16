package udemy.uni.Section_13_Avanzado.MaquinaVending;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
    public static void maquinaSnacks(){
        boolean salir = false;
        Scanner inData = new Scanner(System.in);
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); //Muestra inventario
        while(!salir){
           try {
                var opcion = mostrarMenu(inData);
                salir = ejecutarOpciones(opcion, inData, productos);
           } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
           }
           finally{
            System.out.println(); // Salto de linea
           }
        }   
    }
    private static int mostrarMenu(Scanner inData){
        System.out.print("""
                MENU:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                Elige una opcion:\s""");
       return Integer.parseInt(inData.nextLine());         
    }    
    private static boolean ejecutarOpciones(int opcion, Scanner inData, List<Snack> productos){
        boolean salir = false;
        switch(opcion){
            case 1 -> comprarSnack(inData, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarNuevoSnack(inData);
            case 4 -> salir = true;
            default -> System.out.println("Error: opcion no valida");
        }

        return salir;
    }    
    private static void comprarSnack(Scanner inData, List<Snack> productos){
        System.out.print("Cual snack deseas comprar (id)?: ");
        var idSnack = Integer.parseInt(inData.nextLine());
        //Validacion que el snack exista en la lista de snacks.
        var snackEncontrado = false;
        for(var snack : Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()){
                //Se agrega el snack a la lista de productos.
                productos.add(snack);
                System.out.println("Snack: " + snack + " agregado.");
                snackEncontrado = true;
                break; //Termina la iteracion del ciclos for
            }
        }
       if(!snackEncontrado){
        System.out.println("Id de snack no encontrado: " + idSnack);
       }
    } // Fin metodo comprarSnack()

    private static void mostrarTicket(List<Snack> productos){
        var ticket = "***** Ticket de Venta *****";
        var total = 0.0; 
        for(var producto : productos){
            ticket += "\n\t -" +producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal: $" + total;
        System.out.println(ticket);
    }//Fin metodo mostrarTicket()

    private static void agregarNuevoSnack(Scanner inData){
       System.out.print("Nombre del nuevo snack: ");
       var nombre = inData.nextLine();
       System.out.print("Precio del snack: ");
       var precio = Double.parseDouble(inData.nextLine());
       Snacks.agregarSnack(new Snack(nombre,precio));
       System.out.println("Tu snack se ha agregado correctamente.");
       Snacks.mostrarSnacks();
    }//Fin metodo agregarNuevoSnack()
}