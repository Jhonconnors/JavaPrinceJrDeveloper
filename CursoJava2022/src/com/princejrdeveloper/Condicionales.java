package com.princejrdeveloper;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		int edadReal =20;
		String edad1;
		edad1 = JOptionPane.showInputDialog("Ingresa tu edad:");
		edadReal = Integer.parseInt(edad1);
		
		if (edadReal>0 && edadReal<11) {
			JOptionPane.showMessageDialog(null, "El usuario es un Niño");
		}else if (edadReal>=11 && edadReal<18) {
			JOptionPane.showMessageDialog(null, "El usuario es un Adolesente");
		}else if (edadReal>=18 && edadReal<45) {
			JOptionPane.showMessageDialog(null, "El usuario es un Adulto");
		}else if (edadReal>=45 && edadReal<135) {
			JOptionPane.showMessageDialog(null, "El usuario es un Adulto Mayor");
		}else {
			JOptionPane.showMessageDialog(null, "Edad Incorrecta","Alerta", JOptionPane.WARNING_MESSAGE);
		}
	}
	
}
