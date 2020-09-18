package chapter07;

import java.util.Scanner;

public class Exercise07_06 {

	public static void main(String[] args) {
		System.out.print("Enter  number: ");
		Scanner input = new Scanner(System.in);
		double rakam= input.nextInt();
		int asalSayiSayaci=0;
		int sayi=2;
		int[] asal= new int[50];
		
		
		while (asalSayiSayaci<50) {
			boolean asalMi=true;
			for (int i=2; i<sayi;i++) {
				if(sayi%i==0) {
					asalMi=false;
					break;
				}
			}
				if(asalMi==true) {
					asalSayiSayaci++;
					asal[asalSayiSayaci-1]=sayi;
					System.out.println(asalSayiSayaci+". asal sayi "+asal[asalSayiSayaci-1]);
				}
				sayi++;	
			}
			
		
		boolean asalMi = true;
		for(int i=0; i< asal.length;i++){
		
			if((asal[i]<= Math.sqrt(rakam)) && (rakam % asal[i]==0) ) {
			asalMi = false;
			break;
			}
		}
			if(!asalMi) {
			System.out.println(rakam+" asal sayi degil ");
			}
		else { 
				System.out.println(rakam+" asal sayi ");
		}
		
	}
}
	
	
	
	


