package chapter07;

import java.util.Scanner;

public class Exercise07_09 {

	public static void main(String[] args) {
		
		double[]dizi=new double[10];
		
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<dizi.length;i++) {
			double sayi= input.nextDouble();
			dizi[i]=sayi;

		}
		System.out.print("Dizinin en kücük elemani:  " +min( dizi));
	}
		public static double min(double[] dizi) {
			double min=dizi[0];
			for (int i=0;i<dizi.length;i++) {
				if(dizi[i]<min) {
					min=dizi[i];
				}
			}
			return min;
		
		}
		
}
