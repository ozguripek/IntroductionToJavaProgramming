package chapter13.Exercise04;

import java.util.*;

public class MyCalendar  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter full year (e.g., 2001): ");
		int year = input.nextInt();
		
		System.out.print("Enter month in number between 1 and 12: ");
		int month = input.nextInt()-1;	
	
		Calendar calendar = new GregorianCalendar(year, month, 1);
		
		printHeader(calendar); 
		
		for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) { 
			System.out.print("    ");
		}
		
		while (calendar.get(Calendar.DATE) < calendar.getActualMaximum(Calendar.DATE)) {

			if (calendar.get(Calendar.DAY_OF_WEEK) == 7) {
				System.out.printf("%4d\n", calendar.get(Calendar.DATE));
			}
			else {
				System.out.printf("%4d", calendar.get(Calendar.DATE));
			}
			
			calendar.add(Calendar.DATE, 1);
		}
		System.out.printf("%4d\n", calendar.get(Calendar.DATE));
	}
	
	public static void printHeader(Calendar calendar) {
		String[] months = getMonths();

		int length = 29 / 2 - (months[calendar.get(Calendar.MONTH)].length() / 2 + 3);
		System.out.println();
		
		for (int i = 0; i < length; i++) {
			System.out.print(" ");
		}
		System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + 
			calendar.get(Calendar.YEAR));

		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}	

	public static String[] getMonths() {
		String[] months = {"January", "February", "March", "April", "May", "June", 
			               "July", "August", "September", "October", "November", 
			               "December"};
		return months;
	}

}


