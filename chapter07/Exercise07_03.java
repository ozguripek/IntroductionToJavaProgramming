package chapter07;

import java.util.Scanner;

public class Exercise07_03 {

	public static void main(String[] args) {
		int[] sayac= new int[100];
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int sayi; 
		do {
			sayi = input.nextInt();
			if (1<=sayi && sayi <= 100)	
				sayac[sayi - 1]++;
		} while (sayi != 0);
		
		yazdir(sayac);
	}
	
	public static void yazdir(int[] sayac) {	
		
		for(int i=0; i<sayac.length;i++) {
			
			if(sayac[i]!=0) {	
				
				if(sayac[i]>1) {
			
					System.out.println((i+1) + " occurs " + sayac[i]+ " times");
				}
				else {
					System.out.println( (i+1) + " occurs " + sayac[i]+ " time");
				}
			}
		
		
		}
	}
	
}
