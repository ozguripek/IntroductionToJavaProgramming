package chapter06;

import java.util.Scanner;

public class Exercise06_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.print("Geben Sie drei Punkte für ein Dreieck ein:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y2 - y3, 2), 0.5);
		double side3 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		

		if( isValid(side1, side2, side3)) {
			System.out.println("the area of the triangel is: "+area(side1, side2, side3));
		}
		else {
			System.out.println(" invalid value");
		}
	}
	public static boolean isValid(double side1, double side2, double side3) {
		if(side1+side2>side3||side1+side3>side2||side2+side3>side1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		return area;
	}
}
