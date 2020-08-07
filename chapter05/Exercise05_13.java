package chapter05;

public class Exercise05_13 {

	public static void main(String[] args) {
		
		int n=0;
				
		while(Math.pow(n, 3)<12000) {
			
			n++;
			
		}
		System.out.println ("the largest integer n "
				+ "such that n3 is less than 12,000 ist:  "+n);

	}

}