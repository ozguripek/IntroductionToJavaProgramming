package chapter06;

public class Exercise06_28 {

	public static void main(String[] args) { 
		System.out.println("p               2^p –1");
		System.out.println("______________________");
		
		
		int sayi=2;
		while(sayi<=31) {
			
			
			if(asalMi(sayi)) {
			
				if(asalMi(mersenePrime(sayi))) {
					
						System.out.printf("%-12d     ", sayi);
						System.out.printf("%-15d\n", mersenePrime(sayi));
				}
			
			}
	 	sayi++; 
		}
		
	}
	public static boolean asalMi(int sayi) {
		
		boolean asalMi=true;
			
			for(int i=2; i<=sayi/2;i++){
	                	 
	             if(sayi % i== 0){
	                	 asalMi=false;
	                	 break;
	               }
			}
	           return asalMi;
	         
	}
	

	
	public static int mersenePrime(int sayi) {
		double p=(Math.pow(2, sayi))-1;
		return (int)p; 
	}

}

