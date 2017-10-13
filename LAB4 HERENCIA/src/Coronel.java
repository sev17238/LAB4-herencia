
/**
 * Clase que representa a los coronoles y que hereda los metodos de Teniente
 * @author SDiego
 */
public class Coronel extends Teniente {
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    /**
     * Metodo propio de la clase Coronel
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
