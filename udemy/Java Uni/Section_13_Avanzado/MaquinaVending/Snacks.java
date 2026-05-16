package udemy.uni.Section_13_Avanzado.MaquinaVending;

import java.util.ArrayList;
import java.util.List;


public class Snacks {
    private static final List<Snack> SNACKS;

    //Bloque estatico inicializador.
    static{
        SNACKS = new ArrayList<>();
        SNACKS.add(new Snack("Patatas", 4.5));
        SNACKS.add(new Snack("Refresco", 2));
    }
    public static void agregarSnack(Snack snack) {
        SNACKS.add(snack);
    }
    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for(var snack : SNACKS){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("+++++ Snacks en el inventario+++++\n");
        System.out.println(inventarioSnacks);
    }
    public static List<Snack> getSnacks() {
            return SNACKS;
    }
}

