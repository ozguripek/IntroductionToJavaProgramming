package chapter08;
import java.util.Scanner;
public class Exercise08_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[][] points = new double[5][2];
		
		System.out.print("Enter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("The five points are "); 
			if (!sameLine(points)){
					System.out.print("not ");
					} 
			System.out.print("on the same line");			
				
	}

	public static boolean sameLine(double[][] points) {
		for (int i = 0; i < points.length - 2; i ++) {
			if (position(points[i][0], points[i][1], 
					      points[i + 1][0], points[i + 1][1],
					      points[i + 2][0], points[i + 2][1]) != 0) {
				return false;
			}
		}
		return true;
	}

	public static double position(double x0, double y0,
	double x1, double y1, double x2, double y2) {
		
		double position = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
		
		return position;
		
	}
}
