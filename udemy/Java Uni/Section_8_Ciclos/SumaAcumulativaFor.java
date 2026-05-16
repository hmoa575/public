package udemy.uni.Section_8_Ciclos;

public class SumaAcumulativaFor {

    public static void main(String[] args) {
         System.out.println("===== Suma Acumulativa con For =====");
    /*
    Imprime la suma de los cinco primeros numeros
    */

    final int MAXIMO = 15;
    int sumaNumeros = 0;

        for(int i = 1 ; i <= MAXIMO ; i++){
            sumaNumeros = sumaNumeros + i;
            }
            System.out.println(sumaNumeros);    


    }
    
}
