/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;
import java.util.Scanner;
/**Escriba un programa en el cual se ingrese un valor límite positivo, y a 
 * continuación solicite números al usuario hasta que la suma de los números 
 * introducidos supere el límite inicial.

 *
 * @author denis
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Valor Limite:");
        int numLimite = leer.nextInt();
        int suma = 0;
        while (suma < numLimite){
            System.out.println("Ingrese un numero a sumar");
            suma = suma + leer.nextInt();
            System.out.println(suma);
        }
        System.out.println("FIN DE LA OPERACION");
        
    }
    
}
