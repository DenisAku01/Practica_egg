/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicio3 {

    /**Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden 
     * ser a dólares, yenes o libras. La función tendrá como parámetros, la 
     * cantidad de euros y la moneda a convertir que será una cadena, este no 
     * devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:  

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir el monto a convertir");
        double dinero = leer.nextInt();
        System.out.println("Ingrese a la moneda que quiere convertir. libra/dolar/yenes");
        String divisa = leer.next();
        conversion(dinero,divisa);
        
        
        
    }
    public static void conversion(double cantidad,String moneda ){
   /**     0.86 libras es un 1 €
    *   1.28611 $ es un 1 €
    *   129.852 yenes es un 1 €*/
    moneda = moneda.toLowerCase();
        switch(moneda){
            case "libra":
                System.out.println("Libras :" +(cantidad*0.86));
                break;
            case "dolar":
                System.out.println("Dolares :"+ (cantidad*1.28611));
                break;
            case "yenes":
                System.out.println("Yenes :"+ (cantidad*129.852));
                break;
            default:
                System.out.println("ESA MONEDA NO EXISTE CAPO,VOLVER A LA ESCUELA");
                break;
                      }
    }
}
