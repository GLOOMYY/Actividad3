package prop22cap4;

public class respuesta {
    double horas,salario, valor;
    String nombre;
    
    public respuesta(double horas, double valor, String nombre){
        this.horas = horas;
        this.valor = valor;
        this.nombre = nombre;
    }
    
    public String comparacion(){
        String salto = System.getProperty("line.separator");
        salario = horas*valor;
        if (salario<450000){
            return nombre;
        } else {
            return nombre+salto+String.valueOf(salario);
        }
    }
}
