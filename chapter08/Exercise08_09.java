package chapter08;
import java.util.Scanner;

public class Exercise08_09 {

	public static void main(String[] args) {
		
		String [][] oyunTahtasi = yeniOyunTahtasiOlustur();

		String[] players = {" X "," O "};

		int result;//0 kazandi, 1 berabere, 2 devam, 

		
		do {
			oyunTahtasiniYazdir(oyunTahtasi);
			
			int[] hücreKoordinati = hamleAl(oyunTahtasi, players[0]);
			
			hamleyiOyuncuSimgesiyleIlgiliHücreyeAl(oyunTahtasi, hücreKoordinati, players[0]);
	
			result = durumKontrolüYap(oyunTahtasi, players[0]);

			if (result == 2) {
				oyuncuDegistir(players);
			}

		} while(result == 2);

		oyunTahtasiniYazdir(oyunTahtasi);

		if (result == 0)
			System.out.println(players[0] + "player won");
		else
			System.out.println("Players draw");

	}
	
	public static String[][] yeniOyunTahtasiOlustur() {
		
		String[][] m = new String[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					m[i][j] = "   ";
			}
		}
		return m;
	}
	
	public static void oyunTahtasiniYazdir(String[][] m) {
		
		System.out.println("\n-------------");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("|" + m[i][j]);
			}
			System.out.println("|\n-------------");
		}
	}
	
	public static int[] hamleAl(String[][] matrix, String player) {
		
		Scanner input = new Scanner(System.in);
		
		int[] hücreKoordinati = new int[2]; 

		do {
		System.out.print("Enter a row(0, 1, or 2) for player " + player + ": ");
			hücreKoordinati[0] = input.nextInt();
		System.out.print("Enter a column(0, 1, or 2) for player " + player + ": ");
			hücreKoordinati[1] = input.nextInt();

		} while (!gecerliHücreGirisiMi(matrix, hücreKoordinati));
		
		return hücreKoordinati;
	}
	
	public static boolean gecerliHücreGirisiMi(String[][] matrix, int[] hücreKoordinati) {
		for (int i = 0; i < hücreKoordinati.length; i++) {
			if (hücreKoordinati[i] < 0 || hücreKoordinati[i] >= 3) {
				System.out.println("Invalid cell");
				return false;
			}
		}
		if (matrix[hücreKoordinati[0]][hücreKoordinati[1]] != "   ") {
			System.out.println(
				"\nRow " + hücreKoordinati[0] + " column " + hücreKoordinati[1] + " is filled");
			return false;
		}
		return true;		
	}
	
	public static void hamleyiOyuncuSimgesiyleIlgiliHücreyeAl(String[][] matrix,
			int[] hücreKoordinati, String player) {
		
		matrix[hücreKoordinati[0]][hücreKoordinati[1]] = player;
	}
	
	public static int durumKontrolüYap(String[][] matrix, String player) {
		if (kazandiMi(matrix, player))
			return 0; // Kazandi
		else if (berabereMi(matrix))
			return 1; // Berabere
		else
			return 2; // Devam
	}

	public static boolean kazandiMi(String[][] matrix, String player) { 
		
		return yatayKazandiMi(matrix, player)|| 
			   dikeyKazandiMi(matrix, player)|| 
			   caprazKazandiMi(matrix, player);
	}

	public static boolean yatayKazandiMi(String[][] matrix, String player) {
		
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == player)
					count++;
			}
			if (count == 3)
				return true;
		}
		return false;
	}

	public static boolean dikeyKazandiMi(String[][] matrix, String player) {
		
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == player)
					count++;
			}
			if (count == 3)
				return true;
		}
		return false;
	}

	public static boolean caprazKazandiMi(String[][] matrix, String player) {
		//Sol yukardan sag asagi
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] == player)
				count++;
			if (count == 3)
				return true;
		}
		// sag yukardan sol asagi
		count = 0;
		for (int i = 0, j = matrix[i].length - 1; j >= 0 ; j--, i++) {
			if (matrix[i][j] == player)
				count++;
			if (count == 3)
				return true;
		}
		return false;
	}

	public static boolean berabereMi(String[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == "   ")// hala bos yer varsa berabere degildir
					return false;
			}
		}
		return true;// kimse kazanmamis ve bos yer yoksa beraberedir
	}

	
	public static void oyuncuDegistir(String[] player) {
		String temp = player[0];// oynayan daima player [0] daki
		player[0] = player[1];
		player[1] = temp;
	}

}
