/*
 *  Codifique  un  programa  que  solicite  un número entero  mayor  a  cero  y 
 * que mediante recursión sume  todos los  números  números  naturales desde  
 * el número ingresado hasta 1. 
 * Ejemplo: Ingreso 10 El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1 
 */
package javatp2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio21 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero entero mayor a 0:");
        num = scanner.nextInt();
        if(num > 0){
            System.out.println("sumatoria:" + sumatoria(num));
        }else{
            System.out.print("incorrecto: numero ingresado es menor a 1");
        }
    }
    public static int sumatoria(int num){
        if(num == 1){
            return num;
        }else{
            return num + sumatoria(num - 1);//se sma el numero anterior mas el actual
        }
    }
}
