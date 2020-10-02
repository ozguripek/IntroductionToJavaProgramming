package chapter10.Exercise07;

import java.util.Scanner;

public class TestAccount {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		Account[] accountsArray = new Account[10];
		
		createAccountsWithInnitialBallance(accountsArray);
		
		do {
			System.out.print("Enter an id: ");
			int id = input.nextInt();

			if (isValidId(id, accountsArray)) {
				int choice;
				do {	
					choice = displayMainMenu(input);
					if (0<choice && choice < 4) {
						executeTransaction(choice, accountsArray, id, input);
					}
				} while (choice != 4); 
			}
			
		} while (true); 
	}

	public static void createAccountsWithInnitialBallance(Account[] accountsArray) {
		int initialBalance = 100;
		for (int i = 0; i < accountsArray.length; i++) {
			accountsArray[i] = new Account(i, initialBalance);
		}
	}
	
	public static boolean isValidId(int id, Account[] accountsArray) {
		for (int i = 0; i < accountsArray.length; i++) {
			if (id == accountsArray[i].getId())
				return true;
		}
		return false;
	}
	
	public static int displayMainMenu(Scanner input) {
		System.out.print("\n Main menu \n 1: check balance \n 2: withdraw" +
						 "\n 3: deposit \n 4: exit \n Enter a choice: ");
		return input.nextInt();
	}
	
	public static void executeTransaction(int choice, Account[] accountsArray, int id, Scanner input) {
		switch (choice) {
			case 1: System.out.println("The balance is " + accountsArray[id].getBalance());break;
			case 2: System.out.print("Enter an amount to withdraw: "); 
					  accountsArray[id].withdraw(input.nextDouble());break;
			case 3: System.out.print("Enter an amount to deposit: "); 
					  accountsArray[id].deposit(input.nextDouble());
		}
	}
}

