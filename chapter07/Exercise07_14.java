package chapter07;

import java.util.Scanner;

public class Exercise07_14 {

	public static void main(String[] args) {
		int[] dizi=new int[5];
		
		
		System.out.print("Enter five numbers: ");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<dizi.length;i++) {
			int sayi= input.nextInt();
			dizi[i]=sayi;

		}
		System.out.println("obeb is "+ gcd(dizi));
	}
	public static int gcd(int... numbers) {
		
		int obeb=1;
		int bolen=2;
		for( int i=0; i<numbers.length;i++) {
			if (numbers[i]%bolen==0) {
				
				obeb=bolen;
			}
				
			bolen++;
			
		}
		
		return obeb;
		
	}
}
