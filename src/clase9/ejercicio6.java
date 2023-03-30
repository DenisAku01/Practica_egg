/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import static clase9.ejercicio5.llenarMatrizAMano;
import static clase9.ejercicio5.mostrarMatriz;

/**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada
 * por números del 1 al 9 donde la suma de sus filas, sus 
 * columnas y sus diagonales son idénticas. Crear un programa
 * que permita introducir un cuadrado por teclado y determine 
 * si este cuadrado es mágico o no. El programa deberá comprobar
 * que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author denis
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean rango;
        
        int[][] matriz = new int[3][3];
        llenarMatrizAMano(matriz);
        mostrarMatriz(matriz);
        rango = numerosDelAl9(matriz);
        
        //si esta dentro del rango ejecutamos si es magico
        if(rango){
            int filaResultado = sumaMedium(matriz);
            int diagonalResultado= sumaDiagonal(matriz);
            int columnaResultado = sumacolumna(matriz);
            if(filaResultado==15 && diagonalResultado==15 && columnaResultado==15){
                System.out.println("Es Magico");
            }else{
                System.out.println("No es Magico mi rey , la fila o diagonal o columna no es igual a 15");
            }
        }else{
            System.out.println(" Como la Matriz no cumple el requisito de 0 a 9, no se puede saber que es un cuadrado Magico");
        }
        
        
    }
    
    // devuelve un booleano verdadero si todos los numero son del 1 al 9 sino devuelve falso y el primer numero que noes dentro del rango
    public static boolean numerosDelAl9(int[][] matriz){
        boolean num1a9 = true;
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if(matriz[i][j]<10 && matriz[i][j]>0){
             num1a9 = true;
            }else{
                System.out.println("el num "+matriz[i][j]+" no cumple la condicion ");
                num1a9=false;
                return num1a9;
            }
        }
    }
        return num1a9;
    
    }
    
    // devuelve suma de fila 1  sumando columna 0,1,2
    public static int sumaMedium(int[][] matriz){
    int suma = 0;
    
        for (int j = 0; j < matriz[1].length; j++) {
            System.out.println("Sumando fila 1:"+ matriz[1][j]);
            suma = suma + matriz[1][j] ;
        }
        System.out.println(suma);
    return suma;
    }
    
    // suma la diagonal 
    public static int sumaDiagonal(int[][] matriz){
        int suma =0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Sumando diagonal  :"+ matriz[i][i]);
            suma = suma + matriz[i][i];
        }
        System.out.println(suma);
        return suma;
    }
    
    public static int sumacolumna(int[][] matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length ; i++) {
            System.out.println("Sumando columna 0 :"+ matriz[i][0]);
            suma = suma + matriz[i][0];
        }
        System.out.println(suma);
        return suma;
    }
    
}
