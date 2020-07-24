package chapter02;

import java.util.Scanner;

public class Exercise02_12 {

	public static void main(String[] args)  {
		
		
		Scanner eingabe = new Scanner(System.in);	

		
		System.out.print("Geben Sie Tempo und Beschleunigung ein:");
		double tempo = eingabe.nextDouble();
		double beschleunigung = eingabe.nextDouble();

		// Die minimale Landebahnlänge für ein Flugzeug
		double länge = Math.pow(tempo, 2) / (2 * beschleunigung);

		// Display result
		System.out.println("Die minimale Landebahnlänge für dieses Flugzeug beträgt: " + länge);
	}
}
