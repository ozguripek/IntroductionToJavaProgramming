package chapter03;

import java.util.Scanner;


public class Exercise03_19 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter two numbers for 3 corners of a triagle: ");
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		
		double x3= input.nextDouble();
		double y3= input.nextDouble();
		
		double a= Math.pow(Math.pow((x1-x3),2)+ Math.pow((y1-y3),2),0.5);
		double b= Math.pow(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2),0.5);
		double c= Math.pow(Math.pow((x2-x3),2)+ Math.pow((y2-33),2),0.5);
		
		if(a+b>c|| a+c>b || c+b>a) {
			
			double perimeter= a+b+c;
			
			System.out.println(" The perimeter of the triangel is:" + perimeter);
				
		}
		else {
		System.out.println("The input is invalid");
		}
	}

}
