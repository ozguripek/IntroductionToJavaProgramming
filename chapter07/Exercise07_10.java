package chapter07;

import java.util.Scanner;

public class Exercise07_10 {

	public static void main(String[] args) {
		
		double[]dizi=new double[10];
		
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<dizi.length;i++) {
			double sayi= input.nextDouble();
			dizi[i]=sayi;

		}
		System.out.print(indexOfSmallestElement( dizi)+" nci eleman dizinin en kücük elemanidir." );
	}
	public static int indexOfSmallestElement(double[] dizi){
			double min=dizi[0];
			int index=0;
			for (int i=0;i<dizi.length;i++) {
				if(dizi[i]<min) {
					min=dizi[i];
					index=i;		
				}
			}
			return index;
		
		}
		
}
