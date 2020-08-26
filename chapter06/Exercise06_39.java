package chapter06;

import java.util.Scanner;

public class Exercise06_39 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
				
		if(onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
			
			System.out.print("("+x2+", "+y2+")"+"is on the line segment "
					+ "from (1.0, 1.0) to (2.0, 2.0)");
			
		}
				
		else if(onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			
			System.out.print("("+x2+", "+y2+")"+"is on the same line "
					+ "from (1.0, 1.0) to (2.0, 2.0)");
			
		}
		
		else if(leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.print("("+x2+", "+y2+")"+"is on left side of the line "
					+ "from (1.0, 1.0) to (2.0, 2.0)");
		}
		
		else {			
			System.out.print("("+x2+", "+y2+")"+"is on right side of the line "
					+ "from (1.0, 1.0) to (2.0, 2.0)");
			
		}
		
		
		
		
	}
	public static boolean leftOfTheLine(double x0, double y0, 
			double x1, double y1, double x2, double y2) {
		
		if(position(x0, y0, x1, y1, x2, y2)>0) {
			return true;
		}
		else return false;
		
		
	}
	public static boolean onTheSameLine(double x0, double y0,
			double x1, double y1, double x2, double y2) {
		
		if(position(x0, y0, x1, y1, x2, y2)==0) {
			return true;
		}
		else return false;
		
		
	}
	public static boolean onTheLineSegment(double x0, double y0, 
			double x1, double y1, double x2, double y2) {
		
		if( position(x0, y0, x1, y1, x2, y2) == 0 &&
				 (x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1)) {
			return true;
		}
		else return false;
	
	}
	public static double position(double x0, double y0, 
			double x1, double y1, double x2, double y2) {
	double position = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
	
	return position;
	}
}
