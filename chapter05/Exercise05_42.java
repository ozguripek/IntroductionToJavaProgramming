package chapter05;

import java.util.Scanner;

public class Exercise05_42 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("enter COMMISSION_SOUGHT:");
		int commisionSought = input.nextInt();
		
		for (int i=20000; i<100000000; i++){
		
			double commission= ((5000 * 0.08) + (5000 * 0.1) + (0.12*i));
		
			if (commission>=commisionSought ) {
			System.out.println(commisionSought +" $ kazanabilmeniz icin"
						+ " yapmaniz gereken yillik satis:"+(10000+i)+"$");
			System.exit(0);
		
			}
			
			
		}
		

	}

}

