package com.princejrdeveloper;

public class Metodos {

	
	public int sumacion(int num1, int num2) {
		int result = num1 * num2;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
		int resultado;
		
		Metodos metodos = new Metodos();
		
		resultado = metodos.sumacion(8, 55);
		
		System.out.println(resultado);
	}
}
