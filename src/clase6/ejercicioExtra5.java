/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author denis
 */
public class ejercicioExtra5 {

    /**Una obra social tiene tres clases de socios:
            Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
            * los tipos de tratamientos.
    Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos
    * que los socios del tipo A.
    Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
    Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
    * el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Categoria del socio");
        String category = toUpperCase(leer.next());
        
        System.out.println("Precio a pagar");
        double precio = leer.nextDouble();
        
        switch(category){
            case "A":
                precio = precio * 0.50;
                System.out.println("Descuento del 50% $" + precio);
                break;
            case "B":
                precio = precio * 0.75;
                System.out.println("Descuento del 35% $" + precio);
                break;
            case "C":
                System.out.println("El Pago es de $"+ precio);
                break;
            default:
                System.out.println("Socio no ingresado correctamente");
                break;
        
        }
        
         
    }

    

    
    
}
