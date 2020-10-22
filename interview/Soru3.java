package interview;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		int num= input.nextInt();
		int k=fibonacci(num);	
		System.out.println(k);

	}

	private static int fibonacci(int i) {
		
		if(i==2) return 1;
		if(i==1) return 0;	
		
			return fibonacci(i-2)+fibonacci (i-1);	
		
		
	}

}
