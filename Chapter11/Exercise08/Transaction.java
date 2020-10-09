package Chapter11.Exercise08;

public class Transaction {
	private java.util.Date date;//The date of this transaction.
	private char type;//'W' for withdrawal, 'D' for deposit.
	private double amount;//The amount of the transaction.
	private double balance;//The new balance after this transaction.
	private String description;//The description of this transaction.

	public Transaction(char type, double amount, double balance, String description) {
		date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	public String getDate() {
		return date.toString();
	}
	
	public void setType(char type) {
		this.type = type;
	}

	public char getType() {
		return type;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
