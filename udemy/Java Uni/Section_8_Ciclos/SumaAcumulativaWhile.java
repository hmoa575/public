package udemy.uni.Section_8_Ciclos;

public class SumaAcumulativaWhile{

    public static void main(String[] args) {
        
    System.out.println("===== Suma Acumulativa con while =====");
    /*
    Imprime la suma de los cinco primeros numeros
    */

    final int MAXIMO = 15;
    int sumaNumeros = 0;

    int i = 1;
    while(i <= MAXIMO){
    System.out.println("(sumaNumeros + i) -> " + sumaNumeros + " + " + i);
        sumaNumeros = sumaNumeros + i;
        i++ ;
    System.out.println("Suma parcial acumulada: " + sumaNumeros + "\n");    
    }
    System.out.println("Suma de los primeros " + MAXIMO + " numeros: " + sumaNumeros);



    // System.out.println(MAXIMO);
    // System.out.println(sumaNumeros);
    }
}