package chapter02;

import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args){
		
		Scanner eingabe = new Scanner(System.in); 	
		double KILOGRAMM_PRO_PFUND = 0.454;	

		
		System.out.print("Geben Sie einen Nummer im Pfund ein: ");
		double pfund = eingabe.nextDouble();

		// Convert pounds into kilograms
		double kilogramm = pfund * KILOGRAMM_PRO_PFUND;

		// Display the results
		System.out.println(pfund + " pfund ist " + kilogramm + " kilogramm");
	}
}