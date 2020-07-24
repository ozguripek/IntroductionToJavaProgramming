package chapter02;

import java.util.Scanner;

public class Exercise02_01 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);

		 System.out.print("Geben Sie ein Grad in Celsius ein: ");
         double celsius = eingabe.nextDouble();

				// Convert Celsius to Fahrenheit
		 double fahrenheit = 9.0 / 5 * celsius + 32;

				// Display results
	     System.out.println(celsius + " Celsius ist " + fahrenheit
					+ " Fahrenheit"); 
	 }
}