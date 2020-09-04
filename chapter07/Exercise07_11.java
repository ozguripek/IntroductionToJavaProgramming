package chapter07;

import java.util.Scanner;

public class Exercise07_11 {

	public static void main(String[] args) {
		double[]dizi=new double[10];
		
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<dizi.length;i++) {
			double sayi= input.nextDouble();
			dizi[i]=sayi;
		}
		System.out.println("The mean is "+  mean(dizi) );
		System.out.println("The standard deviation is "+ deviation( dizi));
	}	
		
		public static double deviation(double[] dizi) {
			double deviation=0;
			double kareKökPay=0;
			for(int i=0; i< dizi.length;i++) {
			kareKökPay+=Math.pow(dizi[i]-mean(dizi), 2);
				
				
			deviation=Math.pow(	kareKökPay/(dizi.length-1),0.5);
							
			}
		return deviation;	
		
		}
		public static double mean(double[] dizi) {
			double toplam=0;
			
			for(int i=0; i< dizi.length;i++) {
				toplam+= dizi[i];
			}
			return toplam/dizi.length;
		}
}
