package basicCodePracticeJava;

import java.util.Scanner;

public class LBP006 {
	/*
	 * 
	 * Implement a program to calculate the free number of cups the user gets for a specified number 
	 * of cups bought by the user. In this particular case, the user gets 1 cup free for 
	 * every 6 cups bought. (Example: If the user buys 12 cups, he gets 2 cups free as per 
	 * the Buy 6 Get 1 Free offer, and hence the output will be 12+2 = 14 cups).
	 */
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		 if(num>=1) {
			 
			 num = num + num/6;
			 System.out.println(num);
			 
		 }else {
			 System.out.println("Invalid input");
		 }
	}

		
}

