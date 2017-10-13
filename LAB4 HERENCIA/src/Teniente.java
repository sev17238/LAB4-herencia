
/**
 * Clase que representa a los tenientes y hereda los atributos de Militar
 * @author SDiego
 */

public class Teniente extends Militar {
    /**
     * Metodo de orden tomada del coronel.
     * @param texto un texto cualquiera que representa a la orden que da el Coronel
     */
    public void tomaOrdenCoronel(String texto) {
        System.out.println("Tomando orden del Coronel: " + texto);
    }    
}
