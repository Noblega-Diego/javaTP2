/* "La lluvia en Mendoza es escasa"
 * Reemplaza todas las a del String anterior por una e. (aplique replace)
 */
package javatp2;

/**
 *
 * @author diego
 */
public class ejercicio08 {
    public static void main(String[] args){
        String lluvia = "La lluvia en Mendoza es escasa";
        lluvia = lluvia.replace('a', 'e');
        System.out.println(lluvia);
    }
}
