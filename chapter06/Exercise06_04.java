package chapter06;

import java.util.Scanner;

public class Exercise06_04 {

	public static void main(String[] args){
		
		Scanner input= new Scanner (System.in);
		System.out.println("Integer bir sayi giriniz: ");
		int number= input.nextInt();
		System.out.println("Sayinin tersi:"+ reverse(number));
	}
		
		public static int reverse(int number) {
			String tersi="";
			String sayi=""+number;//sayiyi String e cevir;
			 for(int i=sayi.length()-1;i>=0;i--) {
				 char rakam=sayi.charAt(i);
				 //rakam toplamada sag tarafa yazilmalidir
				 tersi=tersi+rakam;
			}
			 
			return Integer.parseInt(tersi);									
			
		}
		
}
