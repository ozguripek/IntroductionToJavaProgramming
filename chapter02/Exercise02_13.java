package chapter02;

import java.util.Scanner;

public class Exercise02_13 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);	
		double Monatliche_Zins = 0.00417;	

		// monatliche Sparbetrag
		System.out.print("Geben Sie den monatlichen Sparbetrag ein: ");
		double Sparbetrag = eingabe.nextDouble();

		// 1.Monat 		
		double total = Sparbetrag * (1 + Monatliche_Zins);
		// 2.Monat
		total = (Sparbetrag + total) * (1 + Monatliche_Zins);
		// 3.Monat
		total = (Sparbetrag + total) * (1 + Monatliche_Zins);
		// 4.Monat
		total = (Sparbetrag + total) * (1 + Monatliche_Zins);
		// 5.Monat
		total = (Sparbetrag + total) * (1 + Monatliche_Zins);
		// 6. Monat
		total = (Sparbetrag + total) * (1 + Monatliche_Zins);

		// Display result
		System.out.println("Nach dem sechsten Monat beträgt der Kontowert " + total);
	}
}
