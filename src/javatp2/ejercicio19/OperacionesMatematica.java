
package javatp2.ejercicio19;

/**
 *
 * @author diego
 */
public class OperacionesMatematica {
    private double valor1;
    private double valor2;
    private String operacion;

    public OperacionesMatematica(){}
    public OperacionesMatematica(double valor1, double valor2) {
        this.valor1 =valor1;
        this.valor2 = valor2;
    }
    public double aplicarOperacion(String operacion){
        this.operacion = operacion;
        double operacionRealizada;
        switch (operacion){
            case "+": operacionRealizada = (double)sumarNumeros();
            break;
            case "-": operacionRealizada = (double)restarNumeros();
            break;
            case "*": operacionRealizada = (double)multiplicarNumeros();
            break;
            case "/": operacionRealizada = (double)dividirNumeros();
            break;
            default:  operacionRealizada = 0;
        }
         return operacionRealizada;
    }
    
    private double sumarNumeros(){ 
        return valor1 + valor2; 
    } 
    private double restarNumeros(){ 
        return valor1 - valor2; 
    } 
    private double multiplicarNumeros(){ 
        return valor1 * valor2; 
    } 
    private double dividirNumeros(){
            return valor1 / valor2;
    }
    
    
    
    public String getOperacion() {
        return operacion;
    }

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    
}
