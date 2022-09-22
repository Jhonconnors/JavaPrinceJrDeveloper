package com.princejrdeveloper;

public class Arrays {

	public static void main(String[] args) {


//		int[] inArray = new int[] {1,2,3,4,5,6};
//		System.out.println(inArray.length+"\n");
//		
//		inArray[1] = 88;
//		
//		for (int i : inArray) {
//			System.out.println(i);
//		}
		
		int[][] arr2 = { {1,2,3},{4,5,6},{7,8,9}};
		
		arr2[0][2] = 99;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j]+" ");
			}System.out.println();
		}
	}

}
