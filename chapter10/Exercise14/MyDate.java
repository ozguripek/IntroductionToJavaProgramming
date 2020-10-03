package chapter10.Exercise14;

import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);		
	}
	
	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(long elapsedTime) {
		GregorianCalendar o1 = new GregorianCalendar();
		o1.setTimeInMillis(elapsedTime);
		year = o1.get(GregorianCalendar.YEAR);
		month = o1.get(GregorianCalendar.MONTH);
		day = o1.get(GregorianCalendar.DAY_OF_MONTH);

	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month + 1;
	}

	public int getDay() {
		return day;
	}

}
