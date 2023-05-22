
package prop19cap3;


public class pitagoras {
    double lado;
    
    public pitagoras(double lado) {
        this.lado = lado;
    }
    
   public double ultimoLado() {
       double medioL = lado/2;
       double l = Math.sqrt(Math.pow(lado,2)-Math.pow(medioL,2));
       return l;
   }
}
