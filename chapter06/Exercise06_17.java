package chapter06;

import java.util.Scanner;

public class Exercise06_17 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi= input.nextInt();
		printMatrix(sayi);

	}
	public static void printMatrix(int n) {
		
		for (int i=1; i<=n;i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((int)(Math.random()*2)+" ");
				
			}System.out.println();
		}
		
		
	}
}
