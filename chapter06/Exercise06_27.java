package chapter06;

public class Exercise06_27 {

	

		public static void main(String[] args) {
			int sayac=0;
			int sayi=10;
			while(sayac<100) {
				
				
				if(asalMi(sayi)) {
				
					if(asalMi(tersi(sayi))) {
						sayac++;
						if(sayac %10==0) {
							System.out.print("    "+sayi+"\n");
						}
						else
							System.out.printf("%6d", sayi);
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
		

		
		public static int tersi(int sayi) {
			String tersi = ""; 	
			String str = sayi + ""; 
			
			for (int i = str.length() - 1; i >= 0; i--) {
				tersi = tersi+str.charAt(i);
			}
			return Integer.parseInt(tersi); 
		}

	}
