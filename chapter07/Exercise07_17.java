package chapter07;

import java.util.Scanner;

public class Exercise07_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int kapasite= input.nextInt();
		int[]notlar= new int[kapasite];
		String[] isimler= new String[kapasite];
		
		
		for (int i=0;i<notlar.length;i++) {
			
			System.out.print("Student " + (i + 1) + ": ");
			isimler[i] = input.next();
			System.out.print("Score: ");
			notlar[i] = input.nextInt();
				
		}
		
		büyüktenKücügeSirala(notlar, isimler);
		
		for(String d:isimler){
			
			System.out.println(d+ " "); 
			
		}
			
	}
	public static void büyüktenKücügeSirala(int[] notlar, String[] isimler ){
		for (int i = 0; i < notlar.length; i++) {
			int curentMax = notlar[i];
			int currentMaxIndex = i;
			String temp;

			
			for (int j = i + 1; j < notlar.length; j++) {
				if (notlar[j] > curentMax) {
					curentMax = notlar[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i) {
				
				temp = isimler[i];
				isimler[i] = isimler[currentMaxIndex];
				isimler[currentMaxIndex] = temp;

				
				notlar[currentMaxIndex] = notlar[i];
				notlar[i] = curentMax;
			}
		}
	}
			
			
			
}
		 
		 
		 
	 
	
	


