package chapter06;

import java.util.Scanner;

public class Exercise06_23 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("bir yazi giriniz: ");
		String str= input.nextLine();
		
		System.out.print("Aramak istediginiz harfi giriniz: ");
		String s= input.next();
		char ch= s.charAt(0);
		
		System.out.print(ch+" harfi metinde "+ count(str, ch)+" defa var");
	
	}
	
	
	public static int count(String str, char a) {
		int sayac=0;
		for (int i=0; i<=str.length()-1;i++) {
			char harf= str.charAt(i);
			if(harf==a) {
			sayac++;
			}
		}
		return sayac;		
	}
}

