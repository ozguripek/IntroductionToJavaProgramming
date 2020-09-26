package chapter08;
import java.util.Scanner;

public class Exercise08_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[6][6];
		
		System.out.println("Enter a 6-by-6 matrix row by row:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		int row = evenViolatedRow (matrix);
		int column = evenViolatedColumn(matrix);

		if (row < 0 || column < 0)
			System.out.println("No cell has been flipped");
		else {
			System.out.println("The flipped cell is at (" + row + ", " + column + ")");
		}
	}

	public static int evenViolatedRow(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			int count = 0;
			for (int column = 0; column < m[row].length; column++) {
				if (m[row][column] == 1)
					count++;
			}
			if (count % 2 != 0)
				return row;
		}
		return -1;
	}

	public static int evenViolatedColumn(int[][] m) {
		for (int column = 0; column < m.length; column++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][column] == 1)
					count++;
			}
			if (count % 2 != 0)
				return column;
		}
		return -1;
	}
}
