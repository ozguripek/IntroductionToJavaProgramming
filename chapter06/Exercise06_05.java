package chapter06;

import java.util.Scanner;

public class Exercise06_05 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		
		System.out.println("Üc adet sayi giriniz: ");
		double	num1= input.nextDouble();
		double	num2= input.nextDouble();
		double 	num3= input.nextDouble();
		
		
		displaySortedNumbers(num1,num2,num3);
	}
		
	public static void displaySortedNumbers( double num1, double num2, double num3) {
		
		double max=Math.max(num3, Math.max(num1, num2));	
		double min= Math.min(num3, Math.min(num1, num2));
		
		if(max!=num1&&min!=num1) {
			num2=num1;
		}
		else if(max!=num3&&min!=num3) {
			num2=num3;
		}
		
		System.out.println(max+" "+num2+" "+min);	
		
			
		}
		
}
