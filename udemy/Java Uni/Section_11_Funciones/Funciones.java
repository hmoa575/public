package udemy.uni.Section_11_Funciones;

public class Funciones {

    /**@param String mensaje */
    public static void enviaMensaje(String mensaje){
        System.out.println("El mensaje es: " + mensaje);
    }

    public static int sumar(int a, int b){
        int resultadoSuma = a + b;
        return resultadoSuma;
    }

    public static boolean esPar(int numero){    
        if(numero % 2 == 0){
            return true;
        } else{
           return false;
        }
    }

    public static boolean esPar2(int numero){
        return (numero % 2 == 0)? true: false;
        }
    
    public static void main(String[] args) {
        
        enviaMensaje("Hola desde Java");
        enviaMensaje("Que tal?");
        enviaMensaje("Cuanto es la suma de 5 mas 50?");
        int resultado_funcion = sumar(5, 50);
        System.out.println("La respuesta es: " + resultado_funcion);
        var resultado_esPar =esPar(10);
        System.out.println(resultado_esPar);
    }
}
