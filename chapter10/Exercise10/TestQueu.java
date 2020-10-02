package chapter10.Exercise10;

public class TestQueu {

	public static void main(String[] args) {
		
		Queue queue1 = new Queue();
		
		for (int i = 1; i <= 20; i++) {
			queue1.enqueue(i);
		}	

		for (int i = 1; i <= 20; i++) {
			System.out.print(queue1.getElements()[i-1]+ " ");
		}
		System.out.println("\n**************************************************");
		
		// Removes these numbers and displays them
		while (!queue1.empty()) {
			System.out.print(queue1.dequeue() + " ");
		}
		System.out.println();
	}
}
