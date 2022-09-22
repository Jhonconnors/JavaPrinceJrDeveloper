package com.princejrdeveloper.poo;

import javax.swing.JOptionPane;

public class TestPerson {

	public static void main(String[] args) {


		Person p1 = new Person("Pedro", "Santiago", 30);
		Person p2 = new Person("Samuel", "Buenos Aires", 25);
	
		

		JOptionPane.showMessageDialog(null, p1);
		JOptionPane.showMessageDialog(null, p2);
	}

}
