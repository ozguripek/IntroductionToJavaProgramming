package chapter02;

import java.util.Scanner;

public class exercise02_16 {

	public static void main(String[] args) {
		
		
		Scanner eingabe = new Scanner(System.in);

		
		System.out.print("Enter the side: ");
		double seite = eingabe.nextDouble();

		// Compute the area of the hexagon, karakök sayinin 0.5 inci kuvveti
		double fläsche = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(seite, 2);

		// Display result
		System.out.println("Die Fläche des Sechsecks beträgt:  " + fläsche); 
	}
}