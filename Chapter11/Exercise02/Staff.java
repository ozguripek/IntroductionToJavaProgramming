package Chapter11.Exercise02;

public class Staff extends Employee {
	
	private String title;

	public Staff(String name, String address, String phone, String email,
			     String office, double salary, String title) {
		
		super(name, address, phone, email, office, salary);
		this.title = title;
	}
 
	public String getTitle() {
		return title;
	}
	  
	@Override
	public String toString() {
		return "class: Staff\nname: " + getName();
	}
}