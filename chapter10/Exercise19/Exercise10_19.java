package chapter10.Exercise19;
import java.math.BigInteger;

public class Exercise10_19 {

	public static void main(String[] args) {
		
		System.out.println("p       2^p - 1");

		for (BigInteger number = new BigInteger("2"); number.compareTo(new BigInteger("100")) <= 0; number = number.add(new BigInteger("1"))) {
			if (isPrime(number)) {
				System.out.printf("%-3d", number);
				System.out.println("       " + mersennePrime(number));
			}
		}
	}

	public static BigInteger mersennePrime(BigInteger n) {
		BigInteger two = new BigInteger("2");
		BigInteger carpim = new BigInteger("2");
		for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; i = i.add(new BigInteger("1"))) {
			carpim = carpim.multiply(two);
		}
		return carpim.subtract(new BigInteger("1")); 
	}


	public static boolean isPrime(BigInteger n) {
		for (BigInteger i = new BigInteger("2"); i.compareTo(n.divide(new BigInteger("2"))) <= 0; i = i.add(new BigInteger("1"))) {
			if (n.remainder(i).compareTo(new BigInteger("0")) == 0) { 
				return false;
			}
		}
		return true; 
	}
}
