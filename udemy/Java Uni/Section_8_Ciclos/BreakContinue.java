package udemy.uni.Section_8_Ciclos;

public class BreakContinue {
    public static void main(String[] args) {
        
        System.out.println("Break and Continue");

        // Ejemplo break, imprimir solamente el primer numero par.

        for(int i = 1; i <= 10 ; i++){
            if(i % 2 == 0){
                System.out.println(i);
                //break;
            } }
        
        System.out.println("**** Segundo ejemplo ****");    
            for(int ie = 1; ie <= 10 ; ie++){
            if(ie % 2 == 0){
                System.out.println(ie);
                break;
            } }

        //Ejemplo con continue. Imprimir solo numeros pares ignorando los numeros impares.
        System.out.println("****** Continue ******");
        for(int numero = 1; numero < 10; numero++){
            if(numero % 2 == 1){ // numero impar
                continue; // Saltamos a la siguiente iteracion.
            }
            System.out.println(numero);
        }     
    
    }
}
