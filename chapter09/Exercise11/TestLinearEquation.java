package chapter09.Exercise11;

import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter values for a, b, c, d, e and f:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		
		LinearEquation lE = new LinearEquation(a, b, c, d, e, f);
		
	
		if (lE.isSolvable()) {
			System.out.println("x is " + lE.getX() + " and y is " + lE.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}

}


