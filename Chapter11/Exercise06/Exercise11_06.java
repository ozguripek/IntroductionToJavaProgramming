package Chapter11.Exercise06;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_06 {
	public static void main(String[] args) {
		
		ArrayList<Object> o1 = new ArrayList<>();
		o1.add(new Loan());		
		o1.add(new Date());		
		o1.add(new String("Hello world"));	
		o1.add(new Circle());	

		for (int i = 0; i < o1.size(); i++) {
			System.out.println(((i+1)+". " + o1.get(i)).toString());
		}
	}
}
