package chapter08;
import java.util.Scanner;

public class Exercise08_14 {

	public static void main(String[] args) {
		
		int[][] matrix = matrixOlustur();
		yazdir(matrix);
		satirKontrolü(matrix);
		sütunKontrolü(matrix);
		solÜsttenSagAltaKontrol(matrix);
		sagÜsttenSolAltaKontrol(matrix);

	}
	public static int[][] matrixOlustur() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		int[][] m = new int[size][size];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random() * 2);
			}
		}
		return m;
	}
	
	public static void yazdir(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
	public static void satirKontrolü(int[][] m) {
		
		int[] sifirMiBirMi = new int[m.length];
		for (int i = 0; i < sifirMiBirMi.length; i++) {
			sifirMiBirMi[i] = -1;
		}

		int[] sayac = new int[2]; 
		for (int satir = 0; satir < m.length; satir++) {
			
			sayac[0] = 0;
			sayac[1] = 0;

			for (int sütun = 0; sütun < m[satir].length; sütun++) {
				sayac[m[satir][sütun]]++;
				if (sayac[0] < sütun + 1 && sayac[1] < sütun + 1) {//hangi satirda isek sayac o kadar olmali
					break;
				}
			}
			if (sayac[0] >= m.length || sayac[1] >= m.length) {
				if(sayac[0] > sayac[1]) {
					sifirMiBirMi[satir]=0;
				}
				else {
					sifirMiBirMi[satir]=1;
				}
			}
			
		}
		
		int count = 0;
		for (int i = 0; i < sifirMiBirMi.length; i++) {
			if (sifirMiBirMi[i] != -1)
				System.out.println("All " + sifirMiBirMi[i] + "s on row " + (i + 1));
			else
				count++;
			if (count == sifirMiBirMi.length)
				System.out.println("No same numbers on a row");
		}
		
	}
	public static void sütunKontrolü(int[][] m) {
			
			int[] sifirMiBirMi = new int[m.length];
			for (int i = 0; i < sifirMiBirMi.length; i++) {
				sifirMiBirMi[i] = -1;
			}
	
			int[] sayac = new int[2]; 
			for (int satir = 0; satir < m.length; satir++) {
				
				sayac[0] = 0;
				sayac[1] = 0;
	
				for (int sütun = 0; sütun < m[satir].length; sütun++) {
					sayac[m[sütun][satir]]++;
					if (sayac[0] < sütun + 1 && sayac[1] < sütun + 1) {//hangi satirda isek sayac o kdar göstermeli
						break;// yoksa devam etmenin manasi yok
					}
				}
	
				if (sayac[0] >= m.length || sayac[1] >= m.length) {
					if(sayac[0] > sayac[1]) {
						sifirMiBirMi[satir]=0;
					}
					else {
						sifirMiBirMi[satir]=1;
					}
				}
				
			}
		
			int count = 0;
			for (int i = 0; i < sifirMiBirMi.length; i++) {
				if (sifirMiBirMi[i] != -1)
					System.out.println("All " + sifirMiBirMi[i] + "s on column " + (i + 1));
				else
					count++;
				if (count == sifirMiBirMi.length)
					System.out.println("No same numbers on a column");	
		
			}
	}
	
	public static void solÜsttenSagAltaKontrol(int[][] m) {
		int[] sayac = new int[2]; 
		int n =-1;
		sayac[0] = 0;
		sayac[1] = 0;
		for (int i = 0; i < m.length; i++) {
			sayac[m[i][i]]++;
			if (sayac[0] == m.length)
				 n=0;
			if (sayac[1] == m.length)
				n= 1;
		}
		
		switch (n) {
			case 0:
			case 1: System.out.println("All " + n + "s on the major diagonal");
					  break;
			case -1: System.out.println("No same numbers on the major diagonal");
				
		}
		
	}
	
	public static void sagÜsttenSolAltaKontrol(int[][] m) {
		int[] sayac = new int[2];
		int n=-1;
		sayac[0] = 0;
		sayac[1] = 0;
		for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
			sayac[m[i][j]]++;
			if (sayac[0] == m.length)
				n= 0;
			if (sayac[1] == m.length)
				n= 1;
		}
		
		switch (n) {
			case 0:
			case 1: System.out.println("All " + n + "s on the sub-diagonal");
					  break;
			case -1: System.out.println("No same numbers on the sub-diagonal");
				
		}
		
	}
	
}