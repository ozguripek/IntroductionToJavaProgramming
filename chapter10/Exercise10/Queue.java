package chapter10.Exercise10;

public class Queue {
	private int[]elements;// that stores the int values in the queue.
	private int  size;// that stores the number of elements in the queue
	
	public Queue() {
		elements= new int[8];	
	}
	// that adds v into the queue as Last element.
	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;//önce elemani ata sonra artir		
	}	
	// that removes and returns the FIRST element from the queue.	
	public int dequeue() {
		int value = elements[0];
		int[] temp = new int[elements.length-1];
		System.arraycopy(elements, 1, temp, 0, size-1);
		elements = temp;
		size--;
		return value;		
	}
	
	//that returns true if the queue is empty.
	 public boolean empty() {
		 return size == 0;
	 }
	 
	 //that returns the size of the queue.
	 public int getSize() {
		 return size;
	 }

	public int[] getElements() {
			return elements;
	}
}
