package chapter05;

public class Exercise05_19 {

	public static void main(String[] args) {
		
		
			
		for (int satirNo = 1; satirNo <= 8; satirNo++) {
			// bosluk olusturma
			for (int boslukSayisi = 8 - satirNo; boslukSayisi >= 1; boslukSayisi--) {
				System.out.print("  ");
			}
			
			for (int sag = 1; sag <=(int)(Math.pow(2, satirNo-2)); sag= sag *2) {
				System.out.print(sag + " ");
				}
			
			
			// sag taraf azalan sayilar
			for (double sag = (int)(Math.pow(2, satirNo-1)); sag >= 1; sag=(sag-sag/2)) {
			System.out.print((int)sag + " ");
			}
			
			// alt satira gec
			System.out.println();
		}
}
}