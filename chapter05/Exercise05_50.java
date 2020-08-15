package chapter05;
import java.util.Scanner;

public class Exercise05_50 {

	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		System.out.print("Enter a string:");		
		String str= input.nextLine();
		
		int sayac=0;
		
		
		for(int i=0;i<str.length();i++) {
			
			if (Character.isUpperCase(str.charAt(i))) {
				
					sayac++;
			
				}
		}
		
	System.out.println("Tne number of uppercase letters is " + sayac);
	
	}
}
