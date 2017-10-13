
/**
 * Clase Soldado que hereda los metodos de Militar.
 * @author SDiego
 */
public class Soldado extends Militar{
    public int getHoras() {
        int horasSoldado = super.getHoras()/2;
        return horasSoldado; 
    }
    /**
     * Metodo de Salario de Soldado que usa el metodo de salario de Militar.
     * @return el salario del objeto Soldado.
     */
    public double getSalario() {
        double salarioSoldado = super.getSalario()-10000.0;
         return salarioSoldado;      // Q40,000.00 / anio
    }
    /**
     * Metodo de vacaciones de Soldado que emplea el metodo de vacaciones de Militar.
     * @return los dias de vacaciones del soldado
     */
    public int getDiasVacaciones() {
        int diasVacasSoldados = super.getDiasVacaciones()/2;
        return diasVacasSoldados;       // 2 semanas de vacaciones pagadas
    }
    /**
     * Metodo propio de Soldado.
     * @return el texto de orden del soldado.
     */
    public String recibeOrden(){
        String orden = "¡Ordene mi general!";
        return orden;
    }    
}
