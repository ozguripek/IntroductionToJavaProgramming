package chapter05;

public class Exercise05_33 {

	public static void main(String[] args) {
		
		
		
		for(int i=1; i <= 10000;i++) {
			int toplam=0;
			for(int j=1; j<i;j++) {
				
				if (i%j==0) {					
					toplam=toplam+j;									
				}
			}
			if(i==toplam) {
			System.out.println(i);
			}

			
			
		}
		
	}

}
