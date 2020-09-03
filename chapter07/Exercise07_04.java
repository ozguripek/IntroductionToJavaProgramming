package chapter07;

import java.util.Scanner;

public class Exercise07_04 {

	public static void main(String[] args) {
		int[] sayac= new int[100];
		int[] dizi= new int[100];
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		int sayi = 0 ; 
		int toplam=0;
		int ort=0;
		int büyükScore=0;
		int kücükScore=0;
		int sayar=0;
		
		
		
		for (int i = 0; i < dizi.length; i++) {
			sayi = input.nextInt();
			if (sayi < 0)						
				break;
			dizi[i]=sayi;
						
			sayac[sayi - 1]++;
			sayar++;
		}
		for (int i = 0; i < dizi.length; i++) {
		 
			toplam+=(dizi[i]*sayac[i]);
		}
			ort= toplam/sayar;
		 
		 
		for(int i=0; i<sayac.length;i++) {
			
			if(sayac[i]!=0) {
			 
				if(dizi[i]>=ort) {
					büyükScore++;
					
				}
				else {
					kücükScore++;
					
				}
			}
		}		
		System.out.println(büyükScore + " scores are above or equal to "
				+ "the average ");
		System.out.println(kücükScore + " are below the average ");
				
	}
	
}