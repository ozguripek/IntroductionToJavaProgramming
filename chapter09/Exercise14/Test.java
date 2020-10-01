package chapter09.Exercise14;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in);
		
		System.out.println("Bir yorum yaziniz:");
		String text= input.nextLine();
		
		System.out.println("Hangi ürün hakkinda yorum yaptiginizi yaziniz:");
		String ürün= input.nextLine();
		
		Comment yorum= new Comment(text, ürün);
		
		if(yorum.isValid(text)) {
			System.out.println("Yorum gecerli bir yorum");
			
		}
		else {
			System.out.println("Gecersiz bir yorum girdiniz");
		}
	
	}
	

}
