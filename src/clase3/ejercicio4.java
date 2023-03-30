/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
 * un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

 *
 * @author denis
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase y defineremos y su primer letra es 'A'");
        String frase = leer.nextLine();
        System.out.println(frase.substring(1));// 0 , 1    (0, 4)  0123
        System.out.println(frase.substring(0,0));
        if("A".equals(frase.substring(0,1))){
            System.out.println("Su frase empieza con A");
        }else{
            System.out.println("su Frase no Empieza con A");
        }
        
    }
    
}
