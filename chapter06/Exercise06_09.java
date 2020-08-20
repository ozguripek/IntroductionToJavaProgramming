package chapter06;

public class Exercise06_09 {

	public static void main(String[] args) {
		
		
		System.out.println("Feet      Meters    |      Meters     Feet");
		System.out.println("__________________________________________");
		
		for (double i = 1.0, j = 20.0; i <= 10.0 && j<=65.0; i++, j += 5) {
			System.out.printf("%4.1f     ", i);
			System.out.printf("%7.3f", footToMeter(i));
			System.out.print("     |      ");
			System.out.printf("%-10.1f", j);
			System.out.printf("%7.3f\n", meterToFoot(j));
		
		}
		
		
		
	}
		
		
	
		

	public static double footToMeter(double foot) {
		
		 double meter = 0.305 * foot;
		 return meter;
	}
	public static double meterToFoot(double meter) {
		
		double foot = 3.279 * meter;
		return foot;		
		
	}
}
