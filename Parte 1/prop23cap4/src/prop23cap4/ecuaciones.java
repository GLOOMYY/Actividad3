package prop23cap4;

public class ecuaciones {
    double a,b,c;
    String respuesta;
    
    public ecuaciones(double a, double b ,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String calculo(){
        double disc = discriminante();
        
        if (disc>0){
            double x1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2 * a);
            return "Las soluciones son: "+x1+" y "+x2;
        } else if (disc==0){
            double x = -b/(2*a);
            return "La solucion es: "+x;
        } else {
            return "No tiene soluciones reales";
        }
    }
    
    private double discriminante(){
        return (b*b)-(4*a*c);
    }
}