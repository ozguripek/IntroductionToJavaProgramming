package chapter05;
import java.util.Scanner;
public class Exercise05_48 {

	public static void main(String[] args) {
	
	Scanner input=new Scanner (System.in);
	System.out.print("Enter a string:");		
	String str= input.nextLine();
	char harf;
	
	for(int i=0;i<=str.length();i++) {
		if(i%2==0) {
		harf= str.charAt(i);
		System.out.print(harf+"");
		
		}
	

	}	
		
}
}
