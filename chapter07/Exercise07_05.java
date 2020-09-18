package chapter07;

import java.util.Scanner;

public class Exercise07_05 {

	public static void main(String[] args) {
		
		int[] dizi= new int[10];
		int sayar=0;
		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
						
		for (int i = 0; i < dizi.length; i++) {
		
			int sayi=input.nextInt();
			if(kontrol(dizi, sayi)) {
			dizi[i]=sayi;	
			sayar++;
			}
		
		}
		
		yazdir(dizi, sayar)	;
	}
		private static boolean kontrol(int[] dizi, int sayi) {
			for(int i = 0; i <dizi.length; i++) {
				if (dizi[i]==sayi) {
					return false;
				}
			}
			return true;
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
	
