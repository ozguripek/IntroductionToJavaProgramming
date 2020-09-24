package chapter09.Exercise02;

public class Stock {
	String  symbol;
	String  name;
	double  previousClosingPrice; 
	double currentPrice;
	
	Stock(String  s, String  n){
		symbol=s;
		name=n;
	}
	double getChangePercent(double previousClosingPrice, double currentPrice ) {
		
		return ((currentPrice-previousClosingPrice)*100)/previousClosingPrice;
	}
	
	
}
