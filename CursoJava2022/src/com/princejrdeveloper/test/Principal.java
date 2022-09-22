package com.princejrdeveloper.test;

import java.util.Arrays;
import java.util.List;

public class Principal {
  public static void main(String[] args) {
    
    Persona p1= new Persona("juan",50,1000);
    Persona p2= new Persona("ana",70,1200);
    Persona p3= new Persona("miguel",50,900);
    Persona p4= new Persona("maria",80,2000);
    
    List<Persona> lista= Arrays.asList(p1,p2,p3,p4);
    
    Ijubilacion o1 = x -> x * 0.70;
    
	
    lista.stream().filter(Persona::estaJubilado).map(Persona::getSalario).map(o1::operacion)
    	.forEach(System.out::println);
    
    double sl = 0;
    
    for (Persona persona : lista) {
    	if (persona.getSalario() <1000) {
    		sl = 1000;
		}else {
			sl = persona.getSalario();
		}
    	//Ternary Operator
//		double sl = persona.getSalario() <1000 ? 1000: persona.getSalario();
		System.out.println(persona.getNombre()+", salario "+sl);
	}
  }
}

@FunctionalInterface
interface Ijubilacion {
	 
public double operacion(double x);
 
}