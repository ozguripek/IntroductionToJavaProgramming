package chapter03;

import java.util.Scanner;

public class Exercise03_06 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Geben Sie Ihre Gewicht in pfund:");		
		double gewicht= input.nextDouble();

		System.out.print("Geben Sie Ihre Höhe in fuß:");		
		double fuß= input.nextDouble();
		
		System.out.print("Geben Sie Ihre Höhe in zoll:");		
		double zoll= input.nextInt();
		
		/*KILOGRAMS_PRO_PFUND = 0.45359237
		METER_PRO_ZOLL = 0.0254		  
		FEET_PER_ZOLL = 0.0833333*/		
		
		// pound u kg ye ceviriyoruz
		
		double gewichtKilogram= gewicht* 0.45359237;
		
		//feet i önce inc e cevirip, sonra metreye ceviriyoruz
		
		double höheMeter= (zoll + (fuß/0.0833333))*0.0254;
		
		double bmi= gewichtKilogram/ Math.pow(höheMeter, 2);
		
		 System.out.println("BMI; ist " +bmi);
		 
		 if(bmi< 18.5) {
			 System.out.println("untergewicht");
			 }
		 	else if( bmi<25) {
				 System.out.println("normal");
				 }
		 		else if( bmi<30) {
					 System.out.println("übergewicht");
					 }
		 			else {
					 System.out.println("fettleibig");
					 
				 }
			 }
			 
}


