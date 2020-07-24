package chapter02;

import java.util.Scanner;

public class Exercise02_02 {

	public static void main(String[] args) {
		
		Scanner eingabe= new Scanner(System.in);
		double PI= 3.1415;
		
		System.out.println("Geben Sie den Radius und die Länge des Zylinders ein:");
		double radius= eingabe.nextDouble();
		double länge= eingabe.nextDouble();
		
		double fläsche= radius*radius*PI;
		double volumen= fläsche* länge;
		
		System.out.println(" Die Fläsche ist:"+ fläsche);
		System.out.println(" Die Volumen ist"+ volumen);
				
		
	  }		

	}


