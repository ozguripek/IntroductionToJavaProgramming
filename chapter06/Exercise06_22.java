package chapter06;

import java.util.Scanner;

public class Exercise06_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("bir sayi giriniz: ");
		long n = input.nextLong();
		System.out.println("approximates the square root of a number: "+
				sqrt(n));

	}
	public static double sqrt(long n) {
		
				
		 long lastGuess = 1;
		
		 long nextGuess = (lastGuess + n / lastGuess) / 2;
		   
				 
		while(nextGuess-lastGuess>0.0001) {
			
			lastGuess=nextGuess;
			
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return nextGuess;
		
	}
}
