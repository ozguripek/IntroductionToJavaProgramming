package chapter06;

public class Exercise06_06 {

		public static void main(String[] args) {
		int satirSayisi=9;
		displayPattern(satirSayisi);
			
		
		}
		
		public static void displayPattern(int n) {
			int boslukMiktari= n-1;//son satirda bosluk olmamasi icin
			
			
			for(int satirSayisi=1;satirSayisi<=n;satirSayisi++ ) {//satir sayisi belirleme
				
								
				for (int j=0;j<boslukMiktari;j++) {//her satirda bosluk sayisi kadar" "atsin
					System.out.print("   ");
				}
				
				for (int rakam=satirSayisi; rakam>0; rakam--) {// rakami satir sayisindan baslatip azaltarak yazdir
					System.out.print(rakam+"  ");
				}
				System.out.println();
				boslukMiktari--;// bosluk sayisini azalt
			}
			
		}
}






