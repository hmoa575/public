package udemy.uni.Section_8_Ciclos;

import java.util.Scanner;

public class CiclosValidacionPassword {
    public static void main(String[] args) {
        
        Scanner inData = new Scanner(System.in);

        System.out.println("*** Sistema de Validacion de la Contraseña ***");
        System.out.println("Teclea tu nueva contraseña (Debe tener almenos 6 caracteres): ");
        String password = inData.nextLine();

        if(password.length() >= 6){
            System.out.println("Contraseña valida.");
        } else{
            System.out.println("Contraseña no valida. Debe tener almenos 6 caracteres.");
        }

        inData.close();
    }
}
