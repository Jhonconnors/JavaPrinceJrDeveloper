package com.princejrdeveloper;

public class Default {

	public static void main(String[] args) {
		
		
//		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
//		
//		intArray[2] = 88;
//		
//		System.out.println(intArray[2] +" EL otro valor es = "+ intArray[3]+"\n"+"\n");
//		
//		
//		
//		
//		int[] intArray2 = new int[10];
//		intArray2[1] = 25;
//		
//		for (int i : intArray2) {
//			System.out.println(i);
//		}
		
	

		 int[][] arr = { {2,7,9},{3,6,1},{7,4,2} };
		 
	
		 arr[0][2] = 25;
		 arr[2][0] = 50;
		 
		// imprimir array 2D
	        for (int i=0; i< 3 ; i++)
	        {
	            for (int j=0; j < 3 ; j++) {
	                System.out.print(arr[i][j] + " ");
	 
	            } System.out.println();
	        }
	
		
		
	}
	
	 
	
	
}
