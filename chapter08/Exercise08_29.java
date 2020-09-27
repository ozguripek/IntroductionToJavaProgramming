package chapter08;

import java.util.Scanner;

public class Exercise08_29 {

	public static void main(String[] args) {
		int[][] matrix1 = getInput("matrix1");
	    int[][] matrix2 = getInput("matrix2");
		
		System.out.println("The two arrays are" + 
		(equals(matrix1, matrix2) ? " " : " not ") + "identical");
	}

	public static int[][] getInput(String name) {
		Scanner input = new Scanner(System.in);  
	    System.out.print("Enter " + name + ": ");
	    int[][] m = new int[3][3];
	    for (int i = 0; i < m.length; i++) {
	      for (int j = 0; j < m[i].length; j++) {
	        m[i][j] = input.nextInt();
	      }
	    }
	    return m;
	  }

	public static boolean equals(int[][] m1, int[][] m2) {
		int[] list1 = sort(m1);
		int[] list2 = sort(m2);
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}
	
	public static int[] sort(int[][] m) {
		int [] list = matrixToArray(m);
		for (int i = 0; i < list.length-1; i++) {
			
			int min = list[i];
			int minIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (min > list[j]) {
					min = list[j];
					minIndex = j;
				}
			}

			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min;
			}
		}
		return list;
	}

	public static int[] matrixToArray(int[][] m) {
		int[] list = new int[m.length * m[0].length];
		int k = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				list[k] = m[i][j];
				k++;
			}
		}
		return list;
	}

}
