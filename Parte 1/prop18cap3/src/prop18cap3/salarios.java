package prop18cap3;

public class salarios {
    double horas, valorHora, porcenRetencion;
    
    public salarios(double horas, double valorHora, double porcenRetencion){
        this.horas = horas;
        this.valorHora = valorHora;
        this.porcenRetencion = porcenRetencion;
    }
    
    public double salarioBruto() {
        double bruto = horas*valorHora;
        return bruto;
    }
    
    public double salarioNeto() {
        double bruto = salarioBruto();
        double neto = bruto-(porcenRetencion*bruto);
        return neto;
    }
}
