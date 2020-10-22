package chapter13.Exercise03;

import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Number> list= new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			list.add((Number)(Math.random()*10));
		}
		System.out.println("Befor sort");
		printList(list);
		
		System.out.println("******************");
		
		sort(list);
		System.out.println("After sort");
		
		printList(list);
		
	}		
		
	public static void sort(ArrayList<Number> list) {
			
		for(int i=0; i<list.size()-1;i++) {
			Number min= list.get(i);
			int minIndex= i;
				
			for(int j=i+1; j<list.size();j++) {
				if(min.doubleValue()>list.get(j).doubleValue()) {
					min= list.get(j).doubleValue();
					minIndex= j;						
				}					
			}
				
			if(minIndex!=i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}				
		}		
	}
	
	private static void printList(ArrayList<Number> list) {
		for (Number n: list) {
			System.out.print(n+ " ");		
		}
		System.out.println();
	}	
}