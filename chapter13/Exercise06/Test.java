package chapter13.Exercise06;

public class Test {

	public static void main(String[] args) {
		
		ComparableCircle comparableCircle1 = new ComparableCircle(10);
		ComparableCircle comparableCircle2 = new ComparableCircle(5);

		
		System.out.println("\nComparableCircle1:");
		System.out.println(comparableCircle1);
		
		System.out.println("\n**************************************");
		
		System.out.println("\nComparableCircle2:");
		System.out.println(comparableCircle2);
		
		System.out.println("\n**************************************");
		
		System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1 
			? "\nComparableCircle1 " : "\nComparableCircle2 ") + 
			"is the larger of the two Circles");
	}
}
