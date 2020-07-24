package chapter02;

import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);

		
		System.out.print("Geben sie die Nummer von den Minuten ein: ");
		int minuten = eingabe.nextInt();
	 // ein jahr 365 tage
     // ein jahr 525600 minuten
     // ein Tag 1140 minuten		
		
		int jahre = minuten / 525600;
		int tage = (minuten % 525600) / 1440;

		
		System.out.println(minuten + " minuten ist ungefähr " + jahre
			+ " Jahre und " + tage + " tage ");
	}
}
