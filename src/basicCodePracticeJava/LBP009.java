package basicCodePracticeJava;

import java.util.Scanner;

public class LBP009 {
	/*
	 * 
Implement a program to calculate sum of digits present in the given number.
	 */
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		 if(num>0) {
			 
			 String numeber = num+"";
			 numeber.length(); 
			 int sum =0;
			 for(int i =0;i<numeber.length();i++) {
				String s=  numeber.charAt(i)+"";
				int n = Integer.parseInt(s);
				if(n>0 && n%2==0) {
					sum = sum+n;
				}
				
			 }
			  System.out.println(sum);
		 }else {
			 System.out.println("Invalid input");
		 }
	}

		
}

