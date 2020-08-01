package chapter03;
import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	

		// Prompt the user to enter the exchange rate from USD to RMB
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();

		// Prompt the user to enter 0 to convert from USD to RMB
		// and 1 to convert from RMB to USD
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int option = input.nextInt();

		// Prompt the user to enter the amount in USD or RMB
		// to convert it to RMB or USD respectively
		double amount;
		switch(option)
		{
			case 0: System.out.print("Enter the dollar amount: ");
					  amount = input.nextDouble();
					  System.out.println("$" + amount + " is " + 
					  	(amount * rate) + " yuan"); break;
			case 1: System.out.print("Enter the RMB amount: ");
					  amount = input.nextDouble();
					  System.out.println(amount + " yuan is $" + 
					  	((int)((amount * 100) / rate)) / 100.0); break;
			default: System.out.println("Incorrect input");
		} 
	}
}
