package com.princejrdeveloper.poo;

public class Uber extends Taxi{

	
	String uberId;
	boolean uberStatus;
	
	
	public Uber(String matricula, String modelo, int potencia, String licenceNumber) {
		super(matricula, modelo, potencia, licenceNumber);
		
	}


	public String getUberId() {
		return uberId;
	}


	public void setUberId(String uberId) {
		this.uberId = uberId;
	}


	public boolean isUberStatus() {
		return uberStatus;
	}


	public void setUberStatus(boolean uberStatus) {
		this.uberStatus = uberStatus;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+" Y el Id del Uber es: "+uberId+" Su estatus es: "+uberStatus;
	}
	
	

}
