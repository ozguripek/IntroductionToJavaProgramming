package chapter06;

import java.util.Scanner;

public class Exercise06_10 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("0 ve 1000 arasinda bir sayi giriniz: ");
		int sayi= input.nextInt();
		
		if(asalMi(sayi)==true) {
			System.out.println(sayi+" sayisi asal bir sayidir");
		}
		else {
			System.out.println(sayi+" sayisi asal degildir");
		}
	}
	public static boolean asalMi(int sayi) {
		for (int i=2;i<sayi;i++) {
			if (sayi%i==0) {
				return false;
			}
		}
		return true;
		
	}
}
