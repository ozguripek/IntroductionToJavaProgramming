package chapter09.Exercise07;

public class TestAccount {

	public static void main(String[] args) {
		Account account1= new Account(1122, 20.000);
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.printf("Balance: $%.2f\n", account1.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account1.getMonthlyInterest());
		System.out.println("Date created: " + account1.getDateCreated());		
		

	}

}
