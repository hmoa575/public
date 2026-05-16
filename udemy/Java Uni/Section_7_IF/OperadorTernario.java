package udemy.uni.Section_7_IF;

public class OperadorTernario {
    public static void main(String[] args) {
        
    
    // Sintaxis
    // condicion ? exp1 : exp2 ;

    int numero = 4;
    boolean resultado = (numero % 2 == 0)? true:false;
    String resultado2 = (numero % 2 != 0)? "impar":"par";

    System.out.println(resultado);
    System.out.println(resultado2); 
    
    
        var edad = 17;
        var mensaje = (edad >= 18)? "Mayor de edad" : "Es menor de edad";
        System.out.println(mensaje);

        //Valor positivo, negatico o cero (Operador ternario anidado)
        int valorNumero = 1;
        String resultadoAnidado = (valorNumero > 0)?"Positivo":(valorNumero<0)?"Negativo":"es cero";
        System.out.println(resultadoAnidado);
    }
}
