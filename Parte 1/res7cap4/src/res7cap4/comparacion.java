package res7cap4;


public class comparacion {
    double a,b;
    
    public comparacion(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public String mayor(){
        if (a>b){
            return "A es mayor que B";
        } if (a==b){
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }
}
