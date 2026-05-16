package udemy.uni.Section_14_Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "mi_Archivo.txt";
        @SuppressWarnings("unused")
        File archivo = new File(nombreArchivo);

        try {
           System.out.println("Contenido del archivo: "); 
           var entrada = new BufferedReader(new FileReader(nombreArchivo));
           //Linea a linea
           var linea = entrada.readLine();
           //Para leer todas la lineas.
           while(linea != null){
            System.out.println(linea);
            //Antes de terminar el ciclo while, se mueve a la siguiente linea.
                linea = entrada.readLine();
           }
           //cerrar recurso o archivo.
           entrada.close();
           
        } catch (Exception e) {
            System.out.println("Error: al leer el archivo" + e.getMessage());
        }
    }
}
