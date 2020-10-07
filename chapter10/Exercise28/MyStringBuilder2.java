package chapter10.Exercise28;

public class MyStringBuilder2 {
	private String s;

	public MyStringBuilder2() {
		s = "";
	}

	public MyStringBuilder2(char[] chars) {
		s = String.valueOf(chars);
	}

	public MyStringBuilder2(String s) {
		this.s = s;
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String newStr = "";
		
		for (int i = 0; i < offset; i++) {
			newStr += this.s.charAt(i) + "";// ilk metinden numaraya kadar al
		}
		newStr += s;// yeni metni ekle
		return new MyStringBuilder2(newStr + substring(offset));// olusan metne offset ten itibaren ilk metinden ekle
	}

	public MyStringBuilder2 reverse() {
		String newStr = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			newStr += s.charAt(i) + "";
		}
		return new MyStringBuilder2(newStr);
	}

	public MyStringBuilder2 substring(int begin) {
		String newStr = "";
		for (int i = begin; i < s.length(); i++) {
			newStr += s.charAt(i) + "";
		}
		return new MyStringBuilder2(newStr);
	}

	public MyStringBuilder2 toUpperCase() {
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				newStr += (char)(s.charAt(i) - 32) + "";
			else
				newStr += s.charAt(i) + "";
		}
		return new MyStringBuilder2(newStr);
	}

	public String toString() {
		return s;
	}

	public int length() {
		return s.length();
	}

	public char charAt(int index) {
		return s.charAt(index);
	}
}
