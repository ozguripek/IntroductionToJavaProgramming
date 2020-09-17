package chapter08;

public class Exercise08_03 {

	public static void main(String[] args) {
		
		char[][] cevaplar = {
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
			};

		
		char [] cevapAnahtari = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

		
		int[][] ögBasinaDogruCizelgesi = new int[cevaplar.length][2];

		
		for (int satir = 0; satir < cevaplar.length; satir++) {			
			for (int sütun = 0; sütun < cevaplar[satir].length; sütun++) {
				if (cevaplar[satir][sütun] == cevapAnahtari[sütun]) {
					ögBasinaDogruCizelgesi[satir][0] = satir;
					ögBasinaDogruCizelgesi[satir][1]++;
				}
			}

		}

	
		sirala(ögBasinaDogruCizelgesi);

		
		for (int satir = 0; satir < ögBasinaDogruCizelgesi.length; satir++) {
			System.out.println("Student " + (ögBasinaDogruCizelgesi[satir][0]+1) + 
				"'s correct count is " + ögBasinaDogruCizelgesi[satir][1]);
		}
	}

	
	public static void sirala(int[][] matrix) {
		for (int i = 0; i < matrix.length-1; i++) {
			
			int enAzDogruCevapVerenÖgrenci= matrix[i][0];
			int enAzDogruSayisi = matrix[i][1];
			int minIndex = i;
			// en kücügü bulma ve degerleri geici degiskenlere atama
			for (int j = i + 1; j < matrix.length; j++) {
				if (enAzDogruSayisi > matrix[j][1]) {
					
					enAzDogruSayisi = matrix[j][1];
					enAzDogruCevapVerenÖgrenci = matrix[j][0];
					minIndex = j;
				}
			}

			// yer degistirme,  
			if (minIndex != i) {
				matrix[minIndex][0] = matrix[i][0];
				matrix[minIndex][1] = matrix[i][1];
				matrix[i][1] = enAzDogruSayisi;
				matrix[i][0] = enAzDogruCevapVerenÖgrenci;
			}
		}
	}
}
