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
public class ejercicio2 {

    /**Diseñe una función que pida el nombre y la edad de N
     * personas e imprima los datos de las personas ingresadas por
     * teclado e indique si son mayores o menores de edad. Después de 
     * cada persona, el programa debe preguntarle al usuario si quiere
     * seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //if
        Scanner leer= new Scanner(System.in);
        boolean entrada = true;
        do{
            
            System.out.println("Edad:");
            int edad =leer.nextInt();
            esMayor(edad);
            System.out.println("Desea ingresar otra persona?");
            String entra = leer.next();
            if(entra.equalsIgnoreCase("S")){
            entrada = true;
            }else{
            entrada=false;
                    }
            
            
        }while(entrada == true);
    }
    
    public static void esMayor(int edad){ 
        if(edad>18){
            System.out.println("Es Mayor de Edad");}else{
            System.out.println("Es Menor de Edad");}
    }
    
}
