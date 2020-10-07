package chapter10.Exercise20;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise10_20 {
	public static void main(String[] args) {
		
		System.out.println("\n The e values for i = 100 to 1000:");
		System.out.println("-----------------------------------");
		System.out.println(" i                e");
		System.out.println("-----------------------------------");
		for (BigDecimal i = new BigDecimal("100"); i.compareTo(new BigDecimal("1000")) <= 0;i = i.add(new BigDecimal("100"))) {
			System.out.println(i + "    " + getE(i));
		}
	}

	@SuppressWarnings("deprecation")
	public static BigDecimal getE(BigDecimal v) {
		BigDecimal one = new BigDecimal("1");
		BigDecimal e = new BigDecimal("0.0");
		for (BigDecimal i = one; i.compareTo(v) <= 0; i = i.add(one)) {
			BigDecimal denominator = i;
			for (BigDecimal k = i.subtract(one); 
				k.compareTo(one) >= 1; 
				k = k.subtract(one)) {
				denominator = denominator.multiply(k);
			}
			// Use 25 digits of precision
			e = e.add(one.divide(denominator, 25, RoundingMode.HALF_UP));  
		}
		return e;
	}
}