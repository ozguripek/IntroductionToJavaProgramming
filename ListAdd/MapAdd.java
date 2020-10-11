package ListAdd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapAdd {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);		
		System.out.println(" bir kelime giriniz");
		String word= input.next();	
		printUniqueLetters(word);
					
	}
	private static <K, V> void printUniqueLetters(String word) {
		Map <Character, Integer> myMap= new HashMap<>();
			
		for( int i=0; i< word.length(); i++){
				Character c= word.charAt(i);
				
				if(Character.isLetter(c)) {
					if(myMap.containsKey(c)) {
						int value= myMap.get(c);
						value++;
						myMap.put(c, value);
					}else {
						myMap.put(c, 1);
					}
				}	
		}
			
		System.out.println(myMap);
		System.out.println(myMap.size());
	}
			
}
