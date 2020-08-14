package chapter05;

import java.util.Scanner;

public class Exercise05_41 {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter number: ");
	int max = input.nextInt();	
	int count = 1;					
	int number = 0;				


	for(int i=1;i<5;i++) {
		System.out.print("Enter number: ");
		number = input.nextInt();
		if (number > max) {
			max = number;
			count = 1;
		}
		else if (number == max)
			count++;
	} 


	System.out.println("The largest number is " + max);
	System.out.println(
		"The occurrence count of the largest number is " + count);
}
}