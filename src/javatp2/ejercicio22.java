/*
 * Suma los dígitos de un número ingresado por el usuario de forma recursiva. 
 * Ejemplo: el usuario ingresa 1596 El programa debe sumar 1 + 5 + 9 + 6  
 */
package javatp2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio22 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("numeros a sumar:");
        num = scanner.nextInt();
        System.out.print("sumatoria:" + sumatoria(num));
    }
    public static int sumatoria(int dividiendo){
        if(dividiendo % 10 == 0){
            return dividiendo;
        }else{
            return dividiendo % 10 + sumatoria(dividiendo / 10);
        }
    }
}
