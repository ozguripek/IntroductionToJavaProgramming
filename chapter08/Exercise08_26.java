package chapter08;

import java.util.Scanner;

public class Exercise08_26 {

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
		
		 copy= sortRows(copy);
		
		System.out.println("\nThe row-sorted array is");
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy.length; j++) {
				System.out.print(copy[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] copy)  {
		
		for (int row = 0; row < copy.length; row++) {
			for (int col = 0; col < copy[row].length - 1; col++) {
				double min = copy[row][col];
				int index = col;
				for (int j = col + 1; j < copy[row].length; j++) {
					if (min > copy[row][j]) {
						min = copy[row][j];
						index = j;
					}
				}
				if (index != col) {
					copy[row][index] = copy[row][col];
					copy[row][col] = min;
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
