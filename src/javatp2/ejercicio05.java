/*
 * Solicite el ingreso de un número y conviértalo a un String mediante
 * String.valueOf
 */
package javatp2;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio05 {
    public static void main(String[] args){
        int num;
        String stringNum;
        Scanner scanner = new Scanner(System.in);
        //se le pide que ingrese un numero
        System.out.print("ingrese un numero: ");
        num = scanner.nextInt();
        
        //casteo mediante valueOf
        stringNum = String.valueOf(num);
        
        System.out.println(stringNum);
        
    }
}
