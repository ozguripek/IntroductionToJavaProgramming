package chapter07;

import java.util.Scanner;

public class Exercise07_02 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		int[] dizi= new int[10];
		
		System.out.print("Enter ten the number: ");
		for (int i=0; i<10 ;i++) {
		dizi[i]=input.nextInt();		
		}
		
		int[] tersi= new int[10];
		
		terseCevir(dizi,tersi);
		yazdir(dizi);
		yazdir(tersi);
		
	}
	public static int[] terseCevir(int[] dizi, int[] tersi) {
		for (int i=0, j=dizi.length-1 ; i<10 ;i++, j--) {
			 tersi[j]=dizi[i];		
			}
		return tersi;
	}
	public static void yazdir(int[] dizi) {	
		
		for(int i=0; i<dizi.length;i++) {
			System.out.println( i + " is " + dizi[i]) ;	
		
		}
		System.out.println("**************" ) ;
		
	}
	
	
}
