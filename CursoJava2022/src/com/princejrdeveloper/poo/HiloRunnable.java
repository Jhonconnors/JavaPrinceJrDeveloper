package com.princejrdeveloper.poo;

public class HiloRunnable implements Runnable {

	Thread t;
	String nombre;
	
	public HiloRunnable(String nombre) {
		this.nombre=nombre;
		t = new Thread(this,"Hilo 1");
		t.start();
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println(nombre+" Valor = "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
