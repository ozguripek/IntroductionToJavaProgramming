package chapter06;

public class Exercise06_26 {

	public static void main(String[] args) {
		palindrom();

	}
	public static void palindrom() {
		int sayac=0;
		int sayi=2;
		
		while(sayac<100) {
			
			boolean asalMi=true;
			
			for(int i=2; i<=sayi/2;i++){
	                	 
	             if(sayi % i== 0){
	                	 asalMi=false;
	                	break;
	             }
	         }
	 
			if(asalMi){		
					
				if(palindromMu(sayi)) {
					sayac++;
					if(sayac %10==0) {
						System.out.println(" "+sayi);
					}
					else
						System.out.printf("%6d", sayi);
				}
			}
			sayi++; 
		}
	}
	public static boolean palindromMu(int sayi) {
		
		if(sayi == tersi(sayi)) {
			return true;
			}
		
		else {
			return false;
			}
	}

	
	public static int tersi(int sayi) {
		String tersi = ""; 	
		String str = sayi + ""; 
		
		for (int i = str.length() - 1; i >= 0; i--) {
			tersi = tersi+str.charAt(i);
		}
		return Integer.parseInt(tersi); 
	}

}
		



