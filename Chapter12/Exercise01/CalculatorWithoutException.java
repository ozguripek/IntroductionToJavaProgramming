package Chapter12.Exercise01;

import java.util.Scanner;

public class CalculatorWithoutException {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		String[] array= new String[3];
		System.out.println("Enter operand1 operator operand2: ");
		
		for(int i=0; i<array.length;i++) {
			array[i]= input.next();	
		}
		testDigit(array[0]);
		testDigit(array[2]);		
		
		int result = 0;	
		
		switch (array[1].charAt(0)) {
			case '+' : result = Integer.parseInt(array[0]) +
								Integer.parseInt(array[2]);
							  break;
			case '-' : result = Integer.parseInt(array[0]) -
								Integer.parseInt(array[2]);
							  break;
			case '.' : result = Integer.parseInt(array[0]) *
								Integer.parseInt(array[2]);
							  break;
			case '/' : result = Integer.parseInt(array[0]) /
								Integer.parseInt(array[2]);
							  break;
		}	

		System.out.println(array[0] + ' ' + array[1] + ' ' + array[2]+ " = " + result);
		
	}
		private static void testDigit(String array) {
			for (int i = 0; i < array.length(); i++) {
				if (!Character.isDigit(array.charAt(i))) {
					System.out.println("Wrong Input: " + array);
					System.exit(0);
				}
			}
		}	
		
}
