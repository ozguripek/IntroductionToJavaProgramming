package chapter05;

import java.util.Scanner;

public class Exercise05_22 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.print("Loan Amount: ");
		double krediMiktari=input.nextDouble();
		System.out.print("Number of Years: ");
		int yilSayisi=input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double yillikFaizOrani=input.nextDouble();
		
				
		   double aylikFaizOrani= yillikFaizOrani/1200;
		
			double aylikÖdeme = krediMiktari * aylikFaizOrani / (1
					 - 1 / Math.pow(1 + aylikFaizOrani, yilSayisi * 12));
			
			double toplamÖdeme = aylikÖdeme * yilSayisi * 12;
				
			
		System.out.println("Monthly Payment:"+(int)(aylikÖdeme*100)/100.0);
		System.out.println("Total Payment:"+(int)(toplamÖdeme*100)/100.0);
		
		System.out.println("Payment#     Interest    Principal      Balance");
		double bakiye = krediMiktari, anaParaÖdemesi, faizÖdemesi;
		for (int i = 1; i <= yilSayisi * 12; i++) {
			faizÖdemesi = aylikFaizOrani *  bakiye;
			anaParaÖdemesi = aylikÖdeme - faizÖdemesi;
			bakiye = bakiye - anaParaÖdemesi;
			
			
			System.out.printf("%-13d%-13.2f%-14.2f%.2f\n", i, faizÖdemesi,
				anaParaÖdemesi, bakiye);
		
		}
	}
}
	
