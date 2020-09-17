package chapter08;

import java.util.Scanner;

public class Exercise08_02 {

public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		double[][] matrix= new double[4][4];
		System.out.println(" Enter a 4-by-4 matrix row by row:");
		for (int satir=0; satir<matrix.length; satir++) {
			for( int sütun=0; sütun<matrix[satir].length;sütun++) {
				matrix[satir][sütun]= input.nextDouble();
				
			}
			
		}
		
		System.out.println("Sum of the elements in the major diagonal is "
		+sumMajorDiagonal(matrix));	
		
	
	}

	public static double sumMajorDiagonal(double[][] matrix) {
		
		double toplam= 0;
		
		for (int satir=0; satir<matrix.length; satir++) {
			
		
			for( int sütun=0; sütun<matrix[satir].length;sütun++) {
				if(satir==sütun) {
				toplam+=matrix[satir][sütun];
				}
			}
		}
		return toplam;
	}
}


