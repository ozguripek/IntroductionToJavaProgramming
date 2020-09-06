package chapter07;
import java.util.Scanner;

public class Exercise07_25 {

	public static void main(String[] args) {
		double[] eqn= new double[3];
		double[]roots= new double[3];
		System.out.println(" Enter values for a, b, and c :");
		
		Scanner input= new Scanner(System.in);
		for( int i=0; i<eqn.length; i++) {
		eqn[i]= input.nextDouble();	
		
		}
		
	solveQuadratic(eqn, roots);

	}
	public static void solveQuadratic(double[] eqn, double[] roots) {
		
		double discriminant= Math.pow(eqn[1], 2) - (4*eqn[0]*eqn[2]);
		
		roots[0]= (-eqn[1] + Math.pow(discriminant, 0.5))/(2*eqn[0]);
		
		roots[1]= (-eqn[1] - Math.pow(discriminant, 0.5))/(2*eqn[0]);
		
		if(discriminant<0) {
			   System.out.println("the equation has no real roots");
			   }
		   
		   else if( discriminant== 0) {
				System.out.println("the equation has one roots: " +roots[0]);
				
				}
		   
		   else{ System.out.println("the equation has two roots" +
				   roots[0]+"  "+roots[1]);
		   	  
		   	   
		   	   }
		
		
		
	}
			
}
		
		
		


