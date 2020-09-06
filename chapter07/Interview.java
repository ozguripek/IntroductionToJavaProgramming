package chapter07;

import java.util.Scanner;

public class Interview {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir yazi giriniz");
		String yazi1= input.nextLine();
		char[] yaziDizisi1=yazi1.toCharArray();
		
		System.out.println("Ikinci bir yazi giriniz");
		String yazi2= input.nextLine();
		char[] yaziDizisi2=yazi2.toCharArray();
		
		
		
		int[] sayac1=sayacaCevir(yaziDizisi1);
		int[] sayac2=sayacaCevir(yaziDizisi2);
		
		boolean ayniMi=true;
		for(int i=0; i< sayac1.length;i++) {
			
			if(sayac1[i]!=sayac2[i]) 
				
				ayniMi=false;
				
			}	
				
			if(ayniMi)	
			System.out.println("iki yazida da ayni karakterler var");	
			else 
				System.out.println("iki yazida da ayni karakterler yok");	
				
		}

	public static int[] sayacaCevir(char[] yaziDizisi) {
		int[] sayac=new int[29];
		for(int i=0; i< yaziDizisi.length;i++) {
			
			sayac[yaziDizisi[i]-'a']++;
		}
		return sayac;
		
		
	}
}