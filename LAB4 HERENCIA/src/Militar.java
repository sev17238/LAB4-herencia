/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SDiego
 */
// CC2006, Lab 4
// Una clase para representar a los militares en general.

public class Militar {
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }

    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}

