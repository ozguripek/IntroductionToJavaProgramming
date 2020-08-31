package chapter07;

import java.util.Scanner;

public class Exercise07_01 {

	public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
	System.out.print("Enter the number of students: ");
	int size= input.nextInt();
	
	int[] dizi= new int[size];
	System.out.print("Enter "+ size+ " scores: ");
	
	for (int i=0; i<size ;i++) {
		 dizi[i]=input.nextInt();		
	}
	
	char[] harfDizisi=new char[size];
	
	harfHesapla(dizi, harfDizisi);
	
	yazdir(dizi, harfDizisi);
		
	}
	
	public static char[] harfHesapla(int[] dizi, char[] harfDizisi) {
		int best=70;
		 
		for(int i=0; i<dizi.length;i++) {
			if(dizi[i]>=best - 10) harfDizisi[i]='A';
			else if(dizi[i]>=best - 20) harfDizisi[i]='B';
			else if(dizi[i]>=best - 30) harfDizisi[i]='C';
			else if(dizi[i]>=best - 40) harfDizisi[i]='D';
			else  harfDizisi[i]='F';
		}
		return harfDizisi;
	}
	
	public static void yazdir(int[] dizi,char[] harfDizisi ) {	
		
		for(int i=0; i<dizi.length;i++) {
			System.out.println("Student " + i + " score is " + dizi[i]
					+ " and gerade is " + harfDizisi[i]) ;
		
		
		}
	}
	

}
