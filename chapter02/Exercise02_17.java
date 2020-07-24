package chapter02;

import java.util.Scanner;

public class Exercise02_17 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);

		// temperature must between -58F and +41F and 
		// wind speed must greater than or equal to 2
		
		System.out.print("Geben Sie die Temperatur in Fahrenheit ein " +
			"zwischen -58ºF und +41ºF: ");		
		double temperatur = eingabe.nextDouble();
		
		
		
		System.out.print("Geben Sie die Windgeschwindigkeit (> = 2)" +
				"in Meilen pro Stunde ein: ");
		double geschwindigkeit = eingabe.nextDouble();

		// Windchill index
		double Windchill = 35.74 + 0.6215 * temperatur -
								 35.75 * Math.pow(geschwindigkeit, 0.16) +
								 0.4275 * temperatur * Math.pow(geschwindigkeit, 0.16);

		// Display result
		System.out.println("Der Windchill-Index ist " + Windchill);
	}
}
