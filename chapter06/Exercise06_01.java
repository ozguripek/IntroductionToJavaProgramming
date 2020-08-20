package chapter06;

public class Exercise06_01 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			
			if(i%10==0) {
			
				System.out.printf("%8d\n",getPentagonalNumber(i));
			}else 
				System.out.printf("%8d",getPentagonalNumber(i));
						
		}
		

	}
	public static int getPentagonalNumber(int n) {
		
		int pentagonal= (n*(3*n-1))/2;
		return pentagonal;
		
		 
	}
}
