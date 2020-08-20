package chapter06;

import java.util.Scanner;

public class Exercise06_02 {

		public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("Integer bir sayi giriniz: ");
		long sayi= input.nextInt();
		System.out.println("Girdiginiz sayinin rakamlari toplami: "+
				sumDigits(sayi));
		}

		public static int sumDigits(long n) {
		int toplam=0;
			while(n%10!=0) {
		
				int rakam =(int)n%10;
				n=n/10;
				toplam=toplam+rakam;
			
			}
			return toplam;
		}
}
