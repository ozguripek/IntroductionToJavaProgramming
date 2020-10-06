package chapter10.Exercise17;
import java.math.BigInteger;

public class Exercise10_17 {

	public static void main(String[] args) {	   
		
	    BigInteger longMax = new BigInteger(String.valueOf(Long.MAX_VALUE));
	    long m = (long)(Math.sqrt(Long.MAX_VALUE));
	    BigInteger n = new BigInteger(m+"");//String.valueOf(m)

	    int count = 0;
	    while (count < 10) {
	      BigInteger square = n.multiply(n);
		      if (square.compareTo(longMax) == 1) {
		        System.out.println(square);
		        count++;
		      }
	      n = n.add(new BigInteger("1"));//n = n.add(BigInteger.ONE);
	    }
	  }
	}
