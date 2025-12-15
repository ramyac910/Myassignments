package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		int number[]= { 98, 99, 96, 80, 67};
		
		// to find the length of the array
		
		int lengthofArray = number.length;
		System.out.println(lengthofArray);
		
		// to find the last index value
		
		System.out.println("Last index value of number " + number[lengthofArray - 1]);
		
		//To find the first index value
		System.out.println("Last index value of number " + number[0]);
		
		// To sort the array value - 98,99,96,80,67
		
		Arrays.sort(number);
		System.out.println("Array after sorting " + number[0]);
		
		// to iterate the arrays value - for loop
		for (int i=0; i < number.length; i++) {
			
			System.out.println("Ascending values : " +number[i]) ;
		} System.out.println();
		
		for (int i = number.length-1; i >0; i--) {
			System.out.println("Descending values : " +number[i]);
			
		}
		
		
	}

}
