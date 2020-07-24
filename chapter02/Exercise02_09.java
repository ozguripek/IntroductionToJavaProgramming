package chapter02;

import java.util.Scanner;

public class Exercise02_09 {

	public static void main(String[] args) {
		
			Scanner eingabe = new Scanner(System.in);	

			System.out.println("Geben Sie v0(m/s), v1(m/s) und z(s)ein: ");
			double v0 = eingabe.nextDouble();
			double v1 = eingabe.nextDouble();
			double z = eingabe.nextDouble();

			// Berechnen Sie die durchschnittliche Beschleunigung
			double d = (v1 - v0) / z;

			System.out.println("die durchschnittliche Beschleunigung ist " + d + "m/s");
		}
	}
	
