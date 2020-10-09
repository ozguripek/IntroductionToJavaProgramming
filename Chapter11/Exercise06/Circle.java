package Chapter11.Exercise06;

public class Circle {
	private double radius = 1;	
	private static int numberOfObjects = 0;

	public Circle() {
		numberOfObjects++;
	}

	public Circle(double radius) {
		this.radius = radius;
		numberOfObjects++;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = (radius >= 0) ? radius : 1;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	
}
