package chapter13.Exercise07;

public class TestColorable {

	public static void main(String[] args) {
		
		GeometricObject[] squaresArray = {new Square(1), new Square(2), new Square(3), 
				                          new Square(4), new Square(5)};

		for (int i = 0; i < squaresArray.length; i++) {
		 	System.out.println("\nSquare :" + (i + 1));
		 	System.out.println("Area: " + squaresArray[i].getArea());
		 	System.out.println("How to color: " + ((Square)squaresArray[i]).howToColor());
		 } 
	}
}
