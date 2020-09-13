package chapter07;
import java.util.Scanner;

public class Exercise07_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		
		System.out.print("Atilacak top miktarini giriniz: ");
		int topMiktari = input.nextInt();

		
		System.out.print("Makinedeki hazne sayisini giriniz: ");
		int hazneMiktari = input.nextInt();
		
		int piramittekiKatSayisi=hazneMiktari-1;

		String[] yol = new String[topMiktari*piramittekiKatSayisi]; 
		int[] hazneler = new int[hazneMiktari];  

		int SagMiktari = 0; 
		// Herbir düsüs Yolundaki Sag miktarini hesapla
		for (int i = 0; i < yol.length; i++) {
			yol[i] = getRandomPath();

			// If if ball path is right increament numberOfRs
			if (yol[i] == "R") {
				SagMiktari++; 
			}

			// Count the number of balls in each slot
			if ((i + 1) % piramittekiKatSayisi == 0) {//Piramitteki kat sayisi kadar düsüs gerceklesti mi
				hazneler[SagMiktari]++; 
				SagMiktari = 0;
			}
		}	

		// topun düsüs yolunu gösterme
		print(yol, piramittekiKatSayisi);
		
		// haznelerdeki top sayisini 0 ile gösterme
		print(hazneler);

	}

	//rastgele sag veya sol üretme
	public static String getRandomPath() {
		if ((int)(Math.random() * 2) == 0)
			return "L";
		else
			return "R";
	}

	//her bir satirda piramidin kat sayisi kadar yön(R veya L) yazdirma
	public static void print(String[] yol, int piramittekiKatSayisi) {
		System.out.println();
		for (int i = 0; i < yol.length; i++)
			System.out.print(((i + 1) % (piramittekiKatSayisi) == 0) ? yol[i] + "\n" : yol[i]);
	}

	// haznelerdeki top kadar 0 yazdirma 
	public static void print(int[] list) {
		int max = max(list);

		while (max > 0) {
			System.out.println();
			for (int i = 0; i < list.length; i++) {
				if (list[i] >= max) {
					System.out.print("O");
				}
				else
					System.out.print(" ");
			}
			max--;
		}
		System.out.println();
	}

	//en büyük sayiyi bulma
	public static int max(int[] list) {
		int max = list[0];

		for (int i = 1; i < list.length; i++) {
			if (list[i] > max)
				max = list[i];
		}
		return max;
	}
}