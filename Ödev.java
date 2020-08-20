
public class Ödev {

	public static void main(String[] args) {
		
		System.out.println("[" + reverse("This is interview question") + "]");
		
	}

	private static String reverse(String s) {
		  int k = s.indexOf(" ");
		  System.out.println(k);
		   return k == -1 ? s : reverse(s.substring(k + 1)) + " " + s.substring(0, k);
		   
	}

}
