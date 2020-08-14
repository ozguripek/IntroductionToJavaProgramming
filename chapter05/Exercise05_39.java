package chapter05;

public class Exercise05_39 {

	public static void main(String[] args) {
		
		
		for (int i=20000; i<100000000; i++){
		
			double commission= ((5000 * 0.08) + (5000 * 0.1) + (0.12*i));
		
			if (commission==30000) {
			System.out.println(" 30000 $ kazanabilmeniz icin"
						+ " yapmaniz gereken yillik satis:"+(10000+i)+"$");
			System.exit(0);
		
			}
			
			
		}
		

	}

}
