package chapter08;

public class Exercise08_22 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[6][6];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Every row" + 
			(isEveryRowHaveAnEvenNumberOf1s(matrix) ? " " : " does NOT " + 
				"have an even number of 1s"));
		System.out.println("Every column" + 
			(isEveryColumnHaveAnEvenNumberOf1s(matrix) ? " " : " does NOT " + 
				"have an even number of 1s"));
	}

	
	public static boolean isEveryRowHaveAnEvenNumberOf1s(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			System.out.println("Row count: "+count);
			if (count % 2 != 0)
				return false;
		}
		return true;
	}

	public static boolean isEveryColumnHaveAnEvenNumberOf1s(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1)
					count++;
			}
			System.out.println("Column count: "+count);
			if (count % 2 != 0)
				return false;
		}
		return true;
	}
}
