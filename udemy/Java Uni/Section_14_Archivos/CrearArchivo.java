package udemy.uni.Section_14_Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        
        String nombreArchivo = "mi_Archivo.txt";
        File archivo = new File(nombreArchivo);
        try {
            if(archivo.exists()){
            System.out.println("El archivo " + archivo + " ya existe.");
        }else{
            PrintWriter outPut = new PrintWriter(new FileWriter(archivo));
            outPut.close();
            System.out.println("Se ha creado el archivo.");
        }
        } catch (IOException e) {
            System.out.println("Error: al crear el archivo " + e.getMessage());
            e.printStackTrace();
        }
          
    }


}
