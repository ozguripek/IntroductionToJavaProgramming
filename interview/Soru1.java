package interview;
import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Bir kelime giriniz");
		String str= input.nextLine();
		metod(str);	

	}

	private static String metod(String str) {
		
		int  a=str.length()-1;
		String str2="";
		
		System.out.println(str.charAt(a));
		str2 += str.charAt(a);
		if(str.length()!=1) {
			
			
			  metod(str.substring(0,a));	
			 //System.out.println(str2);
		}
		System.out.println(str2);
		if(str==str2) {
		
		return t;
		}
		
	}

}
