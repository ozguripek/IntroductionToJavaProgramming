package chapter02;
import java.util.Scanner;

public class Exercise02_18 {

	public static void main(String[] args) {
		
System.out.println("a      b      pow(a, b)");
		
	for(float a=1 ; a<=5; ){
	for(float b=2 ; b<=6; ){
	System.out.println((int)a + "      " + (int)b +"      " + (int)Math.pow(a, b));
	a++;
	b++;}
}	

	}
}