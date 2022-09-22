package com.princejrdeveloper.generics;

public class Main {

	public static void main(String[] args) {

//		String nombres[]= {"Jose", "Maria", "Pepe"};
//		Integer numeros[]= {200,25,14,99,66,53};
//		Boolean validaciones[]= {true,false,false,false,true,true,true,true};
//		
//		String Elementos= MisArreglos.getElementos(nombres);
//		System.out.println(Elementos);
		
//		System.out.println(MisArreglos.getElementos(validaciones));
		
		Empleado listaEmpleado[] = {new Empleado("Ana",45, 2000),
				new Empleado("Pedro",25, 2100),new Empleado("Angel",55, 2900),new Empleado("Rojo",75, 2900)};
		
		System.out.println(MisArreglos.getElementos(listaEmpleado));
		
		for (Empleado empleado : listaEmpleado) {
			System.out.println(empleado.getNombre()+" "+empleado.getSalario());
		}
		
		

	}

}

class MisArreglos{
	public static <T> String getElementos(T[]a) {
		return "El array Tiene: "+a.length+" Elementos";
	}
	public static String getElement(String[]a) {
		return "El Array tiene: "+a.length+" Elementos";
	}
	
}
