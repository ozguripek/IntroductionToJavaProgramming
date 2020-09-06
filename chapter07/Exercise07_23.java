package chapter07;

public class Exercise07_23 {

	public static void main(String[] args) {
		String[] dolaplar = new String[100];

		
		tümdolaplariKapat(dolaplar);

		
		dolapDurumunuDegistir(dolaplar);
		
		
		acikDolaplariYazdir(dolaplar);
	}

	
	public static boolean acikMi(String dolap) {
		 if(dolap == "OPEN")return true;
		 else return false;
	}

	
	public static void tümdolaplariKapat(String[] dolaplar) {
		for (int i = 0; i < dolaplar.length; i++) {
			dolaplar[i] = "CLOSED";
		}
	}

	
	public static void dolapDurumunuDegistir(String[] dolaplar) {
		
		for (int ögrenci = 1; ögrenci <= dolaplar.length; ögrenci++) {
			for (int i = 0; i < dolaplar.length; i += ögrenci) {
				if (acikMi(dolaplar[i])==true)
					dolaplar[i] = "CLOSED";
				else
					dolaplar[i] = "OPEN";
			}
			
		}
	}

	
	public static void acikDolaplariYazdir(String[] dolaplar) {
		for (int i = 0; i < dolaplar.length; i++) {
			if (acikMi(dolaplar[i])) {
				System.out.print("Dolap " + (i + 1) + ", ");
			}
		}
		System.out.println();
	}
}