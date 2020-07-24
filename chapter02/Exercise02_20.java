package chapter02;

import java.util.Scanner;

public class Exercise02_20 {

	public static void main(String[] args) {
	
	Scanner eingabe = new Scanner(System.in);

	System.out.print("Geben Sie Kontostand und Zinssatz ein(z.B., 3 für %3): ");
	double kontoStand = eingabe.nextDouble();
	double jährlichZinssatzRate = eingabe.nextDouble();

	// Calculate the interest
	double zinssatz = kontoStand * (jährlichZinssatzRate  / 1200);

	// Display result
	System.out.println("Der Zinssatz ist " + zinssatz);
		}
	}