package com.princejrdeveloper.generics;

public class UsoGenerica {

	public static void main(String[] args) {


		Generica<String> g1 = new Generica<>();
		
		g1.setPrimero("Ana");
		g1.setSegundo("Anakarina");
		
		System.out.println(g1.getSegundo());
		
		String nombre1 = (String) g1.getSegundo();
		System.out.println(nombre1);
		
		Persona p1 = new Persona("Connors");
		Persona p2 = new Persona("Diego");
		Persona p3 = new Persona("Angel");

		Generica<Persona> op1 = new Generica<>();
		
		op1.setPrimero(p1);
		op1.setSegundo(p2);
		
		p3 = (Persona) op1.getSegundo();
		System.out.println(p3);
	}

}

class Persona{
	
private String nombre;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}

