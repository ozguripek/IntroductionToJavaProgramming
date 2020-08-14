package chapter05;

public class Exercise05_15 {

	public static void main(String[] args) {
		
		final int PERLINE=10;
		
		//!nin 33, ~nin 126 oldugunu görmek icin
		
		for( int i=1; i<=150; i++) {
			
			System.out.println(i+" "+(char)i);
		}
		
		for ( int j=33; j<=126;j++) {
			
			if( j% PERLINE==0) {
			
			System.out.println(j+"-"+(char)j);
			} 
			else {
			System.out.print(j+"-"+(char)j+" ");
			}
		}

	}
}