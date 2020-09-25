package chapter09.Exercise13;

public class Location {
	
	public static int row;
	public static int column;
	public static double maxValue;
	
	Location(){
		
	}
	public Location(double[][] a) {
		maxValue = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
  
	}
	
	public static Location locateLargest(double[][] a) {
		return new Location(a);
	}

}
