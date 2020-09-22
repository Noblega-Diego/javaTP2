/*
 * Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
 * vocales tiene en total (recorre el String con charAt)
 */
package javatp2;
import java.util.Scanner;;
/**
 *
 * @author diego
 */
public class ejercicio07 {
    public static void main(String[] args){
        String cadena;
        Scanner scanner = new Scanner(System.in);
        cadena = scanner.nextLine();
        System.out.println("tamaño: "+ cadena.length());
        System.out.println("vocales: "+ cantidadVocales(cadena));
        
    }
    
    /**
     * devuelve la cantidad de vocales de una cadena
     * @return la cantidad de vocales
     */
    public static int cantidadVocales(String cadena){
        int cantidad = 0;
        for(int i = 0; i < cadena.length(); i++){
            cantidad += identificarVocal(cadena.charAt(i))? 1:0;
        }
        return cantidad;
    }
    
    /**
     * permite idntificar si un caracter es vocal
     * @param caracter el caracter a identificar
     * @return true si el caracter pertenece a una vocal
     */
    public static boolean identificarVocal(char caracter){
        String vocales = "aeiou";
        for(int i =0; i < vocales.length(); i++){
            if(Character.toLowerCase(caracter) == vocales.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
