package chapter07;
import java.util.Scanner;

public class Exercise07_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double[] dizi = new double[10];  

		
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < dizi.length; i++)
			dizi[i] = input.nextDouble();

		
		bubbleSort(dizi);

		
		for (double d: dizi) {
			System.out.print(d + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(double[] dizi) {
		
		
			for (int i = 0; i < dizi.length - 1; i++) {
				
				double currentMin=dizi[i];
				int currentMinIndex=i;
				for(int j=i+1; j<dizi.length;j++) {
					if (currentMin > dizi[j]) {
					currentMin = dizi[j];
					currentMinIndex = j;
					
					}
				}
				
				if(currentMinIndex!=i) {
					dizi[currentMinIndex]=dizi[i];
					dizi[i]=currentMin;
				
				}
			}
		
	}
}