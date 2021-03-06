package Chapter11.Exercise15;

import java.util.Scanner;
import chapter10.Exercise04.MyPoint;
import java.util.ArrayList;

public class Exercise11_15 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int numOfPoints = input.nextInt();

        System.out.print("Enter the coordinates of the points: ");
        ArrayList<MyPoint> points = new ArrayList<>();
        for (int i = 0; i < numOfPoints; i++) {
            points.add(new MyPoint(input.nextDouble(), input.nextDouble()));
        }
        System.out.println("The total area is " + getConvexPolygonArea(points));

    }

    public static double getConvexPolygonArea(ArrayList<MyPoint> points) {
        
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < points.size(); i++) {
            int limitIndex = (i + 1) % points.size();
            MyPoint p1 = points.get(i);
            MyPoint p2 = points.get(limitIndex);
            
            sum1 += (p1.getX() * p2.getY());
            sum2 += (p1.getY() * p2.getX());
        }

        double area = 0.5 * (sum1 - sum2);
        return (area > 0) ? area : -area;
    }

}