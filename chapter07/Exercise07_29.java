package chapter07;

public class Exercise07_29 {

	public static void main(String[] args) {
		int[] deste;

		do {
			deste = new int[52];
			dörtKartSec(deste);	 

		} while (sum(deste) != 24);
		
		
		print(deste);
	}

	
	public static void dörtKartSec(int[] deck) {
		for (int i = 0; i < 4; i++) {
			deck[(int)(Math.random() * 52)]++;
		}
	}

	
	public static int sum(int[] deck) {
		int sum = 0;
		for (int i = 0; i < deck.length; i++) {
			sum += ((1+(i% 13))) * deck[i]; 
		}
		return sum;
	}

	public static void print(int[] deck) {
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Jack", "Queen", "King"};

		System.out.print("The number of picks that yields the sum of 24: ");
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] > 0)
				System.out.print(ranks[i % 13] + " ");
		}
		System.out.println();
	}
}
