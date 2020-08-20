package chapter06;
import java.util.Scanner;
public class Exercise06_18 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Passwordu giriniz: ");
		String p= input.next();
		if (checkPassword(p)) {
			System.out.println("password gecerli.");
		}
		else {
			System.out.println(" password gecersiz.");
		}
		
	}
	public static boolean checkPassword(String p) {
		int sayac=0;
		
		if( p.length()>=8) {
			
			for(int i=0; i<=p.length()-1;i++) {
				
				int krk= ((int)p.charAt(i));
				  
				if(48<=krk && krk<=121  ) {
					      /*if(48<=krk && krk<=56) {						
					    	 sayac++;
					    	 	if(sayac>2) {*/
					    		 return true;
				  }
		}
					
					
					
		}return false;
				
	}
}


