package chapter02;

import java.util.Scanner;

public class exercise02_15 {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);

		
		System.out.print("Geben Sie x1 und y1 ein : ");
		double x1 = eingabe.nextDouble();
		double y1 = eingabe.nextDouble();
		
		System.out.print("Geben Sie x2 and y2 ein: ");
		double x2 = eingabe.nextDouble();
		double y2 = eingabe.nextDouble();

		
		double distanz = Math.pow(Math.pow(x2 - x1, 2) +
								Math.pow(y2 - y1, 2), 0.5);

		
		System.out.println(" Die distanz zwischen zwei Punkt ist " + distanz);
	}
}