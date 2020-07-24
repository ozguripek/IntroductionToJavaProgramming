package chapter02;
import java.util.Scanner;

public class Exercise02_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
    // how many km did you go
		System.out.print("Enter the driving distace in Mil: ");
		double distace = input.nextDouble();
		
	 //how many miles are you going with a gallon
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
	// what is the price of a gallon in dollars
		System.out.print("Enter price per gallon in $: ");
		double pricePerGallon = input.nextDouble();

		// Find how many gallons are spent and multiply by 1 gallon price
		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		// Display result
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}