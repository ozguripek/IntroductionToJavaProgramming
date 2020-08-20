import java.util.Scanner;
public class HuluReoccuringChar {
	

	public static void main(String[] args) {
		

	}
 public static char findTheReoccuringChar(String word1,String word2) {
	 char cevap=' ';
	 String temp=" ";
	 //System.out.println("kelimeyi giriniz.");
	// Scanner input= new Scanner(System.in);
	 //String str= input.nextLine();
	 
	 for( int i=0; i<=word1.length()-1;i++) {
		 
		 char harf1 = word1.charAt(i);
		 
		 for( int j=0; j<=word2.length()-1;j++) {
			 
			 char harf2 = word2.charAt(i);
		 
		 if (harf1!=harf2) {
			 
			 temp=temp+harf1;
		 }
		 else {
			 
			 break
			
		 }
	 
	 
	 return cevap;
		 }
}
	}
 }

