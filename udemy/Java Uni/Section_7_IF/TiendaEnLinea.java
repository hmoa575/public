package udemy.uni.Section_7_IF;

import java.util.Scanner;

public class TiendaEnLinea {
    
public static void main(String[] args) {
    
    System.out.println("*** Tienda en Línea con Descuentos ***");

    //Fields
    final double MONTO_COMPRA_DESC = 500.00;
    double descuento = 0;

    Scanner inData = new Scanner(System.in);

    System.out.println("Cual es el monto de tu compra?: ");
    double montoCompra = inData.nextDouble();

    System.out.println("Eres miembro de la tienda (true/false)?:");
    boolean eresMiembro = inData.nextBoolean();

    //Calcular el descuento
    if(montoCompra >= MONTO_COMPRA_DESC && eresMiembro == true){
        descuento = 0.10; // Descuento del 10%
    } else if(eresMiembro){ 
        descuento = 0.05; // Descuento del 5%
    } else {
        descuento = 0;
    }

    //Se hacen los calculos
    if(descuento != 0){
        double montoDescuento = montoCompra * descuento;
        double montoFinal = montoCompra - montoDescuento;

        System.out.println("Tu descuento es del: " + descuento*100);
        System.out.println("Monto de la compra: " + montoCompra);
        System.out.println("Monto del descuento: " + montoDescuento);
        System.out.println("Monto final a pagar: " + montoFinal);
        System.out.println("");
    } else{
        System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento.
                    Te invitamos a hacerte miembro de la tienda!
                    Monto final de la compra: $%.2f%n
                    """, montoCompra);
    }

    inData.close();
    }
}
