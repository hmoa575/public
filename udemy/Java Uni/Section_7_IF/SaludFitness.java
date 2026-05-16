package udemy.uni.Section_7_IF;

import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        
        Scanner inData = new Scanner(System.in);

        final double META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;


        System.out.println("Cual es tu nombre?: " );
        String nombreUsuario = inData.nextLine();
        System.out.println("Cuantos pasos has caminado en el dia?: ");
        var pasosUsuario = inData.nextDouble();

        //Calculamos
        double caloriasQuemadas = pasosUsuario*CALORIAS_POR_PASO;

        //Verificamos
        // meta alcanzada = pasos diarios >= META PASOS DIARIOS

        if(pasosUsuario >= META_PASOS_DIARIOS){
            System.out.println("Felicidades " + nombreUsuario + " has alcanzado la meta!");
            System.out.println("Calorias quemadas: " + caloriasQuemadas);
            
        }else{
            System.out.println("No has alcanzado la meta.");
        }
        inData.close();
    }
}
