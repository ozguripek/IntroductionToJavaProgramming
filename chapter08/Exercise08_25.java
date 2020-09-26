package chapter08;
import java.util.Scanner;

public class Exercise08_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] m = new double[3][3];

		System.out.println("Enter a 3-by-3 matrix row by row:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("It is" + (isMarkovMatrix(m) ? " " : " not ") +
			"a Markov matrix");
	}

	public static boolean isMarkovMatrix(double[][] m) {
		if(isEachElementPositive(m) && isEachColumnSum1(m)) {
		return true ;
		}
		return false;
	}

	public static boolean isEachElementPositive(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0)
					return false;
			}
		}
		return true;
	}

	public static boolean isEachColumnSum1(double[][] m) {
		for (int column = 0; column < m.length; column++) {
			double sum = 0; 
			for (int row = 0; row < m.length; row++) {
				sum += m[row][column];
			}
			if (sum != 1)
				return false;
		}
		return true;
	}
}
