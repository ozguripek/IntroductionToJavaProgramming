package chapter05;

public class Exercise05_06 {

	public static void main(String[] args) {
		
	
		System.out.println("Miles     Kilometers  |  Kilometers	  Miles");
				
		for( int miles=1, km=20 ;miles<=10 && km<=65;miles++,km+=5) {
			
			System.out.printf("%-10d%-10.3f", miles,miles*1.609);
			
			System.out.print("  |  ");
			
			System.out.printf("%-14d%8.3f\n", km,km/1.609);

		}
	}
}