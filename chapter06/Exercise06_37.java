package chapter06;

import java.util.Scanner;

public class Exercise06_37 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input. nextInt();
		
		
		System.out.print("Enter the width of the number: ");
		int width = input. nextInt();
		
		System.out.println(format(number, width));
		
		
	}
	public static String format(int number, int width) {
		
		String num= number+"";
		
		if(num.length()>=width) {
			
			return num;
		}
		else {
		
			for (int i=width-num.length();i>0;i--) {
				System.out.println(width-num.length());
			num=0+num;
			}
		return num;
		}
		
		
		
	}

}
