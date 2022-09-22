package com.princejrdeveloper.poo;

import java.util.HashMap;
import java.util.Map;

public class ListMap {

	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(55, "Ana");
		map.put(88, "Juan");
		map.put(14, "Alicia");
		
		System.out.println("\n"+map.keySet());
		
		System.out.println("\n");
		
		for (@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "
							+ m.getValue());
		}
	}
}
