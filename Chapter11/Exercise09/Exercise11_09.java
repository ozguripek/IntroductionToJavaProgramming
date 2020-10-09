package Chapter11.Exercise09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the array size: ");
		int n = input.nextInt();		
		int[][] array = new int[n][n];

		fill(array);		
		print(array);

		System.out.print("The largest row index: ");
		print(largestRow(array));
		System.out.print("The largest column index: ");
		print(largestColumn(array));
	}
	
	public static void fill(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
			}
		}
	}

	public static void print(int[][] array) {
		System.out.println("The random array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void print(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
		
	public static ArrayList<Integer> largestRow(int[][] array) {
		ArrayList<Integer> index = new ArrayList<>();
		int[] count = new int[array.length];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (array[row][col] == 1)
					count[row]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	} 
	
	public static ArrayList<Integer> largestColumn(int[][] array) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[array.length];
		for (int col = 0; col < array.length; col++) {
			for (int row = 0; row < array[col].length; row++) {
				if (array[row][col] == 1)
					count[col]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	/** Adds the indices of x in count to the list */
	public static void getIndex(ArrayList<Integer> list, int[] count, int max) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max)
				list.add(i);
		}
	}
	
	/** Fill array randomly with 0s and 1s */
	
}
