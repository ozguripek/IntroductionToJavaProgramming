package chapter09.Exercise09;

public class RegularPolygon {
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	
	RegularPolygon(){
		
	}
	RegularPolygon( int numberOfSides, double lengthOfSide){
		n= numberOfSides;
		side= lengthOfSide;		
	}
	
	RegularPolygon( int numberOfSides, double lengthOfSide, double xcoordinate, double ycoordinate){
		n= numberOfSides;
		side= lengthOfSide;	
		x= xcoordinate;
		y= ycoordinate;
	}
	
	public double getPerimeter() {
		 	
		return side * n;
	}
	
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
			
	}

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
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


}
