package chapter08;

import java.util.Scanner;

public class Exercise08_13 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		
		double[][] matrix= new double[input.nextInt()][input.nextInt()];
		System.out.println("Enter the array: ");
		for (int satir = 0; satir < matrix.length; satir++) {			
			for (int sütun = 0; sütun < matrix[satir].length; sütun++) {
				matrix[satir][sütun] = input.nextDouble();
			}
		}
		int[] dizi = locateLargest(matrix);
		
	System.out.println("The location of the largest element is at: (" 
	+dizi[0] + ", " + dizi[1] + ")");
		
	}
	public static int[] locateLargest(double[][] a) {
		double largestElement = 0;
		
		int[] largestElementIndex= new int[2];
		largestElementIndex[0] = -1;
		largestElementIndex[1] = -1;
		
		for (int satir = 0; satir < a.length; satir++) {			
			for (int sütun = 0; sütun < a[satir].length; sütun++) {
				
				if(a[satir][sütun]>largestElement) {
					largestElement=a[satir][sütun];
					largestElementIndex[0]= satir; 
					largestElementIndex[1]= sütun;
				}
			}		
		}
	return	largestElementIndex;
	}
			
}
