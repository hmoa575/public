package udemy.uni.Section_11_Funciones;

public class FuncionRecursiva {
    
    public static void funcionRecursiva(int numero){
        if(numero == 1){
            System.out.print(numero + " ");
        } else{
            //Caso recursivo
            funcionRecursiva( numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        
        funcionRecursiva(5);
    }
}
