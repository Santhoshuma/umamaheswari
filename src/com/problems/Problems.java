package com.problems;

import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		
		// 1. Find the given number is odd or even
		// 2. Find the given number is prime or not
		// 3. find the given number is palindrome or not
		// 4. Fibonacci series
		// 5. Amstrong number
		// 6. Reverse the string
		// 7. Repeated string
		// 8. Print Triangle in the console
		// 9. Adding two array
		//10. making simple calculator using switch
		
		
		// 1. The given number is odd or even 
		
		//Scanner number = new Scanner (System.in);
		
		//System.out.println("Enter a Number");
		
		//int GN = number.nextInt();
		
		//if (GN % 2 ==0) 
			
			//System.out.println("The Given Number is Even");
		
		//else
			
			//System.out.println ("The Given Number is Odd");
		
		
		//8. Print Triangle on Console
		
		int i, j, row= 5;
				
			for(i=0; i<row; i++) {
				
				for(j=2*(row-i); j>=0; j--) {
					
					System.out.print(" ");
				}
			for(j=0; j<=i; j++) {
				
				System.out.print(" " + " * ");
			
			}
			
			System.out.println();
	}
			
	}

}
