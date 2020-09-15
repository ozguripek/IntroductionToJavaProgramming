package chapter07;

import java.util.Scanner;

public class Exercise07_31 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter list1:");		
		int elemanSayisi1= input.nextInt(); 
		int[] list1= new int[elemanSayisi1];
		for( int i=0; i<list1.length; i++){
			list1[i]= input.nextInt();
		}
		
		System.out.print("Enter list2:");		
		int elemanSayisi2= input.nextInt(); 
		int[] list2= new int[elemanSayisi2];
		for( int i=0; i<list2.length; i++){
			list2[i]= input.nextInt();
		}
		
		int[] karma=merge(list1, list2);
		
		System.out.print("The merged list is: ");
		
		for( int sayi: karma){
			System.out.print(sayi+" ");	
		}
		
	}
		public static int[] merge(int[] list1, int[] list2) {
			
			int[] karma= new int[list1.length+list2.length];
			for (int i = 0; i < list1.length; i++)
				karma[i] = list1[i];

			for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
				karma[j] = list2[i];	
			}

			sirala(karma);

			return karma;
		}
		
		public static void sirala(int[] list) {
			for (int i = 0; i < list.length - 1; i++) {
				int min = list[i];
				int minIndex = i;

				for (int j = i + 1; j < list.length; j++) {
					if (list[j] < min) {
						min = list[j];
						minIndex = j; 
					}					
				}

				if (minIndex != i) {
					list[minIndex] = list[i];
					list[i] = min;
				}
			}
		}
			
}
		
		
		

		
