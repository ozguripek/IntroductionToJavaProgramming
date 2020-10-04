package chapter10.Exercise15;

public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	public MyRectangle2D() {
		x=0;
		y=0;
		width=1;
		height=1;
	}
	
	public MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public static MyRectangle2D getRectangle(double[][] points) {
		double[] minAndMaxValuesForX=new double[2];
		double[] minAndMaxValuesForY=new double[2];
		final int COLUMN_X = 0;
		final int COLUMN_Y = 1;		
		minAndMaxValuesForX = findMinAndMaxValues(points, COLUMN_X);
		minAndMaxValuesForY = findMinAndMaxValues(points, COLUMN_Y);
		double x = (minAndMaxValuesForX[0] + minAndMaxValuesForX[1]) / 2;
		double y = (minAndMaxValuesForY[0] + minAndMaxValuesForY[1]) / 2;
		double width  = Math.sqrt(Math.pow(minAndMaxValuesForX[1] - minAndMaxValuesForX[0], 2));		
		double height = Math.sqrt(Math.pow(minAndMaxValuesForY[1] - minAndMaxValuesForY[0], 2));;
		
		return new MyRectangle2D(x, y, width, height);
	}

	private static double[] findMinAndMaxValues(double[][] points, int col) {
		double[] minAndMaxValues = new double[2];
		minAndMaxValues[0] = minAndMaxValues[1] = points[0][col];
		for (int i = 0; i < points.length; i++) {
			if (points[i][col] < minAndMaxValues[0])
				minAndMaxValues[0] = points[i][col];
			if (points[i][col] > minAndMaxValues[1])
				minAndMaxValues[1] = points[i][col];
		}
		return minAndMaxValues;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean contains(double x, double y) {
		return getDistance(this.y, y) <= height / 2 && getDistance(this.x, x) <= width / 2; 
	}

	public boolean contains(MyRectangle2D mR) {
		return 
			getDistance(y, mR.getY()) + mR.getHeight() / 2 <= height / 2 && 
		 	getDistance(x, mR.getX()) + mR.getWidth() / 2 <= width / 2 &&
			height / 2 + mR.getHeight() / 2 <= height &&
		 	width / 2 + mR.getWidth() / 2 <= width;
	}	
	public boolean overlaps(MyRectangle2D mR) {
		return !contains(mR) &&
				 ((x + width / 2 > mR.getX() - mR.getWidth()) ||
				 (y + height / 2 > mR.getY() - mR.getHeight())) &&
		  		 (getDistance(y, mR.getY()) < height / 2 + mR.getHeight() / 2) && 
				 (getDistance(x, mR.getX()) < width / 2 + mR.getWidth() / 2);
	}

	private double getDistance(double p1, double p2) {
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}
	
	public double getX() {
		return x;
	}	
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}		
	public void setY(double y) {
		this.x = y;
	}	
	public double getWidth() {
		return width;
	}	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}	
	public void setHeight(double height) {
		this.height = height;
	}	
	
}
