package com.princejrdeveloper;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		
//		Scanner tc = new Scanner(System.in);
//		
//		int num1;
//		int num2;
//		
//		System.out.println("Ingrese Primer Numero");
//		num1 = tc.nextInt();
//		System.out.println("Ingrese Segundo Numero");
//		num2 = tc.nextInt();
//		
//		System.out.println(num1+num2);
//		
//		tc.close();
		
		String nombre, edad;
		int edadReal;
		
		nombre = JOptionPane.showInputDialog("Ingresa Tu nombre");
		edad = JOptionPane.showInputDialog("Ingresa Tu Edad");
		
		edadReal = Integer.parseInt(edad);
		
		JOptionPane.showMessageDialog(null,"Tu nombre es "+ nombre+" y tu edad es: "+edadReal);
	}

}
