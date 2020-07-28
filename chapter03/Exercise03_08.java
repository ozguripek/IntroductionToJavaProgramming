package chapter03;
import java.util.Scanner;

public class Exercise03_08 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println(" Geben Sie drei Integer ein:");
		
		int num1= input.nextInt();
		int num2= input.nextInt();
		int num3= input.nextInt();
		
		int max1;
		int max2;
		int max3;
		
		if (num1>=num2 && num1>=num3) {
			max1=num1;
			if(num2>=num3) {max2=num2;max3= num3;}
			else {max2=num3; max3= num2;}
		}
		
		else if (num2>=num1 && num2>=num3) {
			 max1=num2;
			if(num1>=num3) {max2=num1;max3= num3;}
			else {max2=num3;max3= num1;}

		}
		else {
			max1=num3;
			if(num2>= num1) {max2= num2;max3= num1;}
			else {max2= num1;max3= num2;}
		}
		System.out.println (max1+" "+max2+" "+max3);
	}
			
}