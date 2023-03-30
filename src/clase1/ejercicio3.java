/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/**
 *
 * 
 * @author denis
 */
public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase favorita");
        String frase = leer.nextLine();
        String mayus= toUpperCase(frase);
        String minus = toLowerCase(frase);
        System.out.println(minus);
        System.out.println(mayus);
        
        
    }
}
