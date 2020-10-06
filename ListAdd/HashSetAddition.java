package ListAdd;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetAddition {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String isim="";
		System.out.println(" bir isim giriniz");		
		Set<String> myHashSet= new HashSet<>();
		
		do {
			isim= input.nextLine();
			if(isim.startsWith("+")) {
				myHashSet.add(isim.substring(1));
			}			
			else if(isim.startsWith("-")) {
				myHashSet.remove(isim.substring(1));
			}else {
				continue;
			}
		}while(!isim.equals("!"));
		System.out.println(myHashSet.toString());
	}

}
