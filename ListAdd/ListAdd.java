package ListAdd;
import java.util.ArrayList;
import java.util.Scanner;

public class ListAdd {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String isim="";
		System.out.println(" bir isim giriniz");		
		ArrayList<String> list= new ArrayList<>();
		
		do {
			isim= input.nextLine();
			if(isim.startsWith("+")) {
				list.add(isim.substring(1));
			}			
			else if(isim.startsWith("-")) {
				list.remove(isim.substring(1));
			}else {
				continue;
			}
		}while(!isim.equals("!"));
		System.out.println(list.toString());
	}

}
