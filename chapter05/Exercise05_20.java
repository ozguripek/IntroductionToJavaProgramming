package chapter05;

public class Exercise05_20 {

	public static void main(String[] args) {
		
		System.out.println(
				" 2 ile 1,000 arasindaki asal sailar:");
		
		int sayac = 0; 
		int sayi=2;

		while (sayi <= 1000) {
			
			boolean asalMi = true;	

			
			for (int i = 2; i <= sayi / 2; i++) {
				if (sayi % i == 0)	{
					asalMi = false;	
					break;	
				}
			}

			if (asalMi==true) {
				sayac++;	
				if (sayac % 8== 0) {
			
					System.out.println(sayi);
				}
				else
					System.out.print(sayi + " ");
			}
			sayi++;
		}
	}
}

				
	
