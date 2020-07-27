package chapter03;

import java.util.Scanner;

public class Exercise03_01 {
	
	
	public static void main(String[] args) {
		
				
		System.out.println(" Enter values for a, b, and c :");
		
		Scanner input= new Scanner(System.in);
		
		double a= input.nextDouble();	
		
		double b= input.nextDouble();
		
		double c= input.nextDouble();
		
		
		double discriminant= Math.pow(b, 2) - (4*a*c);
		
		double r1= (-b + Math.pow(discriminant, 0.5))/(2*a);
		
		double r2= (-b - Math.pow(discriminant, 0.5))/(2*a);
		
		   if(discriminant<0) {
			   System.out.println("the equation has no real roots");
			   }
		   
		   else if( discriminant== 0) {
				System.out.println("the equation has one roots: " +r1);					
				}
		   
		   else {System.out.println("the equation has two roots" +
				r1+"  "+r2);
			}
			
		}
				
	
	}		
	


