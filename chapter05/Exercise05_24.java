package chapter05;

public class Exercise05_24 {

	public static void main(String[] args) {
		
		double toplam=0;
		
		for(int i=1; i<=97; i+=2) {
		
			toplam=toplam+(i/i+2);
			System.out.print(i+"/"+(i+2)+" + ");
		}	
		System.out.print("\n ="+toplam);		
	}
}
		



