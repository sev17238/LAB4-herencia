
/**
 * Clase Alarma que hereda los metodos de la clase TImbre.
 * @author SDiego
 */
public class Alarma extends Timbre {
    
    /**
     * Metodo m1 de esta clase que imprime el texto.
     */ 
    public void m1() {
        System.out.println("alarma 1");
	}
    /**
     * Metodo m2 de esta clase que llama al metodo m1 de la clase Timbre.
     */ 
    public void m2() {
	super.m1();
    }
    /**
     * Metodo toString() de esta clase que hace uso del metodo toString() de la clase padre
     * Timbre.
     * @return El texto impreso por el metodo ToString de la clase Timbre
     */
    public String toString() {
	return super.toString() + "…" + super.toString();
    }
}
