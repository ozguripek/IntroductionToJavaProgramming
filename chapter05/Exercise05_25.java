package chapter05;
import java.util.Scanner;

public class Exercise05_25 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println(" Degeri giriniz (10000, 20000, 100000) :");
		double deger=input.nextDouble();
		double sum = 0;
	
		for (double i = 1; i <= (2 * deger - 1); i += 2) {
			sum += 1 / i;
			i += 2;
			sum -= 1 / i; 
		}
		double pi = 4 * sum;

		
		System.out.println("PI value for "+deger+ " is =  " + pi);

		
	}
}