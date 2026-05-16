package udemy.uni.Section_14_Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {
     public static void main(String[] args) {
        boolean anexar = false;
        String nombreArchivo = "mi_Archivo.txt";
        File archivo = new File(nombreArchivo);
        
        try {
            //Revisar el archivo
           anexar =  archivo.exists();
           PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
           String nuevoContenido = "Nuevo\ncontenido extra"; 
           salida.println(nuevoContenido);
           salida.close();
           System.out.println("Se agrego contenido al archivo...");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }// Fin metodo main
}// fin clase EscribirArchivo
