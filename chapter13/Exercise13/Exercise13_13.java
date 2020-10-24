package chapter13.Exercise13;

public class Exercise13_13 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course c1 = new Course("Java");
	    c1.addStudent("Ali");
	    c1.addStudent("Veli");
	    c1.addStudent("Cemal");

	    Course c2 = (Course) c1.clone();
	    c2.addStudent("Hasan");
	    c2.addStudent("Hüseyin");
	    
	    System.out.println("\nCourse1: ");
	    printList(c1);
	    System.out.println("\nCourse2: ");
	    printList(c2);
	}

	public static void printList(Course course) {
		  
		 System.out.println("\nNumber of students in "+ course.getCourseName()+ " course: "+ 
		 + course.getNumberOfStudents());
		 String[] students = course.getStudents();
		  
		 for (int i = 0; i < course.getNumberOfStudents(); i++) {
		    System.out.print(students[i] + ", ");
		 }
			System.out.println();
	}

}
