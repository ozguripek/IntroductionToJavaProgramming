package chapter06;

public class Exercise06_32 {

	public static void main(String[] args) {
		int point=0;
		int toplam=0;
		int kazandinSayac=0;
		int kaybettinSayac=0;
		for(int i=1; i<=1000; i++){
		
		int zar1= zarAt();
		int zar2=zarAt();
		System.out.println("You rolled "+zar1+" + "+zar2);
		toplam= zar1+zar2;
		if(toplam==2||toplam==3||toplam==12) {
			 kaybettinSayac++;
		}
		else if(toplam==7||toplam==11) {
			kazandinSayac++;
		}	
		}
		System.out.println(kazandinSayac+" defa kazandin."
				+ kaybettinSayac+" defa kaybettin.");
		
	}
	
	
	
	public static int zarAt() {
		double zar= (Math.random()*6)+1;
		return (int)zar;
	}
	
	public static int toplamiKontrolEt(int toplam) {
		int point=0;
		switch(toplam) {
		case 2:point=2; System.out.println("you lose");break;
		case 3:point=3;System.out.println("you lose");break;
		case 12:point= 12; System.out.println("you lose");break;
		case 7: point=7;System.out.println("you win");break;
		case 11:point=11;System.out.println("you win");break;
		case 5:point=5; System.out.println("point is "+point);break;
		case 6:point=6; System.out.println("point is "+point);break;
		case 8:point=8; System.out.println("point is "+point);break;
		case 9:point=9; System.out.println("point is "+point);break;
		case 10:point=10; System.out.println("point is "+point);break;
		}
		return point;
		
		}
		
		
		
		
}
