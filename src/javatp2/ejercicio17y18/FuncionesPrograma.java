/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp2.ejercicio17y18;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author diego
 */
public class FuncionesPrograma {
    public static String getFechaString(Date fecha){
        String format = "dd:MM:y";//como quiero que me muestre la fecha
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(fecha);
    }
    public static Date getFechaDate(int dia, int mes, int anio){
        Date date = new Date(anio - 1900, mes -1, dia);
        return date;
    }
    public static int anosPasados(Date fecha, Date fechaSiguiente){
        int year, year2;
        year = fecha.getYear();
        year2= fechaSiguiente.getYear();
        return year2 - year;
    }
}
