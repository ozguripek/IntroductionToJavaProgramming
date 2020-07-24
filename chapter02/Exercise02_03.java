package chapter02;

import java.util.Scanner;

public class Exercise02_03 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);

		
		double METER_PRO_FUß = 0.305;

		System.out.print("Geben Sie einen Wert für Fuß ein: ");
		double fuß = eingabe.nextDouble();

		// Convert feet into meters
		double meter = fuß * METER_PRO_FUß;

		// Display results
		System.out.println(fuß + " fuß ist " + meter + " meter");
	}
}
