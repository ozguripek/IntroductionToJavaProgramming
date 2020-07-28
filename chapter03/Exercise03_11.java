package chapter03;
import java.util.Scanner;

public class Exercise03_11 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Geben Sie die Nummer des Monats ein: ");
		int monat= input.nextInt();
		
		System.out.print("Geben Sie den Jahr ein: ");
		int jahr= input.nextInt();
		
	    boolean leapJahr= (jahr % 4 == 0 && jahr % 100 != 0) ||
	    		(jahr % 400 == 0);
	    
	    switch (monat) {
	    
	    case 1:System.out.println("January "+jahr+ " hat 31 Tage");break;
	    case 2:System.out.println("February "+jahr+
	    	((leapJahr) ? " hat 29 Tage" : " hat 28 Tage")); break;
	    	
	    case 3:System.out.println("Marc "+jahr+ " hat 31 Tage");break;
	    case 4:System.out.println("April "+jahr+ " hat 30 Tage");break;
	    case 5:System.out.println("May "+jahr+ " hat 31 Tage");break;
	    case 6:System.out.println("Juni "+jahr+ " hat 30 Tage");break;
	    case 7:System.out.println("Juli "+jahr+ " hat 31 Tage");break;
	    case 8:System.out.println("August "+jahr+ " hat 31 Tage");break;
	    case 9:System.out.println("September "+jahr+ " hat 30 Tage");break;
	    case 10:System.out.println("Oktober "+jahr+ " hat 31 Tage");break;
	    case 11:System.out.println("November "+jahr+ " hat 30 Tage");break;
	    case 12: System.out.println("Dezember "+jahr+" hat 31 Tage"); break;
	    
	    
	    }
	 }
}


