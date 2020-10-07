package chapter10.Exercise23;

public class MyString2 {
	private String s;

	public MyString2(String s) {
		this.s = "";
		for (int i = 0; i < s.length(); i++) {
			this.s += s.charAt(i) + "";
		}
	}


	public int compare(String s) {
		int index = 0;
		if (this.s.length() < s.length())
			index = -1;
		if (s.length() < this.s.length())
			index = 1; 


		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) < s.charAt(i))
				index = -(i + 1);
			if (this.s.charAt(i) > s.charAt(i))
				index = i + 1;
		}
		return index;
	}

	public MyString2 substring(int begin) {
		String b = "";
		for (int i = begin, j = 0; i < s.length(); i++, j++) {
			b += s.charAt(i) + "";
		}
		return new MyString2(b);
	}

	public MyString2 toUpperCase() {
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			if ('a'<=s.charAt(i) && s.charAt(i) <= 'z')
				n += String.valueOf((char)(s.charAt(i) - 32));
			else
				n += String.valueOf(s.charAt(i));
		}
		return new MyString2(n);
	}

	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}

}

