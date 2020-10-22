package chapter13.Exercise01;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter three sides for triangle: ");
		double side1= input.nextDouble();
		double side2= input.nextDouble();
		double side3= input.nextDouble();
		
		System.out.println("Enter color for triangle: ");
		String color= input.next();		
		
		System.out.println("Enter if the triangle is filled or not(T/F): ");
		boolean filled= input.nextBoolean();
		
		Triangle tirangle1= new Triangle(side1, side2, side3, color, filled);
		
		System.out.println(tirangle1.toString());

	}

}
