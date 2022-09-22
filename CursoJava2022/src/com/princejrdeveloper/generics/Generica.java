package com.princejrdeveloper.generics;

public class Generica<T> {

	private T primero;
	private Object segundo;
	
	public T getPrimero() {
		return primero;
	}
	public void setPrimero(T primero) {
		this.primero = primero;
	}
	public Object getSegundo() {
		return segundo;
	}
	public void setSegundo(Object segundo) {
		this.segundo = segundo;
	}
	public Generica() {
		primero=null;
		segundo=null;
	}
	
	
}
