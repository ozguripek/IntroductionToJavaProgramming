package Chapter11.Exercise03;

public class Exercise11_03 {

	public static void main(String[] args) {
	
		Account account = new Account(01, 100_000);
		SavingsAccount savings = new SavingsAccount(02, 100_000);
		CheckingAccount checking = new CheckingAccount(03, 100_000, -100);
		
		account.setAnnualInterestRate(2);
		savings.setAnnualInterestRate(2);
		checking.setAnnualInterestRate(2);

		account.withdraw(110_000);
		savings.withdraw(110_000);
		checking.withdraw(110_000);


		account.deposit(30_000);
		savings.deposit(30_000);
		checking.deposit(30_000);

		
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
