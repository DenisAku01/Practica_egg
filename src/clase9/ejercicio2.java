
package clase9;

import java.util.Scanner;



/**Realizar un algoritmo que llene 
 * un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si
 * se encuentra repetido
 *
 * @author denis
 */
public class ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //tamano vector
        System.out.println("Ingrese tamano del Vector"); 
        int[] vector =new int[leer.nextInt()];
        
        // rellenar vector con numeros aleatorio
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random()*9+1);
            System.out.print(vector[i]+" ");
            
        }
        System.out.println("");
        
        
        //Numero Buscando
        System.out.println("Ingrese el numero a buscar dentro del arreglo");
        int numBuscar = leer.nextInt();
        int encontrado = 0;
        for (int i = 0; i < vector.length; i++) {
            if(numBuscar == vector[i]){
                System.out.println("Numero "+ numBuscar +" encontrado en posicion "+(i+1));
                encontrado ++;
            
            }
        }
        if(encontrado != 0){
        System.out.println("Se encontro su numero "+encontrado+ " veces");}else{
            System.out.println("Ninguna encontrado capo");}
    }
    
}
