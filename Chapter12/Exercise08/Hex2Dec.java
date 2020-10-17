package Chapter12.Exercise08;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
	
		try {
			System.out.println("The decimal value for hex number "
				+ hex + " is " + hexToDecimal(hex.toUpperCase()));
		}
		catch (HexFormatException ex) {
			System.out.println(ex.getMessage());
		}finally{
			input.close();
		}
	}

	public static int hexToDecimal(String hex) throws HexFormatException {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			if (!('0'<=hex.charAt(i) && hex.charAt(i) <= '9' || 'A'<=hex.charAt(i) && hex.charAt(i) <= 'F')) {
				throw new HexFormatException(hex);
			}
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
	
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if ( 'A' <=ch && ch <= 'F') {
			return 10 + ch - 'A';
		}
		else {
			return ch - '0';
		}
	}
}
