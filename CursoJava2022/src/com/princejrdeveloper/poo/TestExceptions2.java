package com.princejrdeveloper.poo;

import java.util.Scanner;

public class TestExceptions2 {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    int [] array = {4,2,6,7};
	    int n;
	    boolean repetir = false;
	    
	    do{
	         try{
	                repetir = false;
	                System.out.print("Introduce un número entero >= 0 y < " + array.length + " ");                     
	                n = sc.nextInt();
	                System.out.println("Valor en la posición " + n + ": " + array[n]);
	         }catch(IndexOutOfBoundsException e){
	                  System.out.println("Error "+e.toString()+"\n"+"Debe introducir un número entero >= 0 y < " + array.length + " ");           
	                  repetir = true;
	         }catch(Exception e){ //resto de excepciones de tipo Exception y derivadas
	                   System.out.println("Error inesperado " + e.toString());
	                   repetir = true;
	         }finally {

	             System.out.println("bloque de código ejecutado siempre");

	        }
	     }while(repetir);
	    
	    System.out.println("Ejecucion luego de la division ");

	}

}
