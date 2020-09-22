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
public class ejercico03Mejorado {
    public static void main(String[] args){
        short num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ingrese un numero de 3 digitos:");
        num = scanner.nextShort();
        if( sumaDeTresDigitos(num) != -1){
            System.out.println("suma es de: " + sumaDeTresDigitos(num) );
        }else{
            System.out.println("el numero ingresado dispone de mas o menos de tres digitos");
        }
        
    }
    
    
    public static byte sumaDeTresDigitos(short numero){     //mejor optimizado
        byte resultado = 0;
        if(numero > 99 && numero < 1000){
            for(byte i = 0; i < 3; i++){
                resultado += (byte)(numero % 10);
                numero = (short)(numero/10);
            }
            return resultado;
        }else{
            return -1;                                      //valor de retorno en caso de que que el numero NO sea de 3 digitos
        }
    }
    public static int sumaDeTresDigitos(int numero){    //hace un mayor uso de memoria
        int resultado = 0;
        if(numero > 99 && numero < 1000){
            for(byte i = 0; i < 3; i++){
                resultado += numero % 10;
                numero = numero/10;
            }
            return resultado;
        }else{
            return -1;                                  //valor de retorno en caso de que que el numero NO sea de 3 digitos
        }
    }
}
