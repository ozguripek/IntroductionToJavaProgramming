package chapter02;

import java.util.Scanner;

public class Exercise02_06 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);		

		System.out.print("Geben Sie eine Nummer zwischen 0 und 1000 ein: ");
		int nummer = eingabe.nextInt();

		
		int wenigAls10 = nummer % 10; 
		nummer /= 10;				
		int zehner = nummer % 10;	
		nummer /= 10;				
		int hunderte = nummer % 10;	
		nummer /= 10;				
		int summe = hunderte + zehner + wenigAls10;	

		
		System.out.println("Die Summe der Ziffern ist: " + summe);
	}
}
