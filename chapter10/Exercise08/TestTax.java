package chapter10.Exercise08;

public class TestTax {

	public static void main(String[] args) {
		
		Tax tax2001 = new Tax();
		Tax tax2009 = new Tax(); 

		// sayfa 402 table 10.1
		double[] rates2001 = {15, 27.5, 30.5, 35.5, 39.1};
		tax2001.setRates(rates2001);
		
		int[][] brackets2001 = {
			{27_050, 65_550, 136_750, 297_350},  // status 0
			{45_200, 109_250, 166_500, 297_350}, // status 1														// -or qualifying widow(er)
			{22_600, 54_625, 83_250, 148_675},  // status 2
			{36_250, 93_650, 151_650, 297_350} 	// status 3
		};
		tax2001.setBrackets(brackets2001);

		// Print tax tables for 2001 and 2009
		final double FROM = 50_000;		// Start table taxable income range at $50,000
		final double TO = 60_000;		// End table taxable income range at $60,000
		final double INTERVAL = 1000;	// Increase each row by $1000

		System.out.println(
			"\n2001 tax tables for taxable income from $50,000 to $60,000");
		print(tax2001, FROM, TO, INTERVAL);
		System.out.println("\n*********************************************************************");

		System.out.println(
			"\n2009 tax tables for taxable income from $50,000 to $60,000");
		print(tax2009, FROM, TO, INTERVAL);
		
	}

	/** Display taxable for  taxable income with specified range and interval */
	public static void print(Tax tax, final double FROM, final double TO, final double INTERVAL) {
		// Print header
		System.out.println(
			"---------------------------------------------------------------------\n" +
			"Taxable       Single      Married Joint       Married        Head of\n" +
			"Income                    or Qualifying       Separate       a House\n" +
			"                          Widow(er)\n" +
			"---------------------------------------------------------------------");
		// Print Data
		for (double taxableIncome = FROM; taxableIncome <= TO; taxableIncome += INTERVAL) {
			tax.setTaxableIncome(taxableIncome);
			System.out.printf("%-13.0f", taxableIncome);
			
			tax.setFilingStatus(tax.SINGLE_FILER);			
			System.out.printf("%8.2f", tax.getTax());
			
			tax.setFilingStatus(tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER);
			System.out.printf("%15.2f", tax.getTax());
			
			tax.setFilingStatus(tax.MARRIED_SEPARATELY);			
			System.out.printf("%18.2f", tax.getTax());
			
			tax.setFilingStatus(tax.HEAD_OF_HOUSEHOLD);
			System.out.printf("%15.2f\n", tax.getTax());
		}
	}
}
