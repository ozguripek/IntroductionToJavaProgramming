package chapter05;

import java.util.Scanner;

public class Exercise05_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String isbn = input.nextLine();

		int d10 = 0;
		// isbn nin her bir rakamini okut ve islem yap
		// charAt(0) dan basladigi icin döngüyü 0 dan baslatip, carpima 1 ekliyoruz
		for (int i = 0; i < isbn.length(); i++) {
			d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
		}
		d10 %= 11;

		// Display the 10-digit ISBN
		for (int i = 0; i < 9; i++) {
			System.out.print(isbn.charAt(i));
		}
		if (d10 == 10)
			System.out.println("X");
		else
			System.out.println(d10);
	}
}
