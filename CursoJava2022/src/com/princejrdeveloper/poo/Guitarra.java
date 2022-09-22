package com.princejrdeveloper.poo;

public class Guitarra extends Instrumento {

	@Override
	public String tocar() {
		return "Sonido de Guitarra";
	}

}

class impGuitarra{
	public static void main(String[] args) {
		Guitarra g1=new Guitarra();
		System.out.println(g1.tocar());
	}
}
