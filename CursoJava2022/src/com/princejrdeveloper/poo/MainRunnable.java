package com.princejrdeveloper.poo;

public class MainRunnable {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		HiloRunnable hilo1 = new HiloRunnable("N1");
//		HiloRunnable hilo2 = new HiloRunnable("N2");
	
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("[A]Ejecucion del Runnable clase Anonima: "+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
		};
		
		Thread hiloA = new Thread(r);
		hiloA.start();
	}
	
}
