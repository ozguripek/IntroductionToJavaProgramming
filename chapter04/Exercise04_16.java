package chapter04;
import java.util.Scanner;

public class Exercise04_16 {

	public static void main(String[] args) {
	// Generate a random number between 65 and 90
	int number = (int)((Math.random() * (91 - 65))+65);

	// Display a random uppercase letter
	System.out.println((char)(number));
}
}