package com.princejrdeveloper.test;

public class Car {

	private String marca;
	private String modelo;
	private int fabricacion;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getFabricacion() {
		return fabricacion;
	}
	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}
	public Car(String marca, String modelo, int fabricacion) {
		this.marca = marca;
		this.modelo = modelo;
		this.fabricacion = fabricacion;
	}
	
	@Override
	public String toString() {
		return "Carro Marca: "+marca+" cuyo modelo es: "+modelo+", fue fabricado en: "+fabricacion;
	}
	
	
	
}
