/*
 * Cree  una  clase  OperacionMatematica  con  dos  atributos  numéricos  
 * decimales, valor1   y   valor2   y   un   atributo   String   de   nombre   
 * operación. Cree   los correspondientes métodos get/set.
 * Cree   una   clase   Calculo   que   contenga  un   método   main,   donde  
 * cree   una instancia  de  la  clase  OperacionMatematica,  
 * asigne  2  valores  para  las  variables de la instancia y ejecute la 
 * función aplicarOperacion, pasando como parámetro primero “+”, después “-”, a 
 * continuación “*” y finalmente “/”. Muestre por pantalla el resultado de 
 * las operaciones.
 */
package javatp2.ejercicio19;

/**
 *
 * @author diego
 */
public class ejercicio19 {
    public static void main(String[] args) {
        OperacionesMatematica opMat = new OperacionesMatematica(50.35,2.25);
        System.out.println("suma:" + opMat.aplicarOperacion("+"));
        System.out.println("resta:" + opMat.aplicarOperacion("-"));
        System.out.println("multiplicacion:" + opMat.aplicarOperacion("*"));
        System.out.println("divicion:" + opMat.aplicarOperacion("/"));
    }
}
