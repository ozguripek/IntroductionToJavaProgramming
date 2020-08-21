package chapter06;

import java.util.Scanner;

public class Exercise06_21 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("bir yazi giriniz: ");
		String s= input.nextLine();
		for (int i=0;i<=s.length()-1;i++) {
			char ch=Character.toUpperCase(s.charAt(i));
			if( Character.isLetter(ch)) {
				System.out.print(getNumber(ch));
			} else {
				System.out.print(ch);	
			}
		}
	}
		public static int getNumber(char uppercaseLetter) {
		        int number=123123123;
			
				if (uppercaseLetter >= 'W')
					number = 9;
				else if (uppercaseLetter >= 'T')
					number = 8;
				else if (uppercaseLetter >= 'P')
					number = 7;
				else if (uppercaseLetter >= 'M')
					number = 6;
				else if (uppercaseLetter >= 'J')
					number = 5;
				else if (uppercaseLetter >= 'G')
					number = 4;
				else if (uppercaseLetter >= 'D')
					number = 3;
				else if (uppercaseLetter >= 'A')
					number = 2;
				
				return number;
				
		
	}
}
