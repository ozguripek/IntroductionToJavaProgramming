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

	public static BigDecimal getE(BigDecimal v) {
		BigDecimal one = new BigDecimal("1");
		BigDecimal e = new BigDecimal("0.0");
		for (BigDecimal i = one; i.compareTo(v) <= 0; i = i.add(one)) {
			BigDecimal payda = i;
			
			for (BigDecimal j = i.subtract(one); j.compareTo(one) >= 1; j = j.subtract(one)) {
				payda = payda.multiply(j);
			}
			
			e = e.add(one.divide(payda, 25, RoundingMode.HALF_UP));  
		}
		return e;
	}
}