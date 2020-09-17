package chapter08;

import java.util.Scanner;

public class Exercise08_06 {

public static void main(String[] args) {
		
		double[][] matrix1 = girdiAlMatris(1);
		double[][] matrix2 = girdiAlMatris(2);
		double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

		
		print(matrix1);
		System.out.println("*__________");
		print(matrix2);
		System.out.println("=__________");
		print(matrix3);
		
		
	}

	public static double[][] girdiAlMatris(int i) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter matris" + i + ": ");

		double[][] matris = new double[3][3];
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++)
				matris[j][k] = input.nextDouble();
		}

		return matris;
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int h = 0; h < c.length; h++) {
					c[i][j] += a[i][h] * b[h][j];
				}
			}
		}
		return c;
	}

	
	public static void print(double[][] m) {	
		for( int i=0; i<3; i++ ){	
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
				
			}	
		System.out.println();
		}
	}
}