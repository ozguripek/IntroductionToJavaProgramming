package chapter05;

import java.util.Scanner;

public class Exercise05_26 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println(" Degeri giriniz (10000, 20000, 100000) :");
		double deger=input.nextDouble();
		double e = 0.0;
				
				
		
		for (double i = 1; i <= deger; i++) {
			 double payda = i;
			 for (double j = i-1 ; j >= 1; j--) {
				 payda *= j;
			}
			e += 1 / payda;  
		}

		
		System.out.println("The e value for i = 10000: " + e);
		

	}

}
