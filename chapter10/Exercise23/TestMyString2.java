package chapter10.Exercise23;

public class TestMyString2 {

	public static void main(String[] args) {
		MyString2 str1 = new MyString2("test1");
		MyString2 str2 = new MyString2("qwertzuiop");

		System.out.print("\n1. Compare str1 to \"test1\":");
		System.out.println(str1.compare("test1"));

		System.out.print("\n2. Display a substring if str2 beginning at index 5:");
		print(str2.substring(5));

		System.out.print("\n3. Convert str2 to upper case:");
		print(str2.toUpperCase());

		// Test valueOf(boolean b)
		System.out.print("\n4. Display the boolean value true as a MyStirng2 object:");
		print(MyString2.valueOf(true)); 
	}

	/** Display a MyString2 object */
	public static void print(MyString2 str) {
		print(str.toChars());
	}

	/** Display an array of characters */
	public static void print(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}
}

