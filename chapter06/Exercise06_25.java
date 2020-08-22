package chapter06;

import java.util.Scanner;

public class Exercise06_25 {
	
	

	public static void main(String[] args) {
		
		
		
		long totalMillisekunden = System.currentTimeMillis();
		
		System.out.println("Bulundugunuz Bölgede Aktüel Saat:" + convertMillis(totalMillisekunden));
		
		
	}
	public static String convertMillis(long millis) {
		
			Scanner input= new Scanner(System.in);
			
			System.out.print("GMT'den saat dilimi farkını girin:");
			
			int fark = input.nextInt();
		
		
			String aktuelleZeit = "";
		
			long totalSekunden = millis / 1000;

			
			long aktuelleSekunde = totalSekunden % 60;

			
			long totalMinuten = totalSekunden / 60;

			
			long aktuelleMinute = totalMinuten % 60;

			
			long totalStunden = totalMinuten / 60;

			
			long aktuelleUhr = totalStunden % 24;
			
			aktuelleUhr = aktuelleUhr + fark;
			
			if(aktuelleUhr>24) {
				
				aktuelleUhr=aktuelleUhr - 24;
			}
			return aktuelleZeit=aktuelleUhr + ":"+ aktuelleMinute + ":" + aktuelleSekunde;
			
			
		}
}
		


