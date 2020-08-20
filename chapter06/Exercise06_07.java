package chapter06;
import java.util.Scanner;
public class Exercise06_07 {

	public static void main(String[] args) {
	
	
				Scanner input= new Scanner (System.in);
				
				
				System.out.print("Investment Amount: ");
				double	investmentamount= input.nextDouble();
				System.out.print("Annual Interest Rate: ");
				double	monthlyInterestRate= input.nextDouble()/1200;
				System.out.print("Years: ");
				int years= input.nextInt();
				
				System.out.println("Years     Future Value");
				for (int i=1;i<=years;i++) {
					
					System.out.printf("%-8d",i);
					System.out.printf("%11.2f\n",(futureInvestmentValue(investmentamount,monthlyInterestRate,i)));
						
			}
	}	
	public static double futureInvestmentValue(double investmentAmount, 
			double monthlyInterestRate, int years) {
							
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
				
	}
				
}

