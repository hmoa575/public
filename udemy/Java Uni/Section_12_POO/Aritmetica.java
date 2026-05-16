package udemy.uni.Section_12_POO;

public class Aritmetica {

    private double operando1;
    private double operando2;

    public void sumar(){
        var resultadoSuma = operando1 + operando2;
        System.out.println(resultadoSuma);
    }

    public void sumar(double operando1, double operando2){
        var resultadoSuma = operando1 + operando2;
        System.out.println(resultadoSuma);
    }

    public void restar(){
        var resultadoResta = operando1 - operando2;
        System.out.println(resultadoResta);
    }
    public double getOperando1(){
        return this.operando1;
    }
    public double getOperando2(){
        return this.operando2;
    }
    public void setOperando1(double operando1){
        this.operando1 = operando1;
    }
    public void setOperando2(double operando2){
        this.operando2 = operando2;
    }
}
