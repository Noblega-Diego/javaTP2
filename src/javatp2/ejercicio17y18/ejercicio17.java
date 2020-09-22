/*
 * Ejercicio17
 * Cree una clase FuncionesPrograma y codifique una función estática 
 * que reciba como parámetro una fecha de tipo Date y retorne la fecha 
 * como una cadena. 
 * public static String getFechaString(Date fecha){ ...
 * ....... }  
 * Cree una clase Principal que contenga un método main y haga uso 
 * de la función getFechaString. 
 * Ejercicio18
 * En la clase FuncionesPrograma codifique una función estática que 
 * reciba como parámetro  3  valores  enteros,  día,  mes,  anio    y  retorne  
 * la  fecha  de  tipo  Date correspondiente. 
 * public static Date getFechaDate(int día, int mes, int anio){ .....
 * ..... }  En  la  clase  Principal  creada  en  el  punto  anterior  haga  
 * uso  de  la  función getFechaDate.
 */
package javatp2.ejercicio17y18;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio17 {
    public static void main(String[] args) {
        int anio, mes, dia;
        System.out.println("ingrese la fecha de nacimiento");
        dia = MensajeYLectura("Dia:");
        mes = MensajeYLectura("Mes:");
        anio = MensajeYLectura("Año:");
        if(dia > 0 && mes > 0 && mes <= 12 && anio > 0){
            Date fechaNacimiento = FuncionesPrograma.getFechaDate(dia, mes, anio);//al instanciarlo con un constructor vacio el valor inicial sera la fecha actual.
            Date fechaActual = new Date();
            System.out.println("fecha de nacimiento:"+ FuncionesPrograma.getFechaString(fechaNacimiento));
            System.out.println("edad:"+ FuncionesPrograma.anosPasados(fechaNacimiento, fechaActual));
        }else{
            System.out.println("incorrecto: alguno de los valores ingresado son negativos o 0");
        }
    }
    
    private static int MensajeYLectura(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}
