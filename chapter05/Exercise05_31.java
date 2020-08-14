package chapter05;
import java.util.Scanner;

public class Exercise05_31 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double mevduat= input.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		double yillikYüzdeGetiri = input.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		int vade= input.nextInt();
		
		System.out.println("Month    CD Value");
		
		for (int i=1; i<=vade; i++) {
			
			mevduat= mevduat+(mevduat* yillikYüzdeGetiri/1200);
			
			System.out.printf("%-8d%.2f\n", i,mevduat);
			
		}

	}

}
