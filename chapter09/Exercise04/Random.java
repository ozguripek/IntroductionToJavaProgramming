package chapter09.Exercise04;

public class Random {
	public static void main(String[] args) {
		
		java.util.Random random= new java.util.Random(1000);
	
		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 0) {
				System.out.printf("%3d\n", random.nextInt(100));
			}
			else {
				System.out.printf("%3d", random.nextInt(100));
			}
		}
	}
}
