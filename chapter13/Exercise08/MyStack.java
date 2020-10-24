package chapter13.Exercise08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
	
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public MyStack() {		
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override	
	public Object clone() {
		try {	    
			MyStack myStackClone = (MyStack)super.clone();		
			myStackClone.list = copyList();
			return myStackClone;
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}	
	
	private ArrayList<Object> copyList() {
		ArrayList<Object> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			newList.add(list.get(i));
		}
		return newList;
	}	

	@Override 
	public String toString() {
		return ": " + list.toString();
	}
}


