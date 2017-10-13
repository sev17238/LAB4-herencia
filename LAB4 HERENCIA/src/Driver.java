/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SDiego
 */
public class Driver {
    public static void main(String[] args) {
            Soldado solda = new Soldado();
            System.out.println("El soldado Trabaja: "+solda.getHoras());
            System.out.println("El soldado tiene de salario: "+solda.getSalario());
            System.out.println("El soldado tiene de vaciones: "+solda.getDiasVacaciones()+" dias"); 
            System.out.println("El soldado dice: "+solda.recibeOrden());
	}  
}
