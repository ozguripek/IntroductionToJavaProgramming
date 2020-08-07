package chapter05;
import java.util.Scanner;

public class Exercise05_02 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int dogruSayisi=0;
		int yanlisSayisi=0;
		
		long baslangicZamani= System.currentTimeMillis();
		for (int i=0;i<10;i++) {	
				
		int sayi1= 1+ (int)(Math.random()*15);
		int sayi2= 1+ (int)(Math.random()*15);
		
		System.out.println( sayi1+ " ve "+ sayi2 +" nin toplamini giriniz:");
		int cevap=input.nextInt();
		
		
		
		if(sayi1+sayi2==cevap) {
			dogruSayisi++;
		}else {
			yanlisSayisi++;
		}
	}
		long bitisZamani= System.currentTimeMillis();
		int süre= (int)(bitisZamani-baslangicZamani)/1000;
		
		System.out.println(süre +" saniyede 10 sorudan "+ dogruSayisi
				+ " adet soruya dogru, "+  yanlisSayisi+" adet soruya yanlis "
						+ "cevap verdiniz." );
		
	}
	
}
