package udemy.uni.Section_13_Avanzado;

public class ArgumentosVariables {
    public static void main(String[] args) {
        
        imprimirNumeros(1,2,3,4,5);
        variosParametros("Karla", 10, 30, 50);
    }
    public static void imprimirNumeros(int... numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
    public static void variosParametros(String nombre, int... numeros){
        System.out.println("\nNombre: " + nombre);
        imprimirNumeros(numeros);
    }
}
