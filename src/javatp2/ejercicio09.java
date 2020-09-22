/*
 * Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
 * Muéstralos en línea recta, separados por un espacio entre cada carácter.
 */
package javatp2;

/**
 *
 * @author diego
 */
public class ejercicio09 {
    public static void main(String[] args){
        String lluvia = "La lluvia en Mendoza es escasa";
         char s[] = lluvia.toCharArray();
         for(int i = 0; i < s.length; i++){
             if(i == s.length -1)
                 System.out.println((int) s[i]);//al castear un char a int se obtiene su codigo ASCii
             else
                System.out.print((int) s[i]+ " ");
         }
    }
}
