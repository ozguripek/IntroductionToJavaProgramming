package chapter02;

import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
	
		//KILOGRAMME PRO PUNKT = 0.45359237
		// METER PRO ZOLL = 0.0254
		
	
		System.out.print("Geben Sie das Gewicht in Pfund ein: ");
		double gewicht = eingabe.nextDouble();

	
		System.out.print("Geben Sie die Höhe in Zoll ein:");
		double höhe = eingabe.nextDouble();

		// Gewicht in Kilogramm umrechnen
		gewicht = gewicht * 0.45359237;

		// höhe in Meter umrechnen
		höhe = höhe * 0.0254;

		
		double BMI = gewicht / Math.pow(höhe, 2);

		
		System.out.println("BMI ist " + BMI);
	}
}