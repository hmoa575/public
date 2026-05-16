package udemy.uni.Section_8_Ciclos;

import java.util.Scanner;

public class CiclosMenuIterativo {
   public static void main(String[] args){

    Scanner inData = new Scanner(System.in);

    boolean salir = false;

    //Comenzar con la iteracion del menu

    while(!salir){
        System.out.print("""
                *** Sistema de Administración de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción:\s
                """);
    int opcion = inData.nextInt();

    // Evaluar cada opcion

   switch(opcion){
        case 1 -> System.out.println("Tu cuenta ha sido creada");
        case 2 -> System.out.println("La cuenta ha sido eliminada");
        case 3 -> {System.out.println("Hasta luego");
        salir =true;}
        default -> System.out.println("Opcion no valida.\n");   
    }   
        
        System.out.println(opcion);
        
    }
    System.out.println("Fin del Sistema de Administración de Cuentas");
    inData.close();
   } 

}
