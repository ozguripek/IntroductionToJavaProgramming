package Chapter11.Exercise02;

public class Student extends Person {
	
	private int classStatus;
	
	public static final int FRESHMAN = 0;
	public static final int SOPHOMORE = 1;
	public static final int JUNIOR = 2;
	public static final int SENIOR = 3;

	public Student(String name, String address, String phone, String email, int classStatus){
	    super(name, address, phone, email);
	    this.classStatus = classStatus;
	}
	
	public int getClassStatus() {
		return classStatus;
	}
	@Override
	public String toString() {
		return "class: Student\nname: " + getName();
	}
}
