/*
 * Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
 * 999) y por medio del uso de las operaciones matemáticas módulo 10 y división
 * por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
 * del algoritmo 14.
 */
package javatp2.ejercicio03;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio03 {
    public static void main(String[] args){
        short num;
        byte numArray[] = new byte[3];
        byte resultado;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese un numero de 3 digitos:");
        num = scanner.nextShort();
        if(num > 99 && num < 1000){
            for(byte i = 0; i < 3; i++){
                // tendremos que recurrir a una serie de casteos
                numArray[i] = (byte)(num % 10);
                num = (short)(num/10);
            }
            resultado = (byte)(numArray[0] + numArray[1] + numArray[2]); 
            System.out.println(resultado);
        }else{
            System.out.println("el numero ingresado contiene mas/menos de 3 digitos");
        }
    }
    
    
}
