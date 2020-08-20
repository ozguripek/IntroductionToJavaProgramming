package chapter06;

import java.util.Scanner;

public class Exerise06_12 {

	public static void main(String[] args) {
		
		char ch1= '1';
		char ch2= 'Z';
		int numberPerLine=10;
		printChars(ch1, ch2, numberPerLine);
	}
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int sayac=1;
		for (char ch=ch1; ch<=ch2;ch++) {
			
			if (sayac%numberPerLine==0) {
			System.out.println(ch+" ");
			
			}
			else {
			System.out.print(ch+" ");	
			}
			sayac++;
		}
			
	}
}
