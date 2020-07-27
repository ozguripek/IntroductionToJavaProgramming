package chapter03;
import java.util.Scanner;

/*(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve 
 the following 2 * 2 system of linear equation:

ax+by=e  x= ed-bf/ad-bc 
cx+dy=f  y= af-ec/ad-bc

 */

public class Exercise03_03 {

	public static void main(String[] args) {
		
		System.out.println("ax+by=e und cx+dy=f  "
				+ "Geben Sie eine nummer für a, b, c, d, e, f ein:");
		Scanner input= new Scanner(System.in);		
		double a= input.nextDouble();
		double b= input.nextDouble();
		double c= input.nextDouble();
		double d= input.nextDouble();
		double e= input.nextDouble();
		double f= input.nextDouble();
		
		double result= (a*d)-(b*c);
		
		if(result==0) {
			System.out.println("Die Equation hat keine Solution");
						
		}
		else
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}
	}
}
		
	

