package chapter02;

import java.util.Scanner;

public class Exercise02_08 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);	

		// Benutzer gibt den Zeitzonenversatz zu GMT ein
		System.out.print("Geben Sie den Zeitzonenversatz zu GMT ein: ");
		int versatz = eingabe.nextInt();

		// Erhalten Sie die gesamten Millisekunden seit Mitternacht, Jan 1, 1970
		long totalMillisekunden = System.currentTimeMillis();
		
		//Erhalten Sie die gesamten sekunden seit Mitternacht, Jan 1, 1970
		long totalSekunden = totalMillisekunden / 1000;

		// Berechnen Sie die aktuelle Sekunde in der Minute in der Stunde
		long aktuelleSekunde = totalSekunden % 60;

		// Erhalten Sie die Gesamtminuten
		long totalMinuten = totalSekunden / 60;

		// Berechnen Sie die aktuelle Minute in der Stunde
		long aktuelleMinute = totalMinuten % 60;

		// Erhalten Sie die Gesamtstunden
		long totalStunden = totalMinuten / 60;

		// Berechnen Sie die aktuelle Stunde
		long aktuelleUhr = totalStunden % 24;
		aktuelleUhr = aktuelleUhr + versatz;
		
		if(aktuelleUhr>24) {
			
			aktuelleUhr=aktuelleUhr - 24;
				
		}
		
		// Ergebnisse anzeigen
		System.out.println("Aktuelle Zeit ist " + aktuelleUhr + ":"
			+ aktuelleMinute + ":" + aktuelleSekunde);
	}
}
