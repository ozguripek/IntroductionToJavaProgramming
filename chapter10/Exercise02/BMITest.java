package chapter10.Exercise02;

public class BMITest {

	public static void main(String[] args) {
		BMI bmi1 = new BMI("Ali", 18, 145, 5, 10);
		System.out.println("The BMI for " + bmi1.getName() + " is "
			+ bmi1.getBMI() + " " + bmi1.getStatus());

		BMI bmi2 = new BMI("Veli", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is "
			+ bmi2.getBMI() + " " + bmi2.getStatus());
		
		BMI bmi3= new BMI ("", 20, 87, 50);
		System.out.println("The BMI for " + bmi3.getName() + " is "
				+ bmi3.getBMI() + " " + bmi3.getStatus());

	}

}
