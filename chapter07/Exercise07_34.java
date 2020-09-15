package chapter07;

import java.util.Scanner;

public class Exercise07_34 {

		public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.print("enter a string:");	
		    
			String ifade= input.nextLine();
			System.out.print(sort(ifade));

		}
		
		public static char[] sort(String s) {
			char[] dizi= s.toCharArray();
			sirala(dizi);
			return dizi;
			
			
		}
		public static void sirala(char[] list) {
			for (int i = 0; i < list.length ; i++) {
				char min =list[i];
				int minIndex = i;

				for (int j = i + 1; j < list.length; j++) {
					if (list[j] < min) {
						min = list[j];
						minIndex = j; 
					}					
				}

				if (minIndex != i) {
					list[minIndex] = list[i];
					list[i] =  min;
				}
				
			}
			
		}
}
