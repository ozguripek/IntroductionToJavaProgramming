package chapter07;

import java.util.Scanner;

public class Exercise07_27 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter list1:");		
		int elemanSayisi1= input.nextInt(); 
		int[] list1= new int[elemanSayisi1];
		
			for( int i=0; i<list1.length; i++) {
				list1[i]= input.nextInt();
			}
		
		
		System.out.print("Enter list2:");		
		int elemanSayisi2= input.nextInt(); 
		int[] list2= new int[elemanSayisi2];
		
		for( int i=0; i<list2.length; i++) {
			list2[i]= input.nextInt();
		}
	
		if(equals(list1, list2)&&(list1.length==list2.length)){
				System.out.println("Two lists are identical");
			}
		
		else {
			System.out.println("Two lists are NOT identical");
		}
			
	}	
	public static boolean equals(int[] list1, int[] list2) {
			int[] sayac1= new int[10]	;
			int[] sayac2= new int[10]	;
			
			for( int i=0; i<list1.length; i++) {
				sayac1[list1[i]]++;
			}
			for( int i=0; i<list2.length; i++) {
				sayac2[list2[i]]++;
			}
			
			for( int i=0; i< sayac1.length;i++) {
					if(sayac1[i]!=sayac2[i]) {
						return false;
					}
				}
			
		
		return true;	
		
	}
}