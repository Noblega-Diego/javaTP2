/*
 * Crea  un  programa  donde  se  pida  el ingreso  de  una  cadena y por  
 * medio  de  recursión mostrar la cadena de forma inversa.  
 * Ejemplo: Ingreso “computadora de escritorio” Invertir cadena “oirotircse ed arodatupmoc”
 */
package javatp2.ejercicio20;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio23 {
    public static void main(String[] args) {
        String cadena;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la palabra:");
        cadena = scanner.nextLine();
        System.out.println(invertirString(cadena, 0));
    }
    public static String invertirString(String cadena, int c){
        if(c == cadena.length()/2){
            return cadena;
        }else{
            char letra;
            char []cadenaChar = cadena.toCharArray();//pasa la cadena a un arreglo de caracteres
            letra =  cadenaChar[c];//salvamos la primera letra para luego moverla
            cadenaChar[c] = cadenaChar[cadenaChar.length -1 - c];//invertimos de lugar
            cadenaChar[cadenaChar.length -1 - c] = letra;//le asignamos la nueva posicion que tedra la letra salvada
            cadena = new String(cadenaChar);//la convertimos en cadena nuevamente
            return invertirString(cadena, c+1);//enviamos la cadena modificada junto con la posicion de la siguiente letra
        }
    }
}
