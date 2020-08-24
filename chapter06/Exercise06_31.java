package chapter06;

import java.util.Scanner;

public class Exercise06_31 {
	public static void main(String[] args) {
	
	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter a credit card number as a long integer:");
	long number= input.nextLong();
	
	if(isValid(number)) {
		System.out.println(number +" is valid.");
	}
	else {
		System.out.println(number +" is invalid.");
	}
	
	}
	public static boolean isValid(long number) {
		
		if((13<=getSize(number) && getSize(number) <= 16) &&
		(prefixMatched(number, 4) || prefixMatched(number, 5) ||
		prefixMatched(number, 37) || prefixMatched(number, 6)) &&
		((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)){
			
			return true;
		}
		else{
			return false;
		}
	}
	
	public static int sumOfDoubleEvenPlace(long number) {
		int toplam=0;
		String sayi= number+"";
		
		for (int i=getSize(number)-2; i>=0; i-=2) {
			
			toplam+=getDigit(Integer.parseInt(sayi.charAt(i)+"")*2);
		}
		return toplam;
	}
	public static int getDigit(int number) {
		if (number<9) {
			return number;
		}
		else {
			return (number%10+number/10);//birler bas, ile onlar bas.nin toplami
		}
	}
	public static int sumOfOddPlace(long number) {
		int toplam=0;
		String sayi= number+"";
		for (int i=getSize(number)-1; i>=0; i-=2) {
			
			toplam+=Integer.parseInt(sayi.charAt(i)+"");
		}
		return toplam;
		
	}
	
	public static boolean prefixMatched(long number, int d) {
		//getSize(d) ile rakamin tek haneli mi cift haneli mi oldugunu ögreniyoruz
		
		if(getPrefix(number, getSize(d))==d){
			return true;
		}
		else {
			return false;
		}
			
	}
	public static int getSize(long d) {
		String number= d+"";
		
		int size= number.length();
		
		return size;
		
	}
	
	public static long getPrefix(long number, int k) {
		
		if( getSize(number)>k) {
			String sayi= number+"";
			return Long.parseLong(sayi.substring(0,k));
		}
		else {
			return number;
			}
	}
}
