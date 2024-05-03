package basicCodePracticeJava;

import java.util.Scanner;

public class LBP001_CheckOddAndEvenNumber {
	
	
	// Implement a program to check whether the given number is even number or odd number.
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        if(num>=0){
	            if(num%2==0){
	                System.out.println("even");
	             }else{
	                System.out.println("odd");
	            }
	        }else{
	            System.out.println("invalid");
	        }
		
	}

}
