package chapter03;
import java.util.Scanner;

public class Exercise03_10 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		
		int n1= (int)(Math.random()*100);
		int n2= (int)(Math.random()*100);
		
		int sum= n1+n2;
		
		System.out.println("Was ist die Summe:" + n1 +"+"+ n2);	
		int antwort= input.nextInt();
		
		
		if(antwort == sum) {
			
			System.out.println(" Du bist reicht, die Summe ist: "+sum);
		}
		else{
			System.out.println(" Sie haben Fehler gemacht, die Summe ist: "+sum);
		}
			

	}

}
