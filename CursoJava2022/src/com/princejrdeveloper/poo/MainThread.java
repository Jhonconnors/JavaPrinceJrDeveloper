package com.princejrdeveloper.poo;

public class MainThread {

	public static void main(String[] args) {


		Thread hilo1 = new HiloThread("Proceso 1");
		Thread hilo2 = new HiloThread("Proceso 2");
		
		
		hilo1.run();
		hilo2.start();
		
		System.out.println("Final");
	}

}
