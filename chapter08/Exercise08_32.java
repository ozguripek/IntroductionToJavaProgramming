package chapter08;
import java.util.Scanner;

public class Exercise08_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] points = new double[3][2];

		System.out.println("Enter three points of a triangle:");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		if (getTriangleArea(points) == 0)
			System.out.println("The three points are on the same line");
		else
			System.out.printf("The area of the triangle is %.2f\n", 
					getTriangleArea(points));
	}

	/** getTriangleArea returns the area of a triangle */
	public static double getTriangleArea(double[][] points) {
		double[] side = new double[3]; 

		side[0] = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) + 
				            Math.pow(points[1][1] - points[0][1], 2));

		side[1] = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) + 
				            Math.pow(points[2][1] - points[1][1], 2));

		side[2] = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + 
				            Math.pow(points[0][1] - points[2][1], 2));

		
		double s = (side[0]+ side[1]+ side[2])/2;;
		double area = Math.pow(s * (s - side[0]) * (s - side[1]) * (s - side[2]), 0.5);
		System.out.println(area);
		return area;
		
	}
}
