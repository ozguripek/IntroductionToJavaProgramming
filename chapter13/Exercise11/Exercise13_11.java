package chapter13.Exercise11;

public class Exercise13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon octagon1 = new Octagon(5);
		
		System.out.println("Octagon:\nArea: " + octagon1.getArea() + 
			               "\nPerimeter: " + octagon1.getPerimeter());

		Octagon octagon2 = (Octagon)octagon1.clone();

		
		if (octagon1.compareTo(octagon2)== 1) {
			System.out.println("Octagon is greather than its clone.");
		}
		else if (octagon1.compareTo(octagon2) == -1) {
			System.out.println("Octagon is less than its clone.");
		}
		else if(octagon1.compareTo(octagon2) == 0) {
			System.out.println("Octagon is equal to its clone.");
		}

	}

}
