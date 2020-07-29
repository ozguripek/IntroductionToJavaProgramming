package chapter03;

import java.util.Scanner;

public class Exercise03_15 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	// Generate a random three-digit number
	int lottery = (int)(Math.random()* 1000);

	// Prompt the user to enter a three-digit number
	System.out.print("Enter a three-digit number: ");
	int guess = input.nextInt();

	// Extract digits from lottery
	int lotteryDigit1 = lottery / 100;
	int remainingDigits = lottery % 100;
	int lotteryDigit2 = remainingDigits / 10;
	int lotteryDigit3 = remainingDigits % 10;

	// Extract digits from guess
	int guessDigit1 = guess / 100;
	int remainingDigit = guess % 100;
	int guessDigit2 = remainingDigit / 10;
	int guessDigit3 = remainingDigit % 10;

	System.out.println("The lottery number is " + lottery);

	// Check the guess
	if (guess == lottery) {
		System.out.println("Exact match: you win $10,000");
		}
	else if ((guessDigit1 == lotteryDigit2 || guessDigit1==lotteryDigit3)&&
			(guessDigit2 == lotteryDigit1 || guessDigit2==lotteryDigit3)&&
			(guessDigit3 == lotteryDigit1 || guessDigit3==lotteryDigit2))
	{
		System.out.println("You win: $3000");
	}
	else if(((guessDigit1 == lotteryDigit1) || (guessDigit1==lotteryDigit2) ||
		  (guessDigit1 == lotteryDigit3) ||

		(guessDigit2 == lotteryDigit1) || (guessDigit2==lotteryDigit2) ||
		(guessDigit2 == lotteryDigit3)||

         (guessDigit3 == lotteryDigit1) || (guessDigit3==lotteryDigit2) ||
        ( guessDigit3 == lotteryDigit3)))

	{
		System.out.println("You win: $1000");
	}
		else System.out.println("You could not win ");
}}