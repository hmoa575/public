package udemy.uni.Section_13_Avanzado.MaquinaVending;

import java.io.Serializable;

public  class Snack implements Serializable{
    
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack(){
        this.idSnack = ++Snack.contadorSnacks;
    }

    public Snack( String nombre, double precio){
        this(); //Manda a llamar al constructor vacio.
        this.nombre = nombre;
        this.precio = precio; 
    }
        //Getters and Setters
    // public static void setContadorSnacks(int contadorSnacks) {
    //     Snack.contadorSnacks = contadorSnacks;
    // }
    // public void setIdSnack(int idSnack) {
    //     this.idSnack = idSnack;
    // }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public int getContadorSnacks(){
        return contadorSnacks;
    }
    public int getIdSnack(){
        return idSnack;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }   

@Override
    public String toString(){
        return "Snack{" +
               "idSnack=" + idSnack +
               ", nombre='" + nombre + '\'' +
               ", precio=" + precio +
               '}';

    }
@Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(snack.precio, precio) == 0 && nombre.equals(snack.nombre);
    }
@Override
public int hashCode(){
    return java.util.Objects.hash(idSnack, nombre, precio);
    }
}