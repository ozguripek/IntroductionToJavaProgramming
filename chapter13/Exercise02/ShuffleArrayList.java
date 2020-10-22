package chapter13.Exercise02;

import java.util.ArrayList;

public class ShuffleArrayList {

	public static void main(String[] args) {
		ArrayList<Number> list= new ArrayList<>();
		
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		shuffle(list);
		
		for (Number n: list) {
			System.out.print(n+ " ");
		}
		
	}
	
	public static void shuffle(ArrayList<Number> list) {
		
		for (int i=0; i<list.size(); i++) {
			int index= (int)(Math.random()* list.size());
			Number temp= list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}
		
	}

}
