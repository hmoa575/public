package udemy.uni.Section_12_POO;

//import udemy.uni.Section_12_POO.Aritmetica;

public class Main{
    public static void main(String[] args) {
        Persona persona = new Persona("Hector", "Olmos");
        persona.mostrarPersona("Juan","Perez");

        Persona persona2 = new Persona("Laura","Perez");
        persona2.setNombre("Angel") ;
        persona2.setApellido("Lopez");
        persona2.getNombre();
        persona2.getApellido();
        persona2.mostrarPersona();

        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.setOperando1(2);
        aritmetica1.setOperando2(4);
        aritmetica1.sumar();

        Aritmetica aritmetica2 = new Aritmetica();
        aritmetica2.setOperando1(10);
        aritmetica2.setOperando2(5);
        aritmetica2.restar();
        
       var aritmetica3 = new Aritmetica();
       aritmetica3.sumar(3,4);
    }
}
