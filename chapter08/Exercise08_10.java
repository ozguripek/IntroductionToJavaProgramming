package chapter08;

public class Exercise08_10 {

	public static void main(String[] args) {
		int[][] matrix= new int[4][4];
		rassalMatrixDoldur(matrix);
		print(matrix);
		System.out.println("The largest row index:"+ largestRow(matrix));
		System.out.println("The largest column index:"+ largestColumn(matrix));
	}

	public static int[][] rassalMatrixDoldur(int[][] matrix) {
		
		for(int i=0; i<matrix.length;i++) {
			for( int j=0; j< matrix[i].length; j++) {
				matrix[i][j]=(int)(Math.random()*2);
				
			}
		}
		return matrix;
		
	}
	public static void print(int[][] matrix) {
		for(int i=0; i<matrix.length;i++) {
			for( int j=0; j< matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int largestRow(int[][] matrix) {
		int largestRowIndex=0;
		int largestRowToplam=0;
		for(int satir=0; satir<matrix.length;satir++) {
			int rowToplam=0;
			for( int sütun=0; sütun< matrix[satir].length; sütun++) {
				 rowToplam += matrix[satir][sütun];
			}
				if(rowToplam> largestRowToplam) {
					largestRowIndex=satir;
					largestRowToplam=rowToplam;
			}
			
		}
	return largestRowIndex;
	}
	private static int largestColumn(int[][] matrix) {
		int largestColumnIndex=0;
		int largestColumnToplam=0;
		for(int sütun=0; sütun<matrix.length;sütun++) {
			int columnToplam=0;
			for( int satir=0; satir< matrix.length; satir++) {
				columnToplam += matrix[satir][sütun];
			}
				if(columnToplam> largestColumnToplam) {
					largestColumnIndex=sütun;
					largestColumnToplam=columnToplam;
			}
			
		}
	return largestColumnIndex;
	}
	
}
