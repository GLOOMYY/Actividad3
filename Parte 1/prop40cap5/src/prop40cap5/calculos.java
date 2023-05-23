package prop40cap5;

public class calculos {
    double numero;
    
    public calculos(double numero){
        this.numero = numero;
    }
    
    public double raiz(){
        return Math.sqrt(numero);
    }
    
    public double cuadrado(){
        return (numero*numero);
    }
    
    public double cubo(){
        return (numero*numero*numero);
    }
}
