package chapter01;

public class Exercise01_13 {

	public static void main(String[] args) {
		
		// a=3.4
		// b=50.2
		// c=2.1
		// d=.55
		// e=44.5
		// f=5.9
		
		
		//    (44.5 * .55) - (50.2 * 5.9))
		// x = ----------------------------
		//	   (3.4  * .55) - (50.2 * 2.1)
		
		
		//    (3.4 * 5.9) - (44.5 * 2.1)
		// y= --------------------------
		//    (3.4 * .55) - (50.2 * 2.1)
		
		System.out.println("3.4x + 50.2y = 44.5");
		System.out.println("2.1x +  .55y =  5.9");
		
		System.out.println("                               ");
		System.out.println("    (44.5 * .55) - (50.2 * 5.9)");
		System.out.println("x= ----------------------------");
		System.out.println("    (3.4  * .55) - (50.2 * 2.1)");
		
		
		System.out.println((((44.5 * .55) - (50.2 * 5.9)) / 
							 ((3.4 * .55) - (50.2 * 2.1))));
		
		
		System.out.println("                              ");
		System.out.println("    (3.4 * 5.9) - (44.5 * 2.1)");
		System.out.println("y=  --------------------------");
		System.out.println("    (3.4 * .55) - (50.2 * 2.1)");
		
		
		System.out.println((((3.4 * 5.9) - (44.5 * 2.1)) /
							((3.4 * .55) - (50.2 * 2.1))));

	}

}
