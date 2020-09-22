/*
 * Desarrolle un programa que ayude a una cajera a determinar el número de
 * billetes y monedas que se necesitan de cada una de las siguientes
 * denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y
 * 0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad es
 * 1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2
 * billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos. 
 */
package javatp2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cntidad de dinero:");
        float money = scanner.nextFloat();
        if(money < 0){
            System.out.println(toStringCantidadBilletes(money));
        }else{
            System.out.println("incorrecto: valor ingresado es negativo");
        }
    }
    
    public static String toStringCantidadBilletes(float money){
        //varibles para las cantidades de los diferentes billetes
        int cant_200,cant_100,cant_50,cant_20,cant_10,cant_5,cant_2,cant_1;
        int cant_05;
        int cant_025;
        int cant_01;
        int cant_005;
        
        cant_200 = (int)money/200;//al dividir por el billete obtenemos la cntidad que se neesitaran de este
        money = money%200;
        /**
         * el modulo o resto obtendremos el sobrante ya que de caso contrario trabajariamos con 
         * el mismo numero dandonos en el paso siguiente una cantidad mayor de billetes de lo que deberían de ser
        **/
        
        
        cant_100 = (int)money/100;
        money = money%100;
        
        cant_50 = (int)money/50;
        money = money%50;
        
        cant_20 = (int)money/20;
        money = money%20;
        
        cant_10 = (int)money/10;
        money = money%10;
        
        cant_5 = (int)money/5;
        money = money%5;
        
        cant_2 = (int)money/2;
        money = money%2;
        
        cant_1 = (int)money;
        if((int)money != 0 )
            money = money - 1;
            
        /*  llegado a este paso nos queda solo los decimales tenindo en cuenta que 
         * es muy dificil trabajar con ellos lo multiplicamos por 100
         * permitiendonos trabajar de una mejor manera
         * ej: money= 0.95 -> 95.0
         */
        money *= 100;
        //money= 95.0
        cant_05 = (int)(money/50);//50 centavos
        money = money%50;
        
        cant_025 = (int)(money/25);//25 centavos
        money = money%25;
        
        cant_01 = (int)(money/10);//10 centavos
        money = money%10;
        
        cant_005 = (int)(money/5);//5 centavos
        
        return "{" +"c200="+    cant_200    + "," +
                    "c100="+    cant_100    + "," +
                    "c50="+     cant_50     + "," +
                    "c20="+     cant_20     + "," +
                    "c10="+     cant_10     + "," +
                    "c5="+      cant_5      + "," +
                    "c2="+      cant_2      + "," +
                    "c1="+      cant_1      + "," +
                    "c05="+     cant_05     + "," +
                    "c025="+    cant_025    + "," +
                    "c01="+     cant_01     + "," +
                    "c005="+    cant_005    +
                "}";
    }
}
