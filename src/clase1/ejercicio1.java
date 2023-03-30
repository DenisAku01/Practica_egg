/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase1;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        /*Escribir un programa que pida dos números enteros por 
    teclado y calcule la suma de los dos. El programa deberá después mostrar
    el resultado de la suma*/
        System.out.println("ingrese el primer numero a sumar:");
        int num = leer.nextInt();
        System.out.println("Ingrese el Segundo numero a sumar");
        int num2 = leer.nextInt();
        int resultado = num + num2;
        System.out.println("El resultado es :"+ resultado);
        
       
    
    
    }
    
}
