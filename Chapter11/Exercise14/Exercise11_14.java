package Chapter11.Exercise14;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_14 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		System.out.print("Enter five integers for list1: ");
		fillList(list1);
		System.out.print("Enter five integers for list2: ");
		fillList(list2);
		
		ArrayList<Integer> list3 = union(list1, list2); 
		
		System.out.print("The combined list is: ");
		for (int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i) + " ");
		}		

	}
	
	public static void fillList(ArrayList<Integer> list) {
		Scanner input = new Scanner(System.in);		
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
	}
	
	public static ArrayList<Integer> union( 
			ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> list3= new ArrayList<>();
		
		for(int i=0; i<list1.size();i++) {
			list3.add(list1.get(i));				
		}		
		for(int j=0; j<list1.size();j++) {
			list3.add(list2.get(j));				
		}
		return list3;
			
	}
}


