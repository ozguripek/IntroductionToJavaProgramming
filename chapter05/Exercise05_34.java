package chapter05;

import java.util.Scanner;

public class Exercise05_34 {

	public static void main(String[] args) {
		
		
		int oyuncuSayac=0;
		int bilgisayarSayac=0;
		Scanner input= new Scanner(System.in);
		
		for (int i=1;i<=100;i++){
		System.out.println("enter a number for scissor (0), rock (1), paper (2) :");
		int number= input.nextInt();
		
		int computer= (int)(Math.random()*2);
		
		// esitlik
		
		if(number==0 && computer==0) {
			System.out.println("The computer is scissor. "
					+ "You are scissor too. It is a draw");
		}
		
		else if(number==1 && computer==1) {
			System.out.println("The computer is rock. "
					+ "You are rock too. It is a draw");
		}
		else if(number==2 && computer==2) {
			System.out.println("The computer is papier. "
					+ "You are  papier too. It is a draw");
		}
		
		//oyuncu kazanir
		else if (number == 0 && computer == 2) {
				
				System.out.println("The computer is papier. "
						+ "You are scissor. You won");
				oyuncuSayac++;
		}
		else if (number == 1 && computer == 0) {
				System.out.println("The computer is scissor. "
						+ "You are rock. You won");
				oyuncuSayac++;
			}
		else if(number == 2 && computer == 1) {
			    	  System.out.println("The computer is rock. "
								+ "You are papier. You won");
			    oyuncuSayac++;
		}    	
		
		// bilgisayar kazanir
		else if(number == 0 && computer == 1) {
				
				System.out.println("The computer is rock. "
						+ "You are scissor. Computer won");
				bilgisayarSayac++;
		}		
			else if (number == 1 && computer == 2) { 
				System.out.println("The computer is papier. "
						+ "You are rock. Computer won");
				bilgisayarSayac++;
			}	
			      else if(number == 2 && computer == 0) {
			    	  System.out.println("The computer is scissor. "
								+ "You are papier. Computer won");
			    bilgisayarSayac++; 
		}
		
		if(oyuncuSayac==2|| bilgisayarSayac==2) {
			System.out.println (" iki kez kazanildi, oyun bitti.");
			System.exit(0);
		}
			
	}

}
}

