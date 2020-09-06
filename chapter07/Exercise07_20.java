package chapter07;

import java.util.Scanner;

public class Exercise07_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("eleman sayisini ve dizi elemanlarini giriniz: ");
		int kapasite= input.nextInt();
		int[] dizi= new int[kapasite];
		
		
		
		for (int i=0;i<dizi.length;i++) {
			
			
			
			dizi[i] = input.nextInt();
				
		}
		kücüktenBüyügeSirala( dizi );
		
		
			
	}
	public static void kücüktenBüyügeSirala(int[] dizi ){
		for (int i = dizi.length-1; i >=0 ; i--) {
			int curentMax = dizi[i];
			int currentMaxIndex = i;
			
			
			for (int j = i - 1; j >= 0; j--) {
				if (dizi[j] > curentMax) {
					curentMax = dizi[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i) {
				
				dizi[currentMaxIndex] = dizi[i];
				dizi[i] = curentMax;
			}
		}
		for(int k=0; k<dizi.length;k++) {
		System.out.print(dizi[k]+" ");	
			
		}
		
	}
			
			
			
}