package basicCodePracticeJava;

import java.util.Scanner;

public class LBP002_PrintInformationBasedOnCondition {
	
	
	// Implement a program to check whether the given number is even number or odd number.
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	       if(num>=0) {  
	        if(num%2==0) {
	         if(num>=2 && num<5) {
	        	System.out.println("Not Weird");
	         }else if (num>=6 && num<=20) {
	        	 System.out.println("Weird");
	         }else {
	        	 System.out.println("Not Weird");
	         }
	        }else {
	        	System.out.println("Weird");
	        }
	       }else {
	    	  System.out.println("invalid"); 
	       }
		
	}

}
