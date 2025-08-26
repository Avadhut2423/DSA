package Array;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
	    int arr[]=new int[size];
	    
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    int max=arr[0];
	    for(int i=1;i<arr.length;i++) {
	    	if(max<arr[i]) {
	    		max=arr[i];
	    	}
	    }
	    System.out.println(max);
	    
	    for(int j=max;j>=1;j--) {
	    	for(int i=0;i<arr.length;i++) {
	    		
	    		if(arr[i]>=j) {
	    			System.out.print("*\t");
	    		}
	    		else {
	    			System.out.print("\t");
	    		}
	    	}
	    	System.out.println();
	    }
		
	}

}
