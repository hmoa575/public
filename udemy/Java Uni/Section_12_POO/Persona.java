package udemy.uni.Section_12_POO;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

    }

    /*
Sin embargo, el método que tiene parámetros está ignorando los atributos de la clase y solo está imprimiendo los parámetros que recibe.
El método sin parámetros imprime los atributos de la clase.
    */

public void mostrarPersona(String nombre, String apellido){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
