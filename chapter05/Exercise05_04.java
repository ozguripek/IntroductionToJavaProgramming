package chapter05;

public class Exercise05_04 {

	public static void main(String[] args) {
		
		System.out.println("Miles       Kilometers");
		
		for(int i=1;i<11;i++) {
			double j= i*1.609;
			System.out.printf("%-12d%-1.3f\n",i, j);
		}

	}

}
