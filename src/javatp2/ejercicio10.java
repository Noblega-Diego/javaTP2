/*
 * Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
 * usuario lo pida y mostraremos el resultado por pantalla
 */
package javatp2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio10 {
    public static void main(String[] args){
        String cadena;
        char caracteDeAprovacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el texto:");
        cadena = scanner.nextLine();
        
        System.out.print("desaea pasar a mayusculas (y):");
        caracteDeAprovacion = scanner.nextLine().charAt(0);
        if(caracteDeAprovacion == 'y' || caracteDeAprovacion == 'Y'){
            System.out.println("cadena: " + StringAMayusculas(cadena));
        }else{
            System.out.println("cadena: " + cadena);
        }
    }
    /**
     @return cadena pasada a mayuscula
     */
    public static String StringAMayusculas(String cadena){
        StringBuilder cadenaBuild = new StringBuilder(cadena);                  //creamos una instancia de StringBuilder dandole la cadena
        for (int i = 0; i<cadenaBuild.length(); i++){                           //recorremos la cadenaBuilder
            if(Character.isLowerCase(cadenaBuild.charAt(i))){                   //si un caracter esta en minusculas ese caracter se remplazara por el mismo en mayuscula
                cadenaBuild.setCharAt(i, Character.toUpperCase(cadenaBuild.charAt(i)));//para relizarlo se usa setCharAt el cual nos pide la posicion y el char que colocaremos en ese lugar
            }
        }
        return cadenaBuild.toString();
    }
}
