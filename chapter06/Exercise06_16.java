package chapter06;
import java.util.Scanner;

public class Exercise06_16 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Yili giriniz: ");
		int year= input.nextInt();
		System.out.println(year+" yilindaki gün sayisi: "+numberOfDaysInAYear(year));
	}
	
	public static int numberOfDaysInAYear(int year) {
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return 366;
		}
		else {
			return 365;
		}
				
	}
}
