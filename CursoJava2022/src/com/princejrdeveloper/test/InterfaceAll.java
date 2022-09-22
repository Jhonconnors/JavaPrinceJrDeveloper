package com.princejrdeveloper.test;

//Anotacion que declara La interfaz funcional

@FunctionalInterface
public interface InterfaceAll {

	// el metodo abstracto
				public double suma(double x, double y);
				
				
				@SuppressWarnings("unused")
				private String sumacion(String str) {
					
					return "Variable + : "+recibicion(55)+str+" Dato prep: "+prep();
				}
				
				static <T> T recibicion(T t) {
					return t;
				}
				
				default Integer prep() {
					return 99;
				}
}
