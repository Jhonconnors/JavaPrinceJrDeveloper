package com.princejrdeveloper.funcional;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1= new Persona("juan",50,1000);
	    Persona p2= new Persona("ana",70,1200);
	    Persona p3= new Persona("miguel",50,900);
	    Persona p4= new Persona("maria",80,2000);
	    
	    List<Persona> lista = Arrays.asList(p1,p2,p3,p4);
		
	    //Metodo Annonimo
	    
//	    Ijubilacion o = new Ijubilacion() {
//			
//			@Override
//			public double operacion(double x) {
//				return x*0.70;
//			}
//		};
	    
	    Ijubilacion o = x -> x*0.70;
		
		lista.stream().filter(p -> p.estaJubilado())
			.forEach(p -> System.out.println(p.getNombre()+" - "+o.operacion(p.getSalario())));
		
	}
}

@FunctionalInterface
interface Ijubilacion{
	
	public double operacion(double x);
}