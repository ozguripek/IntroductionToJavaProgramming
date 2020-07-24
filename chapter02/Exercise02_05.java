package chapter02;

import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args)  {
		Scanner eingabe = new Scanner(System.in);

		System.out.print("Geben Sie die Zwischensumme und die Gratifikation Rate: ");
		double zwischensumme = eingabe.nextDouble();
		double gRate = eingabe.nextDouble();

		// Calculate gratuity and total
		double gratifikation = zwischensumme * (gRate / 100);
		double total = zwischensumme + gratifikation;

		// Display results
		System.out.println("Die Gratifikation ist $" + gratifikation +
			" und die Summe ist $" + total);
	}
}