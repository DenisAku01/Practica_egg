/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicio1 {

    /**
     * Crea una aplicación que le pida dos números al usuario y este pueda
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
     * tener una función para cada operación matemática y deben devolver sus
     * resultados para imprimirlos en el main.      *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese algun numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextByte();
        System.out.println("1 suma\n 2 resta\n 3 multiplicacion\n 4 division ");
        int option = leer.nextByte();
        switch(option){
            case 1 :
                int resultado = suma(num1,num2);
                System.out.println(resultado);
                break;
            case 2 :
                System.out.println(resta(num1,num2));
                break;
            case 3 :
                System.out.println(multiplica(num1,num2));
                break;
            case 4 :
                System.out.println(division(num1,num2));
                break;
            default:
                System.out.println("Opcion Incorecta");
                break;
        }
    }

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    public static int resta(int num1,int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    public static int division(int num1,int num2){
        int resultado = num1/num2;
        return resultado;
    }
    public static int multiplica(int num1,int num2){
        int resultado = num1 * num2 ;
        return resultado;
    }
    
            }
            
