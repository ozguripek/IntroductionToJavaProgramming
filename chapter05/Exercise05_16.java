package chapter05;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("Faktöriyeli hesaplanacak "
				+ "sayiyi giriniz:");
		int sayi=input.nextInt();
		int i=2;		
		while(i!=sayi) {
			
			if(sayi%i==0 ) 
			{
				System.out.print(i+", ");
				sayi=sayi/i;					
				
			}
			else {
				i++;
			}
		
		}
		System.out.println(sayi + ".");
	}

}
