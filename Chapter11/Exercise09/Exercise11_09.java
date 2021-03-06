package Chapter11.Exercise09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter the array size: ");
		int n = input.nextInt();		
		int[][] array = new int[n][n];

		randomlyFill(array);		
		printArray(array);

		System.out.print("The largest row index: ");
		printArrayList(largestRow(array));
		System.out.print("The largest column index: ");
		printArrayList(largestColumn(array));
	}
	
	public static void randomlyFill(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
			}
		}
	}

	public static void printArray(int[][] array) {
		System.out.println("The random array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printArrayList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
		
	public static ArrayList<Integer> largestRow(int[][] array) {
		ArrayList<Integer> indexesOfMaxValues = new ArrayList<>();
		int maxCounter = 0;
		for (int row = 0; row < array.length; row++) {
			int tempCounter=0;
			for (int col = 0; col < array[row].length; col++) {
				if (array[row][col] == 1)
					tempCounter++;
			}
			if(tempCounter>maxCounter)	{
				maxCounter = tempCounter;
				indexesOfMaxValues.clear();
				indexesOfMaxValues.add(row);
			}else if(tempCounter==maxCounter){				
				indexesOfMaxValues.add(row);
			}			
		}		
		return indexesOfMaxValues;
	} 	

	public static ArrayList<Integer> largestColumn(int[][] array) {
		ArrayList<Integer> indexesOfMaxValues = new ArrayList<Integer>();
		int maxCounter = 0;
		for (int col = 0; col < array.length; col++) {
			int tempCounter=0;
			for (int row = 0; row < array[col].length; row++) {
				if (array[row][col] == 1)
					tempCounter++;
			}
			if(tempCounter>maxCounter)	{
				maxCounter = tempCounter;
				indexesOfMaxValues.clear();
				indexesOfMaxValues.add(col);
			}else if(tempCounter==maxCounter){				
				indexesOfMaxValues.add(col);
			}			
		}		
		return indexesOfMaxValues;
	}	
}
