package chapter05;

import java.util.Scanner;

public class Exercise05_14 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner (System.in);
		System.out.println(" Iki tam sayi giriniz: ");
		int n1= input.nextInt();
		int n2= input.nextInt();
		int d;
			
		if(n1<n2) {
			 d=n1;
		}	 
		else {
			d=n2;
		}
		
		while(n1%d!=0 && n2%d!=0) {
			d--;			
		}
		System.out.println( "OBEB: "+ d);
		
	}

}
