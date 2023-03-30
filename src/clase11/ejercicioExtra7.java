/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase11;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese cuantas veces se va a repetir la sucesion");
        N=leer.nextInt();
        
        int [] vector= new int [N];
        for (int i = 0; i < vector.length; i++) {
            if (i == 0 || i == 1) {
                vector[i] = 1;
                
            } else {
                vector[i] = vector[i - 1] + vector[i - 2];
                
            }
            
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
            
        }
        System.out.println(" ");
    
    
                
        
        
        
    }
    
}
    
    

