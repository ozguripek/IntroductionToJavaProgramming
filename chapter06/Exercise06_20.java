package chapter06;

import java.util.Scanner;

public class Exercise06_20 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("bir yazi giriniz: ");
		String s= input.nextLine();
		System.out.println("yazidaki harf sayisi:"+countLetters(s));
		
		
		
		
	}
	public static int countLetters(String s) {
		int sayac=0;
		for(int i=0;i<=s.length()-1;i++) {
			
			char ch=s.charAt(i);
			if(Character.isLetter(ch)){
				sayac++;
			}
		}
		return sayac;
	}
	
	
	
}
