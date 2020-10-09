package Chapter11.Exercise02;

public class Faculty extends Employee {
	  
	private String officeHours;
	private String rank;

	  
	public Faculty(String name, String address, String phone, 
				   String email, String office, double salary, String officeHours, 
			       String rank) {
		super(name, address, phone, email, office, salary);
	    this.officeHours = officeHours;
	    this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}
	
	public String getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "class: Faculty\nname: " + getName();
	}
}