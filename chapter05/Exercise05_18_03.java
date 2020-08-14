package chapter05;

import java.util.Scanner;

public class Exercise05_18_03 {

	public static void main(String[] args) {
		
		System.out.println("Pattern C");
		
		
			
		for (int satirNo = 1; satirNo <= 6; satirNo++) {
			// bosluk olusturma
			for (int boslukSayisi = 6 - satirNo; boslukSayisi >= 1; boslukSayisi--) {
				System.out.print("  ");
			}
			// Sol taraf azalan sayilar
			for (int sol=satirNo; sol >= 1; sol--) {
			System.out.print(sol + " ");
			}
			
			// alt satira gec
			System.out.println();
		}
}
}
