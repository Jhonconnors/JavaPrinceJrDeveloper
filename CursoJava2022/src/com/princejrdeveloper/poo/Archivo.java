package com.princejrdeveloper.poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {

	public static void main(String[] args) throws IOException{


		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\J Connors\\PrinceJrDeveloper\\CursoJava2022\\src\\test1.txt"));
		
	     String texto = bf.readLine();
	     
	     System.out.println(texto);
	     bf.close();
	     
	     
		}
	

	}


