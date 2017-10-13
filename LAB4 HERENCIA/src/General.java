
/**
 * Clase que representa a los generales.
 * @author SDiego
 */
public class General extends Militar {
    /**
     * Metodo de dias de vacaciones del general
     * @return los dias de vacaciones del general
     */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }
    /**
     * Metodo de formulario de vacaciones para el general.
     * @return el color del formulario de vacaciones del general.
     */
    public String getFormularioVacaciones() {
        return "rosado";
    }
    /**
     * Metodo propio de la clase general.
     */
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
}