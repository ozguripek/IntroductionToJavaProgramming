package chapter07;

import java.util.Scanner;

public class Exercise07_26 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter list1:");		
		int elemanSayisi1= input.nextInt(); 
		int[] list1= new int[elemanSayisi1];
		
			for( int i=0; i<list1.length; i++) {
				list1[i]= input.nextInt();
				System.out.println(" list1:"+ i+ "nci eleman "+list1[i]);
			}
		
		
		System.out.print("Enter list2:");		
		int elemanSayisi2= input.nextInt(); 
		int[] list2= new int[elemanSayisi2];
		
		for( int i=0; i<list2.length; i++) {
			list2[i]= input.nextInt();
			System.out.println(" list2:"+ i+ "nci eleman "+list2[i]);
		}
	
		if(equals(list1, list2)){
				System.out.println("Two lists are strictly identical");
			}
		
		else {
			System.out.println("Two lists are NOT strictly identical");
		}
			
	}	
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length!=list2.length) return false;
			
			for( int i=0; i<list1.length; i++) {
				if(list1[i]!=list2[i]) {
					return false;
				}
			}
		
		return true;	
		
	}
}