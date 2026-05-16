package udemy.uni.Section_7_IF;

import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {

        Scanner inData = new Scanner(System.in);

        System.out.println("*** Casa de los Espejos ***");

        int mayorEdad = 10;
        boolean oscuridadMiedo = true;

        System.out.println("Cual es tu edad?: ");
        mayorEdad = inData.nextInt();
        System.out.println("Tienes miedo a la oscuridad (true/false)?: ");
        oscuridadMiedo = inData.nextBoolean();

        if(mayorEdad >= 10 && !oscuridadMiedo){
            System.out.println("Puedes entrar");
        }else{
            System.out.println("No puedes entrar");
        }
        inData.close();
    }
}
