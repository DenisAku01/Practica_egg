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
public class ejercicioExtra4 {

    /**Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
     * y se muestre su equivalente en romano.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese un numero del 1 al 10");
        int num = leer.nextInt();
        switch(num){
            case 1:
                System.out.println("I");
                break;
                case 2:
                System.out.println("II");
                break;
                case 3:
                System.out.println("III");
                break;
                case 4:
                System.out.println("IV");
                break;
                case 5:
                System.out.println("V");
                break;
                case 6:
                System.out.println("VI");
                break;
                case 7:
                System.out.println("VII");
                break;
                case 8:
                System.out.println("VIII");
                break;
                case 9:
                System.out.println("IX");
                break;
                case 10:
                System.out.println("X");
                break;
                default:
                    System.out.println("No Sabemos Contar hasta Ahi ;u;");
                
        }
    }
    
}
