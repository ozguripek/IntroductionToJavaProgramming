package chapter10.Exercise14;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myDate1 = new MyDate();
		MyDate myDate2 = new MyDate(34355555133101L);

		System.out.println("First Date is: "+ myDate1.getDay()+ "."+ myDate1.getMonth() + "."+ myDate1.getYear());
		System.out.println("Second Date is: " + myDate2.getDay()+ "."+ myDate2.getMonth() + "."+ myDate2.getYear());
	}
}
