package com.princejrdeveloper.poo;

import java.util.HashSet;
import java.util.Set;

public class ListSet {

	
	public static void main(String[] args) {
		
		
		Set<String> Set = new HashSet<String>();
		
		Set.add("one");
		Set.add("two");
        Set.add("two");
        Set.add("two");
        Set.add("three");
        Set.add("four");
        Set.add("five");
        
        System.out.println(Set);
		
	}
}
