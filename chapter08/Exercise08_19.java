package chapter08;

import java.util.Scanner;

public class Exercise08_19 {

public static void main(String[] args) {
		
		int[][] matrix = matrixOlustur();
		yazdir(matrix);
		if(satirKontrolü(matrix)||
		sütunKontrolü(matrix)||
		solÜsttenSagAltaKontrol(matrix)||
		sagÜsttenSolAltaKontrol(matrix)) {
			
			System.out.println("Array contains four consecutive numbers with the same value.");
		}
		else {System.out.println("Array does NOT contain four consecutive numbers with the same value");}

	}
	public static int[][] matrixOlustur() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		int[][] m = new int[size][size];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random() * 10);
			}
		}
		return m;
	}
	
	public static void yazdir(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean satirKontrolü(int[][] m) {
		
		for (int satir = 0; satir < m.length; satir++) {
			
			int[] sayac = new int[10];
			
			for (int sütun = 0; sütun < m[satir].length; sütun++) {
				if ((sütun+1)<m[satir].length && m[satir][sütun]==m[satir][sütun+1]) {
					sayac[m[satir][sütun]]++;
					for (int i=0; i< sayac.length ; i++) {
						if(sayac[i]==4) return true;
					}
				}
			}
			
		}
		return false;
	}
		
	public static boolean sütunKontrolü(int[][] m) {
			
		for (int satir = 0; satir < m.length-1; satir++) {
			int[] sayac = new int[10];
			
			for (int sütun = 0; sütun < m[satir].length; sütun++) {
				if ((sütun+1)<m[satir].length && m[sütun][satir]==m[sütun+1][satir]) {
					sayac[m[sütun][satir]]++;
					for (int i=0; i< sayac.length ; i++) {
						if(sayac[i]==4) return true;
					}
				}
					
			}
			
		}
		return false;
	}
	
	public static boolean solÜsttenSagAltaKontrol(int[][] m) {
		int[] sayac = new int[10]; 
		
		for (int i = 0; i < m.length; i++) {
			sayac[m[i][i]]++;
			if (sayac[m[i][i]] == 4)
				 return true;
		}
		return false;
	}
	
	public static boolean sagÜsttenSolAltaKontrol(int[][] m) {
		int[] sayac = new int[10];
		
		for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
			sayac[m[i][j]]++;
			if (sayac[m[i][j]] == 4)
				return true;
			
		}
		
	return false;	
		
	}
	
}
