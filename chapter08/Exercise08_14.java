package chapter08;

public class Exercise08_14 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				matrix[j][k] = (int)(Math.random()*2);
			}
		}
		print(matrix);
		if (dikeyAyniMi(matrix)==false) {
			System.out.println("No same numbers on a column");
			}
		else {
			System.out.println("All s on row");
			}
		
		/*int[] dizi=yatayAyniMi(matrix);
		if (dizi[0]==-1) {
			System.out.println("No same numbers on a row");
			}
		else {
			System.out.println("All "+ dizi[1]+"s on row"+ dizi[0]);
			}*/
		
	}
	public static void print(int[][] m) {	
		for( int i=0; i<3; i++ ){	
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
				
			}	
		System.out.println();
		}
	}

	public static int[] yatayAyniMi(int[][] matrix) {
		int[] sayiIndex= new int[2];
		for (int i = 0; i < matrix.length; i++) {
			int sifirCount = 0;
			int birCount = 0;
			sayiIndex[0]=-1;
			sayiIndex[1]=-1;
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					sifirCount++;
					if(sifirCount==3) {
					sayiIndex[0]=i;
					sayiIndex[1]=0;
					return sayiIndex;
					}
				}
				else if((matrix[i][j] == 1)) {
					birCount++;
					if(birCount==3) {
					sayiIndex[0]=i;
					sayiIndex[1]=1;
					return sayiIndex;
					}
				}
			}
			
		}
		return sayiIndex;
	}

	public static boolean dikeyAyniMi(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			int sifirCount = 0;
			int birCount = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == 0)
					sifirCount++;
				if (matrix[j][i] == 1)
					birCount++;
			}
			if (sifirCount == 3||birCount==3)
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
}
