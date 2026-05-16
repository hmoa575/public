package udemy.uni.Section_8_Ciclos;

public class Ciclos8 {

    public static void main(String[] args) {
        
//WHILE
        //La variable "i" index se declara al inicio del ciclo o bucle.
        int i = 1;
        while(i <= 3){
            System.out.println(i);
            i++; // El incremento se realiza al final del ciclo o bucle.
        }
        System.out.println("\n****Variable Contador****");
        var contador = 0;
        while(contador <= 5){
            System.out.println(contador);
            contador++;
        }

        System.out.println("\n ****Imprime los numeros para del 0 al 20****");
        
        int ia = 0;
        while(ia <= 20){
            if(ia % 2 == 0){
            System.out.print(ia + " ");
        } 
            ia++;
    }

// DO WHILE
        System.out.println("\n***** DO WHILE *****");
            //La variable "i" index se declara al inicio del ciclo o bucle.
        int ib = 1;
        do{ // "do" es la primera expresion forzando la ejecucion del bucle.
        System.out.print(" "+ ib);
        ib++; // El incremento va despues de la ejecucion.
        } while(ib <=10); // En este caso "While" va al final.


        System.out.println("Numeros del 1 al 10 en decendente.");
        int ic = 10;
        do{
            System.out.print(ic + " ");
            --ic;
        } while (ic > 0);

System.out.println("#################################################");
System.out.println("Numeros impares");

            int id = 0;
            do{
                if(id % 2 != 0){
                System.out.println(id);
                }
                id++;
            } while(id <= 30);

System.out.print("\n ************ Bucle FOR *********** \n");

            for(int ie = 1; ie <=5; ie++){
                System.out.println("El numero a imprimir es: " + ie);
            }

    }

    
}
