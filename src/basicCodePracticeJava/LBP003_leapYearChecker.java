package basicCodePracticeJava;

import java.util.Scanner;

public class LBP003_leapYearChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year>0) {
		 
		 if(year%100==0 && year%400==0) {
			 System.out.println("True");
		 }else {
			 
			 if(year%100 !=0 && year%4==0) {
				 System.out.println("True");
			 }else {
				 System.out.println("False"); 
			 }
			 
			
		 }
		 
		}else {
			System.out.println("invalid input");
		}

	}

}
