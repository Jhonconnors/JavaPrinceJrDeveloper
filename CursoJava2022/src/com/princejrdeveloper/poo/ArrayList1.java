package com.princejrdeveloper.poo;

import java.util.ArrayList;

public class ArrayList1 {

	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Manzana");
		al.add("Pera");
        al.add("Uva");
        
        System.out.println(al);
        
        al.remove(1);
        
        System.out.println(al);
        
        al.add("Melon");
        
        System.out.println(al);
        al.add(0, "Sandia");
        
        System.out.println(al);
		
	}
}
