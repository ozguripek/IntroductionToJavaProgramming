package chapter06;

public class Exercise06_13 {

	public static void main(String[] args) {
		System.out.println("i                 m(i)");
		System.out.println("_________________________");
		kesir(20);
		
	}
	
	
	public static void kesir(double sayi) {
		double toplam=0;
		
		for (double i=1; i<=sayi; i++) {
			toplam=toplam+(i/(i+1));
				
		System.out.printf("%-2.0f     ", i);
		System.out.printf("%15.4f\n", toplam);
				
		}
	}
}
