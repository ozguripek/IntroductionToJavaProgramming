package chapter07;

import java.util.Scanner;

public class Exercise07_08 {
	
	public static void main(String[] args) {
		double[]ortalama=new double[10];
		int[]ort=new int[10];
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<ortalama.length;i++) {
			double sayi= input.nextDouble();
			ortalama[i]=sayi;
			ort[i]=(int)sayi;
			
		}
		
		System.out.println("ortalama double "+ average(ortalama)); 
		System.out.println("ortalama int "+ average(ort));
		
		
	}

		public static int average(int[] ort) {
			int toplam=0;
		
			for (int i=0;i<ort.length;i++) {
			
			toplam+=ort[i];
				
			}
			return toplam/ort.length;
		
		} 
	
	
		public static double average(double[] ortalama) {
		
			double toplam=0;
		
			for (int i=0;i<ortalama.length;i++) {
			
				toplam+=ortalama[i];
				
			}
			return toplam/ortalama.length;
		
		}
	
}
