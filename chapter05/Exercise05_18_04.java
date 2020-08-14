package chapter05;

import java.util.Scanner;

public class Exercise05_18_04 {

	public static void main(String[] args) {
		

		System.out.println(" Pattern D ");
		
	
		
		for (int satirNo = 6; satirNo >= 1; satirNo--) {
			
			for (int boslukSayisi = 6-satirNo; boslukSayisi >= 1; boslukSayisi--) {
				System.out.print("  ");
			}
		
			for (int sag = 1; sag <= satirNo; sag++) {
			System.out.print(sag + " ");
			}
			 
			System.out.println();
		}
	}
}