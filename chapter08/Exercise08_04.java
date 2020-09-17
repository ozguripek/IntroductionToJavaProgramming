package chapter08;

public class Exercise08_04 {

	public static void main(String[] args) {
			
		int[][] günBasinaSaatler = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6 ,3 ,4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}
				};

		int[][] kisiBasiTopCalismaCiz = new int[günBasinaSaatler.length][2];

		
		for (int satir = 0; satir < günBasinaSaatler.length; satir++) {	
			for (int sütun = 0; sütun < günBasinaSaatler[satir].length; sütun++) {
				
			kisiBasiTopCalismaCiz[satir][0] = satir;
			kisiBasiTopCalismaCiz[satir][1]+=günBasinaSaatler[satir][sütun];
			}
		}

		

	
		sirala(kisiBasiTopCalismaCiz);

		
		for (int satir = 0; satir < kisiBasiTopCalismaCiz.length; satir++) {
			System.out.println("Employee " + (kisiBasiTopCalismaCiz[satir][0]+1) + 
				"'s work hours are " + kisiBasiTopCalismaCiz[satir][1]);
		}
	}

	
	public static void sirala(int[][] matrix) {
		for (int i = 0; i < matrix.length-1; i++) {
			
			int enAzCalisan= matrix[i][0];
			int enAzCalisilanSüre = matrix[i][1];
			int minIndex = i;
			// en kücügü bulma ve degerleri geici degiskenlere atama
			for (int j = i + 1; j < matrix.length; j++) {
				if (enAzCalisilanSüre > matrix[j][1]) {
					
					enAzCalisilanSüre = matrix[j][1];
					enAzCalisan = matrix[j][0];
					minIndex = j;
				}
			}

			// yer degistirme,  
			if (minIndex != i) {
				matrix[minIndex][0] = matrix[i][0];
				matrix[minIndex][1] = matrix[i][1];
				matrix[i][1] = enAzCalisilanSüre;
				matrix[i][0] = enAzCalisan;
			}
		}
	}
}

