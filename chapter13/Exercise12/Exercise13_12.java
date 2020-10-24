package chapter13.Exercise12;

public class Exercise13_12 {

	public static void main(String[] args) {
		
		GeometricObject[] array = {new Circle(5), new Circle(10),
				                   new Rectangle(3, 4), new Rectangle(4, 5)};

	    System.out.println("Total area is " + sumArea(array));
	}

	  public static double sumArea(GeometricObject[] geObjArray) {
	    double sum = 0;
	    for (int i = 0; i < geObjArray.length; i++) {
	      sum += geObjArray[i].getArea();
	    }
	    return sum;
	  }

}
