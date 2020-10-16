package Chapter11.Exercise16;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

		while (number1 + number2 != answer) {						
			
			if (answerList.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			else {
				answerList.add(answer);
			}			
			
			System.out.print("Wrong answer. Try again. What is "+ number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}

		System.out.println("You got it!");
	}
}