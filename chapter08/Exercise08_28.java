package chapter08;
import java.util.Scanner;

public class Exercise08_28 {

	public static void main(String[] args) {
	  
	    int[][] matrix1 = getInput("matrix1");
	    int[][] matrix2 = getInput("matrix2");

	    if (equals(matrix1, matrix2)) {
	      System.out.println("The two arrays are strictly identical");
	    } else {
	      System.out.println("The two arrays are not strictly identical");
	    }
	  }

	  public static boolean equals(int[][] m1, int[][] m2) {
	    if (m1.length != m2.length) { 
	    	return false; 
	    }

	    for (int i = 0; i < m1.length; i++) {
	    	if (m1[i].length != m2[i].length) { 
	        	return false; 
	        }
	         for (int j = 0; j < m1[i].length; j++) {
	        
	        	 if (m1[i][j] != m2[i][j]) {
	        		 return false; 
	        	 }
	         }
	    }

	    return true;
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
	}