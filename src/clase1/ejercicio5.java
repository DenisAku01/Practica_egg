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
public class ejercicio5 {
    public static void main(String[] args){
            Scanner muestrame = new Scanner(System.in);
            System.out.println("Ingrese un numero entero");
            int num = muestrame.nextInt();
            long dobleNum = num*2;
            long tripleNum = num*3;
            double raizNum = Math.sqrt(num);
            System.out.println("Doble: " + dobleNum + " triple:"+ tripleNum + " raizCuadrada:"+ raizNum);
 }
}
