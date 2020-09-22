/*
 * Como transformo una variable tipo Double a una variable tipo double.
 */
package javatp2;

import static java.time.Clock.system;

/**
 *
 * @author diego
 */
public class ejercicio16 {
    public static void main(String[] args) {
        Double a = 0.3;
        double b;
        b = a;
        /**
         * problema esta cuando un Double contiene un null
         * ya que el tipo primitivo no lo puede contener aparece un NullPointerException
        */
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
