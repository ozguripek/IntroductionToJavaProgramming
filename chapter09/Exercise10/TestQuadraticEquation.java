package chapter09.Exercise10;

import java.util.Scanner;

public class TestQuadraticEquation {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter values for a, b, and c:");
		double a= input.nextDouble();
		double b= input.nextDouble();
		double c= input.nextDouble();
	
		QuadraticEquation qE= new QuadraticEquation(a, b,c);
	
		System.out.print("The equation has ");
		if (qE.getDiscriminant() < 0)
			System.out.println("no real roots");
		else if (qE.getDiscriminant() > 0) {
			System.out.println("two roots " + qE.getRoot1() + 
					" and " + qE.getRoot2());
		}
		else {
			System.out.println("one root " + (qE.getRoot1() > 0 ? 
				qE.getRoot1() : qE.getRoot2()));
		}
	

	}

}
