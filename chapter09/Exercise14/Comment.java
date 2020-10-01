package chapter09.Exercise14;

public class Comment{
	

	String text;
	String ürünAdi;
	
	
	Comment(String text, String ürünAdi)  {
		this.text= text;
		this.ürünAdi=  ürünAdi;;	
		
	}
	
	public static boolean isValid(String text) {
		
		String[] küfür= {"shit", "idiot", "dumb"};
		
		for(int i=0; i<küfür.length; i++) {
			if(text.contains(küfür[i])) {
				return false;
			}
			
		}
		return true;
	}
	
	
	public boolean contains(String string) {
		
		return true;
	}
	
	
	
	

}
