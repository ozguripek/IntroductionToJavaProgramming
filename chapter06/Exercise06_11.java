package chapter06;

import java.util.Scanner;

public class Exercise06_11 {

	public static void main(String[] args) {
		
				
		System.out.println("Sales Amount       Commission");
		System.out.println("_____________________________");
		
		for (double i = 10000.0 ; i <= 100000.0 ; i += 5000) {
			System.out.printf("%-6.0f     ", i);
			System.out.printf("%20.1f\n", computeCommission(i));
		}
		
	

	}
	public static double computeCommission(double salesAmount) {
		
		double commission= ((5000 * 0.08) + (5000 * 0.1) + (0.12*(salesAmount-10000)));
		
		return commission;
	}
}
