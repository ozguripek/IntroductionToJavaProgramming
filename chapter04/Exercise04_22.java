package chapter04;
import java.util.Scanner;

public class Exercise04_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two strings
		System.out.print("Enter string s1: ");
		String str1 = input.nextLine();
		System.out.print("Enter string s2: ");
		String str2 = input.nextLine();

		// Display wheater the second string
		// is a substring of the frist string
		System.out.println(
			str2 + ((str1.contains(str2)) ? " is " : " is not ") + 
			"a substring of " + str1);
	}
}
