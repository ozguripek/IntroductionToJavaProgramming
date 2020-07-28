package chapter03;

import java.util.Scanner;

public class Exercise03_14 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		int coin= (int)(Math.random()*2);
		
		System.out.println("Geben Sie 0 oder 1 ein:");
		int antwort= input.nextInt();
		
		if( coin== antwort) {
			System.out.println("Congratulation, Sie haben gewinen");
			
		}
		else {
			System.out.println("leider , Sie konnten nicht gewinnen");
		}
		

	}

}
