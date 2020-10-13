package Chapter11.Exercise10;

import java.util.Scanner;

public class Exercise11_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		MyStack myStack= new MyStack();

		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			myStack.push(input.next());	
		}

		System.out.println(myStack.toString());
	}
}
