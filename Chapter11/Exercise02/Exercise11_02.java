package Chapter11.Exercise02;

public class Exercise11_02 {

	public static void main(String[] args) {
		
	    Person person1 = new Person("Ali", "1. Cadde No:1", "0111 111 11 11",
	      "ali@gmail.com");
	    
	    Student student = new Student("Veli", "2. Cadde No:2", "0222 222 22 22",
	      "veli@gmail.com", Student.FRESHMAN);
	    
	    Employee employee = new Employee("Ayse", "3. Cadde No:3", "0333 333 33 33",
	      "ayse@gmail.com", "Ofis No 1", 2000.0);
	    
	    Faculty faculty = new Faculty("Hasan", "4. Cadde No:4", "0444 444 44 44",
	      "hasan@gmail.com", "Ofis No 2", 3000.0, "08.30 AM-05.00PM", "professor");
	    
	    Staff staff = new Staff("Fatma", "5. Cadde No:5", "555-555-5555",
	      "fatma@gmail.com", "Ofis No 3", 2500.0, "Chief");

	    System.out.println(person1);
	    System.out.println(student);
	    System.out.println(employee);
	    System.out.println(faculty);
	    System.out.println(staff);
	}
}
