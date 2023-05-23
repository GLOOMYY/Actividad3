package figurasgeometricas;

public class circulo {
    double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
    
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
