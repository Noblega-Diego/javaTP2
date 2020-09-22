/*
 * Indique que sucede si realizo la siguiente declaración de variable: 
 * int numero = null; ¿Qué debo modificar para poder asignar null a la variable?
 */
package javatp2;

/**
 *
 * @author diego
 */
public class ejercicio15 {
    public static void main(String[] args) {
        /* int numero = null; una variable primitiva no puede contar con este 
         * tipo de valor ya que este hace referencia a que no tiene un 
         * espacio en meoria dando un error del tipo nullPointerExeption
        */
        Integer numero = null; /* a cambio  @numero al ser clases si se le puede 
         * asignar null ya que el espacio en mermoria no es fijo
         * ¿Qué debo modificar para poder asignar null a la variable?
         * por lo tanto se tiene que pasar al de su tipo por referncia.
         */
    }
    
}
