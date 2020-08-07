package chapter05;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {
		
		Scanner klavye= new Scanner (System.in);
		System.out.println("Enter the number of students: ");
		int numStudents= klavye.nextInt();
		String name="";
		int score=0;
		int highScore=0;
		String highName="";
		
		for (int i=1;i<=numStudents;i++) {
		System.out.print("Enter "+ i +". students name:");
		name= klavye.next();
		System.out.print("Enter "+ name +"`s score:");
		score=klavye.nextInt();
		
			if(score>highScore) {
				highScore=score;
				highName=name;
				}
		}
		System.out.print("the name of the student with the "
				+ "highest score ("+ highScore +") is "+name);

		}

	}
