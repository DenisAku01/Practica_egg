/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;


import static clase9.ejercicio4.matrizTraspuesta;
import java.util.Scanner;

/**
 *
 * @author denis
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        llenarMatrizAMano(matriz);
        mostrarMatriz(matriz);
        System.out.println("==================");
        matrizTraspuesta(matriz);
    }
     public static void llenarMatrizAMano(int[][] matriz){
         Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.println("fila "+i+" columna:"+j );
            matriz[i][j]= leer.nextInt();
            
        }
        System.out.println();
    }
}
        public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }

}



}

    
