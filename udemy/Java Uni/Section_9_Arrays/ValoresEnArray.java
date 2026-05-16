package udemy.uni.Section_9_Arrays;

import java.util.Scanner;

public class ValoresEnArray {
    
 public static void introducirValoresAlArrego(){
    
    Scanner inData = new Scanner(System.in);

    System.out.println("Proporciona el tamanio del arreglo: ");
    int tamanioArreglo = inData.nextInt();

    var enteros = new int[tamanioArreglo];

    for(int i = 0; i < tamanioArreglo; i++){
        System.out.print("Proporciona un numero entero para el indice [" +i+"]: ");
        enteros[i] = inData.nextInt();
    }
    for(int i = 0; i < tamanioArreglo; i++){
        System.out.println(enteros[i]);
    }


    inData.close();
    } // Fin del metodo introducirValor


    public static void promedioCalificaciones(){
        Scanner inData = new Scanner(System.in);

        double sumaCalificaciones = 0;
        double calificacion = 0;
        double promedioCalificaciones = 0;

        System.out.println("Cuantas calificaciones deseas agregar?: ");
        int cantidadCalificaciones = inData.nextInt();
        promedioCalificaciones = sumaCalificaciones/cantidadCalificaciones;
        for(int i = 0; i <= cantidadCalificaciones; i++ ){
              
            System.out.print("Proporciona la calificacion [" +i+"]: ");
            calificacion = inData.nextDouble();
            sumaCalificaciones += calificacion;  

                    
        }
        System.out.println("El promedio de las calificaciones es: " + promedioCalificaciones);
    inData.close();
    }


public static void main(String[] args) {
    
    introducirValoresAlArrego();

    }// Fin del metodo main

}// Fin de la clase

// Fin del metodo