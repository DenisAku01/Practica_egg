
package clase9;

import static clase9.ejercicio5.mostrarMatriz;



/**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
 * se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author denis
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        llenarMatriz(matriz);
        System.out.println("==================");
        matrizTraspuesta(matriz);
        
    }
    
    //rellena matriz de forma aleatoria
    public static void llenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j]= (int)(Math.random()*9+1);
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    
    }
    public static int[][] matrizTraspuesta(int[][] matriz){
    int[][] matriz2 = new int[3][3];
    for (int i = 0; i < matriz2.length; i++) {
        for (int j = 0; j < matriz2[i].length; j++) {
            matriz2[i][j]= matriz[j][i];
            
        }
        
    } 
    mostrarMatriz(matriz2);
    return matriz2;
}
}
