package chapter03;

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		System.out.print("Geben Sie eine Nummer in 3 Digit ein: ");
		 int nummer = input.nextInt();
		 
		 int n1= nummer/100;
		 int remain= nummer%100;
		 
		 int n2= remain/10;
		 remain= remain%10;
		 
		 int n3= remain;
		 
		 if( n1==n3) {
			 System.out.println(nummer+ " ist eine palindrome Nummer");
		 }
		 else {
			 System.out.println(nummer+ " ist keine palindrome Nummer");
		 }
	}

}
