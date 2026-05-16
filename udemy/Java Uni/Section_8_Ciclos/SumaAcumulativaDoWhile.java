package udemy.uni.Section_8_Ciclos;

public class SumaAcumulativaDoWhile {
    
    public static void main(String[] args) {
        
        System.out.println("===== Suma Acumulativa con do-while =====");
    /*
    Imprime la suma de los cinco primeros numeros
    */

    final int MAXIMO = 15;
    int sumaNumeros = 0;

        int i = 1;
        do{
            sumaNumeros = sumaNumeros + i; 
            i++; 
        } while( i <= MAXIMO);
        System.out.println(sumaNumeros);

    }
    
}
