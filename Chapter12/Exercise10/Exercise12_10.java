package Chapter12.Exercise10;

import java.util.Scanner;

public class Exercise12_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 digit array size: ");
		int size = input.nextInt();
		
		try {
			byte[] array = new byte[size];
		} catch (OutOfMemoryError ex) {
			System.out.println("Out Of Memory");
		}
		
	}
}
