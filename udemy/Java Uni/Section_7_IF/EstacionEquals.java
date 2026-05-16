package udemy.uni.Section_7_IF;

import java.util.Scanner;

public class EstacionEquals {
    
    public static void main(String[] args) {
       // String estacion = "invierno";

        // if (estacion.equals("invierno")) {
        //     System.out.println("Es invierno");
        // } else if (estacion.equals("primavera")) {
        //     System.out.println("Es primavera");
        // } else if (estacion.equals("verano")) {
        //     System.out.println("Es verano");
        // } else if (estacion.equals("otoño")) {
        //     System.out.println("Es otoño");
        // } else {
        //     System.out.println("Estación no válida");
        // }
    
        Scanner inData = new Scanner(System.in);
        System.out.println("Dime el mes y te dire la estacion: ");
        String mes = inData.nextLine();


    if(mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Febrero") || mes.equalsIgnoreCase("Diciembre")){
        System.out.println("La estacion es invierno");
    }else if(mes.equalsIgnoreCase("Marzo") || mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Mayo")) {
        System.out.println("La estacion es primavera");
    }else if(mes.equalsIgnoreCase("Junio") || mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto")){
        System.out.println("La estacion es verano");
    }else if(mes.equalsIgnoreCase("Septiembre") || mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Noviembre")){
        System.out.println("La estacion es otono");
    } else {
        System.out.println("Mes invalido.");
    }

        inData.close();
    }
}
