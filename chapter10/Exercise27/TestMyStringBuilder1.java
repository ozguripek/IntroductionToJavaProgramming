package chapter10.Exercise27;

public class TestMyStringBuilder1 {

	public static void main(String[] args) {
	
		MyStringBuilder1 str1 = new MyStringBuilder1("TEST");

		System.out.println("\n1. Append the string \" MyStringBuilder1\" to string: " + 
			str1.append(new MyStringBuilder1(" MyStringBuilder1")));

		System.out.println("\n2. Append integer 66 to the string: " + str1.append(66));

		System.out.println("\n3. Length of string: " + str1.length());

		System.out.println("\n4. Character at index 2: " + str1.charAt(2));

		System.out.println("\n5. String to lower case: " + str1.toLowerCase());

		System.out.println("\n6. Substring of string from index 1 to 3: " + str1.substring(1, 3));

		System.out.println("\n7. Display string: " + str1.toString());
	}
}
