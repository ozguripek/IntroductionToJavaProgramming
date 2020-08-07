package chapter05;

public class Exercise05_03 {

	public static void main(String[] args) {
		System.out.println("Kilograms    Pounds");
		for(int kg=1; kg<200;kg+=2) {
	
			 double pounds=kg * 2.2;
			System.out.printf("%-13d%6.1f\n", kg,pounds);			
			
		}
	
	}

}
