package chapter13.Exercise10;

public class Exercise13_10 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3, 5);
		Rectangle r2 = new Rectangle(5, 3);
		Rectangle r3 = new Rectangle(4, 5);

		System.out.println("Rectangle1 Area :" + r1.getArea());
		System.out.println("Rectangle2 Area :" + r2.getArea());
		System.out.println("Rectangle3 Area :" + r3.getArea());

		System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
			"equal to Rectangle2");

		System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
			"equal to Rectangle3");

	}

}
