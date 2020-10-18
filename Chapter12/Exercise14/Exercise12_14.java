package Chapter12.Exercise14;

import java.io.*;
import java.util.*;

public class Exercise12_14 {

	public static void main(String[]args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a file of scores: ");
		File file = new File(input.nextLine());	
		
		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}
	
		int count = 0; 		
		double total = 0;	
	
		try (Scanner inputFile = new Scanner(file);)
		{
			while (inputFile.hasNext()) {
				total += inputFile.nextInt();
				count++;
			}
		}
			catch (FileNotFoundException ex) {

	            System.out.println("Error reading " + file);
	            ex.printStackTrace();
	        }
				
		System.out.println("File " + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));
			
	}
}


