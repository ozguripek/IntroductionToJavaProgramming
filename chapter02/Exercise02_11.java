package chapter02;

import java.util.Scanner;

public class Exercise02_11 {

	public static void main(String[] args) {
		
		// 31536000 seconds per year
		// Current population: 312,032,486
		// One birth every 7 seconds
		// One death every 13 seconds
	    // One new immigrant every 45 seconds
				
		//Current population + (((births per year)
		//		                -(deaths per year)
		//		                +(new immigrants per year))
		//		                 * year))
		
		
		
		Scanner eingabe = new Scanner(System.in);	

		//  the number of years
		System.out.print("Geben Sie die Anzahl der Jahre ein: ");
		int jahre = eingabe.nextInt();

		// Calculate population projection
		int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
								+ (31536000 / 45)) * jahre);

		// Display the results
		System.out.println("Die Population im " + jahre + " ist " + population);
	}
}
