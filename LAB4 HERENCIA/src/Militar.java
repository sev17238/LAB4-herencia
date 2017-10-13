
/**
 * Clase Militar padre de las clases Teniente, General, Soldado y Coronel.
 * @author SDiego
 */
public class Militar {
    /**
     * Metodo Horas de Militar
     * @return las horas que trabaja el Militar
     */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    /**
     * Metodo de Salario de Militar
     * @return el salario del Militar
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    /**
     * Metodo de dias de vacaciones de Militar
     * @return los dias de vacaciones del militar
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }
    /**
    * Metodo del formulario de vacaciones para el Militar
    * @return el color del formulario de vacaciones del militar
    */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}

