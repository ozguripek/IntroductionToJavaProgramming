package chapter07;

import java.util.Scanner;

public class Exercise07_28 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] dizi= new int[10];
		System.out.print("enter 10 integers:");		
		
			for( int i=0; i<dizi.length; i++) {
				dizi[i]= input.nextInt();
			}
		
			
		for( int i=0; i<dizi.length; i++) {
			for ( int j=0; j<dizi.length;j++) {
				if (i != j)
				System.out.println(dizi[i]+""+dizi[j]);
			}
			
		}
	}

}
