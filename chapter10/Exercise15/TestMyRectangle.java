package chapter10.Exercise15;

import java.util.Scanner;

public class TestMyRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[][] points = new double[5][2];

		System.out.print("Enter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D mR1 = MyRectangle2D.getRectangle(points);

		System.out.println("The bounding rectangle's center (" + mR1.getX() + ", " + 
			mR1.getY() + "), width " + mR1.getWidth() + ", height " + mR1.getHeight());
	}
}
