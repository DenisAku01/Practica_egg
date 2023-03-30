/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicioExtra2 {

    /**Declarar cuatro variables de tipo entero A, B, C y D y
     * asignarle un valor diferente a cada una. A continuación, 
     * realizar las instrucciones necesarias para que: B tome el valor 
     * de C, C tome el valor de A, A tome el valor de D y D tome el valor 
     * de B. Mostrar los valores iniciales y los valores finales de cada 
     * variable. Utilizar sólo una variable auxiliar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = leer.nextByte();
        int b = leer.nextByte();
        int c = leer.nextByte();
        int d = leer.nextByte();
        //B a C, C a A
        int aux = b;
        System.out.println("A:"+a+"\nB:"+b+"\nC:"+c+"\nD:"+d+"\n****************");
        b = c ;
        c= a;
        a =d ;
        d = aux;
        System.out.println("A:"+a+"\nB:"+b+"\nC:"+c+"\nD:"+d);
        
    }
    
}
