package chapter09.Exercise13;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter the number of rows and columns in the array: ");
		
		int x= input.nextInt();
		int y= input.nextInt();
		
		double[][] matrix= new double [x][y];
		
		System.out.println("Enter the array: ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]= input.nextDouble();
			}
		}
		
		Location location1 = new Location();
				 location1=location1.locateLargest(matrix);

	
		System.out.println("The location of the largest element is " +
			location1.maxValue + " at (" + location1.row + ", " + location1.column + ")");
	}

	
	
	
}


