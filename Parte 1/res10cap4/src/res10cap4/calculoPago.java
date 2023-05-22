package res10cap4;

public class calculoPago {
    double patrimonio, estrato, matricula = 50000;
    
    public calculoPago(double patrimonio, double estrato){
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }
    
    public double pagoMatricula(){
        if (patrimonio>2000000 && estrato>3){
            matricula= matricula+(0.03*patrimonio);
        }
        return matricula;
    }   
}
