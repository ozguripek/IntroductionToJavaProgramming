package chapter05;

import java.util.Scanner;

public class Exercise05_30 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Meblagi giriniz: ");
		double meblag= input.nextDouble();
		
		System.out.println("Yillik faiz oranini giriniz(örnegin 0,05): ");
		double faiz= input.nextDouble();
		
		System.out.println("Ilgili ayi giriniz: ");
		int ay=input.nextInt();
		
		double toplamTutar=0;
		for(int i=1;i<=ay;i++) {
			toplamTutar=(meblag+toplamTutar)+(1+faiz/12);
		}
		System.out.println(ay+". ayin sonunda toplam paraniz= "+toplamTutar);

	}

}
