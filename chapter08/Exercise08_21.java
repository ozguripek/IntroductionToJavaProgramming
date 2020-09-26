package chapter08;
import java.util.Scanner;

public class Exercise08_21 {
	 public static void main(String[] args) {
		   
		 Scanner input = new Scanner(System.in);		 
		 System.out.print("Enter the number of cities: ");		 
		 double[][] cities = new double[input.nextInt()][2];
		    
		 System.out.print("Enter the coordinates of the cities: ");
		 for (int i = 0; i < cities.length; i++) {
			 cities[i][0] = input.nextDouble();
			 cities[i][1] = input.nextDouble();
		    }
		 
		    int index = -1;
		    double shortestTotalDistance = Double.MAX_VALUE;
		    double totalDistance;
		    for (int i = 0; i < cities.length; i++) {
		      totalDistance = 0.0;
		      for (int j = 0; j < cities.length; j++) {
		        totalDistance += distance(cities[i][0], cities[i][1], cities[j][0],
		          cities[j][1]);
		      }
		      if (totalDistance < shortestTotalDistance) {
		        shortestTotalDistance = totalDistance;
		        index = i;
		      }
		    }

		    System.out.println("The central city is at (" + cities[index][0] + ", " 
		    											  + cities[index][1] + ")");
		    
		    		//+ getLocString(cities[index]));
		    System.out.println("The total distance to all other cities is " +
		      shortestTotalDistance);
	}

	/* public static String getLocString(double[] loc) {
		    return "(" + loc[0] + ", " + loc[1] + ")";
	}*/

	public static double distance(double x1, double y1, double x2, double y2) {
		    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

		
}
