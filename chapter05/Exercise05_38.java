package chapter05;
import java.util.Scanner;

public class Exercise05_38 {

	public static void main(String[] args) {
		{
			
			Scanner input=new Scanner (System.in);
			System.out.print("integer bir sayi giriniz: ");
			int sayi= input.nextInt();
			String sekizlikSayi=""; 
			for( int i=sayi; i>0; i=i/8) {
				
				sekizlikSayi=(i%8)+ sekizlikSayi;
				System.out.println(sekizlikSayi);
			}
			System.out.println(sayi+" nin oktal degeri :"+sekizlikSayi);
		}

	}
}