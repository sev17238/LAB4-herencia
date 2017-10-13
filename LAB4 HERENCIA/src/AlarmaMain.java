
/**
 * Esta es la clase principal donde se prueban las clases Alarma, Timbre y AlarmaEmergencia
 * @author SDiego
 */
public class AlarmaMain {
    /**
     * Metodo principal donde se crean los objetos de las clases que se quieren probar.
     * @param args Cualquier ocurrencia
     */
    public static void main(String[] args) {
	AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
	alarmaIncendio.m1();                  // emergencia 1
	alarmaIncendio.m2();                  // alarma 1 / timbre 1	
        System.out.println(alarmaIncendio);   // emergencia Ring…Ring…Ring…Ring
    }        
}