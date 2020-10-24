package chapter13.Exercise15;

import java.math.BigInteger;

public class Exercise13_15 {
	public static void main(String[] args) {
	
		Rational r1 = new Rational(new BigInteger("200000"), 
					  new BigInteger("300000"));
		Rational r2 = new Rational(new BigInteger("400000"), 
				      new BigInteger("500000"));
	
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r1 + " is "+ r1.doubleValue());
	}    
}
