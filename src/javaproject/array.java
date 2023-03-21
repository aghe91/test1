package javaproject;

public class array {
     
	public static void main(String[] args) {

		
		int [] array = {9,5,6,3,1}
		;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		//dimensions array
		int [] [] array2 = {{9,8},{0,5}};
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		
		char [] array3 = new char [1];
		array3[0]='g';
		System.out.println(array3[0]);
		
		char [] [] array4 = new char [1] [1];
		array4[0] [0] ='g';
		System.out.println(array4[0][0]);
		
		
	}		
		
	
}
