package chapter03;
import java.util.Scanner;

public class Exercise03_09 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println(" Enter the first 9 figit if an ISBN as integer: ");
		
		int isbn= input.nextInt();
		
		int d1=    isbn/100000000;
		int remain=isbn%100000000;
		
		int d2= remain/10000000;
		remain= remain%10000000;
		
		int d3= remain/1000000;
		remain= remain%1000000;
		
		int d4= remain/100000;
		remain= remain%100000;
		
		int d5= remain/10000;
		remain= remain%10000;
		
		int d6= remain/1000;
		remain= remain%1000;
		
		int d7= remain/100;
		remain= remain%100;
		
		int d8= remain/10;
		remain= remain%10;
		
		int d9= remain;
				
			
	int d10=(d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
	
	System.out.print(" The ISBN-10 number is: "+ d1+d2+d3+d4+d5+d6+d7+d8+d9);
		
	if(d10==10) {
		System.out.println("X");
	}
		else {System.out.println(d10); 
		}
	}
}

