package chapter03;

import java.util.Scanner;

public class Exercise03_17 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("enter a number for scissor (0), rock (1), paper (2) :");
		int number= input.nextInt();
		
		int computer= (int)(Math.random()*2);
		//it is a draw
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
		
	//you won
		else if (number == 0 && computer == 2) {
				
				System.out.println("The computer is papier. "
						+ "You are scissor. You won");
		}
		else if (number == 1 && computer == 0) {
				System.out.println("The computer is scissor. "
						+ "You are rock. You won");
			}
		else if(number == 2 && computer == 1) {
			    	  System.out.println("The computer is rock. "
								+ "You are papier. You won");
		}    	
		
		//computer won
		else if(number == 0 && computer == 1) {
				
				System.out.println("The computer is rock. "
						+ "You are scissor. Computer won");
		}		
			else if (number == 1 && computer == 2) { 
				System.out.println("The computer is papier. "
						+ "You are rock. Computer won");
			}	
			      else if(number == 2 && computer == 0) {
			    	  System.out.println("The computer is scissor. "
								+ "You are papier. Computer won");
		}
		

	}

}
