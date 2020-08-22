package chapter06;

public class Exercise06_30 {

	public static void main(String[] args) {
		int point=0;
		int toplam=0;
		
		while (toplamiKontrolEt(toplam)!=7) {
		
		int zar1= zarAt();
		int zar2=zarAt();
		System.out.println("You rolled "+zar1+" + "+zar2);
		toplam= zar1+zar2;
			
		}
	}
	
	
	
	public static int zarAt() {
		double zar= (Math.random()*6)+1;
		return (int)zar;
	}
	
	public static int toplamiKontrolEt(int toplam) {
		int point=0;
		switch(toplam) {
		case 2,3,12:System.out.println("you lose");System.exit(0);
		case 7,11:System.out.println("you win");System.exit(0);
		case 5:point=5; System.out.println("point is "+point);break;
		case 6:point=6; System.out.println("point is "+point);break;
		case 8:point=8; System.out.println("point is "+point);break;
		case 9:point=9; System.out.println("point is "+point);break;
		case 10:point=10; System.out.println("point is "+point);break;
		}
		return point;
		
		}
		
		
		
		
}

