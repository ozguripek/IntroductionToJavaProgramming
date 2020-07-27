package chapter03;

import java.util.Scanner;

public class Exercise03_02 {

	public static void main(String[] args) {
		
		int digit1= (int)(Math.random()*10);
		int digit2= (int)(Math.random()*10);
		int digit3= (int)(Math.random()*10);
		
		System.out.print("Geben Sie die Summe von "+ digit1+
				"+"+digit2+"+"+digit3+"=");
	    
		Scanner input= new Scanner(System.in);
	    
	    int antwort= input.nextInt();
	    
	    int summe=digit1 + digit2 + digit3;
	    
	    if(summe==antwort) {	   
	   System.out.println("Sis sind reicht, die Summe ist= "+summe);
	   }
	    else {
		System.out.println("Die Antwort ist falsch, die Summe ist ="+summe);
		}
	}	    

}
