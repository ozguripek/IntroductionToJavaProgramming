package chapter05;

import java.util.Scanner;

public class Exercise05_32 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		int d1= (int)(Math.random()*10);
		int d2;		
		do {			
			d2= (int)(Math.random()*10);
		} while(d1==d2);	
		
		System.out.print("Enter your lottery pick (two distinct digits): ");
		int tahmin = input.nextInt();

		
		int guessd1 = tahmin / 10;
		int guessd2 = tahmin % 10;
		
		if(guessd1==guessd2) {
			System.out.print("You had to enter two distinct digits");
			System.exit(0);
		}

		System.out.println(
			"The lottery number is " + d1 + d2);

		// Check the guess
		if (guessd1 == d1 &&
			 guessd2 == d2)
			System.out.println("Exact match: you win $10,000");
		else if (guessd2 == d1
				&& guessd1 == d2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessd1 == d1
				|| guessd1 == d2
				|| guessd2 == d1
				|| guessd2 == d2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
	}
}
		
		
		

