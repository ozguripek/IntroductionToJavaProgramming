package chapter04;
import java.util.Scanner;

public class Exercise04_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the side of a hexagon
		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		// Compute the area of a hexagon
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

		// Display result
		// toplam 4 digit virgülden sonra 2 digit yaz sonra alt satira in
		//System.out.printf("The are of the hexagon is %4.2f\n", area);
		
		System.out.println("The are of the hexagon is " + (int)(area*100)/100.0);
	}
}