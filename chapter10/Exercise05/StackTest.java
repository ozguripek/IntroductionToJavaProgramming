package chapter10.Exercise05;
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		StackOfIntegers stackOfInteger1 = new StackOfIntegers(); 
		smallestFactors(number, stackOfInteger1);	
		
		System.out.print("The smallest factors of " + number + " are: ");
		
		while (!stackOfInteger1.empty()) {//stack bos olmadigi müddetce
			System.out.print(stackOfInteger1.pop() + " ");//en üstteki elemani sil, ve gönder
		}
		System.out.println();
	}

	public static void smallestFactors(int number, StackOfIntegers stackOfInteger) {
		int i = 2;
		while (number / i != 1){ //sayinin kendisi olmadigi müddetce
			if (number % i == 0) {
				stackOfInteger.push(i);//Stores an integer into the top of the stack.
				number /= i;
			}
			else
				i++;
		}
		stackOfInteger.push(number);//asal sayi ise en son sayinin kendisini de stokla 
	}

}
