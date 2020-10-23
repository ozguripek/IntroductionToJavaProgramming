package chapter13.Exercise05;

public class TestGeometricObject {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(5, "red", true);
		Circle circle2 = new Circle(3, "yellow", false);
		
		System.out.println("\nCircle 1: ");
		print(circle1);
		
		System.out.println("\nCircle 2: ");
		print(circle2);

		System.out.println("\nThe larger of the two circles is ");
		print(Circle.max(circle1, circle2));

		System.out.println("\n************************************");
		
		Rectangle rectangle1 = new Rectangle(1, 2, "green", true);
		Rectangle rectangle2 = new Rectangle(2, 3, "black", true);

		System.out.println("\nRectangle 1: ");
		print(circle1);

		System.out.println("\nRectangle 2: ");
		print(circle2);

		System.out.println("\nThe larger of the two rectangles is ");
		print(Rectangle.max(rectangle1, rectangle2));
	}
	
	public static void print(GeometricObject o) {
		System.out.println(o.toString());
	}
}