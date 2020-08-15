package chapter05;
import java.util.Scanner;

public class Exercise05_45 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double toplam=0;
		double kareToplam=0;
		System.out.print("Enter ten numbers:");
		
		for (int i=1;i<=10;i++) {		
		double sayi=input.nextDouble();
		toplam= toplam+sayi;
		kareToplam=kareToplam+(sayi*sayi);
		}
		System.out.println("Mean is: "+(toplam/10));
		double kareKökIci=(kareToplam-((Math.pow(toplam,2)/10)))/9;
		System.out.println("deviation is: "+Math.pow(kareKökIci,0.5));
	}

}
