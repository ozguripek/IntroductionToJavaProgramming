package chapter10.Exercise03;

public class MyIntegerTest {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5}; 
		
		// Test MyInteger(), isEven(), isOdd(), isPrime() and getValue()
		System.out.println("\nTest if values are even by using method isEven():");
		for (int i = 0; i < intArray.length; i++) {		
			MyInteger integer = new MyInteger(intArray[i]);
			System.out.println(integer.getValue() + " " + integer.isEven());
		}

		System.out.println("\nTest if values are odd by using method isOdd():");
		for (int i = 0; i < intArray.length; i++) {
			MyInteger integer = new MyInteger(intArray[i]);
			System.out.println(integer.getValue() + " " + integer.isOdd());
		}

		System.out.println("\nTest if values are prime by using method isPrime():");
		for (int i = 0; i < intArray.length; i++) {
			MyInteger integer = new MyInteger(intArray[i]);
			System.out.println(integer.getValue() + " " + integer.isPrime());
		}
		
		// Test MyInteger(int), isEven(int), isOddint(int), isPrime(int) 
		
		System.out.println("\nTest if values are even by using method isEven(int):");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " " + MyInteger.isEven(intArray[i]));
		}

		System.out.println("\nTest if values are odd by using method isOdd(int):");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " " + MyInteger.isOdd(intArray[i]));
		}

		System.out.println("\nTest if values are prime by using method isPrime(int):");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " " + MyInteger.isPrime(intArray[i]));
		}		

		// Test isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
		System.out.println("\nTest if values are even by using method isEven(MyInteger):");
		for (int i = 0; i < intArray.length; i++) {
			MyInteger integer = new MyInteger(intArray[i]);
			System.out.println(integer.getValue() + " " + MyInteger.isEven(integer));
		}

		System.out.println("\nTest if values are odd by using method isOdd(MyInteger):");
		for (int i = 0; i < intArray.length; i++) {
			MyInteger integer = new MyInteger(intArray[i]);
			System.out.println(integer.getValue() + " " + MyInteger.isOdd(integer));
		}

		System.out.println("\nTest if values are prime by using method isPrime(MyInteger):");
		for (int i = 0; i < intArray.length; i++) {
			MyInteger integer = new MyInteger(intArray[i]);
			System.out.println(integer.getValue() + " " + MyInteger.isPrime(integer));
		}

		// Test equals(int) 
		int[] intArray2 = {1, 5, 9};
		MyInteger integer = new MyInteger(9);
		System.out.println("\nTest if " + integer.getValue() + " is equal to the specified value:");
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i] + " " + integer.equals(intArray2[i]));
		}
		// Test equals(MyInteger)
		System.out.println("\nTest if " + integer.getValue() + " is equal to the specified value:");
		for (int i = 0; i < intArray2.length; i++) {
			MyInteger myInteger = new MyInteger(intArray2[i]);	
			System.out.println(intArray2[i] + " " + integer.equals(myInteger));
		}

		// Test parseInt(char[]) and parseInt(String)
		System.out.println("\nTest parseInt(char[]) and parseInt(String):");
		char[] numericCharacters = {'3', '4', '2'};
		String numericString = "658";
		
		System.out.print("\'");
		for (int i = 0; i < numericCharacters.length; i++) {
		 	System.out.print(numericCharacters[i]);
		} 
		System.out.println("\' + \"" + numericString + "\" = " + 
			(MyInteger.parseInt(numericCharacters) + MyInteger.parseInt(numericString)));

	}

}
