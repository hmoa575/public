package udemy.uni.Section_7_IF;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        
        System.out.println("*** Sistema Bancario ***");

        Scanner inData = new Scanner(System.in);

        System.out.println("Desea salir del sistema (true/false)?: ");
        boolean salirSistema = inData.nextBoolean();

        //Verificamos
        if(!salirSistema){
            System.out.println("Nos mantenemos dentro del sistema...");
        } else{
            System.out.println("Salimos del sistema...");
        }

        inData.close();
    }
    
}
