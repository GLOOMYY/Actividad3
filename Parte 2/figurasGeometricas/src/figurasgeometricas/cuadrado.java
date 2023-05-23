package figurasgeometricas;

public class cuadrado {
    double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro() {
        return (4*lado);
    }
}
