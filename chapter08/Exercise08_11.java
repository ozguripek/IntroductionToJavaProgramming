package chapter08;
import java.util.Scanner;

public class Exercise08_11 {

	public static void main(String[] args) {
		//int[] dizi= new int[9];
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: ");
		//dizi=
		decimalToBinary(input.nextInt());
		
		//yazdir(dizi);

	}

	private static int[] decimalToBinary(int num) {
		 int binary[] = new int[9];
	     int index = 8;
	     while(num > 0){
	       binary[index--] = num%2;
	       num = num/2;
	     }
	     //for(int i = 0;i <binary.length;i++){
	     //  System.out.print(binary[i]);
	     //}
	     yazdir(binary);
	     return binary;
	 }
	private static void yazdir(int[] dizi) {
		String [][]matrix= new String[3][3];
		 
			for(int j=0; j< 3; j++) {
				for(int k=0; k< 3; k++) {
					for(int i=0; i< dizi.length-1;  i++) {
					if(dizi[i]==0)  {
						matrix[j][k]="H";	
					}
					else {
						matrix[j][k]="T";
					}
				}
			}
		}
		
		for(int i=0; i< 3; i++) {
			for(int j=0; j< 3; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();	
		}
		
	}
}

