package ListAdd;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetAdd {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);		
		System.out.println(" bir kelime giriniz");
		String word= input.nextLine();		
		printUniqueLetters(word);		
		
	}

	private static void printUniqueLetters(String word) {
		Set<Character> setOfChars= new HashSet<>();		
		for( int i=0; i< word.length(); i++){
			setOfChars.add(word.charAt(i));
		}	
		System.out.println(setOfChars);
		System.out.println(setOfChars.size());
		}
		
}



