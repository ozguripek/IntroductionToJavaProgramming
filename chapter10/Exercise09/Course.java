package chapter10.Exercise09;

public class Course {
	private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {		
		if (numberOfStudents == students.length) {
			String[] temp = new String[students.length + 1];
			for (int i = 0; i < students.length; i++) {
				temp[i] = students[i];
			}
			students = temp;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		int index=-1;
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				index=i;
			}
		}
		if(index==-1) {
				System.out.println(student + " is not in the course: " + courseName);
		}
		else {
		String[] temp = new String[students.length - 1];
		for (int i = 0, j = 0; i < temp.length; i++, j++) {
			if (i == index) {
				j++;
			}
			temp[i] = students[j];
		}
		this.students = temp;
		numberOfStudents--;	
		}	
	}	
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}
	
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}	
	
}
