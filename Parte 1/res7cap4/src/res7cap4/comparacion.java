package res7cap4;


public class comparacion {
    double a,b;
    
    public comparacion(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public double mayor(){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }
}
