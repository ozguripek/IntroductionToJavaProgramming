package chapter06;

import java.util.Scanner;

public class Exercise06_08 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
				
		System.out.print("Enter celsius: ");
		double	celsius= input.nextDouble();
		double fahrenheit =celsiusToFahrenheit(celsius);
		System.out.println("fahrenheit: "+fahrenheit);
		
		System.out.print("Enter fahrenheit: ");
		double	fahrenheit2= input.nextDouble();
		double celsius2 =fahrenheitToCelsius(fahrenheit);
		System.out.println("celcius: "+ celsius2);
		
		
	}
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		return fahrenheit;
	
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		      
	     double celsius = (5.0 / 9) * (fahrenheit - 32);
	     return celsius;
	}
}
