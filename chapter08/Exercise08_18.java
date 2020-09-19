package chapter08;

public class Exercise08_18 {

	public static void main(String[] args) {
		
		int[][] dizi = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

		shuffle(dizi);
		
		for (int[] i:dizi) {
			for (int eleman:i  ) {
				System.out.printf("% 3d ", eleman);
			}
			System.out.println();
		}
	}

	
	public static void shuffle(int[][] dizi) {
		int[] temp = new int[2];

		for (int satir = 0; satir < dizi.length; satir++) {
			
			int randomSatir = (int)(Math.random() * dizi.length);
			
			temp[0] = dizi[satir][0];
			temp[1] = dizi[satir][1];
			dizi[satir][0] = dizi[randomSatir][0];
			dizi[satir][1] = dizi[randomSatir][1];
			dizi[randomSatir][0] = temp[0];
			dizi[randomSatir][1] = temp[1];
		}
	}
}