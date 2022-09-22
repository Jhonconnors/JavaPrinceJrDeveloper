package com.princejrdeveloper.poo;

public class HiloThread extends Thread {

	
	public HiloThread(String msg) {
		super(msg);
	}
	
	@Override
	public void run() {
	for (int i = 0; i < 20; i++) {
		System.out.println(this.getName()+" - Valor = "+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	}
}
