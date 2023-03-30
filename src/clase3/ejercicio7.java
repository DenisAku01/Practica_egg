/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**Realizar un programa que pida dos números enteros positivos por teclado
 * y muestre por pantalla el siguiente menú:El usuario deberá elegir una 
 * opción y el programa deberá mostrar el resultado por pantalla y luego 
 * volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’
 * se sale del programa, caso contrario se vuelve a mostrar el menú.
 *
 * @author denis
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       // 2 numero enteros positicos
        System.out.println("Ingrese el primer numero");
        int num1= leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2= leer.nextInt();
        
        boolean opction = true;
                while(opction){
                    System.out.println("Elija una opción"+"\n Menú"+"\n 1. Suma"+"\n 2. Resta"+"\n 3. Multiplicar"+"\n 4. Dividir"); 
                    int numOption = leer.nextInt();
                    switch (numOption){
                        case 1:
                            System.out.print("La Suma es ");
                            System.out.println(num1 + num2);
                            break;
                            case 2:
                            System.out.print("La Resta es ");
                            System.out.println(num1 - num2);
                            break;
                            case 3:
                            System.out.print("La Multiplicacion es ");
                            System.out.println(num1 * num2);
                            break;
                            case 4:
                            System.out.print("La Dividir es ");
                            System.out.println(num1 / num2);
                            break;
                            case 5:
                                System.out.println("Quiere Salir del Programa S/N");
                                String sn = leer.next();
                                if("S".equalsIgnoreCase(sn)){
                                   opction = false ;
                                }else{
                                 System.out.println("Continue navegando");
                                }
                            break;
                            default:
                                System.out.println("Opcion Incorrecta , Vuelva a Ingresar");
                    }
                }
        
        
    }
    
}
