package chapter05;

public class Exercise05_43 {

	public static void main(String[] args) {
		int sayac=0;
		for(int i=1;i<=7;i++) {
			
			for(int j=i+1;j<=7;j++) {
				
					sayac++;
					System.out.println(i+""+j);
				}
			}
		System.out.println("The total number of all combinations is: "+sayac);
	}
		
}


