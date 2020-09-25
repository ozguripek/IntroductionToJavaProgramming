package chapter09.Exercise06;

public class StopWatchTest {

	public static void main(String[] args) {
		StopWatch sW= new StopWatch();
		int[] randomArray= new int[100_000]; 
		for(int i=0; i<randomArray.length; i++) {
			randomArray[i]= (int)(Math.random()*100_000);
		}
		sW.start();

		sort(randomArray);

		sW.stop();

		System.out.println("The execution time of sorting 100,000 numbers "
				+ "using selection sort is " + sW.getElapsedTime()+
			" milliseconds.");
	}
	
	public static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = array[i];
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}

			if (i != minIndex) {
				array[minIndex] = array[i];
				array[i] = min;
			}
		}
	} 
}

