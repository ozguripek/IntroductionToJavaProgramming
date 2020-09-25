package chapter09.Exercise07;

import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		
		dateCreated = new Date(); 
	}
	
	Account(int  newId, double newBalance){
		id = newId;
		balance=newBalance;
		dateCreated = new Date();
	}
	
	double getMonthlyInterestRate(){
		return (annualInterestRate/100)/12;		
	}
	
	void withdraw(double amount){
		balance -=amount;
	}
	
	void deposit(double amount) {
		 balance += amount;
	}
	
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}		
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	

}