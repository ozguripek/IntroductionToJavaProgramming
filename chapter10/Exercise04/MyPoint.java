package chapter10.Exercise04;

public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
		this(0,0);	
	}
	
	public MyPoint(double x, double y) {	
		this.x=x;
		this.y=y;
	}
	
	public double distance(MyPoint myPoint) {
		return Math.sqrt(Math.pow(myPoint.getX()-x, 2) + Math.pow(myPoint.getY()-y, 2));
	}
	
	public double distance(double x, double y) {
		return distance(new MyPoint(x, y));		
	}	
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
