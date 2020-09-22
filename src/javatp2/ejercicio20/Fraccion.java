/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp2.ejercicio20;

/**
 *
 * @author diego
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        
    }
    
    public static Fraccion sumarFracciones(Fraccion f1, Fraccion f2){ 
        int num, den;
        num = (f1.numerador * f2.denominador) + (f2.numerador * f1.denominador);//calcla el numeradorresltante de la suma
        den = f1.denominador * f2.denominador;//calcula el denominador resultante para la suma;
        int mcd = MCD(num,den);
        Fraccion fraccion = new Fraccion(num/mcd,den/mcd);//para obtener una fraccion mas pequeña se divide alos dos por el MCD
        return fraccion;
    }
    public static Fraccion restarFracciones(Fraccion f1, Fraccion f2){ 
        int num, den;
        num = (f1.numerador * f2.denominador) - (f2.numerador * f1.denominador);//solo cambia el signo de la operacion
        den = f1.denominador * f2.denominador;
        int mcd = MCD(num,den);
        Fraccion fraccion = new Fraccion(num/mcd,den/mcd);
        return fraccion;
    } 
    public static Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){ 
        int num,den,mcd;
        num = f1.numerador*f2.numerador;//se multiplican los numeradores
        den = f1.denominador*f2.denominador;//se multiplican los denominadores
        mcd = MCD(num,den);
        Fraccion fraccion = new Fraccion(num/mcd,den/mcd);//se achican los valores del numerador y el denominador
        return fraccion;
    }
    public static Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        Fraccion fraccion = new Fraccion(f2.denominador, f2.numerador);
        return multiplicarFracciones(f1, fraccion);
    }  
    /**
     * maximo comun divisor
     * @return retorna el maximo como un divisor;
     **/
    
    public static int MCD(int num1, int num2){//aplicando el algoritmo de auclides para el MCD
        if(num1 < 0){//por si algun valor ingresado es menor a cero 
            num1 = (int)Math.sqrt(num1 * num1);//se lo pasa a un entero positivo
        }
        if(num2 < 0){
            num2 = (int)Math.sqrt(num2 * num2);
        }
        if(num1 <= num2){
            if(num2 % num1 == 0){
                return num1;
            }else{
                return MCD(num2 % num1,num1);
            }
        }else{
            return MCD(num2,num1);
        }
        
    }
      
    @Override
    public String toString() {
        return "Fraccion{" + "numerador=" + numerador + ", denominador=" + denominador + '}';
    }
          
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    
    
}
