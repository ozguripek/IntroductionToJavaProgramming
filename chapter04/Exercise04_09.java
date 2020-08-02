package chapter04;
import java.util.Scanner;

public class Exercise04_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a character
		// girilen Stringin ilk harfini al
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		// Display Unicode of character
		System.out.println((int)ch);
	}
}
