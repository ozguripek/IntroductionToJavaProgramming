package chapter09.Exercise03;

public class Date {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
				
	    for (long i = 10000L; i < 10000000000L; i*= 10) {
	    		date.setTime(i);
				System.out.println(date.toString());
			}
		}


}

