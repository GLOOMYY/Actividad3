package figurasgeometricas;

public class trianguloRectangulo {
    double base, altura;

    public trianguloRectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura / 2);
    }

    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }
    
    public double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    public void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
            System.out.println("Es un triángulo equilatero");
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
