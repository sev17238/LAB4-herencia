
/**
 * Clase principal del ejercicio 4 que prueba las clases Soldado que hereda los metodos de Militar.
 * @author SDiego
 */
public class Driver {
    /**
     * Metodo principal de la clase Driver.
     * @param args cualquier ocurrencia
     */
    public static void main(String[] args) {
        Soldado solda = new Soldado();
        System.out.println("El soldado Trabaja: "+solda.getHoras());
        System.out.println("El soldado tiene de salario: "+solda.getSalario());
        System.out.println("El soldado tiene de vaciones: "+solda.getDiasVacaciones()+" dias"); 
        System.out.println("El soldado dice: "+solda.recibeOrden());
    }  
}
