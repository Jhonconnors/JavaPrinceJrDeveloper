package com.princejrdeveloper.poo;

public class Taxi extends Vehicle {

	public Taxi(String matricula, String modelo, int potencia, String licenceNumber) {
		super(matricula, modelo, potencia);
		this.licenceNumber = licenceNumber;
	}

	String licenceNumber;

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Licencia Numero: "+licenceNumber;
	}
	
}
