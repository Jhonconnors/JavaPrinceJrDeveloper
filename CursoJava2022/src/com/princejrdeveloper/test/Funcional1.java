package com.princejrdeveloper.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Funcional1 {

	//Here we Used Lambdas for reorder List
	
	public void ordenar(List<String> lista) {

		//Traditional Programming  
		Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
			
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
		//Lambda expression
		Collections.sort(lista, (p1, p2) -> p1.compareTo(p2));
		lista.forEach(n -> System.out.println("Vegetales: "+n));
		
		//Used Filter
		lista.stream().filter(p -> p.equals("Aguacate") || p.equals("Maiz")).forEach(x -> System.out.println("Vegetales: "+x));
		
	}
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Zanahoria");
		lista.add("Aguacate");
		lista.add("Maiz");
		
		Funcional1 f1 = new Funcional1();
		
		f1.ordenar(lista);
		
	}
	

}
