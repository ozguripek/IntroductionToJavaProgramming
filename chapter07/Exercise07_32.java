package chapter07;

import java.util.Scanner;

public class Exercise07_32 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter list:");		
		int[] list= new int[input.nextInt()];
		
		for( int i=0; i<list.length; i++){
			list[i]= input.nextInt();
		}

	    partition(list);
	  }

	  public static void partition(int[] list) {
	    int[] newList = new int[100];
	    int pivot = list[0];
	    int pivotIndex = 0;

	    for( int i=0,  j=1; i<list.length-1; i++, j++){
	    	if (list[j] <pivot) {
	    		newList[i]=list[j];
	    		 pivotIndex++;
	    	}
	    }
	    newList[pivotIndex+1]=pivot;
	    
	    for( int i=pivotIndex+1,  j=0; j<list.length; i++, j++){
	    	if (list[j] >pivot) {
	    		newList[i]=list[j];
	    	}
	    }
	    displayList(newList);
	    		
	  }
	    	
	   public static void displayList(int[] list) {
	    System.out.print("After the partition, the list is ");
	    for (int n: list) {
	    	if(n>0)
	      System.out.print(n + " ");
	    }
	    System.out.println();
	  }
	}
