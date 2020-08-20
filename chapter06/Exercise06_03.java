package chapter06;

import java.util.Scanner;

public class Exercise06_03 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("Integer bir sayi giriniz: ");
		int number= input.nextInt();
		
		
		
		if(isPalindrome(number)) {
		
		System.out.println(number+" sayisi polindrom bir sayidir.");
		}
		else{
			System.out.println(number+" sayisi polindrom degildir.");
		}
	}
		public static boolean isPalindrome(int number) {
			
			if(number==reverse(number)){
					return true;
			}
			else {
				return false;
				}
			
	}
				
		public static int reverse(int number) {
			String tersi="";
			String sayi=""+number;//sayiyi Stringe cevir;
			 for(int i=sayi.length()-1;i>=0;i--) {
				 char rakam=sayi.charAt(i);
				 //rakam toplamada sag tarafa yazilmalidir
				 tersi=tersi+rakam;
			}
			 System.out.println("sayinin tersi:"+ tersi);	
			 
			return Integer.parseInt(tersi);									
			
		}
		
}
		
		

