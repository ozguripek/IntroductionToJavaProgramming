package chapter05;

import java.util.Scanner;

public class Exercise05_01 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		double toplam=0;
		double sayac=0;
		int pozitifSayaci=0;
		int negatifSayaci=0;
		
		System.out.println("Enter an integer, the input ends if it is 0:");
		int sayi= input.nextInt();
		
		if(sayi==0) {
			System.out.println("No numbers are entered except 0 ");
			System.exit(0);
		}
		while(sayi!=0) {
			toplam+=sayi;
			if(sayi>0) {
				pozitifSayaci++;
			}else {
				negatifSayaci++;
			}
			sayac++;
		
		sayi= input.nextInt();
		}
		
			System.out.println("The number of positives is: "+pozitifSayaci);
			System.out.println("The number of negatives is: "+negatifSayaci);
			System.out.println("The total is: "+toplam);
			System.out.println("The avarage is: "+(toplam/sayac));
		}
	}


