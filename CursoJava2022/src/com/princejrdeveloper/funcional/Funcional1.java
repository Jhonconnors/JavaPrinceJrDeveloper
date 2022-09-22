package com.princejrdeveloper.funcional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Funcional1 {
	
	public void ordenar(List<String> lista) {
//		Collections.sort(lista, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2) ;
//			}
//		});
//		
//		for (String s1 : lista) {
//			System.out.println(s1);
//		}
		
		//Lambda Function
		Collections.sort(lista, (p1, p2) -> p1.compareTo(p2));
		lista.forEach(n -> System.out.println(n));
		
		//Using Stream
		lista.stream().filter(p -> p.equals("Maiz")).forEach(gt -> System.out.println(gt));
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
