package udemy.uni.Section_13_Avanzado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Pedro");
        miLista.add("Luz");
        miLista.add("Pedro");

        for(String elemento : miLista){
        System.out.println("Nombre: " + elemento);
        }
        
        List<String> semanaDias = new ArrayList<>();
        semanaDias.add("Lunes");
        semanaDias.add("Martes");
        semanaDias.add("Miercoles");
        semanaDias.add("Jueves");
        semanaDias.add("Viernes");
        semanaDias.add("Sabado");
        semanaDias.add("Domingo");
        // for(String dia : semanaDias){
        //     System.out.println("Hoy es: " + dia);
        // }

        // Forma Lambda
        semanaDias.forEach( dia -> {System.out.println("Hoy es: " + dia);});
        
        List<String> alumnos = Arrays.asList("Maria","Pedro","Laura");
        System.out.println("\nAlumnos: ");
        alumnos.forEach(System.out::println);

    }
}
