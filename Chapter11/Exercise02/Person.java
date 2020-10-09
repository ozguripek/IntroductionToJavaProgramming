package Chapter11.Exercise02;

public class Person {
	
	private String name;
	private String address;
	private String phone;
	private String email;

	public Person(String name, String address, String phone, String email) {
		this.name 	 = name;
		this.address = address;
		this.phone 	 = phone;
		this.email   = email;
	}
			  
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phone;
	}

	public String getEmailAddress() {
		return email;
	}
	
	@Override
	public String toString() {
		return "class: Person\nname: " + getName();
	}
}
