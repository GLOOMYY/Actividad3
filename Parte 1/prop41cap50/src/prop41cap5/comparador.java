package prop41cap5;
import java.util.List;


public class comparador {
    private List<Double> lista;

    public comparador(List<Double> lista) {
        this.lista = lista;
    }
    
    public Double mayor() {
        
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía");
        }
        
        Double mayor = lista.get(0);

        for (Double numero : lista) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }
}

