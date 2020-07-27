package chapter03;
import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {
		
		System.out.print("Geben sie Heutes Tagsnummer(z.B.Sonntag:0, "
				+ "Montag:1...):");
		Scanner input= new Scanner(System.in);
		
	    int heute= input.nextInt();
	    
	    System.out.print("Geben Sie eine Zahl,"
	    		+ " die seit heute vergingen:");
	    
	    int vergingen= input.nextInt();
	    
	    int zukunft= (heute+vergingen)%7; 
	    
	    System .out .print( "Heute ist");
	    
	    switch(heute) {
	    case 0: System.out.print(" Sontag "); break;
	    case 1: System.out.print(" Montag "); break;
	    case 2: System.out.print(" Dienstag "); break;
	    case 3: System.out.print(" Mitwoch "); break;
	    case 4: System.out.print(" Donnerstag "); break;
	    case 5: System.out.print(" Freitag "); break;
	    case 6: System.out.print(" Samstag "); break;	    
	    
	    }
	    
	    System.out.print("und Zukunftag ist");
	    switch(zukunft) {
	    case 0: System.out.print(" Sontag "); break;
	    case 1: System.out.print(" Montag "); break;
	    case 2: System.out.print(" Dienstag "); break;
	    case 3: System.out.print(" Mitwoch "); break;
	    case 4: System.out.print(" Donnerstag "); break;
	    case 5: System.out.print(" Freitag "); break;
	    case 6: System.out.print(" Samstag "); break;	    
	    
	    }
	 	
		
	}

}
