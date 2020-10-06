package chapter10.Exercise18;
import java.math.BigInteger;

public class Exercise10_18 {

	public static void main(String[] args) {	
		
			BigInteger number = new BigInteger(Long.MAX_VALUE + "");
			int count = 0; 
			final int NUMBER_OF_PRIMES = 5;

			System.out.println();
			while (count < NUMBER_OF_PRIMES) {
				number = number.add(new BigInteger("1"));
				if (isPrime(number)){
					count++;
					System.out.println(number);
				}				
			}
		}

		public static boolean isPrime(BigInteger n) {
			for (BigInteger i = new BigInteger("2"); i.compareTo(n.divide(new BigInteger("2"))) <= 0; 
				  i = i.add(new BigInteger("1"))) {
				if (n.remainder(i).compareTo(new BigInteger("0")) == 0) {
					return false;
				}
			}
			return true;
		}

}