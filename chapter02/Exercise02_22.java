package chapter02;
import java.util.Scanner;

public class Exercise02_22 {

	public static void main(String[] args) {
		
	 Scanner input = new Scanner(System.in);

			
	 System.out.print("Enter an amount"+
	  "(For example, 1156 represents 11 dollars and 56 cents.):");
	 
	 int amount = input.nextInt();

	 int remainingAmount = amount;

			// kac 1 dolar dolar var
	 int numberOfOneDollars = remainingAmount / 100;
			remainingAmount %= 100;

			// quarters (25 cent)
	 int numberOfQuarters = remainingAmount / 25;
	 remainingAmount %= 25;

			// on cent
	 int numberOfDimes = remainingAmount / 10;
			remainingAmount %= 10;

			// 5 cent
	 int numberOfNickels = remainingAmount / 5;
	 remainingAmount %= 5;

			// Find the number of pennies in the remaining amount
	 int numberOfPennies = remainingAmount;

			// Display results
	 System.out.println("Your amount " + amount / 100.0 + " consists of");
	 System.out.println(" " + numberOfOneDollars + " dollars");
	 System.out.println(" " + numberOfQuarters + " quarters(25 cent)");
	 System.out.println(" " + numberOfDimes + " dimes(10 cent)");
	 System.out.println(" " + numberOfNickels + " nickels(5 cent)");
	 System.out.println(" " + numberOfPennies + " pennies(1 cent)");
		}
	}