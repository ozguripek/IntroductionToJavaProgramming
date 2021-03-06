package chapter04;
import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of sides  
		// and their length of a regular polygon
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("Enter the lenght of one side: ");
		double side = input.nextDouble();

		// Compute the area of a regular polygon
		double area = (numberOfSides * Math.pow(side, 2) / 
			(4 * Math.tan(Math.PI / numberOfSides)));

		// Display result
		System.out.println("The area of the polygon is " + area);
	}
}
