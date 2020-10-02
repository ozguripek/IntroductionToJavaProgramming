package chapter10.Exercise09;

public class TestCourse {

	public static void main(String[] args) {
		
		Course java = new Course("Java");
		
		java.addStudent("Özgür");
		java.addStudent("Melike");
		java.addStudent("Erol");
		print(java);
		
		System.out.println(java.getNumberOfStudents());
		java.dropStudent("Özgür");
		print(java);
		java.dropStudent("Ahmet");
		print(java);
		
		print(java);
	}

	private static void print(Course java) {
		System.out.println("\nThe students in the course " + java.getCourseName() + ":");
		String[] students = java.getStudents();
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i] + " ");
		}
		System.out.println();
	}
}