package chapter05;
import java.util.Scanner;

public class Exercise05_37 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.print("integer bir sayi giriniz: ");
		int sayi= input.nextInt();
		String ikilikSayi=""; 
		for( int i=sayi; i>0; i=i/2) {
			
			ikilikSayi=(i%2)+ ikilikSayi;
			System.out.println(ikilikSayi);
		}
		System.out.println(sayi+" nin ikilik degeri :"+ikilikSayi);
	}

}
