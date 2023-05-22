
package prop19cap3;


public class calculos {
    double lado;
    
    public calculos(double lado) {
        this.lado = lado;
    }
    
    public double area(){
        pitagoras pits = new pitagoras(lado);
        double altura = pits.ultimoLado();
        double a = lado*altura;
        return a;
    }
    
    public double perimetro(){
        double p = lado*3;
        return p;
    }
}
