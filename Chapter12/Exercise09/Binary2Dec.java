package Chapter12.Exercise09;

import java.util.Scanner;

public class Binary2Dec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary value: ");
		String binaryString = input.nextLine();
		System.out.println(bin2Dec(binaryString));
	}

	public static int bin2Dec(String binaryString) throws BinaryFormatException{
		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				throw new BinaryFormatException(binaryString);
			}
			decimalValue = decimalValue * 2 + (binaryString.charAt(i) - 48);
		}

		return decimalValue;
	}
}