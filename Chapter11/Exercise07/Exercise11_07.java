package Chapter11.Exercise07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();		
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Enter a list of integers ending with 0: ");
		
		while (true) {			
			int element = input.nextInt();
			if (element==0) break; 
			list.add(element);
		}

		
		shuffle(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	public static void shuffle(ArrayList<Integer> list) {
		java.util.Collections.shuffle(list);
	}
}