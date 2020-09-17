package chapter08;
import java.util.Scanner;
public class Exercise08_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int pointNumber  = input.nextInt();
		double[][] points = new double[pointNumber][2];
		
		
		  for (int i = 0; i < points.length; i++) {
			  System.out.print("Enter " + (i+1) + ". point X : ");
			points[i][0] = input.nextDouble();
				System.out.print("Enter " + (i+1) + ". point Y : ");
			points[i][1] = input.nextDouble();
		  }
		
		
		int row1 = 0, row2 = 1; 
		double shortestDistance = distance(points[row1][0], points[row1][1],
			                               points[row2][0], points[row2][1]); 

		
		for (int i = 0; i < points.length-1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1],
					                       points[j][0], points[j][1]); 

				if (shortestDistance > distance) {
					row1 = i;
					row2 = j; 
					shortestDistance = distance; 
				}
			}
		}

		
		for (int i = 0; i < points.length-1; i++) {
			for (int j = i+1; j < points.length; j++) {
				if (distance(points[i][0], points[i][1],
					points[j][0], points[j][1]) == shortestDistance)
					System.out.println("The closest two points are " +
						"(" + points[i][0] + ", " + points[i][1] + ") and (" +
							points[j][0] + ", " + points[j][1] + ")");
			}
		}
		System.out.println("Their distance is " + shortestDistance);
	}

	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) +  Math.pow(y2 - y1, 2));
	}
}

