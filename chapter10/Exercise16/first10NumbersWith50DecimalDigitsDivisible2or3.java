package chapter10.Exercise16;
import java.math.*;

public class first10NumbersWith50DecimalDigitsDivisible2or3 {

	public static void main(String[] args) {
		int count = 1;
		BigInteger number = new BigInteger(
			"10000000000000000000000000000000000000000000000000");
		BigInteger zero = new BigInteger("0");

		while (count <= 10) {
			if (zero.compareTo(number.remainder(new BigInteger("2"))) == 0 || 
				zero.compareTo(number.remainder(new BigInteger("3"))) == 0) {
				System.out.println(count+".  "+number);
				count++;
			}
			number = number.add(new BigInteger("1"));
		}
	}
}