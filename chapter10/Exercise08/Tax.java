package chapter10.Exercise08;

public class Tax {
	
	private int filingStatus;
	// public static constants represent the statuses.
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets;//Stores the tax brackets for each filing status.
	private double[] rates; //Stores the tax rates for each bracket.
	private double taxableIncome; //Stores the taxable income.
	
	public Tax() {
		filingStatus = SINGLE_FILER;
		// sayfa 90 table 3.2
		int[][] brackets2009 = {
				{8_350, 33_950, 82_250, 171_550, 372_950},  // 0
				{16_700, 67_900, 137_050, 208_850, 372_950}, // 1
				{8_350, 33_950, 68_525, 104_425, 186_475},  // 2
				{11_950, 45_500, 117_450, 190_200, 372_950} // 3
			};		
		setBrackets(brackets2009);
		// sayfa 90 table 3.2
		double[] rates2009 = {10, 15, 25, 28, 33, 35};
		setRates(rates2009);		
		taxableIncome = 0;		
	}	
	public Tax(int filingStatus,int[][] brackets,double[] rates,double taxableIncome) {		
		setFilingStatus(filingStatus);
		setBrackets(brackets);
		setRates(rates);
		setTaxableIncome(taxableIncome);		
	}	
	
	public double getTax() {
		double tax = 0, incomeTaxed = 0;
		double income = taxableIncome; 
		if (rates.length >= 2) {
			for (int i = rates.length - 2; i >= 0; i--) {
				if (income > brackets[filingStatus][i]) {
 					tax += (incomeTaxed = income - brackets[filingStatus][i]) 
 								* rates[i + 1];
					income -= incomeTaxed;
 				}
			} 
		}
		return tax += brackets[filingStatus][0] * rates[0];
	}	
	
	public int getFilingStatus() {
		return filingStatus;
	}
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	
	public int[][] getBrackets() {
		return brackets;
	}
	public void setBrackets(int[][] brackets) {
		this.brackets = new int[brackets.length][brackets[0].length];
		for (int i = 0; i < brackets.length; i++) {
			for (int j = 0; j < brackets[i].length; j++)
				this.brackets[i][j] = brackets[i][j];
		}
	}
	
	public double[] getRates() {
		return rates;
	}
	public void setRates(double[] rates) {
		this.rates = new double[rates.length];
		for (int i = 0; i < rates.length; i++)
			this.rates[i] = rates[i] / 100;
	}
	
	public double getTaxableIncome() {
		return taxableIncome;
	}
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
}
