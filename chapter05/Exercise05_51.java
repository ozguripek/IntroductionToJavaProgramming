package chapter05;
import java.util.Scanner;

public class Exercise05_51 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the first string:");		
		String str1= input.nextLine();
		System.out.print("Enter the second string:");		
		String str2= input.nextLine();
				
						
		String prefix = "";		

		for (int i=0;i<str1.length();i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
			prefix += str1.charAt(i);
			
			}
		}
		
		if (prefix.length() > 0) {
			System.out.println("The commmon prefix is " + prefix);
		}
		else {
			System.out.println(str1 + " and " + str2 +
				" have no commmon prefix");
		}
	}
}

