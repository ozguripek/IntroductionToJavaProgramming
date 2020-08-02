package chapter04;
import java.util.Scanner;

public class Exercise04_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a hex digit
		System.out.print("Enter a hex digit: ");
		String hexString = input.nextLine();

		// Check if the hex string has exactly one character
		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}

		// Display binary number for the hex digit
		char ch = hexString.charAt(0);
		if ((ch >= 'A' && ch <= 'F')) 
		{
			System.out.print("The binary value is ");
			switch(ch)
			{
			 
				case 'A': System.out.println(1010); break; 
				case 'B': System.out.println(1011); break; 
				case 'C': System.out.println(1100); break; 
				case 'D': System.out.println(1101); break; 
				case 'E': System.out.println(1110); break; 
				case 'F': System.out.println(1111); break; 
			}
		}
		else
			System.out.println(ch + " is and invalid input");

	}
}
