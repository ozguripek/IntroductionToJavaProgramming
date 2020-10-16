package Chapter12.Exercise01;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class CalculatorWithException {
	
	public static void main(String[] args)  throws NumberFormatException {
		
		Scanner input= new Scanner(System.in);
		String[] array= new String[3];
		System.out.println("Enter operand1 operator operand2: ");
		
		try {
			for(int i=0; i<array.length;i++) {
				array[i]= input.next();
			}
				if(!(Character.isDigit(array[0].charAt(0)) || Character.isDigit(array[2].charAt(0)))) {
					throw new NumberFormatException("This is not a digit");					
				}				
			
		}catch (NumberFormatException ex) {
			System.out.println("Wrong Input: " + ex.getMessage());
			System.out.println("Try again and Enter operand1 operator operand2: ");
			
			for(int i=0; i<array.length;i++) {
				array[i]= input.next();
			}
		}
		 finally {
			input.close();
		}
		
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

			
			System.out.println(array[0] + ' ' + array[1] + ' ' + array[2]
				+ " = " + result);
		
	}
}