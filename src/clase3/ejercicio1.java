/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *Ejercicio 5 Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

 * @author denis
 */
public class ejercicio1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);// importar clase
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();// declaro el tipo de variable , entrada por pantalla
        System.out.println("Ingrese su segundo numero");
        int num2 = leer.nextInt();
        if(num1>25 || num2>25){// verdadero ,verdadero
            if(num1>25 && num2 <25){
                System.out.println("su primer numer es mayor a 25 el segundo no es mayor");
            }
            if(num1<25 && num2 >25){
                System.out.println("su primer numer es menor a 25 el segundo si es mayor");
            }
        }else{
            System.out.println("Ninguno de los 2 son mayores");
        }
    
    }
    
}
