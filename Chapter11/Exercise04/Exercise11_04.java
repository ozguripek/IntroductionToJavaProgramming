package Chapter11.Exercise04;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter a sequence of numbers ending wih 0: ");
		while (true) {
		      int element = input.nextInt();
		      if (element == 0) { 
		    	  break; 
		      }
		      list.add(element);
		}

		System.out.println("The largest number in the input is " + max(list));
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
}
