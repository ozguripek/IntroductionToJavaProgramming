package Chapter11.Exercise02;
import java.util.Date;

public class Employee extends Person {
	  
	  private String office;
	  private double salary;
	  private Date dateHired;

	  public Employee(String name, String address, String phone, String email, String office, double salary){
	    super(name, address, phone, email);
	    this.office = office;
	    this.salary = salary;
	    dateHired = new Date();
	  }
	  public String getOffice() {
	    return office;
	  }

	  public double getSalary() {
	    return salary;
	  }

	  public Date getDateHired() {
	    return dateHired;
	  }

	  @Override
	  public String toString() {
	    return "class: Employee\nname: " + getName();
	  }
}