package basicCodePracticeJava;

import java.util.Scanner;

public class LBP005 {
 
	/*
	 * 
Implement a program that takes a number as an argument, increments the number by +1 and returns the result.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		 if(num>=0) {
			 
			num = num+1;
			System.out.println(num);
			 
		 }else {
			 System.out.println("Invalid input");
		 }
		
		
	}
	
}
