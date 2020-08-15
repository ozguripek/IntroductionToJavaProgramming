package chapter05;

public class Exercise05_40 {

	public static void main(String[] args) {
		int sonuc=0;
		int sayacYazi=0;
		int sayacTura=0;
		
		for (int i=1;i<=1000000;i++) {
		
			sonuc= (int)(Math.random()*2);
			if(sonuc==0) {
			sayacYazi++;
			}else {
			sayacTura++;
			}
			
		}
		System.out.println(sayacYazi+" "+sayacTura);
	}
}
