package chapter05;
import java.util.Scanner;
public class Exercise05_47 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.print("Enter the first 12 digits of"
				+ " an ISBN-13 as a string: ");		
		String str= input.nextLine();
		int toplam=0;
		int d13=0;
		int sayi;
		System.out.print("The ISBN-13 number is: ");
		
		for(int i=0;i<=11;i++) {
			if(i%2!=0) {
			sayi= 3*Integer.parseInt(str.charAt(i)+"");
			
			}else {
			sayi= Integer.parseInt(str.charAt(i)+"");	
			}
					
			toplam= toplam+sayi;
		
		
			int sonuc=10-(toplam%10);
			if(sonuc!=10) {
			d13=sonuc;
			}
		
	
		}	
		System.out.print(str+d13);	
	}
}
