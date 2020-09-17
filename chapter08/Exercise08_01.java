package chapter08;
import java.util.Scanner;

public class Exercise08_01 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		double[][] matrix= new double[3][4];
		System.out.println(" Enter a 3-by-4 matrix row by row:");
		for (int satir=0; satir<matrix.length; satir++) {
			for( int sütun=0; sütun<matrix[satir].length;sütun++) {
				matrix[satir][sütun]= input.nextDouble();
				
			}
			
		}
		for(int sütun=0; sütun<4; sütun++) {
		System.out.println((sütun+1)+"inci sütunun toplami: "+sumColumn(matrix, sütun));	
		}
	
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double toplam=0;
		
		for( int satir=0; satir<3;satir++) {
			toplam+=m[satir][columnIndex];
				
			}
		return	toplam;
		
	
	}

}
