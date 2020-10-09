package Chapter11.Exercise01;
import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		Triangle triangle1 = new Triangle(side1, side2, side3);
		triangle1.setColor(color);
		triangle1.setFilled(filled);

		System.out.println(triangle1.toString());
		System.out.println("Area: " + triangle1.getArea());
		System.out.println("Perimeter: " + triangle1.getPerimeter());
		System.out.println("Color: " + triangle1.getColor());
		System.out.println("Triangle is " + (triangle1.isFilled() ? "" : " NOT ") 
			+ "filled");
	}
}
