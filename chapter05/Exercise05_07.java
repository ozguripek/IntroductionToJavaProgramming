package chapter05;

public class Exercise05_07 {

	public static void main(String[] args) {
		
		double tutition= 10000;
		double onYilTutition=0;
		double onDörtYilTutition=0;
		
		for(int i=1; i<=14;i++) {
			tutition= tutition +(tutition * 0.05);
			
			if(i==10) {
				onYilTutition=tutition;
			System.out.println("the tuition in ten years "+(int)(onYilTutition*100/100.0));
			}
			if(i==14) {
				onDörtYilTutition=tutition;
			System.out.println("the total cost of four years’ "
					+ "worth of tuition after the tenth year. "+(int)(onDörtYilTutition-onYilTutition*100/100.0));;
			}
				
		}


	}

}

