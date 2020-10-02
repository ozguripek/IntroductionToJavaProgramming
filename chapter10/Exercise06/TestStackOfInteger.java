package chapter10.Exercise06;

public class TestStackOfInteger {

	public static void main(String[] args) {
		
		StackOfIntegers stack1 = new StackOfIntegers();

		for (int i = 2; i < 120; i++) {
			if (isPrime(i))
			stack1.push(i);//Stores an integer into the top of the stack.
		}

		System.out.println("\nAll the prime numbers less than 120 in decreasing order:");
		while (!stack1.empty()) {
				System.out.print(stack1.pop() + " ");// removes the integer at the top of the stack and returns it
				}
				System.out.println();
			}

	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) { 
				return false;
			}
		}
		return true;
	}
}
