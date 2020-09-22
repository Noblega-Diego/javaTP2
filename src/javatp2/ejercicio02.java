/*
 * Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
 * ¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
 */
package javatp2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio02 {
    public static void main(String[] args){
        byte num;
        Scanner scanner = new Scanner(System.in);
        
        // para el jemplo se le pedira un numero. tener en cuenta que para hacer un ejemplo mas 
        // facil se elegio el entero mas pequeño en cuanto a espacio (-128 -> 127)
        
        System.out.print("ingrese un numero del -128 hasta 127:");
        try{
            //¿Qué ocurre?
            // en caso de que el usuario ingrese un numero fuera de rango se produce un desbordamiento de memoria
            num = scanner.nextByte();
            
        }catch(Exception miExcepcion){// en el caso de que se produsca la excepcion en el bloque try la trataremos/capturamos con catch
            //¿Existe alguna forma de resolverlo?
            //lo que trataremos de hacer es decidir que hacer con la exception presentada
            //ej: presentando una informacion del error causado
            System.out.println("ha ingresado un numero que se encuentra fuera de rango;");
            System.out.println("exeption: " + miExcepcion.getMessage());
        }
        
        
    }
}
