package chapter07;

public class Exercise07_16 {

	public static void main(String[] args)  {
		
		
		int[] dizi = new int[10000];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rastgeleSayiÜret();
		}
		int sayi = rastgeleSayiÜret();
		
		System.out.println(" sayi "+ sayi);
		
		long startTime = System.currentTimeMillis();
		int aramaSonucu = linearSearch(dizi, sayi);
		System.out.println(" aramaSonucu "+ aramaSonucu);
		
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(" Lineer arama Islem süresi: "+ executionTime);

		

	
		startTime = System.currentTimeMillis();
		aramaSonucu = binarySearch(dizi, sayi);
		System.out.println(" aramaSonucu "+ aramaSonucu);
		
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(" Binary arama Islem süresi: "+ executionTime);
		
		
	}

	
	public static int rastgeleSayiÜret() {
		return 1 + (int)(Math.random() * 100000);
	}

	
	public static int linearSearch(int[] dizi, int sayi) {
		for (int i = 0; i < dizi.length; i++) {
			if ( dizi[i]== sayi) 
				return i;
			
		}
		 return -1;
	
	}
	public static int binarySearch(int[] dizi, int sayi) {
		int kücük = 0;
		int büyük = dizi.length - 1;
		
		while (büyük >= kücük) {
			int ort = (kücük + büyük) / 2;
			if (sayi < ort)
				büyük = ort - 1;
			else if (sayi == ort)
				return ort;
			else
				kücük = ort + 1;
		}
		return  -1;
	}
}
