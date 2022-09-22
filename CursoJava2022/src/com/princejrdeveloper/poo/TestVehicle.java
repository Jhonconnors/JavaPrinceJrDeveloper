package com.princejrdeveloper.poo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class TestVehicle {

	public static void main(String[] args) {
		
		Taxi t1 = new Taxi("AA256FF", "Suburu", 1600, "L2022SANTIAGO");
//		Taxi t2 = new Taxi("TTR217", "Mazda", 2000, "L2022SANTIAGO");
//		Taxi t3 = new Taxi("AA0001F", "Toyota", 2600, "L2022SANTIAGO");
	
		Uber u1 = new Uber("ZZY201", "Mazda", 2000, "L2022LIMA");
		u1.uberId ="U2022";
		u1.uberStatus = true;
		
//		JOptionPane.showMessageDialog(null, t1);
//		
//		JOptionPane.showMessageDialog(null, u1);
//		
		
		List<Taxi> carList = new ArrayList<>();
		
		carList.add(t1);
		carList.add(u1);
		
//		for (Taxi taxi : carList) {
//			System.out.println("\n"+taxi);
//		}
		
		Iterator<Taxi> nombreIterator = carList.iterator();
		while(nombreIterator.hasNext()) {
			Taxi elemento = nombreIterator.next();
			System.out.println(elemento+"\n");
		}
		


		
	}
}
