package Chapter12.Exercise03;

import java.util.Scanner;

public class Exercise12_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		System.out.println("Enter index: ");
		int index = input.nextInt();
		
		try {
			System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
	}

}
