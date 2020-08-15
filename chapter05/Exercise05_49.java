package chapter05;
import java.util.Scanner;
public class Exercise05_49 {

	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	System.out.print("Enter a string:");		
	String str= input.nextLine();
	char harf;
	int sesliSayaci=0;
	int sessizSayaci=0;
	
	for(int i=0;i<str.length();i++) {
		
		if (Character.isLetter(str.charAt(i))) {
			harf=Character.toUpperCase(str.charAt(i));
			if(harf =='A'||harf =='E'||harf =='I'||harf =='O'||harf =='U') {
				sesliSayaci++;
		
			}
			else {
			sessizSayaci++;
			}
		}
	}
	System.out.println("The number of vowels is " + sesliSayaci);
	System.out.println("The number of consonants is " + sessizSayaci);
	}
}

	
	
	
	

