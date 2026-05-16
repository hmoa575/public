package udemy.uni.Section_13_Avanzado;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        
    Map<String, Object> persona = new HashMap<>();
    persona.put("Nombre","Diego");
    persona.put("Apellido","Flores");
    persona.put("Edad", 31);
    
    System.out.println("Los valores del Mapa o Diccionario: ");

    persona.entrySet().forEach(System.out::println);
    
    persona.put("Edad", 35);

    persona.entrySet().forEach(System.out::println);

    persona.remove("Edad");

    persona.entrySet().forEach(System.out::println);

    System.out.println("\nIterando los elementos (llave,valor)");

    persona.forEach((k,v) -> {
        System.out.println("Llave: " + k + ", valor: " + v);
    });
    }
}
