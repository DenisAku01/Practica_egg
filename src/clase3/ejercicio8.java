/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicio8 {

    /**Realizar un programa que simule el funcionamiento de un dispositivo RS232,
     * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
     * llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
     * el primer carácter tiene que ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial 
    * “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que
    * no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
    * incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
    * funciones de Java Substring(), Length(), equals().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        
        int contador = 0;
        int contadorNeg = 0;
        System.out.println("Ingrese una cadena y veremos que cumple el formato del dispositivo RS232");
         
        do{
            cadena = leer.nextLine();
        if("x".equalsIgnoreCase(cadena.substring(0,1))&& "o".equalsIgnoreCase(cadena.substring(cadena.length()-1 ,cadena.length())) && cadena.length()<= 5 ){
            System.out.println("Correct");
            contador =+ 1;
        }else{
            System.out.println("Incorrect");
            contadorNeg =+ 1;
        }
        }while(!"&&&&&".equals(cadena));
        
        System.out.println("Reporte: \n"+ contador + "Correct \n" + contadorNeg +"Incorrect");
       
    }
    
}
