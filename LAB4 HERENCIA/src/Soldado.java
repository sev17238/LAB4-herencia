/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SDiego
 */
public class Soldado extends Militar{
    public int getHoras() {
        int horasSoldado = super.getHoras()/2;
        return horasSoldado; 
    }
    
     public double getSalario() {
        double salarioSoldado = super.getSalario()-10000.0;
         return salarioSoldado;      // Q40,000.00 / anio
    }
     
    public int getDiasVacaciones() {
        int diasVacasSoldados = super.getDiasVacaciones()/2;
        return diasVacasSoldados;           // 2 semanas de vacaciones pagadas
    }
    
    public String recibeOrden(){
        String orden = "¡Ordene mi general!";
        return orden;
    }
    
}
