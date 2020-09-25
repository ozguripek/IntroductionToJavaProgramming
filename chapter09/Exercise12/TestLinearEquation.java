package chapter09.Exercise12;
import java.util.Scanner;

public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		double[] x= new double[5];
		double[] y= new double[5];
		double[] dizi= new double[6];
		
		for (int i=1; i<5; i++) {
			
			System.out.println("Enter values for x" +i+", y"+i+" : ");
			x[i] = input.nextDouble();
			y[i] = input.nextDouble();
					
			
		}
		double a = y[1] - y[2];
		double b = -1 * (x[1] - x[2]);
		double c = y[3] - y[4];
		double d = -1 * (x[3] - x[4]);
		double e = (y[1] - y[2]) * x[1] - (x[1] - x[2]) * y[1];
		double f = (y[3] - y[4]) * x[3] - (x[3] - x[4]) * y[3];
		
		LinearEquation lE= new LinearEquation(a,b,c,d,e,f);
		if (!lE.isSolvable()) {
		      System.out.println("The two lines are parallel");
		    } else {
		      System.out.println("for the intersecting point x: " + lE.getX() + " y: " + lE.getY());
		    }
		
		
	}

}
