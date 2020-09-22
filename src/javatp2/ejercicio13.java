/*
 * Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
 * encuentra dentro de la primera (usar indexOf o contains).
 */
package javatp2;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ejercicio13 {
    public static void main(String[] args) {
        String cadena1, cadena2;
        Scanner scanner = new Scanner(System.in);
        //se le pedira al usuario que ingrese las dos cadenas
        System.out.println("ingrese la primera cadena:");
        cadena1 = scanner.nextLine();
        System.out.println("ingrese la segunda cadena:");
        cadena2 = scanner.nextLine();
        
        //se busacara a la cadena2 dentro de cadena1 
        if(cadena1.contains(cadena2))//contains nos devuelve un true si es la cadena es encontrada
            System.out.println("correcto: la cadena \""+ cadena2 + "\" se encuentra en \"" + cadena1 + "\"");
        else
            System.out.println("incorrecto: la cadena \""+ cadena2 + "\" no se encuentra en \"" + cadena1 + "\"");
    }
}
