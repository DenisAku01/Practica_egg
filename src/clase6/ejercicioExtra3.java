/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicioExtra3 {

    /**Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de 
     * una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals()
     * de la clase String.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Vocal");
        String entrada= leer.next();
        if(entrada.equalsIgnoreCase("A")|| entrada.equalsIgnoreCase("E") ||entrada.equalsIgnoreCase("I") ||entrada.equalsIgnoreCase("O")|| entrada.equalsIgnoreCase("U") ){
            System.out.println("Es Vocal");
    }else{
            System.out.println("No es Vocal");}
    }
    
}
