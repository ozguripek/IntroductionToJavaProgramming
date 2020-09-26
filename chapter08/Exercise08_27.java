package chapter08;

import java.util.Scanner;

public class Exercise08_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] original = new double[3][3];
		double[][] copy = new double[3][3];
		
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				original[i][j] = input.nextDouble();
			}
		}
				
		copyMatrix(original, copy);
		
		 copy= sortColumns(copy);
		
		System.out.println("\nThe column-sorted array is");
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy.length; j++) {
				System.out.print(copy[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortColumns(double[][] copy)  {
		
		for (int column = 0; column < copy.length; column++) {
			for (int row = 0; row < copy.length - 1; row++) {
				double min = copy[row][column];
				int index = row;
				for (int i = row + 1; i < copy.length; i++) {
					if (min > copy[i][column]) {
						min = copy[i][column];
						index = i;
					}
				}
				if (index != row) {
					copy[index][column] = copy[row][column];
					copy[row][column] = min;
				}
			}
		}
		return copy;
	}

	public static void copyMatrix(double[][] original, double[][] copy) {
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				copy[i][j] = original[i][j];
			}
		}
	}
}