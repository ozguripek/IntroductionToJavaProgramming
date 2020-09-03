package chapter07;

import java.util.Scanner;

public class Exercise07_05 {

	public static void main(String[] args) {
		
		int[] dizi= new int[10];
		int sayar=0;
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		int sayi = 0 ; 
				
		for (int i = 0; i < dizi.length; i++) {
			sayi = input.nextInt();
			if (dizi[sayi-1]==0) {						
			dizi[sayi-1]=sayi;
			
			sayar++;
			}
		}
		
		yazdir(dizi, sayar)	;
	}
		public static void yazdir(int[] dizi, int sayar) {	
			
			System.out.println(	"The number of distinct number is:" + sayar);
			System.out.print("The distinct numbers are: ");
			
			for(int i=0; i<dizi.length;i++) {
				
				if(dizi[i]!=0) {	
				System.out.print(dizi[i]+ " ");		
				}
					
			}
			
			
		}
}
	
