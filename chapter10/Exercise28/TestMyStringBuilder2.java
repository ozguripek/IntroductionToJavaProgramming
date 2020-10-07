package chapter10.Exercise28;

public class TestMyStringBuilder2 {

	public static void main(String[] args) {
		
		MyStringBuilder2 str1 = new MyStringBuilder2("testString");
		
		char[] chars = {'I', 'n', 's', 'e', 'r', 'T'};		
		MyStringBuilder2 str2 = new MyStringBuilder2(chars);

		System.out.print("\n1. Insert string 2 into string 1 at index 3: ");
		MyStringBuilder2 str3 = str1.insert(2, str2);
		System.out.println(str3);

		System.out.println("\n2. Reverse string 1: " + str1.reverse());

		System.out.println("\n3. Substring of string 3 beginning index 10: " + 
			str3.substring(10));

		System.out.println("\n4. String 2 to upper case: " + str2.toUpperCase());
	}
}
