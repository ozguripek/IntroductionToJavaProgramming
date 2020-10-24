package chapter13.Exercise09;

public class Circle extends GeometricObject implements Comparable<Circle> {
	
	  private double radius;

	  public Circle() {
	  }

	  public Circle(double radius) {
	    this.radius = radius;
	  }

	  public Circle(double radius, String color, boolean filled) {
	    this.radius = radius;
	    setColor(color);
	    setFilled(filled);
	  }

	  public double getRadius() {
	    return radius;
	  }

	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  public double getArea() {
	    return radius * radius * Math.PI;
	  }

	  public double getDiameter() {
	    return 2 * radius;
	  }

	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }

	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }

	  @Override
	  public boolean equals(Object o) {
			return this.compareTo((Circle)o) == 0;
	  }

	 @Override 
	 public int compareTo(Circle o) {
			if (this.radius > o.radius)
				return 1;
			else if (this.radius < o.radius)
				return -1;
			else
				return 0;
	 }
}



