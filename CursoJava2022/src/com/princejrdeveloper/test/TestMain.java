package com.princejrdeveloper.test;

import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		Car c1 = new Car("Nissan", "350Z", 2001);
		Car c2 = new Car("Toyota", "Supra", 2000);
		Car c3 = new Car("Toyota", "Corola", 2017);
		Car c4 = new Car("Mercedez", "clasic", 1998);
		Car c5 = new Car("Hyundai", "Getz", 2012);
		
		List<Car> lc = Arrays.asList(c1, c2, c3, c4, c5);
		System.out.println("# Functional Data Structures");
        
		for (Object e : lc) {
			System.out.println(e);
		}
        lc.forEach(System.out::println);
		
        

	}

}
