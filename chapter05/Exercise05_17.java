package chapter05;

import java.util.Scanner;

public class Exercise05_17 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println(" 1 ile 15 arasinda bir sayi giriniz: ");
		int toplamSatirSayisi= input.nextInt();
	
		
		for (int satirNo = 1; satirNo <= toplamSatirSayisi; satirNo++) {
			// bosluk olusturma
			for (int boslukSayisi = toplamSatirSayisi - satirNo; boslukSayisi >= 1; boslukSayisi--) {
				System.out.print("  ");
			}
			// Sol taraf azalan sayilar, ilk satirda bir sey yazmaz
			for (int sol = satirNo; sol >= 2; sol--) {
			System.out.print(sol + " ");
			}
			// sag taraf artan sayilar
			for (int sag = 1; sag <= satirNo; sag++) {
			System.out.print(sag + " ");
			}
			// alt satira gec
			System.out.println();
		}
}
}
