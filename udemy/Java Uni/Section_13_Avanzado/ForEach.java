package udemy.uni.Section_13_Avanzado;

public class ForEach {
    public static void main(String[] args){
         
        int edades[] = {5, 10, 30, 45};
        //Suma de todos los elementos de la lista.
        int sumar = 0;
        for(int edad : edades){
            sumar += edad;
            System.out.println("Va sumando: " + sumar);
        }
        // Muestra los elementos de la lista
        for(int edad : edades){
            System.out.println("La edad es: " + edad);
        }

    }

}
