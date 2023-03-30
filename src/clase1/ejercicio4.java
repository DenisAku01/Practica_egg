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
public class ejercicio4 {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Grados Centigrados");
        float centigrados = leer.nextFloat();
        float fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("fahrenheit :" + fahrenheit);
        
    } 
}
