package chapter13.Exercise14;

public class Exercise13_14 {

	public static void main(String[] args) {
		Rational r1 = new Rational(4, 3);
		Rational r2 = new Rational(2, 3);
		
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r1 + " is " + r1.doubleValue());

	}

}
