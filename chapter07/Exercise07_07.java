package chapter07;

public class Exercise07_07 {

	public static void main(String[] args) {
		int[] sayac= new int[100];
		
		
		for (int i=0;i< 100;i++) {
			int sayi= (int)(Math.random()*10);
			sayac[sayi]++;
			 
		 }
		
		for  (int i=0;i< 10;i++) {
			
			System.out.println(i+"  "+sayac[i]+ "   defa üretildi"); 
			
		}
		
	
	}

}
