package chapter05;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) { {
		
		Scanner klavye= new Scanner (System.in);
		System.out.println("Enter the number of students: ");
		int numStudents= klavye.nextInt();
		String name="";
		int score=0;
		int highScore1=0;
		int highScore2=0;
		String highName1="";
		String highName2="";
		
		for (int i=1;i<=numStudents;i++) {
		System.out.print("Enter "+ i +". students name:");
		name= klavye.next();
		System.out.print("Enter "+ name +"`s score:");
		score=klavye.nextInt();
		
			if(score>highScore2) {
				
				if( score>highScore1) {
				highScore2=highScore1;
				highScore1=score;
				highName2=highName1;
				highName1=name;				
				}
				else {
				highName2=name;
				highScore2=score;
				}
			}
		}
		System.out.println("the name of the student with the "
				+ "highest score ("+ highScore1 +") is "+highName1);
		System.out.println("the name of the student with the "
				+ "second highest score ("+ highScore2 +") is "+highName2);

			}

		}
	}


