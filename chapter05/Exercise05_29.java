package chapter05;

import java.util.Scanner;

public class Exercise05_29 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter first day of the year: ");
		int day = input.nextInt();

		
		String baslik; 
		System.out.println();
		for (int month = 1; month <= 12; month++) {
			baslik = "";
			
			switch (month) { 
				case 1: baslik += "January "; break;
				case 2: baslik += "February "; break;
				case 3: baslik += "March "; break;
				case 4: baslik += "April "; break;
				case 5: baslik += "May "; break;
				case 6: baslik += "June "; break;
				case 7: baslik += "July "; break;
				case 8: baslik += "August "; break;
				case 9: baslik += "September "; break;
				case 10: baslik += "October "; break;
				case 11: baslik += "November "; break;
				case 12: baslik += "December "; break;
			}
			
			baslik += year + "";

			// Basligi merkeze yerlestirme
			for (int b = 0; b < 23 - (baslik.length() / 2); b++) {
				System.out.print(" ");
			}

			
			System.out.println(
				baslik + "\n-----------------------------------------------\n " +
				"Sun    Mon    Tue    Wed    Thu    Fri    Sat");

			// günü hesaplama
			day %= 7;
			for (int b = 0; b <= day * 7; b++) {
				System.out.print(" ");
			}

			// Mevcut ayin son gününü hesaplama
			int lastDay = 0;
			if ( month == 1 || month == 3  || month == 5 || month == 7 ||
				  month == 8 || month == 10 ||month == 12)
				lastDay += 31;
			else if (month == 4 || month == 6 || month == 9 || month == 11)
				lastDay += 30;
			else { // Test for leap year
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
					lastDay += 29;
				else
					lastDay += 28;
			}

			// Icinde bulunulan ayi gösterme 
			for (int d = 1; d <= lastDay; d++) {
				// Add a  space before numbers less than 10
				if (d < 10) 
					System.out.print(" ");
				// Start new line after satuarday
				if (day % 7 == 6)
					System.out.print(d + "\n ");
				else {
					System.out.print(d + "     ");
					// After last day of the month go to new line
					if (d == lastDay) 
						System.out.println();
				}
				day++; // increment day

			}
			System.out.println();
		}
	}
}