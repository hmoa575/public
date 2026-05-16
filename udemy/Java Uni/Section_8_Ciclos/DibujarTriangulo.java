package udemy.uni.Section_8_Ciclos;

import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        
        //Instances
        Scanner inData = new Scanner(System.in);

        //Fields
        int numeroFilas = 0;

        //Console
        System.out.println("Proporciona el numero de filas para el triangulo: ");
        numeroFilas = inData.nextInt();

        //Se itera sobre cada fila del triangulo.
        for(int fila = 1; fila <= numeroFilas; fila++){
            String espacioBlanco = " ".repeat(numeroFilas - fila);
            String asteriscos = "*".repeat((fila * 2) - 1);
            System.out.println(espacioBlanco + asteriscos);
            
        }
        inData.close();
    }
}
