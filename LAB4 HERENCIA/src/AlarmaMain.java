/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SDiego
 */
// CC2006 Lab
// Este programa cliente prueba el comportamiento de su clase AlarmaEmergencia.

public class AlarmaMain {
	public static void main(String[] args) {
		Alarma miReloj = new Alarma();
                System.out.println(miReloj);   // emergencia Ring…Ring…Ring…Ring
		miReloj.m1();                  // emergencia 1
		miReloj.m2();                  // alarma 1 / timbre 1		
	}        
}