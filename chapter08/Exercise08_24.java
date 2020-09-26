package chapter08;
import java.util.Scanner;

public class Exercise08_24 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[][] sudoku = new int[9][9];
		
	    System.out.println("Enter a Sudoku puzzle solution:");
		for (int i = 0; i < sudoku.length; i++) {
		      for (int j = 0; j < sudoku[i].length; j++) {
		        sudoku[i][j] = input.nextInt();
		      }
		 }
		     
	    if (isValid(sudoku)) {
	      System.out.println("Valid solution");
	    } else {
	      System.out.println("Invalid solution");
	    }
	  }
	
	public static boolean isValid(int[][] matrix) {
	    
	    for (int i = 0; i < matrix.length; i++) {
	      for (int j = 0; j < matrix[i].length; j++) {
	       	  	if (matrix[i][j] < 1 ||  9 <matrix[i][j]) {
	        	return false; 
	        }
	      }
	    }
	    //satir kontrol
	     for (int i = 0; i < matrix.length; i++) {
	           int[] sayac = new int[matrix.length];
	           for (int j = 0; j < matrix[i].length; j++) {
	                  sayac[matrix[i][j] - 1]++;
	           }
	     
	           if (!areAlls1(sayac)) { 
	        	   return false; 
	           }
	    }

	    // sütun kontrol
	    for (int i = 0; i < matrix[0].length; i++) {
	      	      int[] sayac = new int[matrix.length];
	      	      for (int j = 0; j < matrix.length; j++) {
	      	    	   sayac[matrix[j][i] - 1]++;
	      }
	      
	      if (!areAlls1(sayac)) { 
	    	  return false;
	      }
	    }

	    // kücük matris 3*3 kontrol
	    for (int i = 0; i < matrix.length; i += 3) { // satirda 3er 3er git
	      for (int j = 0; j < matrix.length; j += 3) { //sütunda 3er 3er git
	    	  int[] sayac = new int[matrix.length];
	    	  for (int k = i; k < i + 3; k++) { // kücük matris satir
	    		  for (int m = j; m < j + 3; m++) {//kücük matris sütun
	                sayac[matrix[k][m] - 1]++;
	    		  }
	    	  }
	        if (!areAlls1(sayac)) { 
	        	return false; 
	        }
	      }
	    }

	    return true;
	  }

	public static boolean areAlls1(int[] sayac) {
	    for (int i = 0; i < sayac.length; i++) {
		      if (sayac[i] != 1) { 
		    	  return false; 
		      }
	    }
	    return true;
	  }
}
