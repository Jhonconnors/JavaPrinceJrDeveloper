package com.princejrdeveloper.poo;

import java.util.Scanner;

public class TestExceptions {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			try {
				System.out.print("Introduce un número entero > 0: ");                                            
                n = sc.nextInt();
                System.out.println("La division de 100 entre "+n+" es = "+100/n);
				
			} catch (ArithmeticException e) {
				sc.nextLine();
				n=0;
				System.out.println("Debe introducir un número Mayor a Cero " + e.toString());
			}catch (Exception e) {
				sc.nextLine();
				n=0;
				System.out.println("Debe introducir un número Valido " + e.toString());
			}
			
		}while(n<=0);
		
		
		
		System.out.println("Se ejecuta luego de la division");
	}
}
