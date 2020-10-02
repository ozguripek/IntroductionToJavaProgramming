package chapter10.Exercise13;

public class MyRectangle2D {
	private double x,y;//center of the rectangle
	private double width,height;
	
	public MyRectangle2D() { 	
		x=0;
		y=0;
		width=1;
		height=1;	
	}
	public  MyRectangle2D(double x,double y,double width,double height) {
		this.x=x;
		this.y=y;
		this.width= width;
		this.height=height;		
	} 
	public double getArea() {
		return width * height;	
	} 
	public double getPerimeter() {
		return 2 * (width + height);
	} 
	public boolean contains(double x, double y) {
		return getDistance(this.x, x) <= this.width / 2 && getDistance(this.y, y) <= this.height / 2; 
	} 
	public boolean contains(MyRectangle2D r) {
		return 
				getDistance(this.x, r.getX()) + r.getWidth() / 2 <= this.width / 2 &&
				getDistance(this.y, r.getY()) + r.getHeight() / 2 <= this.height / 2 && 			 	
				this.height / 2 + r.getHeight() / 2 <= this.height &&
			 	this.width / 2 + r.getWidth() / 2 <= this.width;
		
	} 
	public boolean overlaps(MyRectangle2D r) {
		return !contains(r) &&
				 ((this.x + this.width / 2 > r.getX() - r.getWidth()) ||
				 (this.y + this.height / 2 > r.getY() - r.getHeight())) &&
		  		 (getDistance(this.y, r.getY()) < this.height / 2 + r.getHeight() / 2) && 
				 (getDistance(this.x, r.getX()) < this.width / 2 + r.getWidth() / 2);
		
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
		this.y = y;
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
