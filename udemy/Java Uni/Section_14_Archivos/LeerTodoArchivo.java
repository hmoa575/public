package udemy.uni.Section_14_Archivos;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodoArchivo {
    public static void main(String[] args) {
        
        String nombreArchivo = "mi_Archivo.txt";
        try {
            //Leer todas las lineas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            for(String linea : lineas){
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();    
        }
    }


}
