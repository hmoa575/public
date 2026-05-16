package udemy.uni.Section_8_Ciclos;

import java.util.Scanner;

public class CiclosCajeroAutomatico {

    public static void main(String[] args) {       
    
        //Fields
        double saldo = 500;
        boolean salir = false;
    Scanner inData = new Scanner(System.in);

    

//Menu del cajero automatico
while(!salir){
System.out.println("*** Aplicacion de Cajero Automatico ***");    
System.out.print("""
        Operaciones que puedes realizar:
        1.Consulta de saldo
        2.Retirar efectivo
        3.Depositar
        4.Salir
        Elige una opcion:
        """);
        int opcion = inData.nextInt();
        inData.nextLine();

        switch (opcion) {
            case 1 -> System.out.printf("Tu saldo es: %.2f%n%n", saldo);
            case 2 -> {System.out.println("Ingresa el monto a retirar: ");
                        double montoRetirar = inData.nextDouble();
                        if(montoRetirar <= saldo){
                        saldo = saldo - montoRetirar;
                        System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo);
                     } else {System.out.println("Saldo insuficiente.");}}
            case 3 -> {System.out.println("Ingresa el monto a depositar: ");
                        double montoIngresar =  inData.nextDouble();
                        saldo = saldo + montoIngresar;
                        System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo);}
            case 4 -> {System.out.println("Hasta luego");
                        salir = true;}
            default -> System.out.println("Opcion no valida. \n");
        }
    }
        inData.close();
    }
}