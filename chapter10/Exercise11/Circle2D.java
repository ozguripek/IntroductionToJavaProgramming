package chapter10.Exercise11;

public class Circle2D {
	private double x,y;// that specify the center of the circle with getter methods.
	private double radius;// with a getter method.
	
	public Circle2D(){
		x=0;
		y=0;
		radius=1;		
	}
	
	public Circle2D(double x, double y,double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;	
	}
	public  double getArea() { 
		return Math.PI * Math.pow(radius, 2);		 
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	//if the specified point (x, y) is inside this circle
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
	}
	//if the specified circle is inside this circle
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2)) 
				 <= Math.abs(radius - circle.getRadius());
	}	
	//if the specified circle overlaps with this circle 	
	public boolean overlaps(Circle2D circle) { 
		return Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2)) 
				 <= radius + circle.getRadius(); 
	}
	
	public double getX() {
		return x;
	}	
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}	
}
