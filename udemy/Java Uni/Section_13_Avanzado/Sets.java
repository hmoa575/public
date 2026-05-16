package udemy.uni.Section_13_Avanzado;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Pedro");
        conjunto.add("Laura");
        conjunto.add("Carlos");

        System.out.println("Elementos del consunto Set.\n");
        conjunto.forEach(System.out::println);

        conjunto.remove("Pedro");
        System.out.println("\nNuevos elementos del conjunto Set.");
        conjunto.forEach(System.out::println);
    
    }
}
