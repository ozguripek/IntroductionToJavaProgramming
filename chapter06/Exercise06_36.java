package chapter06;

import java.util.Scanner;

public class Exercise06_36 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the number of the sides: ");
		int n = input. nextInt();
		
		
		System.out.print("Enter the side: ");
		double s = input. nextDouble();
		
		System.out.println("The area of the pentagon is: "+area(n, s));
		
		
	}
	public static double area(int n, double side) {
		
		double area= (n*side*side)/(4*Math.tan(Math.PI/n));
		return area;
		
		
	}

}
