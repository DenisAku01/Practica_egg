/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**Crear un programa que pida una frase y si esa frase es igual a 
 * “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
 *
 * @author denis
 */
public class ejercicio2 {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    frase = frase.toLowerCase();
    if("eureka".equals(frase)){
        System.out.println("Entra");
    }else{
        System.out.println("False");
    }
    
    
    
    }
}
