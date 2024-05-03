package basicCodePracticeJava;

import java.util.Scanner;

public class LBP008 {
	/*
	 * 
     Implement a program to calculate sum of even digits present in the given number
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
				sum = sum+n;
			 }
			  System.out.println(sum);
		 }else {
			 System.out.println("Invalid input");
		 }
	}

		
}

