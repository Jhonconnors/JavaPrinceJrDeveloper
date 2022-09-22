package com.princejrdeveloper.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLambda {

	
	public void ordenacion(List<String> lista) {
		
		Collections.sort(lista);
		lista.forEach((n) -> System.out.println(n));
	}
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Zanahoria");
		lista.add("Aguacate");
		lista.add("Maíz");
		lista.add("Pera");
		
		TestLambda tl = new TestLambda();
		
		tl.ordenacion(lista);
		System.out.println("\n");
		
//		List<Integer> lista1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<String> lista2 = Arrays.asList("Tomas","Julieta", "Juan", "Kevin","Juan");
		
		lista2.forEach(n-> System.out.print(n+" "));

		
		
	}
}
