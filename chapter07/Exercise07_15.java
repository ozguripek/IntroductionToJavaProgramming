package chapter07;

import java.util.Scanner;

public class Exercise07_15 {

	public static void main(String[] args) {
		int[] dizi=new int[10];
		int[] sayac= new int[10];
		
		
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<dizi.length;i++) {
			int sayi= input.nextInt();
			if(sayac[sayi-1]>0) continue;
			dizi[i]=sayi;
			
			sayac[sayi-1]++;
		
			
		}
		eliminateDuplicates(dizi, sayac);
	}
		
		public static void eliminateDuplicates(int[] dizi, int[] sayac) {
			
			for(int i=0; i<dizi.length;i++) {
				
				
					if(dizi[i]>0){
													
						System.out.print(dizi[i]+" ");
					}
				
			
			}
		}
}
			
