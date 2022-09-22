package com.princejrdeveloper.poo;

import java.util.Date;

public class Person {

	
	private String name;
	private String city;
	private int age;
	protected final Date creation = new Date();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
		
	}
	
	@Override
	public String toString() {
		return "Mi nombre es: "+name+" vivo en la ciudad: "+city+" y mi edad es: "+age+" Años"+
				", La fecha de hoy es: "+creation;
	}
	


	
	
	
}
