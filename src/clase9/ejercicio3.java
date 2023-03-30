package clase9;

import java.util.Scanner;

/**Recorrer un vector de N enteros contabilizando
 * cuántos números son de 1 dígito, cuántos de 2 dígitos,
 * etcétera (hasta 5 dígitos).
 *
 * @author denis
 */
public class ejercicio3 {

    /** alt+enter
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //tamano del arreglo
        System.out.println("Ingrese tamano Arreglo");
        int[] arr =new int[leer.nextInt()];
        
        
        //rellenar vector
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int)(Math.random()*100000);
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
        //centinelas
        int de1Digito = 0;
        int de2Digitos =0;
        int de3Digitos =0;
        int de4Digitos = 0;
        int de5Digitos = 0;
        
        // condicionales para 1 , 2 ,3,4,5 digitos 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<10){
            de1Digito++;
            }else if(arr[i]>10 && arr[i]<100){
            de2Digitos++;
            }else if(arr[i]>100 && arr[i]<1000){
            de3Digitos++;
            }else if(arr[i]>1000 && arr[i]<10000){
            de4Digitos++;
            }else if(arr[i]>10000 && arr[i]<100000){
            de5Digitos++;
            }
                
        }
         
        System.out.println("su cantidad de numeros de 1 digito es "+de1Digito+" de 2 digitos es "+de2Digitos+" de de 3 digitos son "+de3Digitos+" de de 4 digitos son "+de4Digitos+" de de 5 digitos son "+de5Digitos);
        
        
    }
    
}
