/*
 * Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
 * compareToIgnoreCase)
 */
package javatp2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio11 {
    public static void main(String[] args){
        String palabra1, palabra2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la primera palabra:");
        palabra1 = scanner.nextLine();
        System.out.println("ingrese la segunda palabra:");
        palabra2 = scanner.nextLine();
        System.out.print("Equals:");
        compareEquals(palabra1, palabra2);
        System.out.print("CompareTo:");
        compareCompareTo(palabra1, palabra2);
        System.out.print("CompareToIgnoreCase:");
        compareCompareToIgnoreCase(palabra1, palabra2);
    }
    /**
     * compara si una cadena es igual a la otra
     */
    public static void compareEquals(String palabra1, String palabra2){
        if(palabra1.equals(palabra2) == true){
            System.out.println("las palabras son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
    
    /**
     * compara dos string dependiendo del codigo ascii de los caracteres
     * por lo tanto este diferencia entre minusculas y matusculas
     */
    public static void compareCompareTo(String palabra1, String palabra2){
        if(palabra1.compareTo(palabra2) == 0){
            System.out.println("las palabras son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
    
    /**
     * compara dos string pero no diferencia entre minusculas y mayusculas
     */
    public static void compareCompareToIgnoreCase(String palabra1, String palabra2){
        if(palabra1.compareToIgnoreCase(palabra2) == 0){
            System.out.println("las palabras son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
}
