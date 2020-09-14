package chapter07;

public class Exercise07_24 {

	public static void main(String[] args) {
		/* toplam 52 kagit
		 * 4 ayri kagit türü
		 * her türden 13 ayri kagit ismi var(Sinek Onlu, Kupa Papazı)
		 */
		
		int[] deste = new int[52];
		int[] kagitTürü = new int[4];

		// baslangicta hepsine bir numara atayalim
		for (int i = 0; i < deste.length; i++)
			deste[i] = i;

	
		desteyiKar(deste);

		int sayac = 0; 
		do {
			kartSec(deste, kagitTürü);
			sayac++;
		} while (!herTürdenBirTaneVarMi(kagitTürü));

		
		print(kagitTürü);

		
		System.out.println("Kart cekme sayisi: " + sayac);
	}

	/** desteyi kar */
	public static void desteyiKar(int[] deste) {
		for (int i = 0; i < deste.length; i++) {
			/* 52 defa, 0 ile 51 arasinda rastgele index üret ve  gelen index ile
			i indexinde halen bulunan icerigi karsilikli degistir*/
			int index = kartSec(deste);
			int temp = deste[i];
			deste[i] = deste[index];
			deste[index] = temp;
		}
	}

	/** desteden 4 defa her bir türden rastgele bir kart sec */
	public static void kartSec(int[] deste, int[] kagitTürü) {
		for (int i = 0; i < kagitTürü.length; i++) {
			kagitTürü[i] = deste[kartSec(deste)];
		}
	}

	/** desteden rastgele bir kart sec ( 0 dan 51 e kadar rastgele bir numara üret */
	public static int kartSec(int[] deste) {
		return (int)(Math.random() * deste.length);
	}

	/** isOneOFEachSuit her kart türünden 1 adet cekildi mi */
	public static boolean herTürdenBirTaneVarMi(int[] kagitTürü) {
		for (int i = 0; i < kagitTürü.length; i++) {
			for (int j = 0; j < kagitTürü.length; j++) {
				if (i != j && (kagitTürü[i] / 13 == kagitTürü[j] / 13))
					return false;
			}
		}
		return true;
	}

	/** cekilen 4 kart türünü yazdir */
	public static void print(int[] kagitTürü) {
		String[] türler = {"Maca", "Kupa", "Karo", "Sinek"};
		String[] isimler = {"As", "2", "3", "4", "5", "6", "7", "8", "9",
								"10", "Vale", "Kiz", "Papaz"};

		for (int i = 0; i < türler.length; i++) {
			System.out.println(isimler[kagitTürü[i] % 13] + " of " + türler[kagitTürü[i] / 13]);
		}
	}
}