/*
 * CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
 * asigne el mismo a una variable valorDecimal de tipo double, aplique las
 * operaciones de CASTING para convertir la variable a los siguientes tipos de
 * datos, short, int, long, String, float investigue las diferentes formas de lograr la
 * conversión. Muestre por pantalla el resultado de las conversiones.
 */
package javatp2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio01 {
    public static void main(String[] args){
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero decimal: ");
        num = scanner.nextDouble();
        
        System.out.println("double: " + num);
        
        float num_float = (float) num;
        System.out.println("float: " + num_float);
        
        long num_long = (long) num;
        System.out.println("long: " + num_long);
        
        int num_int = (int) num;
        System.out.println("int: " + num_int);
        
        short num_short = (short) num;
        System.out.println("short: " + num_short);
        
        byte num_byte = (byte) num;
        System.out.println("byte: " + num_byte);
        
        String numString = String.valueOf(num);
        System.out.println("String: " + numString);
    }
}
