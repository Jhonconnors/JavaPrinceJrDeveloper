package com.princejrdeveloper;

import javax.swing.JOptionPane;

public class Cuadrado {

	
	public static void main(String[] args) {
		
		String tam1;
		int tamReal;
		
		tam1 = JOptionPane.showInputDialog("Ingrese Tamaño del Cuadrado");
		
		tamReal = Integer.parseInt(tam1);
		
		for (int i = 0; i < tamReal; i++) {
			for (int j = 0; j < tamReal; j++) {
				System.out.print(" * ");
				
			}System.out.println("");
		}
	}
}
