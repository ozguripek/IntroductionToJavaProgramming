package chapter03;
import java.util.Scanner;
public class Exercise03_07 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		// Receive the amount
				System.out.print(
					"Enter an amount in double, for example 11.56: ");
				double amount = input.nextDouble();
				
				int remainingAmount= (int)(amount*100);
				int numberOfDollar= remainingAmount/100;
				
				remainingAmount=remainingAmount%100;
				
				int numberOfQuarters= remainingAmount/25;
				remainingAmount= remainingAmount%25;
				
				int numberOfDimes= remainingAmount/10;
				remainingAmount=remainingAmount%10;
				
				int numberOfNickels=remainingAmount/5;
				remainingAmount=remainingAmount%5;
				
				int numberOfPennies=remainingAmount;
				
				
				System.out.println("Your amount " + amount + " $ consist of "+
				
				numberOfDollar+				
				(numberOfDollar==1 ? " Dollar " : " Dollars " )+
				
				numberOfQuarters+
				(numberOfQuarters==1 ? " Quarter " : " Quarters ")+
				
				numberOfDimes+
				(numberOfDimes==1 ? " Dime " : " Dimes ")+
				
				numberOfNickels+
				(numberOfNickels==1 ? " Nickel " : " Nickels ")+
				
				numberOfPennies+
				(numberOfPennies==1 ? " Penny." :" Pennies."));				
		

	}

}
