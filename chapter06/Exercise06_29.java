package chapter06;

public class Exercise06_29 {

	public static void main(String[] args) {
			
			int sayi=2;
			while(sayi<1000) {
				
				
				if(asalMi(sayi)&& asalMi(sayi+2)) {
				
					
					System.out.println("("+sayi+", "+(sayi+2)+")");
							
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


}
