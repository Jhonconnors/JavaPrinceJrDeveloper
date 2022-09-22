package com.princejrdeveloper.poo;

public class Animal {

	public void makeSound() {
		System.out.println("Grrr");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("Meow");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("Woof");
	}
}

class ImpAnimal{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();
	}
}

