/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**Realizar un algoritmo que llene un vector con los 100
 * primeros números enteros y los muestre por pantalla en orden descendente.
 *
 * @author denis
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {// las variables i no se interfieren
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i]= i+1;
        }
        
//        for (int n = num.length-1 ; n >= 0; n--) {// acostumbrarse a usar length en bucles for
//            System.out.println(num[n]);
//        }      indice/valor : vector
        for(int indice:num){ 
            System.out.println(indice);
        }
        
    }
       
    
}
