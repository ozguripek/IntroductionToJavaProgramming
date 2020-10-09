package Chapter11.Exercise05;

public class Exercise11_05 {

	public static void main(String[] args) {
		Course course1 = new Course("Java");
		Course course2 = new Course("C++");

		course1.addStudent("Erol");
		course1.addStudent("Ali");
		course1.addStudent("Veli");

		course2.addStudent("Hasan");
		course2.addStudent("Hüseyin");

		System.out.println("Number of students in course1: "+ course1.getNumberOfStudents());
		
		String[] c1 = course1.getStudents();
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i] + ", ");
		}
		
		System.out.println("******************************");
		
		System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
		String[] c2 = course2.getStudents();
		for (int i = 0; i < c2.length; i++) {
			System.out.println(c2[i] + ", ");
		}
	}
	
}
