package basicCodePracticeJava;

import java.util.Scanner;

public class LBP007 {
	/*
	 * 
Implement a program to extract digits from the given number
	 */
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		 if(num>0) {
			 
			 String numeber = num+"";
			 numeber.length(); 
			 for(int i =(numeber.length()-1);i>=0;i--) {
				 System.out.print(numeber.charAt(i)+" ");
			 }
			 
		 }else {
			 System.out.println("Invalid input");
		 }
	}

		
}

