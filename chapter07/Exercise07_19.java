package chapter07;

import java.util.Scanner;

public class Exercise07_19 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		 

		
		System.out.print("Enter list: ");
		int kapasite= input.nextInt();
		int[]dizi= new int[kapasite];
		
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();
		}
		
		
		
		if (isSorted(dizi)==true){
			System.out.println("The list is already sorted");
		}
		else System.out.println("The list is not sorted");
		
		
	}
	public static boolean isSorted(int[] dizi) {
		
		
			for (int i = 0; i < dizi.length - 1; i++) {
				
				double currentMin=dizi[i];
				int currentMinIndex=i;
				for(int j=i+1; j<dizi.length;j++) {
					if (currentMin > dizi[j]) {
					return false;
					}
				}
			}
			return true;
	}
		
}