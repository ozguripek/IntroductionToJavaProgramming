package chapter09.Exercise02;

public class StockTest {

	public static void main(String[] args) {
		Stock s1= new Stock ("ORCL","Oracle Corporation");
		s1.previousClosingPrice=34.5;
		s1.currentPrice=34.35;
		
		System.out.printf("the price-change percentage: %.2f", 
				s1.getChangePercent(s1.previousClosingPrice, s1.currentPrice ));
		
		

	}

}
