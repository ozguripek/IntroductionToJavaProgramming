package chapter07;

import java.util.Scanner;

public class Exercise07_30 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the number of values:");		
		int elemanSayisi= input.nextInt(); 
		int[] dizi= new int[elemanSayisi];
		
		System.out.print("Enter the values:");	
		for(int i=0; i<dizi.length; i++) {
			dizi[i]= input.nextInt();
		}	
		if(isConsecutiveFour(dizi))	{	
			System.out.println(" The list has consecutive fours ");
		}
		else {
			System.out.println(" The list has NO consecutive fours ");
		}

	}
	public static boolean isConsecutiveFour(int[] values) {
		int[] sayac= new int[values.length];
		for( int i=1; i<values.length; i++) {
			
			if(values[i]==values[i-1]) {
				sayac[values[i]-1]++;
			}
		}
		for( int i=0; i<sayac.length; i++) {
			if (sayac[i]>=3) return true;
		}
		return false;
	}
}
