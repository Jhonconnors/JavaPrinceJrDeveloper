package com.princejrdeveloper;

import java.util.Scanner;

public class CondicionalSwitch {

	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		
		System.out.println("Ingrese el dia a evaluar");
		int day = tc.nextInt();
		
		tc.close();
		String dayString;
		
		switch (day) 
        {
            case 1:  dayString = "Lunes";
                     break;
            case 2:  dayString = "Martes";
                     break;
            case 3:  dayString = "Miercoles";
                     break;
            case 4:  dayString = "Jueves";
                     break;
            case 5:  dayString = "Viernes";
                     break;
            case 6:  dayString = "Sabado";
                     break;
            case 7:  dayString = "Domingo";
                     break;
            default: dayString = "Dia inválido";
                     break;
        }
        System.out.println(dayString);

		
		
	}
}
