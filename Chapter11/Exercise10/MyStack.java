package Chapter11.Exercise10;

import java.util.ArrayList;

public class MyStack extends ArrayList{
	
	private ArrayList<Object> list;
	
	public MyStack() {		
		list= new ArrayList<Object>();	
	}
	
	public void push(Object o) {		
		list.add(0,o);
	}
	
	public Object peek() {
		return list.get(0);
	}
	
	public Object pop() {		
		Object o= list.get(0);
		list.remove(0);
		return o;		
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}	

}
