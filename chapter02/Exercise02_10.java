package chapter02;

import java.util.Scanner;

public class Exercise02_10 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		//  the amount of water in kilograms.
		System.out.print("Geben Sie die Wassermenge in Kilogramm ein: ");		
		double kilogramm = eingabe.nextDouble();
		
		//  the initial temperature.
		System.out.print("Geben Sie die Anfangstemperatur ein: ");
		double anfangTemperatur = eingabe.nextDouble();
		
		//  the final temperature.
		System.out.print("Geben Sie die Endtemperatur ein: ");
		double endTemperatur = eingabe.nextDouble();

		// Calculate the energy
		double energie = kilogramm * (endTemperatur - anfangTemperatur) * 4184;

		// Display result
		System.out.println("Die benötigte Energie ist:  " + energie+" j");
	}
}
