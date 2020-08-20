package chapter06;

public class Exercise06_14 {

	public static void main(String[] args) {

		
			System.out.println("i                 m(i)");
			System.out.println("_________________________");
			double sayi=901;
			
			for (double i=1; i<=sayi; i+=100) {
				
			System.out.printf("%-3.0f     ", i);
			System.out.printf("%15.4f\n", estimate(i));
			}
		}
		
		
		public static double estimate(double sayi) {
			double pi=0;
			
			for (double i=1; i<=sayi; i++) {
				pi+=Math.pow(-1, i+1)/(2*i-1);
								
			}
			return 4*pi;
		}
	}
