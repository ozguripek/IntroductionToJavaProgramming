package chapter07;

import java.util.Scanner;

public class Exercise07_12 {

	public static void main(String[] args) {
		int[] dizi= new int[10];
		int[] tersi=new int[10];
		
	
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<dizi.length;i++) {
			int sayi= input.nextInt();
			dizi[i]=sayi;

		}
		tersi( dizi, tersi)	;
		yazdir( tersi);
	}
	
	public static int[] tersi(int[] dizi, int[] tersi) {
		
		for (int i=0, j=tersi.length-1; i<dizi.length;i++,  j--) {
			
			tersi[j]=dizi[i];
					
		}
		return tersi;
	}
	public static void yazdir(int[] tersi) {	
		
		for(int i=0; i<tersi.length;i++) {
			System.out.println( i + " is " + tersi[i]) ;	
		
		}
		System.out.println("**************" ) ;
		
	
	}
}
