package chapter07;

public class Exercise07_13 {

	public static int getRandom(int... numbers) {
		
		int num = 1 + (int)(Math.random() * 54);
		
		for(int i=0; i<numbers.length;i++) {
			
				if ( numbers[i]==num)
					continue;
			}
		return num;
	} 
	
}

