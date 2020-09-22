/*
 * Cree  una  clase Fracción con  dos  atributos  numéricos  enteros, 
 * numerador  y denominador. Agregue  un  constructor  sobrecargado  
 * (debe  contener  como parámetros  el  numerador  y  el  denominador)  que  
 * cree  el  objeto  Fracción correspondiente.
 */
package javatp2.ejercicio20;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class OperacionesFracciones {
    public static void main(String[] args) {
        int num,den;
        num = MensajeYLecturaInt("fraccion1 numerador:");
        den = MensajeYLecturaInt("fraccion1 denominador:");
        Fraccion fracc1 = new Fraccion(num,den);
        num = MensajeYLecturaInt("fraccion2 numerador:");
        den = MensajeYLecturaInt("fraccion2 denominador:");
        Fraccion fracc2 = new Fraccion(num,den);
        
        //operaciones y resultados
        Fraccion fraccionObtenida = Fraccion.sumarFracciones(fracc1, fracc2);
        System.out.println("suma:" + fraccionObtenida.getNumerador()+"/"+fraccionObtenida.getDenominador());
        fraccionObtenida = Fraccion.restarFracciones(fracc1, fracc2);
        System.out.println("resta:" + fraccionObtenida.getNumerador()+"/"+fraccionObtenida.getDenominador());
        fraccionObtenida = Fraccion.multiplicarFracciones(fracc1, fracc2);
        System.out.println("multiplicacion:"  + fraccionObtenida.getNumerador()+"/"+fraccionObtenida.getDenominador());
        fraccionObtenida = Fraccion.dividirFracciones(fracc1, fracc2);
        System.out.println("divicion:" + + fraccionObtenida.getNumerador()+"/"+fraccionObtenida.getDenominador());
    }
    private static int MensajeYLecturaInt(String mensaje){
        System.out.print(mensaje);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
