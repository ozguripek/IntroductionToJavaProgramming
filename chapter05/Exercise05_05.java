package chapter05;

public class Exercise05_05 {

	public static void main(String[] args) {
		
		System.out.println("Kilograms Pounds   |  Pounds  Kilograms");
		
		
		for( int kg=1, pounds=20 ;kg<200 && pounds<516;kg+=2,pounds+=5) {
			
			System.out.printf("%-10d%-7.1f", kg,kg*2.2);
			
			System.out.print("  |  ");
			
			System.out.printf("%-9d%8.2f\n", pounds,pounds/2.2);
						
		}
			
	}

	
}