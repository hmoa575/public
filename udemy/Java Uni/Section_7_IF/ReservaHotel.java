package udemy.uni.Section_7_IF;

import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        
        Scanner inData = new Scanner(System.in);

        System.out.println("*** Sistema de Reservas de Hotel ***");

        double habitacionSinVistaMar = 150.50;
        double habitacionConVistaMar = 190.50; 
        double precio = 0.0;


        System.out.println("Nombre del Cliente: ");
        String nombreCliente = inData.nextLine();
        System.out.println("Dias de estancia: ");
        int diasEstancia = inData.nextInt();
        System.out.println("Cuarto con vistas al mar (true/false)?: ");
        boolean esVistaMar = inData.nextBoolean();

        if(esVistaMar){
            precio = habitacionConVistaMar*diasEstancia;
            System.out.println(nombreCliente);
            System.out.println("Eligio habitacion con vista al mar.");
            System.out.printf("El costo es: %.2f%n", precio);
        }else if(!esVistaMar){
            precio = habitacionSinVistaMar*diasEstancia;
            System.out.println(nombreCliente);
            System.out.println("Eligio habitacion sin vista al mar.");
            System.out.printf("El costo es: %.2f%n", precio);
        } else {
            System.out.println("Debe elegir un tipo de habitacion y los dias de estancia.");
        }
        inData.close();
    }
}
