package udemy.uni.Section_12_POO;

public class Animal {
    
    protected void comer(){
        System.out.println("Me alimento muchas veces al dia.");
    }
    protected void dormir(){
        System.out.println("Duermo muchas horas.");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar, guau guau.");
    }

    @Override
    protected void comer(){
        System.out.println("Me gusta pollo con macarrones.");
        super.comer();
    }
    
}

class PruebaAnimal{
    public static void main(String[] args) {
            System.out.println("#### EJEMPLO DE HERENCIA ####");
        Perro perro = new Perro();
        perro.dormir();
        perro.comer();

    }
}

//NOTA: Los metodos privados no se heredan, para ello se utiliza "protected"
