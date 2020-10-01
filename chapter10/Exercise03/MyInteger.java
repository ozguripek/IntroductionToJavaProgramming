package chapter10.Exercise03;

public class MyInteger {
	
	private int value;
	
	public MyInteger(int value) {		
		this.value= value;		
	}
	
	public boolean isEven() {
		return isEven(value);		
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}
	
	public static boolean isEven(int value) {
		return (value % 2 == 0);		
	}
	
	public static boolean isOdd(int value) {
		return (value % 2 != 0);		
	}
	
	public static boolean isPrime(int value) {
		for (int i = 2; i <= value/2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInteger) {
		return(myInteger.isEven());		
	}
	
	public static boolean isOdd(MyInteger myInteger) {
		return (myInteger.isOdd());		
	}
	
	public static boolean isPrime(MyInteger myInteger) {
		return (myInteger.isPrime());
	}
	
	public boolean equals(int value) {	
		return(this.value==value);		
	}
	
	public boolean equals(MyInteger myInteger) {
		return(this.value==myInteger.value);		
	}	
	
	public static int parseInt(char[] ch){
	    int result=0;
	    for(int i=0;i<ch.length;i++){
	        result=result*10+(ch[i]-'0');
	    }
	    return result;
	}
		
	public static int parseInt(String str) {
		int i = 0;
	    int num = 0;
	    boolean isNeg = false;

	    if (str.charAt(0) == '-') {
	        isNeg = true;
	        i = 1;
	    }
	    while( i < str.length()) {
	        num *= 10;
	        num += str.charAt(i++) - '0'; 
	    }

	    if (isNeg)
	        num = -num;
	    return num;
	}
	
	public int getValue() {
		return value;
	} 	
}
