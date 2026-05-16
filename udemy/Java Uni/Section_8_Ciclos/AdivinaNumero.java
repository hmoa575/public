package udemy.uni.Section_8_Ciclos;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    
    public static void main(String[] args) {
        
        //Instances
        Scanner inData = new Scanner(System.in);
        Random random = new Random();
        
        //Fields
        int numeroRandom = random.nextInt(10) + 1;
        int intentos = 0;
        int numeroUsuario = 0;
        final int INTENTOS_MAX = 5;

        while(numeroUsuario != numeroRandom && intentos < INTENTOS_MAX){
                System.out.println("Adivina el numero secreto (1-10): ");
                numeroUsuario = inData.nextInt();

                //Ayuda al jugador
                if(numeroUsuario < numeroRandom){
                    System.out.println("El numero secreto es mayor.");
                }else if (numeroUsuario < numeroRandom){
                    System.out.println("El numero secreto es menor.");
                } 
                intentos++;
        }
        if(numeroUsuario == numeroRandom){
            System.out.printf("Felicidades es el numero correcto adivinaste en %d intentos%n ", intentos);
        } else{
            System.out.printf("Has utilizado los intentos maximos de: %d%n", INTENTOS_MAX);
            System.out.println("El numero secreto es: " + numeroRandom);
        }


        inData.close();
    }
}
