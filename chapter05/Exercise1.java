package chapter05;
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println ("Bir sayi giriniz:");
		int num1=input.nextInt();	
		System.out.println ("Bir sayi giriniz:");
		int num2=input.nextInt();
		
		int cevap=enBuyugu(num1, num2);
		System.out.println( "En buyuk:" +cevap);
		
	}


	public static Integer enBuyugu(int num1, int num2){
		int cevap =0;
			
		if(num1<num2) {
			 cevap=num2;
		}
		else {
			 cevap=num1;
		}
		return cevap;
	}
}
	
		
